package com.example.bookmyshow.DTO;

import com.example.bookmyshow.models.ResponseStatus;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookMovieResponseDto {

    private Long bookingId;

    private double amount;

    private ResponseStatus responseStatus;
}
