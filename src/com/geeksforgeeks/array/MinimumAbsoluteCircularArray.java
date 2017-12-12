package com.geeksforgeeks.array;

public class MinimumAbsoluteCircularArray {

	public static void main(String[] args) {
		int arr[] = {10, 12, 13, 15, 10} ;
		int value=findMinimalAbsoluteValue(arr);
		System.out.println(value);
	}
	private static int findMinimalAbsoluteValue(int arr[]) {
		int res=Math.abs(arr[0]-arr[1]);
		
		for(int i=2;i<arr.length;i++) {
			int temp=Math.abs(arr[i]-arr[i-1]);
			if(res>temp) {
				res=temp;
			}
		}
		return res;
	}

}
