package com.nickravch.movierecomender.lesson3;

import org.springframework.stereotype.Component;

@Component
public class ContentBasedFilter implements Filter {
    public String[] getRecomendations(String movie) {
        // logic of reccomendation
        return new String[] {"movie1", "Ice age", "Shark tale"};
    }
}
