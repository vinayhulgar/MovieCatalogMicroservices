package io.jetbrains.ratingsdataservice.resources;

import io.jetbrains.ratingsdataservice.models.Rating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ratingsdata")
public class RatingResource {

    @RequestMapping("/{moviesId}")
    public Rating getRating(@PathVariable("moviesId") String movieId){
        return new Rating(movieId, 4);
    }


}
