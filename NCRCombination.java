package com.sinha.aniket;

import java.util.Scanner;

public class NCRCombination {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		if (T >= 1 && T <= 50) {
			for (int tc = 1; tc <= T; tc++) {
				int N = sc.nextInt();
				int R = sc.nextInt();
				int result = calculateNCR(N, R);

				System.out.println(result);
			}
		}
	}

	public static int calculateNCR(int N, int R) {
		int arr[] = new int[R + 1];
		arr[0] = 1;
		for (int i = 1; i <= N; ++i) {
			for (int j = Math.min(i, R); j > 0; --j) {
				arr[j] = (arr[j] + arr[j - 1]) % 1000000007;
			}
		}
		return arr[R];
	}
}
