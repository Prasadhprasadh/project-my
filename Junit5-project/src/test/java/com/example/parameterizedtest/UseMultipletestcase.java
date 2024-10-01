package com.example.parameterizedtest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class UseMultipletestcase {
	Multipletestcase m1=new Multipletestcase();
	
	
	@ParameterizedTest
	@ValueSource(strings= {"2","66","55","88"})
	public void test_param(String a) {
		assertEquals(Integer.parseInt(a),m1.Changetoint(a));
	}
	
	
	@ParameterizedTest
	@ValueSource(ints= {8,6,22,66})
	public void testoddoreven(int a) {
		//m1.oddoreven(a);
		
		assertTrue(m1.oddoreven(a));
		//assertFalse(m1.oddoreven(a));

	}
}
