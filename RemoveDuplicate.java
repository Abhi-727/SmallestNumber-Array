package com.org;

public class RemoveDuplicate {

	public static void main(String[] args) {
		int arr [] = {2,3,1,9,3,1,3,9};
		int n = arr.length;
		for(int i = 0;i<arr.length;i++) {
			for(int j =i+1;j<n;j++) {
				if(arr[i]==arr[j]) {
					for(int k = j;k < n-1;k++) {
						arr[k] = arr[k+1];
					}
					n--;
					j--;
				}
			}
		}
		for(int i = 0;i<n;i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
