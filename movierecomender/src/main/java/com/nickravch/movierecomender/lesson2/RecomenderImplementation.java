package com.nickravch.movierecomender.lesson2;

public class RecomenderImplementation {

    private Filter filter;

    public RecomenderImplementation(Filter filter) {
        super();
        this.filter = filter;
    }


    public String[] recomendedMovies (String movie) {

        System.out.println("Recomending movies similar to " + movie + " by " + filter);

        ContentBasedFilter filter = new ContentBasedFilter();
        String[] results = filter.getRecomendations(movie);

        return results;
    }
}
