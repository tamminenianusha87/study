package com.hcl.calc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainProg {
public static void main(String[] args) {
	ApplicationContext ctx=new ClassPathXmlApplicationContext("calc.xml");
	Calc c=(CalcImpl)ctx.getBean("bean1");
	System.out.println(c.sum());
	System.out.println(c.sub());
	System.out.println(c.mult());
	Resource res=new ClassPathResource("calc.xml");
	BeanFactory factory=new XmlBeanFactory(res);
	Calc c=(CalcImpl) factory.getBean("bean1");
	System.out.println(c.sum());
}
}
