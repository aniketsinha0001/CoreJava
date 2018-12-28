package com.sinha.aniket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class PerfectNumber {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		if (T >= 1 && T <= 300) {
			for (int i = 1; i <= T; i++) {
				long N = Long.parseLong(br.readLine());
				long var = N;
				long sum = 1;
				if (N >= 1 && N <= Math.pow(10, 18)) {

					for (long j = 2; j * j <= N ; j++) {
						if (N % j == 0) {
							sum = sum + j + N / j;
						}
					}
				}
				if (var == sum) {
					System.out.println("1");
				} else {
					System.out.println("0");
				}
			}
		}
	}
}