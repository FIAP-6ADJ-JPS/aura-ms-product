package com.postech.aura_ms_product;

import org.springframework.boot.SpringApplication;

public class TestAuraMsProductApplication {

	public static void main(String[] args) {
		SpringApplication.from(AuraMsProductApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
