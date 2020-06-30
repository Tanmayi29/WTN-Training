package com.wopro.arrays;

public class Ex13 {
	public static void main(String[] args) {
	int[][] b=new int[2][2];
	if(args.length!=4)
	{
		System.out.println("Please Enter 4 integer numbers");
	}
	for(int i=0;i<4 && args.length==4;i++)
	{
		b[(int)i/2][i%2]=Integer.parseInt(args[args.length-i-1]);
	}
	for(int i=0;i<2 && args.length==4;i++)
	{
		for(int j=0;j<2;j++)
		{
			System.out.print(b[i][j]+" ");
		}
		System.out.println();
	}
	}
}
