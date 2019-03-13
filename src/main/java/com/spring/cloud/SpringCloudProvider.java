package com.spring.cloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class SpringCloudProvider {
    
    @Value("${foo.db}")
    private String foodb;
    
	@GetMapping("/hello")
	public String hello(){
		System.out.println("hello "+foodb);
		return "hello,I am springcloud provider."+foodb;
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudProvider.class, args);
	}
}
