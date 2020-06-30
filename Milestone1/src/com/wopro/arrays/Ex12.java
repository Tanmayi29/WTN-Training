package com.wopro.arrays;

public class Ex12 {
	public static void main(String[] args) {
		int d,d1;
		int a[]= {1,2,3};
		int b[]= {4,5,6};
		int c[]=new int[2];
		d=a[a.length/2];
		d1=b[b.length/2];
		c[0]=d;
		c[1]=d1;
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}
	}

}
