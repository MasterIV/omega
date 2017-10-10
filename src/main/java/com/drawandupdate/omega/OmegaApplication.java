package com.drawandupdate.omega;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableScheduling
public class OmegaApplication {
	public static void main(String[] args) {
		SpringApplication.run(OmegaApplication.class, args);
	}
}
