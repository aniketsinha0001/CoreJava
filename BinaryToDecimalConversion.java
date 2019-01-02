package com.sinha.aniket;

import java.util.Scanner;

public class BinaryToDecimalConversion {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		if (T >= 1 && T <= 100) {

			for (int i = 1; i <= T; i++) {
				String s = sc.next();
				int bng = Integer.parseInt(s, 2);

				System.out.println(bng);
			}
		}
	}
}
