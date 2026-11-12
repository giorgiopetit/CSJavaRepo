/**
 * 
 */

/**
 * 
 */

import java.util.Scanner;
public class dealership_lab {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Car car1 = new Car("Ford",32800.0,"Mustang");
	Car car2 = new Car("Nissan",14500.0,"Altima");
	Car car3 = new Car("Dodge",19900.0,"Dart");
	Car car4 = new Car("BMW",32000.0,"X1");
	Car car5 = new Car("Porsche",164200.0,"Spyder");
	Car car6 = new Car("Hyundai",29000.0,"Ioniq");
		
	
	
	
	
		Dealership dealership = new Dealership();
		dealership.getDealershipName();
		dealership.addCar();
		
		car1.displayCarDetails();
		car2.displayCarDetails();
		car3.displayCarDetails();
		car4.displayCarDetails();
		car5.displayCarDetails();
		car6.displayCarDetails();
	}

}


class Car
{
	
	private String make;
	private double price;
	private String model;


public Car(String make, double price,String model) {

	this.make = make;
	this.price = price;
	this.model = model;
	}	
 	
public String getMake() 
{
	
	return make;
}
public String getModel() 
{
	return model;
	
}
public double getPrice()
{
	return price;
}

public void displayCarDetails() 
	{
	System.out.println("   ");
	System.out.println(getMake());
	System.out.println(getModel());
	System.out.println(getPrice());
	System.out.println("   ");
	}
}//end of Car

class Dealership 
{
 private String name;
 private Car[] cars;
 private int currentNumberCars;
	
	public Dealership(String name, Car[]cars, int currentNumbercars) 
	{
		
	this.name = name;
	this.cars = cars;
	this.currentNumberCars = currentNumberCars;
	}
	
		public Dealership() 
		{
		
		}
		public void addCar() 
		{
		
		
		}
		
		public String getDealershipName()
		{
		System.out.print("Enter Dealership Name:");
		Scanner input = new Scanner (System.in);
		String name = input.nextLine();
		input.close();
		return name;
		
		}
		
		public String addCar(Car newCar) 
		{
		System.out.print("Enter Car Make, Cost and Model");
		Scanner input = new Scanner (System.in);
		String car = input.nextLine();
		input.close();
		return car;
		}
		
		public void displayMostExpensiveCar()
		{
	
		}
		
		public void displayCars() 
		{
		
		}
		
		public void writeCarsToFile(String filename)
		{
	
		}
	
}//end of Dealership




