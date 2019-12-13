package com.hcl.bankproject;

import java.util.Scanner;

public class SearchAccountMain {
public static void main(String[] args) {
	int accountNo;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter AccountNo");
	accountNo=sc.nextInt();
	AccountDAO dao=new AccountDAO();
	Account account=dao.searchAccount(accountNo);
	if(account!=null) {
		System.out.println("FirstName "+account.getFirstName());
		System.out.println("LastName  "+account.getLastName());
		System.out.println("city "+account.getCity());
		System.out.println("state "+account.getState());
		System.out.println("Amount "+account.getAmount());
		System.out.println("cheqFacil "+account.getCheqFacil());
		System.out.println("accountType "+account.getAccountType());
	}else {
		System.out.println("AccountNo not found..");
	}
}
}
