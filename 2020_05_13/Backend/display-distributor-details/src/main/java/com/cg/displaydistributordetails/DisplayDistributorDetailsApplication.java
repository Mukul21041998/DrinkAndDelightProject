
package com.cg.displaydistributordetails;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableDiscoveryClient
@EnableJpaRepositories("com.cg.displaydistributordetails.repository")
public class DisplayDistributorDetailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DisplayDistributorDetailsApplication.class, args);
	}

}
