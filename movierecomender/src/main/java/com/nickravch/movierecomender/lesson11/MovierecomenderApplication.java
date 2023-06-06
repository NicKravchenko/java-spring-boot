package com.nickravch.movierecomender.lesson11;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MovierecomenderApplication {

	public static void main(String[] args) {
		ApplicationContext appContext = SpringApplication.run(MovierecomenderApplication.class, args);

		RecomenderImplementation recomender = appContext.getBean(RecomenderImplementation.class);

		System.out.println(recomender);
	}

}
