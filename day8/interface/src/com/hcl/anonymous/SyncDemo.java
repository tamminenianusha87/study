package com.hcl.anonymous;

class Demo {
	void dispMsg(String name) {
		System.out.println("Hello "+name);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("How r u..");
	}
}
public class SyncDemo {

	public static void main(String[] args) {
		Demo obj=new Demo();
		Thread t1=new Thread() {
		@Override
		public void run() {
			// TODO Auto-generated method stub
			obj.dispMsg("Sowmya");
		}	
		};
		Thread t2=new Thread() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				obj.dispMsg("Harika");
			}	
			};
			t1.start();
			t2.start();
			
	}
}
