package com.nickravch.movierecomender.lesson5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecomenderImplementation {

    @Autowired
    @Qualifier("CF")
    private Filter filter;

    public String[] recomendedMovies (String movie) {

        System.out.println("Recomending movies similar to " + movie + " by " + filter);

        ContentBasedFilter filter = new ContentBasedFilter();
        String[] results = filter.getRecomendations(movie);

        return results;
    }
}
