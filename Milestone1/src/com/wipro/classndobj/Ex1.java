package com.wipro.classndobj;

class Box
{
	int height,width,depth;
	public Box(int height,int width,int depth)
	{
		this.height=height;
		this.width=width;
		this.depth=depth;
	}
	int volume()
	{
		
		return (height*width*depth);
	}
}
public class Ex1 {
public static void main(String[] args) {
	Box box = new Box(2,5,6);
	System.out.println(box.volume());
}
}
