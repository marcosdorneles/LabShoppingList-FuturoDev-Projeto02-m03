package futuroDev.Projeto03.LabShoppingList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class LabShoppingListApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabShoppingListApplication.class, args);
	}

}


