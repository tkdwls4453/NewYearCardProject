package com.example.NewYearCardProject.common.external;

import com.example.NewYearCardProject.config.ImageGeneratorConfig;
import com.example.NewYearCardProject.model.GenerateDallEImageRequest;
import com.example.NewYearCardProject.model.GenerateDallEImageResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "imageGenerator", url = "${openai.image-generator.url}", configuration = ImageGeneratorConfig.class)
public interface ImageGeneratorClient {

    @PostMapping(value = "/v1/images/generations")
    GenerateDallEImageResponse generateImage(@RequestBody final GenerateDallEImageRequest request);
}
