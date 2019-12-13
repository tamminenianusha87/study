package com.hcl.anonymous;

interface ITraining 
{
	void name();
	void email();
}
public class Demo1 {
public static void main(String[] args) {
	ITraining obj=new ITraining() {
		
		@Override
		public void name() {
			// TODO Auto-generated method stub
			System.out.println("Name is HCL");
		}
		
		@Override
		public void email() {
			// TODO Auto-generated method stub
			System.out.println("Admin@hcl.com");
		}
	};
	obj.name();
	obj.email();
}
}
