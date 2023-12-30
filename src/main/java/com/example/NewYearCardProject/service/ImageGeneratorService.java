package com.example.NewYearCardProject.service;

import com.example.NewYearCardProject.model.GenerateDallEImageRequest;
import com.example.NewYearCardProject.model.GenerateDallEImageResponse;

public interface ImageGeneratorService {
    GenerateDallEImageResponse generateImage(GenerateDallEImageRequest generateImageRequest);
}
