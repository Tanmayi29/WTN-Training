package com.wipro.exceptionhandling;
import java.util.*;
public class Ex2{
public static void main(String[] args) {
	int n =args.length;
	int[] a = new int[n];
	int sum = 0;
	double avg = 0;
	try {
		for (int i = 0; i < n; i++)
			a[i] = Integer.parseInt(args[i]);
		
		for (int i = 0; i < n; i++)
			sum += a[i];
		
		avg = sum / n;
		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);
	} catch (NumberFormatException e) {
		System.out.println("NumberFormatException");
	} catch (ArithmeticException e) {
		System.out.println("ArithmeticException");
	} catch (InputMismatchException e) {
		System.out.println("InputMismatchException");
	}
	
}
}

