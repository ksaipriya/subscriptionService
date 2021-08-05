package com.cts.subscription.modeltest;


import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;

import com.cts.subscription.model.AuthResponse;



 class AuthResponseTest {
	AuthResponse authResponse = new AuthResponse();
	AuthResponse authResponseTemp = new AuthResponse("Uid","Name",true);
	@Test
	void testUid() {
		authResponse.setUid("priya");
		assertEquals("priya", authResponse.getUid());
	}

	@Test
	void testName() {
		authResponse.setName("priya");
		assertEquals("priya", authResponse.getName());
	}

	@Test
	void testIsValid() {
		authResponse.setValid(true);
		assertEquals(true, authResponse.isValid());
	}
	
	@Test
	void testToString() {
		String string = authResponseTemp.toString();
		assertEquals(authResponseTemp.toString(), string);
	}
}
