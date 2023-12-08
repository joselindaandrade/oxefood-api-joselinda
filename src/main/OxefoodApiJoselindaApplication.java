package br.com.ifpe.oxefood;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OxefoodApiJoselindaApplication {

	public static void main(String[] args) {
		SpringApplication.run(OxefoodApiJoselindaApplication.class, args);
	}

	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}

}
