package com.example.parameterizedtest;

public class Multipletestcase {

	
	public int Changetoint(String a) {
		if(a==null) {
			throw new IllegalArgumentException("String is null");
		}
		//return Integer.parseInt(a)>10?Integer.parseInt(a):0;
		return Integer.parseInt(a);
	}
	
	public boolean oddoreven(int a) {
		if(a%2==0) {
			return true;
		}
		return false;
		
	}
}