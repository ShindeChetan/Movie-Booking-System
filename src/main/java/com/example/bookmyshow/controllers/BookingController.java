package com.example.bookmyshow.controllers;

import com.example.bookmyshow.DTO.BookMovieRequestDto;
import com.example.bookmyshow.DTO.BookMovieResponseDto;
import com.example.bookmyshow.models.Booking;
import com.example.bookmyshow.models.ResponseStatus;
import com.example.bookmyshow.services.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class BookingController { //Waiter.
    private BookingService bookingService;

    @Autowired
    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    public BookMovieResponseDto bookMovie(BookMovieRequestDto bookMovieRequestDto) throws Exception {
        BookMovieResponseDto response = new BookMovieResponseDto();

        try {
            Booking booking = bookingService.bookMovie(bookMovieRequestDto.getUserId(),
                    bookMovieRequestDto.getShowId(),
                    bookMovieRequestDto.getShowSeatIds());

            response.setBookingId(booking.getId());
            response.setResponseStatus(ResponseStatus.SUCCESS);
            response.setAmount(booking.getAmount());
        } catch (RuntimeException runtimeException) {
            response.setResponseStatus(ResponseStatus.FAILURE);
        }

        return response;
    }

    public Booking cancelMovie() {
        return null;
    }
}
