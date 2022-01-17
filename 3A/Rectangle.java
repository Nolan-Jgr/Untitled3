//Name:			Nolan Jaeger 
//Class: 		CSE 1322L
//Instructor: 	Jorge Vera
//Term:			Spring 2021
//Assignment:	1
package A1;

public class Rectangle {
	private double height, width;
	public Rectangle()
	{
		height = 0.0;
		width = 0.0;
	}
	public Rectangle(double h, double w)
	{
		height = h;
		width = w;
	}
	public double perimeter()
	{
		return (2 * height) + (2 * width);
	}
	public double area()
	{
		return height * width;
	}
}
