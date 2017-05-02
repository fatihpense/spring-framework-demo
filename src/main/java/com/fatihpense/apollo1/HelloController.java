package com.fatihpense.apollo1;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fatihpense.apollo1.model.Name;

@RestController
public class HelloController {

	// private static final String template = "Hello, %s %s!";
	private final AtomicLong counter = new AtomicLong();

	@RequestMapping("/hello")
	public Name greeting(@RequestParam(value = "name", defaultValue = "World") String name, String surname) {
		return new Name(counter.incrementAndGet(), name, surname);
	}

}
