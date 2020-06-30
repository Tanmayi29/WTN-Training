package com.wipro.classndobj;

class Calculator
{
	static int powerInt(int num1,int num2)
	{
		return (int) Math.pow(num1, num2);
	}
	static double powerDouble(double num1,int num2)
	{
		return Math.pow(num1, num2);
	}
}
public class Ex2 {
public static void main(String[] args) {
     System.out.println("PowerInt: "+Calculator.powerInt(2,4));
     System.out.println("PowerDouble: "+Calculator.powerDouble(5,6));
}
}
