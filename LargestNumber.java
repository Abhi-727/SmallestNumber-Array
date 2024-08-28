package com.org;

public class LargestNumber {

	public static void main(String [] args) {
	int numbers[] = { 78, 67, 3, 45, 87, 23 };
	int largest = numbers[0];
	for(int i = 1;i<numbers.length;i++)
	{

		if (numbers[i] > largest) {
			largest = numbers[i];
		}
	}
	System.out.println("largest number : "+largest);
	}
}

