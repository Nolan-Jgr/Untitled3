package assignment3;

public class SUV extends Vehicle {
	private double daily_rental_rate;
	private String make;
	private String model;
	private String color;
	private int mileage;
	private int ogCost;
	private boolean rented = false;
	public SUV()
	{
		make = "";
		model = "";
		color = "";
		mileage = 0;
		ogCost = 0;
		rented = false;	
		daily_rental_rate = 0.0;
	}
	public SUV(String ma,String mo,String c, int m, int co, boolean r,int rate)
	{
		make = ma;
		model = mo;
		color = c;
		mileage = m;
		ogCost = co;
		rented = r;
		daily_rental_rate = rate;
	}
	//Override
	public String toString()
	{
		if(this.get_Rent() == true)
		{
			return "SUV: Rented: " + color + " " + make + " " + model + " with " + mileage + " miles";
		}
		else
		{
			return "SUV: Available: " + color + " " + make + " " + model + " with " + mileage + " miles";
		}	
	}

}
