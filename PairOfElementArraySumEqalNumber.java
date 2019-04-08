package com;

public class PairOfElementArraySumEqalNumber {

	
	public static void sumOfPairs(int a[],int n){
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if((a[i]+a[j])==n){
					System.out.println(a[i]+" "+a[j]);
				}
				
			}
		}
		
	}
	public static void main(String[] args) {
		
		int x[]={5,3,2,6,7,9,1,4,8};
		int n=12;
		sumOfPairs(x,n);
	}

}
