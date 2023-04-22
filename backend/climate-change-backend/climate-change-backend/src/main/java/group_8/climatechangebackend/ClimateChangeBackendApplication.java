package group_8.climatechangebackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class ClimateChangeBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClimateChangeBackendApplication.class, args);
	}
}
