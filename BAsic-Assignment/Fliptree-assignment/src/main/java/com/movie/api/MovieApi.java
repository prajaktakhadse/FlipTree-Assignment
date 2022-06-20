package com.movie.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.movie.exception.MovieNotFound;
import com.movie.model.Movie;
import com.movie.service.MovieService;

@RestController
public class MovieApi {
  @Autowired
   private MovieService movieService;
   
   @PostMapping("/Movie/movies")
   public ResponseEntity<Movie> storeMovie(@RequestBody Movie movie){
	  Movie m =  movieService.saveMovie(movie);
	return new ResponseEntity<Movie>(m , HttpStatus.OK);
	   
   }
   
   @GetMapping("/Movie/movies")
   public ResponseEntity<List<Movie>> getMovieList() throws MovieNotFound{
	   List<Movie> movies = movieService.getAllMovie();
	   return new ResponseEntity<List<Movie>>(movies ,HttpStatus.OK);
   }
   
   @PutMapping("/Movie/movies/{movie_Id}")
   public ResponseEntity<Movie> updateMovie(@PathVariable ("movie_Id") Integer movieid ,
		                           @RequestParam ("rating_name") String rating_name) throws MovieNotFound{
   
   Movie updatemovie = movieService.updateMovieRating(movieid, rating_name);
   
   return new ResponseEntity<Movie>(updatemovie , HttpStatus.ACCEPTED);
}

}






