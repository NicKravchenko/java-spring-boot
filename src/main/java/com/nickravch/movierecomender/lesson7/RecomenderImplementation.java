package com.nickravch.movierecomender.lesson7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecomenderImplementation {

    private Filter filter; //Field injection

    @Autowired //Constructor injection
    public RecomenderImplementation(@Qualifier("CF") Filter filter) {
        super();
        this.filter = filter;
    }

    // @Autowired //Setter injection
    // @Qualifier("CBF")
    // public void setFilter(Filter filter) {
    //     this.filter = filter;
    //     System.out.println("Setter method invoked..");
    // }

    public String[] recomendedMovies (String movie) {

        System.out.println("Recomending movies similar to " + movie + " by " + filter);

        ContentBasedFilter filter = new ContentBasedFilter();
        String[] results = filter.getRecomendations(movie);

        return results;
    }
}
