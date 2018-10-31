package com.solution;

import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		Number num=new Number();
		num.display(n);
	}	
	private int display(int n){
		if(n==0){
			
		return 1;
		}
		System.out.println(n);

		return display(n-1);
		
	}

}
