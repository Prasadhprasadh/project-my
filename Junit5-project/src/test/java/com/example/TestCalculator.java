package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestCalculator {
	
	Calculator c1=null;
	
	@BeforeEach
	public void init() {
		c1=new Calculator();
	}
	
	@AfterEach
	public void destroy() {
		c1=null;
	}

	@Test
	public void test_add() {
		assertEquals(50,c1.add(20, 30));
	}
	
	@Test
	public void test_multiply() {
		assertEquals(10,c1.multiply(2, 5));
	}
}
