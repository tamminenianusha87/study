package com.hcl.jdk8;

import java.util.ArrayList;
import java.util.List;

public class Lambda4 {

	public static void main(String[] args) {
		List<Integer> lst=new ArrayList<Integer>();
		lst.add(1);
		lst.add(2);
		lst.add(3);
		lst.add(4);
		lst.add(5);
		int sum=lst.stream().reduce(0, (e1,e2) -> e1+e2);
		System.out.println(sum);
	}
}
