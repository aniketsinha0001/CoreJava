package com.solution;

import java.util.Scanner;

public class PalindromUsingRecursion {

	public static void main(String...args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int result=palindrome(n);
		System.out.println(n);
	}
	static int palindrome(int n){
		int sum=0;
		while(n>0){
		int rem=n%10;
		n=n/10;
	    sum=sum*10+rem;
		}
		return n;
	}
}
