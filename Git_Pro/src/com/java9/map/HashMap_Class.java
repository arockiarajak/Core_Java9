package com.java9.map;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class HashMap_Class {

	public static void main(String[] args) {
		
		Map<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("raj", 1);
		System.out.println(hm);
		System.out.println("Newly added Statement");
	}
}
