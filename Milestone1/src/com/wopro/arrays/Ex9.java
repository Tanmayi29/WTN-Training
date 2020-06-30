package com.wopro.arrays;

public class Ex9 {
	public static void main(String[] args) {
		
		int[] a= new int[args.length];
		for(int i=0,j=-1;i<args.length;i++)
		{
			if(!args[i].equals("10"))
			{
				a[++j]=Integer.parseInt(args[i]);
			}
		}
		for(int i=0;i<args.length;i++)
		{
			System.out.print(a[i]+" ");
		}

	}


}
