package com.movie.exception;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class MovieNotFound extends RuntimeException{
    public MovieNotFound(String message) {
    	super(message);
    }
}
