package io.jetbrains.ratingsdataservice.models;

public class Rating {

    private String movieId;
    private int rating;

    public String getMovieId() {
        return movieId;
    }

    public Rating(String movieId, int rating) {
        this.movieId = movieId;
        this.rating = rating;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
