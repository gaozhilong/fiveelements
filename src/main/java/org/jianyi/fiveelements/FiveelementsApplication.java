package org.jianyi.fiveelements;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.config.EnableWebFlux;

@EnableWebFlux
@SpringBootApplication
public class FiveelementsApplication {

	public static void main(String[] args) {
		SpringApplication.run(FiveelementsApplication.class, args);
	}

}
