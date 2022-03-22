package com.mfpe;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AuditManagementZuulFilterApplicationTests {

	@Autowired
	ClaimManagementZuulFilterApplication claimManagementZuulFilterApplication;
	@Test
	void contextLoads() {
		assertNotNull(claimManagementZuulFilterApplication);
	}

}
