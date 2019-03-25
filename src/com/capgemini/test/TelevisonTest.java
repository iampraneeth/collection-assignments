package com.capgemini.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.main.Television;

public class TelevisonTest {

	private static Television lg;
	private static Television samsung;
	private static Television sony;
	@BeforeClass
	public static void startUp() {
		lg =new Television("LG","lcd",100000,true);
		samsung=new Television("Samsung","led",200000,false);
		sony=new Television("Sony","ipc",300000,true);
		
		
	}
	@Test
	public void test() {
		HashSet<Television> s1=new HashSet<Television>();
		s1.add(lg);
		s1.add(samsung);
		s1.add(sony);
		assertEquals(3, s1.size());
	}
	@Test
	public void test1() {
		ArrayList<Television> c1=new ArrayList<Television>();
		c1.add(lg);
		c1.add(samsung);
		c1.add(sony);
		Iterator<Television> iterator=c1.iterator();
		assertEquals("LG",iterator.next().getCompany());
		assertEquals("Samsung",iterator.next().getCompany());
		assertEquals("Sony",iterator.next().getCompany());


	}

}
