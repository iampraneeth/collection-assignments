
package com.capgemini.client;

import java.util.ArrayList;
//import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Alex");
		names.add("anna");
		names.add("adam");
		names.add("bob");
		names.add("grant");

		/*
		 * Iterator<String> it = names.iterator(); while (it.hasNext()) { String name =
		 * it.next(); System.out.println(name); }
		 */
		for(String name:names) {
			System.out.println(name);
		}
		

	}

	@Override
	public String toString() {
		return "ArrayListDemo []";
	}
}
