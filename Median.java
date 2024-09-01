package com.org;

import java.util.Arrays;

public class Median {
	public static void main(String[] args) {
		int arr[] = { 2, 4, 1, 3, 5 };
		int length = arr.length;
		System.out.println("array length :" + length);
		//sorting array
		Arrays.sort(arr);
		System.out.print("sorted array : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		//checking if length is even number
		if (length % 2 == 0) {
			double median = (arr[length / 2 - 1] + arr[length / 2]) / 2.0;
			System.out.println(" ");
			System.out.print("median of array : " + median);
		}
		//checking if length is even number
		else if (length % 2 != 0) {
			double median = (arr[length / 2]);
			System.out.println(" ");
			System.out.println("median of array : " + median);
		}

	}
}

