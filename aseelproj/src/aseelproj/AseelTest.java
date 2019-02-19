package aseelproj;

import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AseelTest {

	@Test
	public void test1() {
		sc obj1=new sc();
		int result =obj1.getcount();
		assertEquals(0,result);
	}
	
	@Test
	public void test2() {
		sc obj2=new sc();
		product obj3=new product();
		obj2.add("Java Book");
		int result1 =sc.getcount();
		int result2=sc.getprice();
		assertEquals(1,result1);
		assertEquals(127,result2);
	}
	@Test
	public void test3() {
		sc obj4=new sc();
		sc obj66=new sc();
		obj4.clearLinkList();
		int result =obj4.getcount();
		product obj5=new product();
		obj4.add("Java Book");
		obj4.add("Web design Book");
		int result1=obj4.getcount();
		int result2=obj66.getprice();
		
		assertEquals(2,result1);
		assertEquals(227,result2);
	}

	
	
}
