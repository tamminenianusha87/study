package com.hcl.thrdemo;


import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Vector;

class Thr1 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
List<String> names=new ArrayList<String>();
		names.add("Sowmya");
		names.add("Anusha");
		names.add("Poornesh");
		names.add("Bharath");
		names.add("Niharuika");
		for (String s : names) {
			System.out.println("ArrayList "+s);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
class Thr2 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		SortedSet<String> names=new TreeSet<String>();
		names.add("Sowmya");
		names.add("Ram");
		names.add("Suku");
		names.add("Anu");
		names.add("Pavan");
		for (String s: names) {
			System.out.println("TreeSet "+s);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
class Thr3 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Vector<String> names=new  Vector<String>(3,2);
		names.add("Sowmya");
		names.add("Ram");
		names.add("Suku");
		names.add("Anu");
		names.add("Pavan");
		for (String s: names) {
		System.out.println("Vector "+s);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
	
}
public class ThrEx {
public static void main(String[] args) {
	Thr1 th1=new Thr1();
	Thr2 th2=new Thr2();
	Thr3 th3=new Thr3();
	Thread t1=new Thread(th1);
	Thread t2=new Thread(th2);
	Thread t3=new Thread(th3);
	t1.start();
	t2.start();
	t3.start();
}
}
