//Maria Caballero
//Date: 01-15-2023
//Discussion Answer Week #2

import java.util.*; //Imports scanner utility

public class AnswerTwo {
	
	public static void main(String[] args) {

	Scanner userInput = new Scanner(System.in);												//Assigns scanner as userInput
	
	String userMF;																			//Initializes string to identify if user is male or female
	int yearStartedDriving, currentYear, howLong, userAge, averageMiles = 0, milesDriven;	//Initializes integers program I/O

	//Constants based off of data from the Federal Highway Administration website that identify the annual avergage miles driven per age group and sex
	final int AGE_1619_MALE = 8206;																	
	final int AGE_1619_FEMALE = 6873;
	final int AGE_2034_MALE = 17976;
	final int AGE_2034_FEMALE = 12004;
	final int AGE_3554_MALE = 18858;
	final int AGE_3554_FEMALE = 11464;
	final int AGE_5564_MALE = 15859;
	final int AGE_5564_FEMALE = 7780;
	final int AGE_65_PLUS_MALE = 10304;
	final int AGE_65_PLUS_FEMALE = 4785;
	
	System.out.println("NAME: Jackson, Brian\t\t CLASS: CMIS 141/6384\t\t DATE: 14-Jan-23\n");		//Required class header
	
	System.out.print("What is the current year (e.g. 2010)? ");								//Asks user for current year and assigns it to the currentYear int
		currentYear = userInput.nextInt();
		
	System.out.print("\nWhat year did you start driving (e.g. 1999)? ");					//Asks user the year they started driving and assigns it to the yearStartedDriving int
		yearStartedDriving = userInput.nextInt();
		howLong = currentYear - yearStartedDriving;											//Calculates how how years the user has been driving and assigns it to howLong int
		
	System.out.print("\nHow old are you? ");												//Asks user how old they are and assigns it to userAge int
		userAge = userInput.nextInt();
			
	System.out.print("\nAre you male or female? (please select m or f): ");					//Asks user if they are male/female and assigns it to userMF String
		userMF = userInput.next();
			if (userMF.equalsIgnoreCase("m")) {												//Loop that assigns annual driving average to averageMiles for males based on userAge
				if (userAge >= 16 && userAge <= 19)
					averageMiles = AGE_1619_MALE;
				else if (userAge >= 20 && userAge <= 34)
					averageMiles = AGE_2034_MALE;
				else if (userAge >= 35 && userAge <= 54)
					averageMiles = AGE_3554_MALE;
				else if (userAge >= 55 && userAge <= 64)
					averageMiles = AGE_5564_MALE;
				else if (userAge >= 65)
					averageMiles = AGE_65_PLUS_MALE;
			}
			else if (userMF.equalsIgnoreCase("f")) {										//Loop that assigns annual driving average to averageMiles for females base on userAge
				if (userAge >= 16 && userAge <= 19) 
					averageMiles = AGE_1619_FEMALE;
				else if (userAge >= 20 && userAge <= 34)
					averageMiles = AGE_2034_FEMALE;
				else if (userAge >= 35 && userAge <= 54)
					averageMiles = AGE_3554_FEMALE;
				else if (userAge >= 55 && userAge <= 64)
					averageMiles = AGE_5564_FEMALE;
				else if (userAge >= 65)
					averageMiles = AGE_65_PLUS_FEMALE;
			}
				
		milesDriven = averageMiles * howLong;	//Calculates the average of how many miles someone has driven since they started driving
				
	//Prints user age, the current year, when user started driving, and the average of how many miles they have driven since they started driving
	System.out.printf("\nYou started driving in: %d \nthe current year is: %d \nYou have been driving for %d years!\n", yearStartedDriving, currentYear, howLong);
	System.out.printf("Accourding to the Federal Highway Administration, you have driven an average of %,d miles in the past %d years! ", milesDriven, howLong);
	System.out.println();
		
    //Discussion Answer Modification:
    System.out.println();
    System.out.print("This is Maria's modification: "); //Output to the user where the modification starts
    System.out.println();
    int presentYear; //variable storing current year
    int bornYear; //variable storing born year

    System.out.println("What is the current year (e.g. 2010)? ");//Output for user to input current year
    presentYear = userInput.nextInt(); //scanning integer value of current year

    System.out.println("What year was your mother born? "); //Asking user what year he/she was born
    bornYear = userInput.nextInt(); //Scanning user input for the year he/she was born

    userInput.close(); //Closing scanner since it will not be use again in the program.

    int yearsOld = presentYear - bornYear; //Calculating the user mother's age

    System.out.println("Your mom is " + yearsOld + " years old."); //Outputting the result
    System.out.println("Thank you for participating, see you next time!"); //Gratefully ending the program
	
        }
}

