package com.cg.updaterawmaterialstock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableDiscoveryClient
@EnableJpaRepositories("com.cg.updaterawmaterialstock.repository")
public class UpdateRawMaterialStockApplication {

	public static void main(String[] args) {
		SpringApplication.run(UpdateRawMaterialStockApplication.class, args);
	}

}
