/*
 * Assignment Four Part One
 * Student Name: Maria Caballero
 * Date: 02/01/2023
 * Program Summary:
 *          This program will prompt the user for the number of rows and 
 *          output right-side triangle pattern using nested for-loops.
 */
//Importing the necessary packages
import java.util.*;
public class AssignmentFourPart1 {
    public static void main(String[] args){
        //Creating a Scanner for user input
        Scanner scan = new Scanner(System.in);
        //Declaring integer variables 
        int i, j, n;
        System.out.print("Input the number of rows: ");
        //Scanning user input
        n = scan.nextInt();
        //Creating a for-loop that will run through the number of rows
        for(i = 1; i <= n; i++){
            //Creating a nested for-loop that will add one and output the first number of rows plus the addition
            for(j = 1; j <= i; j++)
                //Outputting the right-sided triangle pattern
                System.out.print(j + " ");
                //Printing a new line
                System.out.println();
            
        }
    
    }
}
