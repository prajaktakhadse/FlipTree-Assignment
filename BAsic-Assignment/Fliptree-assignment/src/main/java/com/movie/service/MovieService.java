package com.movie.service;

import java.util.List;

import com.movie.exception.MovieNotFound;
import com.movie.model.Movie;

public interface MovieService {
   public Movie saveMovie(Movie movie);
   
   public List<Movie> getAllMovie()throws MovieNotFound;
   
   public Movie updateMovieRating(Integer movie_Id ,String rating) throws MovieNotFound;
   
}
