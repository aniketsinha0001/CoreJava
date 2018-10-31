package com.solution;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.next();
		
		String result=reverseDemo(s);
		System.out.println("Reversed String is "+result);

	}
	static String reverseDemo(String str){
		
		if(str.equals("null")||str.isEmpty()){
			return str;
		}
		String rev=reverseDemo(str.substring(1))+str.charAt(0);
		
		return rev;
	}
}
