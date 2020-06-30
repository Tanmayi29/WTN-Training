package com.wipro.abstractclass;
import java.util.*;
abstract class Compartment
{
	public abstract String notice();
}

class FirstClass extends Compartment
{
	public String notice()
	{
		return "First Class Compartment";
	}
}

class Ladies extends Compartment
{
	public String notice()
	{
		return "Ladies Compartment";
	}
}

class General extends Compartment
{
	public String notice()
	{
		return "General Compartment";
	}
}

class Luggage extends Compartment
{
	public String notice()
	{
		return "Luggage Compartment";
	}
}

public class Ex1 {
	public static void main() {
		Compartment luggage=new Luggage();
		Compartment ladies = new Ladies();
		Compartment general = new General();
		Compartment first_class = new FirstClass();
		int[] arr =new int[10];
		
		Random rand =new Random();
		for(int i=0;i<10;i++)
		{
			arr[i]=rand.nextInt(4)+1;
			switch(arr[i])
			{
			case 1:
				System.out.println(luggage.notice());
				break;
			case 2:
				System.out.println(ladies.notice());
				break;
			case 3:
				System.out.println(general.notice());
				break;
			case 4:
				System.out.println(first_class.notice());
				break;
			default:
				System.out.println("Invalid Compartment Number");
				break;
			}
		}

	}

}
	
