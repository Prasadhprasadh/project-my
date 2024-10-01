package com.example.parameterizedtest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.stream.Stream;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class TestParammethodSource {

	ParamMethodSource p1=new ParamMethodSource();
	
	@ParameterizedTest
	@MethodSource("paramvalue")
	@Disabled
	public void test_evenorodd(int a, boolean b) {
		//boolean expected=b;
		assertEquals(b,p1.evenorodd(a));
	}
	
	public static Stream<Arguments> paramvalue(){
		return Stream.of(
				Arguments.of(10,true),
				Arguments.of(11,false),
				Arguments.of(16,true),
				Arguments.of(19,false)
				
				);
	}
	
	@Test
	@RepeatedTest(value=3)
	//@Disabled
	public void val() {
		
		assertTrue(p1.evenorodd(66));
	}
}
