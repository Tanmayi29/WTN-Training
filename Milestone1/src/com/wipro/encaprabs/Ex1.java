package com.wipro.encaprabs;
class Author
{
	private String name, email, gender;
	Author(String name, String email, String gender)
	{
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
	void setName(String name)
	{
		this.name=name;
	}
	void setEmail(String email)
	{
		this.email=email;
	}
	void setGender(String gender)
	{
		this.gender=gender;
	}
	String getName()
	{
		return name;
	}
	String getEmail()
	{
		return email;
	}
	String getGender()
	{
		return gender;
	}
}

class Book
{
	private String name, author;
	private double price;
	private int qtyInStock;
	Book(String name, String author, double price, int qtyInStock)
	{
		this.name=name;
		this.author=author;
		this.price=price;
		this.qtyInStock=qtyInStock;
	}
	void setName(String name)
	{
		this.name=name;
	}
	void setAuthor(String author)
	{
		this.author=author;
	}
	void setPrice(double price)
	{
		this.price=price;
	}
	void setQtyInStock(int qtyInStock)
	{
		this.qtyInStock=qtyInStock;
	}
	String getName()
	{
		return name;
	}
	String getAuthor()
	{
		return author;
	}
	double getPrice()
	{
		return price;
	}
	int getQtyInStock()
	{
		return qtyInStock;
	}
	
}

public class Ex1 {

	public static void main(String[] args) 
	{
		Author author = new Author("xyz", "xyx@gmail.com", "Male");
		Book book = new Book("ABC", "XYZ", 45.00, 10);
		System.out.println("Book Details \nTitle: "+book.getName()+
				"\nAuthor: "+book.getName()+
				"\nPrice of the Book: "+book.getPrice()+
				"\nQualtity in stock: "+book.getQtyInStock());
		System.out.println("\nAuthor Details \nName: "+author.getName()+
				"\nEmail ID: "+author.getEmail()+
				"\nGender: "+author.getGender());

		book.setPrice(55.00);
		book.setQtyInStock(60);

		author.setEmail("xyx@gmail.com");
		
		System.out.println("\nUpdated Book Details \nTitle: "+book.getName()+
				"\nAuthor: "+book.getName()+
				"\nPrice of the Book: "+book.getPrice()+
				"\nQualtity in stock: "+book.getQtyInStock());
		System.out.println("\nUpdated Author Details \nName: "+author.getName()+
				"\nEmail ID: "+author.getEmail()+
				"\nGender: "+author.getGender());
	}

}