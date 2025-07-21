package com.springboot.assignment;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

// Qus2: read custom properties
@SpringBootApplication
public class AssignmentApplication implements CommandLineRunner
{

	@Value("${app.welcome}")
	private String welcome;

	@Value("${app.company}")
	private String company;

	private final JdbcTemplate jdbc;
	public AssignmentApplication(JdbcTemplate jdbc) { this.jdbc = jdbc; }

	public static void main(String[] args)
	{
		SpringApplication.run(AssignmentApplication.class, args);
	}

	@Override
	public void run(String... args)
	{
		System.out.println(welcome+" "+company);
	}
}

