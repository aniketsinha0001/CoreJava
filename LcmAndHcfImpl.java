package com.sinha.aniket;

import java.util.Scanner;

public class LcmAndHcfImpl {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		if (T >= 1 && T <= 100) {
			for (int i = 1; i <= T; i++) {
				int A = sc.nextInt();
				int B = sc.nextInt();
				int lcm = 1, hcf = 1;
				int greater = 0;
				int small = 0;
				if (A >= B) {
					greater = A;
					small = B;
				} else {
					greater = B;
					small = A;
				}
				for (int j = 1; j <= small; j++) {
					if ((greater * j) % small == 0) {
						lcm = greater * j;
						break;
					}
				}
				hcf = (A * B) / lcm;
				System.out.println(lcm+" "+hcf);
			}
		}
	}
}
