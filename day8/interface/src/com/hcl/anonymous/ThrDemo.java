package com.hcl.anonymous;

public class ThrDemo {
 public static void main(String[] args) {
	Thread t1=new Thread() {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i+=2){
			System.out.println("Even "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	};
	
	Thread t2=new Thread() {
		@Override
		public void run() {
			// TODO Auto-generated method stub
			for(int i=1;i<10;i+=2){
				System.out.println("Odd "+i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	};
	t1.start();
	t2.start();
 }
}


