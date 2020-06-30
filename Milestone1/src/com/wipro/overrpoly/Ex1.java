package com.wipro.overrpoly;

class Fruit
{
	String name, taste;
	double size;
	void eat()
	{
		System.out.println(name);
		System.out.println(taste);
	}
}

class Apple extends Fruit
{
	void eat()
	{
		System.out.println("Name of the fruit is Apple");
		System.out.println("Taste of the fruit is sweet");
	}
}

class Orange extends Fruit
{
	void eat()
	{
		System.out.println("Name of the fruit is Orange");
		System.out.println("Taste of the fruit is sour");
	}
}

public class Ex1 {

	public static void main(String[] args) {
		Apple apple=new Apple();
		Orange orange= new Orange();
		apple.eat();
		orange.eat();

	}
}

