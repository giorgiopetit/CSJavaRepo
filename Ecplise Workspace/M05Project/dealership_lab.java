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

		Car car1 = new Car("Ford",32800,"Mustang");
	
		System.out.println(car1.getMake());
		System.out.println(car1.getModel());
		System.out.println(car1.getPrice());
		
		
		
		
		
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

public static void displayCarDetails() 
	{


	}
}//end of Car





