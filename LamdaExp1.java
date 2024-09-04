package com.org;

public class LamdaExp1 {

	public static void main(String[] args) {
		LamdaExp additions =(a,b)->(a+b);
		
	int result = additions.operation(35, 3);
		System.out.println("addition : "+result );
	}
}
