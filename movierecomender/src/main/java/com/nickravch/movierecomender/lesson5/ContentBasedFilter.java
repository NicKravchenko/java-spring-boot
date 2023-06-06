package com.nickravch.movierecomender.lesson5;

import org.springframework.stereotype.Component;

// @Component()
@Component("CBF")
public class ContentBasedFilter implements Filter {
    public String[] getRecomendations(String movie) {
        // logic of reccomendation
        return new String[] {"movie1", "Ice age", "Shark tale"};
    }
}
