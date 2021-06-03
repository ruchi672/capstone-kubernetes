package com.mindtree.capstoneproject;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CapstoneprojectApplicationTests {

	@Test
	void contextLoads() {
	}
	
	protected void run() {
        double r = Math.random();
        if (r < 0.1) {
            fail("oops");
        } else if (r < 0.2) {
            throw new AssumptionViolatedException("skipping");
        }
    }

}
