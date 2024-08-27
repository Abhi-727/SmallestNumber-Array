package com.org;

public class SmallestNumber {

	public static void main(String[] args) {
		int numbers[] = {5,8,3,5,12,67};
		int smallest = numbers[0];
		for(int i = 1;i<numbers.length;i++) {
			
			if(numbers[i] < smallest) {
				smallest = numbers[i];
			}
			
		}
		System.out.println("smallest number : " + smallest);
	}
}
