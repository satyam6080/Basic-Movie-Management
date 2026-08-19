package com.cfs.movieproject.entity;

public class Movie {
    private long id;
    private String name;
    private String genre;
    private Double rating;
    private Integer year;
    private String language;

    public Movie() {
    }

    public Movie(long id, String name, String genre, Double rating, Integer year, String language) {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.rating = rating;
        this.year = year;
        this.language = language;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
