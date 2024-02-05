package br.com.huppers.fahrenheiteurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class FahrenheitEurekaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(FahrenheitEurekaClientApplication.class, args);
	}

}
