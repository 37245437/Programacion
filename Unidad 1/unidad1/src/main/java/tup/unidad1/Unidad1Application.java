package tup.unidad1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Unidad1Application {

	public static void main(String[] args) {
		SpringApplication.run(Unidad1Application.class, args);
	}
@GetMapping ()
public static String hola () {
	return String.format ("¡Hola!");
}
}
