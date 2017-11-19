package com.dopsonbr.psadminserver;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@EnableAdminServer
@EnableAutoConfiguration
@SpringBootApplication
public class PsAdminServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PsAdminServerApplication.class, args);
	}
}
