package com.org;

public class SecondSmallest {
	public static void main(String[] args) {
		int arr[] = { 23, 45, 66, 12, 34, 55 };
		int smallest = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < smallest) {
				System.out.println(" second smallest number : " + smallest);
				smallest = arr[i];

			}

		}
		System.out.println("smallest number : " + smallest);

	}
}

