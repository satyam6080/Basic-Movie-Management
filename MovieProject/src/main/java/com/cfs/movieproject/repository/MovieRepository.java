package com.cfs.movieproject.repository;

import com.cfs.movieproject.entity.Movie;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Repository
public class MovieRepository {
    private  Map<Long, Movie> moviedb = new HashMap<>();

    public MovieRepository() {
        System.out.println("Default movie repositor");

    }

    @PostConstruct
    public void loadDummyData(){
        System.out.println("Loading dummy data");
        moviedb.put(1L, new Movie(1L,"KGF","Action",9.8,2023,"HIndi"));
        moviedb.put(2L, new Movie(2L,"PUSHPA","Action",8.8,2024,"Tamil"));
        moviedb.put(3L, new Movie(3L,"Avator","Sc-fi",9.9,2011,"English"));
        moviedb.put(4L, new Movie(4L,"Shiddat","LoveStory",7.8,2023,"HIndi"));
    }
    public List<Movie> getAllMovie(){
        return new ArrayList<>(moviedb.values());
    }

    public Movie getMovieById(Long id){
       return  moviedb.get(id);
    }

    public Movie saveMovie(Movie movie){
        moviedb.put(movie.getId(),movie);
        return movie;
    }

    public List<Movie> searchByName(String name){
//        return moviedb.values()
//                .stream()
//                .filter(movie -> movie.getName()!=null &&
//                       movie.getName().toLowerCase().contains(name.toLowerCase()))
//                      .collect(Collectors.toList());

        List<Movie> movieList = new ArrayList<>();
        for(Movie collection : moviedb.values()){
            if(collection.getName().equals(name)){
                movieList.add(collection);
            }
        }
        return movieList;
    }
}
