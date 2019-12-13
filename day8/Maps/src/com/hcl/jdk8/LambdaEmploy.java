package com.hcl.jdk8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaEmploy {

	public static void main(String[] args) {
		List<Employ> list=new ArrayList<Employ>();
		list.add(new Employ (1,"Anu","java","swe",4000));
		list.add(new Employ (2,"Mahi","sql","swe",7990));
		list.add(new Employ (3,"Suku","python","swe",8000));
		list.add(new Employ (4,"sruthi","html","swe",78909));
		list.add(new Employ (5,"Vyshu","java","swe",7890));
		
		list.stream().filter(e -> e.basic>=5000).forEach(x -> {
			System.out.println(x);
		});
		System.out.println("Max Basic record \n------");
	     Employ maxProduct=list.stream().max((e1,e2)
	    		  ->e1.basic >=e2.basic
	             ?1:-1).get();
	System.out.println(maxProduct);
	
	System.out.println("Min price mobile \n------");
	Employ minProduct=list.stream().min((e1,e2)
			  ->e1.basic <=e2.basic
	       ?-1:1).get();
	System.out.println(minProduct);

	
	
	}
}
