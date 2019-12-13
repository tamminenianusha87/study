package com.hcl.thrdemo;

class MTable {
	synchronized void show(int n) {
		int p;
		for(int i=1;i<=10;i++) {
			p=n*i;
			System.out.println(n+ " * " +i+ " = " +p);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class Tab1 extends Thread {
MTable mtable;

	Tab1(MTable mtable) {

	this.mtable = mtable;
}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		mtable.show(12);
	}
	
}
class Tab2 extends Thread {
	MTable mtable;

 Tab2(MTable mtable) {
	
		this.mtable = mtable;
	}

@Override
public void run() {
	// TODO Auto-generated method stub
	mtable.show(8);
}
}
 class Tab3 extends Thread {
	 MTable mtable;

	 Tab3(MTable mtable) {
	
		this.mtable = mtable;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		mtable.show(19);
	}
	 
 }
	

public class ThrTable {
public static void main(String[] args) {
	MTable mtable=new MTable();
	Thread t1=new Thread(new Tab1(mtable));
	Thread t2=new Thread(new Tab2(mtable));
	Thread t3=new Thread(new Tab3(mtable));
	
	t1.start();
	t2.start();
	t3.start();
}
}
