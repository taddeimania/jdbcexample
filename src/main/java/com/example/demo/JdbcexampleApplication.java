package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class JdbcexampleApplication implements CommandLineRunner {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(JdbcexampleApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {
		System.out.println("HERERERE!JOEL JOEL");
		// jdbcTemplate.execute("DROP TABLE topic IF EXISTS");
		// jdbcTemplate.execute("CREATE TABLE topic (id SERIAL, title VARCHAR(255), description VARCHAR(255))");
	}
}
