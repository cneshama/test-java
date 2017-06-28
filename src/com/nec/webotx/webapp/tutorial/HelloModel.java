package com.nec.webotx.webapp.tutorial;

public class HelloModel {
	
	public int getScore(String name) {
		int sum = 0;
		char[] cArray = name.toCharArray();
		for (int i = 0; i < cArray.length; i++) {
			sum += cArray[i];
		}
		return (sum % 10) + 1;
	}
}
