package com.nickravch.movierecomender.rest;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecommendationsController  {

    //@RequestMapping(method=RequestMethod.GET, value="/movies")
    //OR
    @GetMapping("/movies")
    public List<Movie> getAllMovies() {
        return Arrays.asList(new Movie(1, "Icy Age", 7.5),
                             new Movie(2, "Happy Feet", 6.4),
                             new Movie(3, "Shark Tales", 6.0) );
       }

}
