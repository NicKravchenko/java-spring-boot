package com.nickravch.movierecomender.lesson2;

import java.util.Arrays;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MovierecomenderApplication {

	public static void main(String[] args) {
		RecomenderImplementation recomender = new RecomenderImplementation(new ContentBasedFilter());

		String[] result = recomender.recomendedMovies("Finding Dory");
		System.out.println("Recomendations for Finding Dory:" + Arrays.toString(result));
		// SpringApplication.run(MovierecomenderApplication.class, args);
	}

}
