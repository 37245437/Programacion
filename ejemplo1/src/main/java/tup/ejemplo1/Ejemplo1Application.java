package tup.ejemplo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Ejemplo1Application {

	public static void main(String[] args) {
		SpringApplication.run(Ejemplo1Application.class, args);
	}
	@GetMapping ("/") 
	public static String Hola() {
		String nombre = "Ivana";
		return"Hola! " + nombre;
	}
}
