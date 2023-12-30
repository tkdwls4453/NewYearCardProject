package com.example.NewYearCardProject.controller;

import com.example.NewYearCardProject.model.GenerateDallEImageRequest;
import com.example.NewYearCardProject.model.GenerateDallEImageResponse;
import com.example.NewYearCardProject.model.GenerateImageRequest;
import com.example.NewYearCardProject.service.ImageGeneratorService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@AllArgsConstructor
public class BasicController {

    private final ImageGeneratorService imageGeneratorService;

    private final static int numImages = 1;
    private final static String size = "512x512";

    @PostMapping("/generate")
    public String generateImage(@Valid @RequestBody final GenerateImageRequest request) {
        log.info("Received image request = {}", request);
        String prompt = createPrompt(request.getKeyword(), request.getMood(), request.getStyle(), request.getSituation());
        GenerateDallEImageRequest dallEImageRequest = new GenerateDallEImageRequest(prompt, size, numImages);
        GenerateDallEImageResponse dallEImageResponse = imageGeneratorService.generateImage(dallEImageRequest);
        log.info("Generated image: {}", dallEImageResponse);
        return "ok";
    }

    private String createPrompt(String keyword, String mood, String style, String situation) {
        StringBuilder sb = new StringBuilder();
        sb.append("Keywords: [" + keyword + "], ");
        sb.append("Atmosphere: [" + mood + "], ");
        sb.append("Drawing style: [" + style + "], ");
        sb.append("Specific situation: [" + situation + "], ");
        sb.append("Draw a picture to be included in the New Year card according to these conditions.");
        return sb.toString();
    }
}
