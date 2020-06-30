package com.wopro.arrays;

public class Ex3 {
	public static void main(String[] args) {
		int a[]=new int[] {19,24,12,1};
		int n=0,k,flag=0;
		n=a.length;
		k=Integer.parseInt(args[0]);
		for(int i=0;i<a.length;i++) {
			if(a[i]==k) {
				System.out.println(i);
				flag=1;
				break;
			}
		}
		if(flag==0) {
			System.out.println(-1);
		}
	}

}
