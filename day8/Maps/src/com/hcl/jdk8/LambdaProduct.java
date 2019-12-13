package com.hcl.jdk8;

import java.util.ArrayList;
import java.util.List;

public class LambdaProduct {

	public static void main(String[] args) {
		List<Product> list=new ArrayList<Product>();
		list.add(new Product(1,"Samsung" ,17000));
		list.add(new Product(3,"Iphone 6S",65000));
		list.add(new Product(2,"Sony Xperia",25000));
		list.add(new Product(4,"Nokia Lumia",15000));
		list.add(new Product(5,"Redmi4",26000));
		list.add(new Product(6,"Lenovo Vibe",19000));
		list.stream().filter(p -> p.price>=20000).forEach(x -> {
			System.out.println(x);
		});
		list.stream().filter(p ->p.name.startsWith("s")).forEach(x -> {
			System.out.println(x);
		});
		System.out.println("Max price mobile \n------");
      Product maxProduct=list.stream().max((p1,p2)
    		  ->p1.price >=p2.price
             ?1:-1).get();
System.out.println(maxProduct);
System.out.println("Min price mobile \n------");
Product minProduct=list.stream().min((p1,p2)
		  ->p1.price <=p2.price
       ?-1:1).get();
System.out.println(minProduct);
System.out.println("First 3 records");
list.stream().limit(3).forEach(p -> {
	System.out.println(p);
});
System.out.println("After skipping 2 records");
list.stream().skip(2).forEach(p -> {
	System.out.println(p);
});
	}

}