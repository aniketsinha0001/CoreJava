package com.sinha.aniket;

import java.util.Scanner;

public class FindNthRootOfM {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		if (T >= 1 && T <= 200) {
			for (int tc = 1; tc <= T; tc++) {
				double N = sc.nextInt();
				double M = sc.nextInt();
				double NthRootOfM = 0;
				if (N >= 1 && N <= 20) {
					NthRootOfM = Math.round(Math.pow(M, 1 / N));
				}
				int result = (int) NthRootOfM;
				if (Math.pow(result, N) == M) {
					System.out.println(result);
				} else {
					System.out.println("-1");
				}
			}
		}

	}

}
