package com.example;

public class UseString {

	public int Changetoint(String a) {
		if(a==null) {
			throw new IllegalArgumentException("String is null");
		}
		return Integer.parseInt(a);
	}
}
