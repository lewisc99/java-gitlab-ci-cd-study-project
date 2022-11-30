package com.in28minutes.microservices.limitsservice;

import com.in28minutes.microservices.limitsservice.controller.LimitsController;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class LimitsServiceApplicationTests {



	@Test
	void contextLoads() {


	}

	@Test
	void simpleTest()
	{}

	@Test
	void another_test()
	{
		LimitsController limitsController = new LimitsController();

		assertNotNull(limitsController);

		
	}

}
