package com.wipro.abstractclass;
import java.util.*;

abstract class Compartment
{
	abstract void notice();
}
class FirstClass extends Compartment
{
	 void notice()
	{
		System.out.println("This is FirstClass Compartment...!");
	}
}
class Ladies extends Compartment
{
	void notice()
	{
		System.out.println("This is Ladies Compartment...!");
	}
}
class General extends Compartment
{
	void notice()
	{
		System.out.println("This is General Compartment...!");
	}
}
class Luggage extends Compartment
{
	void notice()
	{
		System.out.println("This is Luggage Compartment...!");
	}
}
public class Ex1 {
public static void main(String[] args) {
	Compartment[] com = new Compartment[10];
	Random r = new Random();
	for(int i=0;i<10;i++)
	{
		int d = r.nextInt(4)+1;
		if(d==1)
		{
			com[i]=new Luggage();
	    }
		else if(d==2)
		{
			com[i]=new Ladies();
		}
		else if(d==3)
		{
			com[i]=new FirstClass();
		}
		else
		{
			com[i]= new General();
		}
		com[i].notice();
}
}
}
