package com.org;

public class Frequency {
	public static void main(String[] args) {
		int arr [] = {10,5,10,15,10,5};
		for(int i =0;i<arr.length;i++) {
			int count =1;
			if(arr[i]==-1) {
				continue;
			}
		for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
					arr[j]=-1;
				}
			}
			System.out.println(arr[i] + " occures " +count+" times ");
		}
	}
}
