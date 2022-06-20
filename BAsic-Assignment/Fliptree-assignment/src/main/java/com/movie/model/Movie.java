package com.movie.model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
	@Id
	
   private Integer movie_id;
   private String title ;
   private String phase ;
   private String category_name ;
   private Integer release_year ;
   private Integer running_time ;
   private String rating_name ;
   private String disc_format_name;
   private Integer number_discs ;
   private String aspect_ratio_name ;
   private Integer status ;
   private String release_date;
   private String budget ;
   private String gross ;
   private String time_stamp ; 
	

   
}
