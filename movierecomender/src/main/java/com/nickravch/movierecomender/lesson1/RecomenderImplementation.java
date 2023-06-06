package com.nickravch.movierecomender.lesson1;

public class RecomenderImplementation {
    public String[] recomendedMovies (String movie) {
        // logic of reccomendation
        ContentBasedFilter filter = new ContentBasedFilter();
        String[] results = filter.getRecomendations(movie);

        return results;
    }
}
