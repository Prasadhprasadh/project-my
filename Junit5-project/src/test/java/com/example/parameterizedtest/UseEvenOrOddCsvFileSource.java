package com.example.parameterizedtest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class UseEvenOrOddCsvFileSource {

	EvenorOddCsvFile e1=new EvenorOddCsvFile();
	
	@ParameterizedTest
	//@CsvFileSource(resources= "/UseEvenorOdd.csv", numLinesToSkip=1)
	@CsvSource({"10,even","11,odd"})
	public void test_evenorodd(int a, String b) {
		
		assertEquals(b,e1.evenorodd(a));
	}
}
