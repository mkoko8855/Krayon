package com.krayon.backend;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.security.SecureRandom;
import java.util.Base64;

@SpringBootTest
class BackendApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	@DisplayName("토큰 서명 해시값 생성하기")
	void makeSecretKey() {
		SecureRandom random = new SecureRandom();
		byte[] key = new byte[64];
		random.nextBytes(key);
		String encodedKey = Base64.getEncoder().encodeToString(key);
		System.out.println("encodedKey = " + encodedKey);
	}
}
