package com.org;

public class SecondLargest {

	public static void main(String[] args) {
		
		int numbers[] = {16,34,46,47,97,2,6};
		int largeNumber = numbers[0];
		int secondlarge = 0;
		
		for(int i = 1;i<numbers.length;i++) {
			
			if(numbers[i] > largeNumber) {
				secondlarge = largeNumber;
				largeNumber = numbers[i];
			}
		}
		System.out.println("Large number : " + largeNumber);
		System.out.println("Second large number : " + secondlarge);
	}
}
