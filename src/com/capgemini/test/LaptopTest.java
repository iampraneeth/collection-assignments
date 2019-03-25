package com.capgemini.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.main.Laptop;

public class LaptopTest {
	private static Laptop dellLaptop;
	private static Laptop hpLaptop;
	private static Laptop msiLaptop;
	
	@BeforeClass
	public static void setUp() {
		dellLaptop=new Laptop("Dell","Inspiron 5558","windows 10","i7");
		hpLaptop=new Laptop("HP","NoteBook","windows 10","i5");
		msiLaptop=new Laptop("MSI","dragon","windows 8","i5");
		
	}
	@Test
	public void testWheatherItIsAcceptingDuplicates() {
		HashSet<Laptop> set=new HashSet<Laptop>();
		set.add(dellLaptop);
		set.add(hpLaptop);
		set.add(msiLaptop);
		assertEquals(3,set.size());
		
	}
	@Test
	public void testWheatherTheOrderIsMaintained() {
		ArrayList<Laptop> al=new ArrayList<Laptop>();
		al.add(dellLaptop);
		al.add(hpLaptop);
		al.add(msiLaptop);
		Iterator<Laptop> iterator=al.iterator();
		assertEquals("Dell", iterator.next().getCompany());
	}
	

}
