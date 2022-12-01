package de.geis.azuretest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@SpringBootApplication
public class AzuretestApplication {

	public static void main(String[] args) {
		SpringApplication.run(AzuretestApplication.class, args);
	}

	@GetMapping("/message")
	public String getTestMessage() {
		return "YEAHRRRR DEVOPS BABY";
	}

}
