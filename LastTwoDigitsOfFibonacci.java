package com.sinha.aniket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LastTwoDigitsOfFibonacci {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		if (T >= 1 && T <= 100) {
			for (int tc = 1; tc <= T; tc++) {
				long N = Long.parseLong(br.readLine());
				if (N >= 1 && N <= Math.pow(10, 9)) {
					int a = 1, b = 1, c = 0;
					N = N % 300;
					if (N > 2) {
						for (long i = 2; i < N; i++) {
							if (N > 300) {
								c = (a + b) % 300;
								a = b;
								b = c;
							} else {
								c = (a + b) % 100;
								a = b;
								b = c;
							}

						}
					} else {
						c = 1;
					}
					System.out.println(c);
				}
			}
		}
	}
}
