package Assignment_5;																							// Package declared
/**
 * Create an abstract class Parent and define an abstract methods in it and implement it in the child class 
 * 
 * All the comments in the program will be placed on the Right-Hand-Side.
 * @author Sahil Khurana <sahilkhurana369@gmail.com>
 */
public class Assignment_5_1 {																					// Class Declared
	public static void main(String[] args) {																	// Main Method Started 
	System.out.println("\nThe program in java to show an abstract class Parent "								// This will print the argument in the next line
			+ "and define an abstract methods in it and implement it in the child class.\n");					
	Car car = new Swift();																						// new Instance is created 
	car.brake();																								// Abstract method called
	car.accelerator();																							// Abstract method called
    car.music();																								// Normal Method Called
	}																											// Main method closed
}																												// Assignment_5_1 Class Closed
