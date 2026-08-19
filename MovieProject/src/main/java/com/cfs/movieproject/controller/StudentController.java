package com.cfs.movieproject.controller;

import com.cfs.movieproject.Service.MovieService;
import com.cfs.movieproject.entity.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.service.annotation.PatchExchange;

import java.util.List;

@RestController
@RequestMapping("/movie")
public class StudentController {

    @Autowired
     private MovieService ms;

     @GetMapping
     public List<Movie> getAllMovies(){
         return ms.getAllMovie();
     }
     @GetMapping("/{id}")
     public Movie getMovieById(@PathVariable  Long id){
         return  ms.getMovieById(id);
     }
     @GetMapping("/search")
     public List<Movie> searchMovieByName(@RequestParam String name){
         return  ms.searchByName(name);
     }
      @PostMapping
    public Movie addMovies(@RequestBody Movie movie){
         return ms.addMovie(movie);
      }
}
