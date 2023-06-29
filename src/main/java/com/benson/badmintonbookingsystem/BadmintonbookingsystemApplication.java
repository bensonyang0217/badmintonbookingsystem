package com.benson.badmintonbookingsystem;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class BadmintonbookingsystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(BadmintonbookingsystemApplication.class, args);
	}

}
