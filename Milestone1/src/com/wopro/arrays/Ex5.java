 //Write a program to find the largest 2 numbers and the smallest 2 numbers in the given array.
package com.wopro.arrays;

public class Ex5 {
	public static void main(String[] args) {
		int a[]=new int[] {12,42,14,67,9,5};
		int t=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[(a.length)-1]);
		System.out.println(a[(a.length)-2]);
	}

}
