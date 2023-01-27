package com.ankhang.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ProjectMicroserviceDiscoveryLoadApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectMicroserviceDiscoveryLoadApplication.class, args);
	}

}
