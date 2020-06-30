package com.wopro.arrays;

public class Ex14 {
	public static void main(String[] args) {
		int maximum=Integer.MIN_VALUE;
		if(args.length==9)
		{
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					if(Integer.parseInt(args[i*3+j])>maximum)
					{
						maximum=Integer.parseInt(args[i*3+j]);
					}
				}
			}
			System.out.println("The biggest number in the given array is "+maximum);
		}
		else
		{
			System.out.println("Please enter 9 integer numbers");
		}

	}

}
