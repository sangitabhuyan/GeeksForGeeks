package com.geeksforgeeks.array;

public class EvenPlaceOddPlace {

	public static void main(String[] args) {
		int arr[] = {3, 6, 12, 1, 5, 8};
		placeChange(arr);
	}
	public static void placeChange(int arr[]) {
		int j=arr.length-1;
		for(int i=0;i<arr.length;i++) {
			if(!(i%2==0 && arr[i]%2==0)&&!(i%2!=0 && arr[i]%2!=0)) {	
				if(!(j%2==0 & arr[j]%2==0)||!(j%2!=0 & arr[j]%2!=0)) {
					int temp=0;
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					j--;
				}
				else
					continue;
			}
			else
				continue;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+",");
		}
	}

}
