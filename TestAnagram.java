package com;

import java.util.Arrays;

public class TestAnagram {

	public static void checkAnagram(String s1,String s2){
		s1=s1.replaceAll("\\s+","").toLowerCase();
		s2=s2.replaceAll("\\s+", "").toLowerCase();
		
		char ch1[]=s1.toCharArray();
		Arrays.sort(ch1);
		System.out.println(ch1);
		char ch2[]=s2.toCharArray();
		Arrays.sort(ch2);
		System.out.println(ch2);
		
		if(Arrays.equals(ch1, ch2)){
			System.out.println("Anagram!");
		}
		else{
			System.out.println("Not Anagram!");
		}
		
	}	
	
	public static void main(String[] args) {
		
		checkAnagram("rail safety", "fairy tales");
		checkAnagram("adultery","true lady");
		checkAnagram("how","why");

		checkAnagram("eleven plus two", "twelve plus one");
		
	}

}
