package com.example.NewYearCardProject.model;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class GenerateImageRequest {

    @NotBlank
    private String keyword;

    @NotBlank
    private String mood;

    @NotBlank
    private String style;

    @NotBlank
    private String situation;

}
