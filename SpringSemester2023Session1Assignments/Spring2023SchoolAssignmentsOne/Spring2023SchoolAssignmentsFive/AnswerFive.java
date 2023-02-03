/*
 * Discussion Participation Week 5
 * Student Name: Maria Caballero
 * Program Modification:
 *      I first corrected the program so that I can use the inputted amount the user entered so that
 *      I can calculate the total Family amount at the end of x months and then displayed the answer
 * 
 */

//import of necessary packages
import java.util.*;

public class AnswerFive {
    //Scanner for user input
    static Scanner stdin = new Scanner(System.in);
    public static void main(String[] args) {
        
        //Title
        System.out.println("\nFamily Planning Calculator");
        
        //Initial statement
        System.out.print("\nEnter the amount of money you have: ");
        int originalAmount = stdin.nextInt(); //changed the variable name
        //added another integer variable with different name for the "for" loop
        int i;
        //here we are initializing the variable of total amount at the end of x months
        int finalAmount = 0;
        for ( i = 1; i < 10; i = i + 2) {
            //Output Statement
            int increase = i * 8;
            finalAmount += increase;
            System.out.println("In month " + i + " you will receive an additional $" + increase);
        }
        //printing a new line
        System.out.println();
        //displaying the total final amount at the end of x months
        System.out.print("      The final total amount it is $" + (originalAmount + finalAmount));
        //closing Scanner
        stdin.close();	

}  
}
