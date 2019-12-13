package com.hcl.thrdemo;

class Demo {
	 synchronized void dispMsg (String name) {
		System.out.print("Hello "+name);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("How are u");
	}
}
class Sai extends Thread {
	Demo demo;
	Sai(Demo demo) {
		this.demo=demo;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
	demo.dispMsg("Sai");
	}
	
}
class Teja extends Thread {
	Demo demo;
 Teja(Demo demo) {
	
		this.demo = demo;
	}
@Override
public void run() {
	// TODO Auto-generated method stub
	demo.dispMsg("Teja");
}
	
}
class Priyanka extends Thread {
	Demo demo;

	public Priyanka(Demo demo) {
		
		this.demo = demo;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		demo.dispMsg("Priyanka");
	}
	
	
}
public class SyncDemo {
public static void main(String[] args) {
	Demo demo=new Demo();
	Sai sai=new Sai(demo);
	Teja teja=new Teja(demo);
	Priyanka priyanka=new Priyanka(demo);
	Thread t1=new Thread(sai);
	Thread t2=new Thread(teja);
	Thread t3=new Thread(priyanka);
	t1.start();
	t2.start();
	t3.start();
}
}
