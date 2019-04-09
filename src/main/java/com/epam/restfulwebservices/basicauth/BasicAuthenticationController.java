package com.epam.restfulwebservices.basicauth;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicAuthenticationController {

	@GetMapping("/hello-world")
	public String helloWorld() {
		return "Hello World";
	}

	@GetMapping("/hello-world-bean")
	public AuthenticationBean helloWorldBean() {
		// throw new RuntimeException("some error has happened contact support at
		// *********");
		return new AuthenticationBean("Hello World515321321321323");
	}

	@GetMapping("/hello-world/path-variable/{name}")
	public AuthenticationBean helloWorldPathVariable(@PathVariable String name) {
		return new AuthenticationBean(String.format("Hello World, %s", name));
	}

	@GetMapping("/basicauth")
	public AuthenticationBean basicAuth() {
		return new AuthenticationBean("You are authenticated");
	}

}
