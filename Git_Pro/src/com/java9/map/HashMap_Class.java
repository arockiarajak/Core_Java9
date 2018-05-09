package com.java9.map;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class HashMap_Class {

	public static void main(String[] args) {
		
		Map<String, Integer> hm = Map.of("hai", 1, "raj", 2, "ram", 3, "gopal", 4, "varma", 5, "saliya", 6, "behind", 7, "krackers", 8, "baseball", 9, "samy", 10);
		
		System.out.println(hm);
		System.out.println("Newly added Statement");
	}
}
