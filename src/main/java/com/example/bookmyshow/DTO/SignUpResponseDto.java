package com.example.bookmyshow.DTO;

import com.example.bookmyshow.models.ResponseStatus;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignUpResponseDto {

    private Long userId;
    private ResponseStatus responseStatus;
}
