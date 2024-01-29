package com.tweteroo.api.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class TweetDTO {

    @NotBlank
    private Integer userId;

		@NotBlank
    @Size(max = 280, message = "Maximum length for tweet is 100 characters!")
    private String text;
}
