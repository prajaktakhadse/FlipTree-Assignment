package com.movie.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalException {
	@ExceptionHandler(MovieNotFound.class)
   public ResponseEntity<MyErrorDetails> myExceptionHandler(MovieNotFound movie_not_found , WebRequest wr){
		System.out.println("Movie not found");
		
		MyErrorDetails err = new MyErrorDetails(LocalDateTime.now() , movie_not_found.getMessage() , wr.getDescription(false));
		
		return new ResponseEntity<MyErrorDetails>(err ,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<MyErrorDetails> myExceptionHandler(Exception ie ,  WebRequest wr){
		System.out.println("Movie not found");
		
		MyErrorDetails err = new MyErrorDetails(LocalDateTime.now() , ie.getMessage() , wr.getDescription(false));
		
		return new ResponseEntity<MyErrorDetails>(err ,HttpStatus.BAD_REQUEST);
	}
}
