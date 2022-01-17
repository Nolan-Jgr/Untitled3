//Name:			Nolan Jaeger 
//Class: 		CSE 1322L
//Instructor: 	Jorge Vera
//Term:			Spring 2021
//Assignment:	1
package A1;

public class Circle extends Triangle{
	private double radius;
	public Circle()
	{
		radius = 0;
	}
	public Circle(double r)
	{
		radius = r;
	}
	public double circumference()
	{
		return 2.0 * (Math.PI) * radius;
	}
	public double area()
	{
		return (Math.PI)*(Math.pow(radius, 2.0));
	}

}
