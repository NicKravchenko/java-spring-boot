package com.nickravchenko.tenisplayer;

import java.sql.Date;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TenisPlayerApplication implements CommandLineRunner {

	private Logger logger = org.slf4j.LoggerFactory.getLogger(this.getClass());

	@Autowired
	PlayerDAO dao;

	public static void main(String[] args) {
		SpringApplication.run(TenisPlayerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// logger.info("Inserting Player 4: {}", dao.insertPlayer(
		// new Player(4, "Thiem", "Austria",
		// new Date(System.currentTimeMillis()),
		// 17)));

		// logger.info("Updating Player with Id 4: {}", dao.updatePlayer(
		// new Player(4, "Thiem", "Austria",
		// Date.valueOf("1991-09-03"), 17)));

		// logger.info("All users -> {}", dao.getAllPlayers());
		// logger.info("Deleting Player with Id 2: {}", dao.deletePlayerById(2));
		// logger.info("All users -> {}", dao.getAllPlayers());
		// dao.createTournamentTable();
		logger.info("French Players: {}", dao.getPlayerByNationality("France"));

	}
}
