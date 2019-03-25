package com.capgemini.test;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.main.Student;

public class StudentTest {

	private static Student ram;
	private static Student akshay;
	private static Student ruchir;
	@Before
	public void startUp() {
		ram=new Student("Ram",1,"Anantapur");
		akshay=new Student("Akshay",2,"Nagpur");
		ruchir=new Student("Ruchir",3,"mumbai");
		
		
	}
	@Test
	public void testWheatherItIsAcceptingDuplicatesOrNot() {
		HashSet<Student> s1=new HashSet<Student>();
		s1.add(akshay);
		s1.add(ram);
		s1.add(ruchir);
		s1.add(akshay);
		s1.add(ram);
		s1.add(ruchir);
		assertEquals(3, s1.size());
	}
	@Test
	public void testMapforKeyValuePair() {
		Map<String, String> map=new HashMap<String, String>();
		map.put(ram.getName(),"Mango");
		map.put(akshay.getName(), "Apple");
		map.put(ruchir.getName(),"Guava");
		assertEquals("Apple", map.get(akshay.getName()));
		assertEquals("Mango", map.get(ram.getName()));
		assertEquals("Guava", map.get(ruchir.getName()));
		
	}
}
