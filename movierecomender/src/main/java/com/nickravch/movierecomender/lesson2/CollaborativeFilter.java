package com.nickravch.movierecomender.lesson2;

public class CollaborativeFilter implements Filter {
    public String[] getRecomendations(String movie) {
        // logic of reccomendation
        return new String[] {"movie1", "Ice age", "Shark tale"};
    }
}
