package com.capgemini.test;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.main.CellPhone;

public class CellPhoneTest {

	private static CellPhone apple;
	private static CellPhone onePlus;
	private static CellPhone nokia;
	
	@BeforeClass
	public static void startUp() {
		apple=new CellPhone("Apple","xs","good","ios10",100000);
		onePlus=new CellPhone("oneplus","6t","best","androidone",200000);
		nokia=new CellPhone("Nokia","7.1","ok","oreo",150000);
		
		
	}
	@Test
	public void sizeIsSame() {
		HashSet<CellPhone> s1=new HashSet<CellPhone>();
		s1.add(apple);
		s1.add(onePlus);
		s1.add(nokia);
		
		assertEquals(3, s1.size());
	}
	@Test
	public void testWheatherItIsAcceptingDuplicatesOrNot() {
		HashSet<CellPhone> cellPhone=new HashSet<CellPhone>();
		cellPhone.add(apple);
		cellPhone.add(onePlus);
		cellPhone.add(nokia);
		assertEquals(3, cellPhone.size());
	}
	@Test
	public void testWheatherItIsSortedOrNot() {
		TreeSet<CellPhone> c1=new TreeSet<CellPhone>();
		c1.add(onePlus);
		c1.add(nokia);
		c1.add(apple);
		Iterator<CellPhone> iterator=c1.iterator();
		assertEquals("Apple",iterator.next().getCompany());
		assertEquals("Nokia",iterator.next().getCompany());
		assertEquals("oneplus",iterator.next().getCompany());

}
}
