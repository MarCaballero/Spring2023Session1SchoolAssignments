// Name: Nwamaka Black    Date: 01/16/23    Class: CMIS 141-6384 Assignment: Discussion 4
/*Write a Java program which contains a 
 * while loop. 
 * Prompt user for input which 
 * determines the 
 * number of times the loop repeats. 
 * The program should 
 * display some output for each iteration 
 * but it should be more than just an increment.
 * */
import java.util.Scanner;

public class AnswerFour {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		
		//Title
		System.out.println("Realtor Vision Board Program");
		System.out.println(" ");
		
		//Initial statement
		System.out.print("Enter the amount of homes you want to sell: ");
		int inputNumber = stdin.nextInt(); 
        
        //Maria Caballero - Implemented and initialized the count variable to be able to 
        //use it for my next "while" loop
        int count = 0;
		
		//Repetition
		while (inputNumber != 0) {
			System.out.println("SOLD!");
			inputNumber--;
            count++;
		}

		//Ending Statement
		System.out.println("You reached your GOAL! YAY! ");
		
		
//Participation Four - Program Modification
//Student: Maria Caballero
//Date: 01/26/2023
/*
* At the top of the program I implemented the count variable so that I can use it for my next while loop
* where I will ask the user for how much the house was sold (in descending order) and then when it reaches 
* zero, I will exit the loop and calculate the comission amount they will receive for having sold that many houses.
*/      
        //Initialize sum variable that will hold the total amount of all the houses being sold
        double sum = 0;
        //Initialize the variable comission that will contain the total percentage they will get for selling that
        //many houses (the total comission percentage they will get is the 45% of the total sum)
        double comission = 0;
        //Printing a new line
        System.out.println();

        while(count!= 0){
            //Asking the seller for how much he sold each house
            System.out.println("Amount for which the " + count + " house was sold for: ");
            //adding into sum the amount that each house was sold for
            sum += stdin.nextDouble();
            //subtracting one each time we ask for house amount in descending order
            count--;
        }
        //Closing the scanner since it will not be use again
        stdin.close();
        //Calculating total comission the person will get from selling the houses
        comission = .45 * sum;
        //printing a new line
        System.out.println();
        //printing the total comission the user will get
        System.out.println("The total comission you will get is " + String.format("%.2f", comission));
        //Gratefully ending the program.
        System.out.println("Thank you for working with us. Keep the hard work!");
	}

}

