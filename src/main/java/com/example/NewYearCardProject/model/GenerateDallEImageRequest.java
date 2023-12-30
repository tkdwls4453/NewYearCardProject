package com.example.NewYearCardProject.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GenerateDallEImageRequest {

    @NotBlank
    private String prompt;

    private String size;

    @Min(1)
    @Max(10)
    @JsonProperty("num_images")
    private int numImages;

}
