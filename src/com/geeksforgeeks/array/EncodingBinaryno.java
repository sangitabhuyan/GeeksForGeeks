package com.geeksforgeeks.array;

public class EncodingBinaryno {

	public static void main(String[] args) {
		int arr[] = {3, 3, 2};
		int k=10;
		if(isUnique(arr,arr.length,k)) {
			System.out.println("Yes");
		}
		else
			System.out.println("No");

	}
	public static boolean isUnique(int arr[],int len,int k) {
		int sum = 0;
	     for (int i=0 ; i<len ; i++)
	        sum += arr[i];
	     sum += len-1;
		return (sum==k);
	}

}
