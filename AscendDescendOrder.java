package com.org;

import java.util.Arrays;

public class AscendDescendOrder {
	public static void main(String[] args) {
		int arr[] = { 8, 7, 1, 6, 5, 9 };
		for (int i = 0; i < arr.length / 2; i++) {
			Arrays.sort(arr);
			System.out.print(arr[i] + " ");
		}
		
		for (int j = arr.length - 1; j >= arr.length / 2; j--) {
			Arrays.sort(arr);
			System.out.print(arr[j] + " ");

		}
	}
}
