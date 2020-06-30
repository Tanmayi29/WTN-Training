package com.wopro.arrays;

public class Ex11 {
	public static void main(String[] args) {
		int c=0;
		int a[]= {1,2,1,2};
		for(int i=0;i<a.length;i++) {
			if(a[i]==1||a[i]==2) {
				c++;
			}
		}
		if(c==a.length) {
			System.out.print("true");
		}
		else
			System.out.print("false");
	}

}
