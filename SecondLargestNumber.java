package com;

import java.util.Arrays;

public class SecondLargestNumber {

	public static void secondLargestNumber(int a[]){
		Arrays.sort(a);
		for(int x:a){
		System.out.print(x+" ");
		}
		System.out.println();

		System.out.println(a[a.length-2]);
	}
	
	public static void main(String[] args) {
		int x[]={22,12,56,33,54,8,20};
		secondLargestNumber(x);
	}
}
