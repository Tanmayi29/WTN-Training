package com.wopro.arrays;

public class Ex10 {
	public static void main(String[] a) {
		int i,l=-1,r=a.length;
		int[] b= new int[a.length];
		for(i=0;i<a.length;i++)
		{
			if(Integer.parseInt(a[i])%2==0)
			{
				b[++l]=Integer.parseInt(a[i]);
			}
			else
			{
				b[--r]=Integer.parseInt(a[i]);
			}
		}
		for(i=0;i<a.length;i++)
		{
			System.out.print(b[i]+" ");
		}
	}

}
