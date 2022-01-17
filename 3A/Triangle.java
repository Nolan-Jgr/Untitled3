//Name:			Nolan Jaeger 
//Class: 		CSE 1322L
//Instructor: 	Jorge Vera
//Term:			Spring 2021
//Assignment:	1
package A1;

public class Triangle extends Rectangle{
	private double side1,side2,side3;
	
	public Triangle()
	{
		side1 = 3.0;
		side2 = 4.0;
		side3 = 5.0;
	}
	public Triangle(double s1,double s2,double s3)
	{
		side1 = s1;
		side2 = s2;
		side3 = s3; 
	}
	public double perimeter()
	{
		return side1 + side2 + side3;
	}
	public double area()
	{
		double p = (side1 + side2 + side3)/2;
		return Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
	}
	public double height()
	{
		double min = side1;
		if(side2 < side1)
		{
			min = side2;
		}
		else if(side3 < side1)
		{
			min = side3;
		}
		return (area() * 2)/min;
	}
	public String toString()
	{
		return "This triangle has sides " + side1 + ", " + side2 + ",and  " + side3 + " with Area: " + area() + " and Perimter: " + perimeter();
	}
}
