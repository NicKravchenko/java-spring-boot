package com.nickravch.movierecomender.lesson11;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class RecomenderImplementation {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    private Filter filter;

    @Autowired
    public void setFilter(Filter filter) {
     logger.info("In RecommenderImplementation setter method..dependency injection");
     this.filter = filter;
    }

    @PostConstruct
    public void postConstruct() {
        //initialization code goes here
        logger.info("In RecommenderImplementation postConstruct method");
    }

    @PreDestroy
    public void preDestroy() {
        //cleanup code
        logger.info("In RecommenderImplementation preDestroy method");
    }

    public String[] recomendedMovies (String movie) {

        System.out.println("Recomending movies similar to " + movie + " by " + filter);

        ContentBasedFilter filter = new ContentBasedFilter();
        String[] results = filter.getRecomendations(movie);

        return results;
    }
}
