//Name:			Nolan Jaeger 
//Class: 		CSE 1322L
//Instructor: 	Jorge Vera
//Term:			Spring 2021
//Assignment:	1			
package A1;

public class Driver extends Circle{
	public static void main(String[]args)
	{
		for(int i = 1; i < 11;i++)
		{
			Circle c = new Circle(i);
			System.out.println("Circle with radius " + i + " has area: " + c.area() + " and perimeter: " + c.circumference());
		}
		for(int i = 1; i < 4;i++)
		{
			for(int j = 1; j < 4;j++)
			{
				Rectangle r = new Rectangle(i,j);
				System.out.println("Area of " + i + " by " + j + " is " + r.area() + " and perimeter " + r.perimeter());
			}
		}
		Triangle t1 = new Triangle(18,30,24);
		System.out.println("Area of triangle 18x30x24 is " + t1.area() + " and its perimeter is " + t1.perimeter() + " with height " + t1.height());
		Triangle t2 = new Triangle();
		System.out.println("Area of triangle 3x4x5 is " + t2.area() + " and its perimeter is " + t2.perimeter() + " with height " + t2.height());
	}
	
	
}
