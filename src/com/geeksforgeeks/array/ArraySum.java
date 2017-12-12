package com.geeksforgeeks.array;

public class ArraySum {

	public static void main(String[] args) {
		int arr[]= {5 , 10 , 15};
		System.out.println(sum(arr));
	}
	public static int sum(int arr[]) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		return sum;
	}
}
