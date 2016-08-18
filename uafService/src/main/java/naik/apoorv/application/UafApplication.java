package naik.apoorv.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfiguration
@SpringBootApplication
public class UafApplication {

	public static void main(String[] args) {
		SpringApplication.run(UafApplication.class, args);
	}
}
