package com.benson.badmintonbookingsystem;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
if you don't use db you can use exclude DataSourceAutoConfiguration.
EX: @SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
*
*
*/

@SpringBootApplication
public class BadmintonbookingsystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(BadmintonbookingsystemApplication.class, args);
	}

}
