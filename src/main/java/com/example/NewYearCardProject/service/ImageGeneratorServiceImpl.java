package com.example.NewYearCardProject.service;

import com.example.NewYearCardProject.common.external.ImageGeneratorClient;
import com.example.NewYearCardProject.model.GenerateDallEImageRequest;
import com.example.NewYearCardProject.model.GenerateDallEImageResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ImageGeneratorServiceImpl implements ImageGeneratorService{

    private final ImageGeneratorClient imageGeneratorClient;
    @Override
    public GenerateDallEImageResponse generateImage(GenerateDallEImageRequest request) {
        final GenerateDallEImageResponse response = imageGeneratorClient.generateImage(request);

        return response;
    }
}
