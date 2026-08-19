package com.cfs.movieproject.Service;

import com.cfs.movieproject.entity.Movie;
import com.cfs.movieproject.repository.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    private final MovieRepository mr;

    public MovieService(MovieRepository mr) {
        this.mr = mr;
    }

    public List<Movie> getAllMovie(){
       return  mr.getAllMovie();
    }

    public Movie getMovieById(Long id){
        return mr.getMovieById(id);
    }

    public Movie addMovie(Movie movie){
        return mr.saveMovie(movie);
    }

    public List<Movie> searchByName(String name){
        return mr.searchByName(name);
    }


}
