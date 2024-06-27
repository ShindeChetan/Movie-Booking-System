package com.example.bookmyshow.exceptions;

public class ShowNotFoundException extends RuntimeException{

    public ShowNotFoundException(String message){
        super(message);
    }
}
