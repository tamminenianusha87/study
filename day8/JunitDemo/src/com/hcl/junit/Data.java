package com.hcl.junit;

import java.util.HashMap;
import java.util.Map;

public class Data {
	public int div(int a,int b)throws ArithmeticException{
		return a/b;
	}
	public String getProperty(String key) {
		
		Map<String, String> m=new HashMap<String, String>();
	 m.put("Meena", "Java");
	 m.put("Anu", "Suku");
	 m.put("Mahi", "Java");
	 m.put("Sai", "Pavani");
	 return m.get(key);
	}
	public boolean even(int x) {
		if(x%2==0) {
			return true;
		}
		return false;
	}
	

	public int minArray(int[] x) {
		int min=x[0];
		for(int i=0;i<x.length;i++) {
			if(min >= x[i])
				min=x[i];
		}
		return min;
	}
	public int max(int a,int b,int c) {
		int m=a;
		if(m<b) {
			m=b;
			
		}
		if(m<c) {
			m=c;
			
		}
		
		return m;
	}
	public int sum(int a,int b) {
		return a+b;
		
	}
public String sayHello() {
	return "Welcome to junit";
	
}
}
