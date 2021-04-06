package com.amdeus.creational.singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestSingleton {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		
		/*
		 * int firstArg=0; if (args.length > 0) { try { firstArg =
		 * Integer.parseInt(args[0]); } catch (NumberFormatException e) {
		 * System.err.println("Argument" + args[0] + " must be an integer.");
		 * System.exit(1); } }
		 */
		Scanner in = new Scanner(System.in);
		String firstArg = in.nextLine();
		List<String> vowels = new ArrayList<String>();
		vowels.add("a");
		vowels.add("e");
		vowels.add("i");
		vowels.add("o");
		vowels.add("u");
		for (int i = 0; i < Integer.parseInt(firstArg); i++) {
			// String inputString = args[i];
			String inputString = in.nextLine();
			String[] inputStringArray = inputString.split("");
			int vowel = 0;
			int consonent = 0;
			for (String singleString : inputStringArray) {
				if (vowels.contains(singleString.trim())) {
					vowel = vowel + 1;
				} else if(singleString!=null && !(singleString.equalsIgnoreCase(""))) {
					consonent = consonent + 1;
				}
			}
			System.out.println(vowel + " " + consonent + " " + (vowel * consonent));
		}
       // in.close();
		//cloneTest();
		//multiThreadTest();
	}

	private static void multiThreadTest() {
		Thread thread = new Thread(new MultithreadDemo());
		thread.start();
	}

	private static void cloneTest() throws CloneNotSupportedException {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		System.out.println("First object: " + s1.toString());
		System.out.println("Second object: " + s2.toString());
		System.out.println("cloned object: " + s2.clone());
	}

}
