package com.nickravch.movierecomender.lesson7;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MovierecomenderApplication {

	public static void main(String[] args) {
		ApplicationContext appContext = SpringApplication.run(MovierecomenderApplication.class, args);

		RecomenderImplementation recomender = appContext.getBean(RecomenderImplementation.class);

		String[] result = recomender.recomendedMovies("Finding Dory");
		System.out.println("Recomendations for Finding Dory:" + Arrays.toString(result));
	}

}
