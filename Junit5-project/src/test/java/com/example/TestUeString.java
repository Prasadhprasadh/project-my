package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class TestUeString {
	UseString s1=new UseString();
	
	@Test
	public void test_changetoint() {
		assertEquals(10,s1.Changetoint("10"));
	}
	
	@Test
	public void test_changetointnull() {
		//String a=null;
		//assertEquals(10,s1.Changetoint(a));
		
		assertThrows(IllegalArgumentException.class,()-> s1.Changetoint(null));
	}
	
}
