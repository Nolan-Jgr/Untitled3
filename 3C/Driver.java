package assignment3;
import java.util.*;
public class Driver extends Vehicle{
	public static void main(String[]args)
	{
		ArrayList<Vehicle> x = new ArrayList<Vehicle>();
		Economy_Car first = new Economy_Car("Nissan","Versa","Blue", 105, 14500,false, 25);
		Economy_Car second = new Economy_Car("Toyota","Yaris","White", 8422, 17500,false, 25);
		Midsize_Car third = new Midsize_Car("Dodge","Avenger","Green", 15720, 15000,false, 45);
		Midsize_Car fourth = new Midsize_Car("Ford","Focus","Yellow", 2368, 14500,false, 45);
		SUV fifth = new SUV("Toyota","Rav4","Silver", 432, 26150,false, 80);
		x.add(first);
		x.add(second);
		x.add(third);
		x.add(fourth);
		x.add(fifth);
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String menu = "1. Rent Cars\n2. Return Cars\n3. Quit";
		System.out.println(menu);
		int input = scan.nextInt();
		while(input != 3)
		{
			switch(input)
			{
			case 1:
				rent_cars(x);
				break;
			case 2:
				return_cars(x);
				break;
			default:
				break;
			}
			System.out.println(menu);
			input = scan.nextInt();
		}
	}
	public static void show_cars(ArrayList<Vehicle> a)
	{
		System.out.println("0. Return");
		int num = 1;
		for(Vehicle v: a)
		{
			System.out.println(num + ". " + v.toString());
			num++;
		}
	}
	public static void rent_cars(ArrayList<Vehicle> a)
	{
		@SuppressWarnings("resource")
		Scanner alpha = new Scanner(System.in);
		System.out.println("Choose a car to rent:");
		show_cars(a);
		int h;
		h = alpha.nextInt();
		while(h != 0)
		{
			switch(h) {
			case 1:
				a.get(0).set_Rent(true);
				break;
			case 2:
				a.get(1).set_Rent(true);
				break;
			case 3:
				a.get(2).set_Rent(true);
				break;
			case 4:
				a.get(3).set_Rent(true);
				break;
			case 5:
				a.get(4).set_Rent(true);
				break;
			default:
				break;	
			}
			System.out.println("Choose a car to rent:");
			show_cars(a);
			h = alpha.nextInt();
		}		
				
	}
	public static void return_cars(ArrayList<Vehicle> a)
	{
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Choose a car to rent:");
		show_cars(a);
		int input = scan.nextInt();
		while(input != 0)
		{
			switch(input) {
			case 0:
				break;
			case 1:
				a.get(0).set_Rent(false);
				break;
			case 2:
				a.get(1).set_Rent(false);
				break;
			case 3:
				a.get(2).set_Rent(false);
				break;
			case 4:
				a.get(3).set_Rent(false);
				break;
			case 5:
				a.get(4).set_Rent(false);
				break;
			default:
				break;	
			}
			System.out.println("Choose a car to rent:");
			show_cars(a);	
			input = scan.nextInt();
		}	
	}
	

}
