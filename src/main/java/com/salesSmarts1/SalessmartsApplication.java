package com.salesSmarts1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class SalessmartsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SalessmartsApplication.class, args);
	}

}
