package com.Repl;
import java.util.*;
public class Riple_203 {

	public static void main(String[] args) {

		Map<String, String> addresses = new HashMap<>();
		addresses.put("Street", "Patrick ST");
		addresses.put("Suite", "265");
		addresses.put("City", "Vienna");
		addresses.put("Zip", "22180");
		addresses.put("Country", "United State");

		Set<String> keys = addresses.keySet();

		Iterator<String> it = keys.iterator();
		while (it.hasNext()) {
			String i = it.next();
			System.out.println(i+ "  " + addresses.get(i));
		}

	}

}
