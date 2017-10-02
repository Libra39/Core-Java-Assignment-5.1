package Assignment_5;																			// Package Declared
abstract class Car{																				// Abstract Class declared
		abstract public void brake();  															//abstract method don't have a method body.
		abstract public void accelerator();														//abstract method don't have a method body.
		public void music(){																	// Normal Method with a body
			System.out.println("Method music() is called from the Abstract Parent Class\n");}	// This will print the argument in the next line	
  }																								// Class Car Closed			
