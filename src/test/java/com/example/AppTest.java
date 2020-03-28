package com.example;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

@SpringBootTest(classes = App.class, webEnvironment = WebEnvironment.RANDOM_PORT)
public class AppTest {
	@LocalServerPort
	int port;
	
	TestRestTemplate restTemplate = new TestRestTemplate();
	
	@Test
	public void testHome() {
		ResponseEntity<String> response = restTemplate.getForEntity("http://localhost:" + port, String.class);
		assertThat(response.getStatusCode(), is(HttpStatus.OK));
		assertThat(response.getBody(), is("Hello world!"));
	}
}
