package com.geeksforgeeks.array;

public class DivideArrayElement {

	public static void main(String[] args) {
		int a[] = {5, 100, 8};
		int b[] = {2, 3};
		
		for(int i=0;i<a.length;i++){
			int d=0;
			int no=a[i];
			for(int j=0;j<b.length;j++){
				 d=no/b[j];
				no=d;
			}
			System.out.println(d);
		}

	}

}
