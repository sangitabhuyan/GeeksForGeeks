package com.geeksforgeeks.array;

public class OrderNegetivePositive {

	public static void main(String[] args) {
		int inputArr[] = {12, 11, -13, -5, 6, -7, 5, -3, -6};
		int arr[]=new int[inputArr.length+1];
		int k=0;
		for(int i=0;i<inputArr.length;i++){
			int no=inputArr[i];
			if(arr[0] != 0){
				for(int j=k;j>=0;j--){
					int temp=0;
					if(arr[j]>no){
						temp=arr[j];
						arr[j]=no;
						arr[j+1]=temp;
					}
				}
				k++;
			}
			else{
				arr[k]=no;
				k++;
			}
		}
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+", ");
		}
	}

}
