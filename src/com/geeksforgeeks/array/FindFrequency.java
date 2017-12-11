package com.geeksforgeeks.array;

import java.util.Scanner;

public class FindFrequency {

	public static void main(String[] args) {
		int arr[]={1, 2, 3};
		int count=0;
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		for(int i=0;i<arr.length;i++){
			if(arr[i]==no){
				count++;
			}
		}
		System.out.println(count);
	}

}
