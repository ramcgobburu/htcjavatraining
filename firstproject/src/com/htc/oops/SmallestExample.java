package com.htc.oops;

import java.util.Scanner;

public class SmallestExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] =new int[5];

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the numbers");
		for(int i = 0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		int smallest=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(smallest>	arr[i]) {
				smallest=arr[i];
			}
		}
	
		System.out.println("smallest is "+smallest);
	}

}
