//maximum and minimum value of the array
package com.wopro.arrays;

public class Ex2 {
	public static void main(String[] args) {
		int a[]=new int[] {10,12,4,73,35};
		int max=0,min=0,n=0;
		n=a.length;
		max=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max)
				max=a[i];
		}
		min=a[0];
		for(int i=0;i<a.length;i++) {
			if(min>a[i])
				min=a[i];
		}
		System.out.println(max);
		System.out.println(min);
	}

}
