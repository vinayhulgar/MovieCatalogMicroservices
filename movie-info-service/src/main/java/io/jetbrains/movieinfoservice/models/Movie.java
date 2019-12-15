package io.jetbrains.movieinfoservice.models;

public class Movie {

    private String movieId;
    private String name;

    public String getMovieId() {
        return movieId;
    }

    public Movie(String movieId, String name) {
        this.movieId = movieId;
        this.name = name;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
