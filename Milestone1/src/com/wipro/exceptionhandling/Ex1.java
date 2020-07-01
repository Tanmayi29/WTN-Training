package com.wipro.exceptionhandling;
import java.util.*;

public class Ex1 {
public static void main(String[] args) throws Exception {
	Scanner sc = new Scanner(System.in);
	try
	{
		System.out.println("Enter the numner of elements in array");
		int n = sc.nextInt();
		int [] a = new int[n];
		System.out.println("Enter the elements in array");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the index of the array element you want to access");
		int k = sc.nextInt();
		System.out.println("The array element at index "+k+" = "+a[k]);
		System.out.println("The array element successfully accessed");
	}
	catch(ArrayIndexOutOfBoundsException a)
	{
		System.out.println(a);
	}
	catch(InputMismatchException n)
	{
		System.out.println(n);
	}
	sc.close();
}
}
