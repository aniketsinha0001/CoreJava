package com.solution;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Recursion {

	public static void main(String...args){

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Num");
	try{
	int n=sc.nextInt();
	int result= fact(n);
	System.out.println("Factorial is"+result);
	}
	catch (InputMismatchException e) {
		System.out.println("pls Enter Number Only "+e);
	}
	
	}
	static int fact(int num){
		int fact=1;
		if(num==1){
			return num;
		}
		fact=num*fact(num-1);
		return fact;
	}	
}