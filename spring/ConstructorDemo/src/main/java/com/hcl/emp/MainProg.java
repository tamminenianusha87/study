package com.hcl.emp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainProg {
public static void main(String[] args) {
	ApplicationContext ctx=new ClassPathXmlApplicationContext("emp.xml");
	Employ e=(Employ)ctx.getBean("bean1");
	System.out.println(e);
}
}
