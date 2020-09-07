package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class SpringArgumentsCommandsExampleApplication {

	public static void main(String[] args) {
		log.info(String.join(" ", args));
		SpringApplication.run(SpringArgumentsCommandsExampleApplication.class, args);
	}

}
