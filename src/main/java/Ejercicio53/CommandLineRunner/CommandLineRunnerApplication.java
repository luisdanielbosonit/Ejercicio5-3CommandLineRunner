package Ejercicio53.CommandLineRunner;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class CommandLineRunnerApplication implements CommandLineRunner {






	public static void main(String[] args) {
		//log.info("Hola desde la clase Inicial.");
		SpringApplication.run(CommandLineRunnerApplication.class, args);
		log.info("Soy la tercera clase ");
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("Hola desde clase secundaria");

	}
}
