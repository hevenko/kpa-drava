package com.example.demo

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class DemoApplication implements CommandLineRunner {

	@Autowired
	private GlobalProperties globalProperties

	static void main(String[] args) {
		SpringApplication.run(DemoApplication, args)
	}

	@Override
	void run(String... args) throws Exception {
		System.out.println(globalProperties.password)
		System.out.println("**********rajko**********: "+globalProperties.url)
	}
}
