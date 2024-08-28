package com.org;

public class Reverse {

	public static void main(String[] args) {

		int numbers[] = { 2, 3, 4, 5, 6 };
		int reverse = 0;

		for (int i = numbers.length - 1; i >= 0; i--) {
			reverse = numbers[i];
			System.out.print(reverse + " ");
		}

	}

}
