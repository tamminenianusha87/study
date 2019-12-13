package com.hcl.junit;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestData {
static Data data;
 @BeforeClass
public static void setup() {
	data=new Data();
}
 @Test
 public void Div() {
assertEquals(1, data.div(5, 4));
 }
 @Test(expected=ArithmeticException.class)
 public void DivEx() {
	 data.div(5, 0);
 }
 @Test
 public void getPropertyTest() {
	 assertNotNull(data.getProperty("Anu"));
	 assertNull(data.getProperty("Suku"));
 }
 @Test
 public void TestEven() {
	 assertTrue(data.even(10));
	 assertFalse(data.even(11));
 }
 @Test
 public void minArray() {
	 int[] a={-1,4,7,2,35};
	assertEquals(-1,data.minArray(a));
	assertEquals(-1, data.minArray(new int[]{-1,4,7,2,35}));
 }
 
 @Test
 public void testMax3() {
	 assertEquals(5, data.max(5,2,3));
	 assertEquals(5, data.max(2,5,3));
	 assertEquals(5, data.max(2,3,5));
	 
 }
// @Ignore
 @Test
 public void testSum() {
	 assertEquals(5, data.sum(2,3));
 }
	@Test
	public void test() {
		Data data=new Data();
		assertEquals("Welcome to junit", data.sayHello());
		
	}
@AfterClass
public static void tearDown() {
	data=null;
}
}
