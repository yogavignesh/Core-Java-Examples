//Homework 4
//Yoga Vignesh Surathi
//1001101504
//INSY 5309
//Rectangle class

package hw4;

public class Rectangle {
	//declare class variables
	private int length, width;
	//default constructor
	public Rectangle()
	{	
		setLength(0);
		setWidth(0);
	}
	public Rectangle( int l, int w )
	{	
		setLength(l);
		setWidth(w);
	}
	public int getLength()
	{
		return length;
	}
	public int getWidth()
	{
		return width;
	}
	public int getArea()
	{   //return area l*b
		return length*width;
	}
	public int getPerimeter()
	{   //return perimeter 2(l+b)
		return 2*(length+width);
	}
	public void setLength( int l )
	{
		length=l;
	}
	public void setWidth( int w )
	{
		width=w;
	}
	public String toString()
	{ 				
		return "Rectangle: length ="+length+" width = "+width;
	}
	public boolean equals( Object o )
	{
		Rectangle r=(Rectangle) o;
		if(length==r.length && width==r.width)
			return true;
		return false;
	}
	public Rectangle clone()
	{
		return new Rectangle(length,width);
		
	}
}
