package com.capgemini.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.main.School;

public class SchoolTest {
	private static School dps;
	private static School hps;
	private static School ags;
	
	@BeforeClass
	public static void startUp() {
		dps=new School("DPS","Delhi","Delhi",1);
		hps=new School("HPS","Hyderabad","secunderabad",2);
		ags=new School("AGS","Anantapur","Anantapur",3);
		
	}
	@Test
	public void testTheSizeWheatherItIsAcceptingDuplicates() {
		HashSet<School> school=new HashSet<School>();
		school.add(dps);
		school.add(hps);
		school.add(ags);
		school.add(ags);

		assertEquals(3, school.size());
	}
	@Test
	public void testTheInsertionFlow() {
		ArrayList<School> school=new ArrayList<School>();
		school.add(dps);
		school.add(hps);
		school.add(ags);
		Iterator<School> iterator=school.iterator();
		assertEquals("DPS",iterator.next().getName());
		assertEquals("HPS",iterator.next().getName());
		assertEquals("AGS",iterator.next().getName());
	}
	

	

}
