package com.capgemini.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.main.Car;

public  class CarTest {
	private static Car audi;
	private static Car bmw;
	private static Car benz;
	
	@BeforeClass
	public  static void startUp() {
		audi= new Car("Audi","v8",2015,2000000);
		bmw=new Car("bmw","7 series",2016,1000000);
		benz=new Car("benz","s class",2012,2500000);
		
		
		
	}
	@Test
	public void testWheatherItIsAcceptingDuplicatesOrNot() {
		HashSet<Car> s1=new HashSet<Car>();
		s1.add(audi);
		s1.add(benz);
		s1.add(bmw);
		
		assertEquals(3, s1.size());
	}
	@Test
	public void testInsertionOrderFlow() {
		ArrayList<Car> c1=new ArrayList<Car>();
		c1.add(audi);
		c1.add(benz);
		c1.add(bmw);
		Iterator<Car> iterator=c1.iterator();
		assertEquals("Audi",iterator.next().getMake());
		assertEquals("benz",iterator.next().getMake());
		assertEquals("bmw",iterator.next().getMake());


	}
	@Test
	public void testWheatherItIsSortedOrNot() {
		TreeSet<Car> c1=new TreeSet<Car>();
		c1.add(benz);
		c1.add(audi);
		c1.add(bmw);
		Iterator<Car> iterator=c1.iterator();
		assertEquals("Audi",iterator.next().getMake());
		assertEquals("benz",iterator.next().getMake());
		assertEquals("bmw",iterator.next().getMake());
		
	}
	
}
