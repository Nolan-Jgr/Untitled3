package assignment3;

public class Vehicle {
	private String make;
	private String model;
	private String color;
	private double mileage;
	private double ogCost;
	private boolean rented = false;
	public Vehicle()
	{
		make = "";
		model = "";
		color = "";
		mileage = 0.0;
		ogCost = 0.0;
		rented = false;
	}
	public Vehicle(String ma,String mo,String c, double m, double co, boolean r)
	{
		make = ma;
		model = mo;
		color = c;
		mileage = m;
		ogCost = co;
		rented = r;
	}
	
	public String get_Make()
	{
		return make;
	}
	public String get_Model()
	{
		return model;
	}
	public String get_Color()
	{
		return color;
	}
	public double get_Mile()
	{
		return mileage;
	}
	public double get_Cost()
	{
		return ogCost;
	}
	public boolean get_Rent()
	{
		return rented;
	}
	public void set_Make(String x)
	{
		make = x;
	}
	public void set_Model(String y)
	{
		model = y;
	}
	public void set_Color(String z)
	{
		color = z;
	}
	public void set_Mile(double x)
	{
		mileage = x;
	}
	public void set_Cost(double y)
	{
		ogCost = y;
	}
	public void set_Rent(boolean x)
	{
		this.rented = x;
	}
	public String toString()
	{
		return "";
	}
	

}
