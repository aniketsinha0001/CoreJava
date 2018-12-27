package com.sinha.aniket;

import java.util.Scanner;

class PrimeNumber {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		if(T>=1&&T<=30){
		    for(int i=1;i<=T;i++){
		        int N=sc.nextInt();
		        if(N>1&&N<=100){
		              int flag=0;
		              for(int j=2;j<=N/2;j++){
		                  if(N%j==0){
		                      flag=1;
		                  }
		              }
		              if(flag==1){
		                  System.out.println("No");
		              }
		              else{
		                  System.out.println("Yes");
		              }
		        }
		    }
		}
	}
}