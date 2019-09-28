package org.ets.studentservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CloudFunctionApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudFunctionApplication.class, args);
	}

	/*@Bean
	public Function<String,String> upperCase(){
		return input -> caseService.upperCase(input);
	}

	@Bean
	public Function<String,String> lowerCase(){
		return input -> {
			System.out.println("In lowerCase Function");
			return input.toLowerCase();
		};
	}*/

}
