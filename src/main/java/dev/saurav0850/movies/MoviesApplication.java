package dev.saurav0850.movies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
//Spring RestController annotation is used to cre	ate RESTful web services using Spring MVC.
@Component
@ComponentScan
@EnableMongoRepositories
public class MoviesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviesApplication.class, args);
	}
//Annotation for mapping HTTP GET requests onto specific handler methods.

//The handler method returns a Boolean value.
// This value indicates whether Dynamo should continue processing
// the rest of the page after this handler has finished.

//	Step 3: open application.properties and add db name and connection url
//	Step 4: Create .env file in resources folder


}
