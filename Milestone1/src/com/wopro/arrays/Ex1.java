//write a program to initialise an array to print the sum and average of array

package com.wopro.arrays;

public class Ex1 {
	public static void main(String a[]) {
		int b[]=new int[] {1,3,5,7,8};
		int sum=0,n;
		float avg;
		n=b.length;
		for(int i=0;i<n;i++) {
			sum=sum+b[i];
		}
		avg=sum/b.length;
		System.out.println(sum);
		System.out.println(avg);
	}

}
