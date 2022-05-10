package tup.tp01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Tp01Application {

	public static void main(String[] args) {
		SpringApplication.run(Tp01Application.class, args);
	}
	@GetMapping ("/")
	public static String Hola() {
		String nombre = "Ivana";
		return"Hola! " + nombre;
	}
}
