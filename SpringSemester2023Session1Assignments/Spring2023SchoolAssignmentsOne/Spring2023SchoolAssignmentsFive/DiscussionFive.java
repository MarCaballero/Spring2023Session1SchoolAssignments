/*
 * Discussion Week 5
 * Student: Maria Caballero
 * Date: 01/30/2023
 * Program Summary:
 *      This program will perform a for loop that will calculate the factorial value of
 *      any number entered by the user in the range of 1 to 10 and then output the answer. 
 */


import java.util.*;

public class DiscussionFive{
    public static void main(String[] args){
        //Creating a Scanner for user input
        Scanner scan = new Scanner(System.in);
        //Declaring and initializing variables that will be used for the "for" loop
        int num; 
        int factorial = 1; 
        //Asking the user to enter an integer from the range 1 to 10 to calculate factorial
        System.out.print("Enter any positive integer in the range of 1-10: "); 
        //Scanning the integer number from user
        num = scan.nextInt(); 
        //Checking the integer inputted is a valid number, if not then asking again for user input
        while(num < 0 || num > 10){
            System.out.print("You entered an invalid number, please try again: "); 
            num = scan.nextInt();
        }
        //creating "for" loop to calculate the factorial of the inputted number
        for(int i = 1; i <= num; i++){
            factorial *= i;
        }
        //closing scanner since it will not be used again
        scan.close();
        //Outputting the answer to the user
        System.out.println("Factorial: " + factorial);
        //Gratefully ending the program
        System.out.print("Thank you for participating. See you next time!");
    }
}
