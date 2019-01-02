package com.sinha.aniket;

import java.util.Scanner;

public class GeometricProgression {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int T=sc.nextInt();
			int nthTerm=0;
			
			for(int i=1;i<=T;i++){
				double A=sc.nextInt();
				double B=sc.nextInt();
				int N=sc.nextInt();
				double r=B/A;
				System.out.println(r);
				nthTerm=(int) (A*Math.pow(r, N-1));
				
				System.out.println((int)Math.floor(nthTerm));

			}
		
	}

}
