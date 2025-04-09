package com.postech.aura_ms_product;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class AuraMsProductApplicationTests {

	@Test
	void contextLoads() {
	}

}
