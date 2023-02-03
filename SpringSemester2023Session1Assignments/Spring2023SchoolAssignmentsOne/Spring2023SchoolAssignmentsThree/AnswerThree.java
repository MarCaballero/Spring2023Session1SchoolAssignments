/** Thomas Nugent 
 * January 22, 2023 
 * Program purpose: Recieve input on the users vehicle MPG and determine if it will remain above the new set standard.
 */ 
import java.util.Scanner;

public class AnswerThree{

	public static void main(String[] args) {
		
	//Define scanner variables
	Scanner scan = new Scanner(System.in);
		
	//Introduction	
	System.out.print("The National Vehicles and Fuel Emissions Laboratory sets the Miles Per Gallon (MPG) requirment for auto manufacturers.");
	System.out.print("\nLet's see if your vehicle will meet their upcoming requirements of the year 2026.");
	
	//Input of a blank line
	System.out.println("");
	
	//Prompt user for vehicle MPG
	System.out.print("\n**Enter whole numbers only**\nEnter your vehicle's average MPG: ");
	int carMPG = scan.nextInt();
	
	//Output the new MPG requirments
	System.out.println("\nThe requirements set for auto manufacturers by the year 2026 is a fleet average of 49 MPG!!");
	
	//Compute if statement to determine if the users vehicle will meet the new standard.
	if (carMPG >= 49) {
		System.out.println("\nCongratulations!! Your car will remain within standard through 2026!");
	} else {
		System.out.println("\nUnfortunately, your vehicle will not meet the the new standard of MPG requirments in the year 2026.\nHowever, you can still drive your car regardless.");
	}
//Task: Discussion #3 Response
//Student Name: Maria Caballero
//Date: 01/22/2023
//Program Summary:
/*
 * This program ask the user to input car's size and number of doors so that
 * we can guess if it is a vehicle, truck, or motorcycle
 */
    System.out.println(); //printing a new line

    //Asking user for vehicle information
    System.out.println("Please enter the following information (we want to see what type of car you own): ");
    System.out.print("What is your car size (small or big)? ");
    String typeCar = scan.next();
    System.out.print("How many doors does it has (2,4, or none)? ");
    String doorsNum = scan.next();
    scan.close(); //closing scanner

    //Car size comparison
    if(typeCar.equals("small")){
        //nested if-else statements
        if(doorsNum.equals("4") || doorsNum.equals("2")){
            System.out.println("You own a car");
        }else{
            System.out.println("You own a motorcycle");
        }
    }else if(typeCar.equals("big")){
        //nested if statement
        if(doorsNum.equals("2") || doorsNum.equals("4")){
            System.out.println("You own a truck");
        }
    }
    //Gratefully ending program
    System.out.print("Have a good day!");
	}
	
}



