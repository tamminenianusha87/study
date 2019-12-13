package com.hcl.bankproject;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class AccountTest {
	static Account account=null;
	@BeforeClass
	public static void setUp() {
		account=new Account();
	}

	@Test
	public void testGettersAndSetters() {
	account=new Account();
	account.setAccountNo(1);
	account.setFirstName("Anusha");
	account.setLastName("Mahesh");
	account.setCity("Kavali");
	account.setState("AP");
	account.setAmount(250000);
	account.setCheqFacil("yes");
	account.setAccountType("savings");
	assertEquals(1, account.getAccountNo());
	assertEquals("Anusha", account.getFirstName());
	assertEquals("Mahesh", account.getLastName());
	assertEquals("Kavali", account.getCity());
	assertEquals("AP", account.getState());
	assertEquals(250000,account.getAmount());
	assertEquals("yes", account.getCheqFacil());
	assertEquals("savings", account.getAccountType());
	
}
}