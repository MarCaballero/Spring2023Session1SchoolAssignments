/*
 * Assignment Four Part Two
 * Student Name: Maria Caballero
 * Date: 02/01/2023
 * Program Summary:
 *          This program will prompt the user to enter an integer value and then it will
 *          use necessary for loops and nested loops to display a rectangualr pattern           
 */
//Importing necessary packages
import java.util.*;
public class AssignmentFourPart2 {
    public static void main(String[] args){
        //Creating a Scanner for user input
        Scanner scan = new Scanner(System.in);
        //Asking the user to enter a value for the square pattern 
        System.out.print("Enter the value of n: ");
        //Scanning the user input
        int n = scan.nextInt();
        //Closing Scanner
        scan.close(); 
        //Declaring integer variables
        int s,i,m,j,k,l;
        // number of rows and columns to be printed
        s = 2 * n - 1;
 
        // for loop accounting for Upper-Half
        for (i = 0; i < (s / 2) + 1; i++){
            m = n;
            //nested for-loop accounting for the Decreasing part
            for (j = 0; j < i; j++){
                System.out.print(m + " ");
                m--;
            }
                //another nested for-loop accounting for the Constant Part
                for (k = 0; k < s - 2 * i; k++){
                    System.out.print(n - i + " ");
                }
                    //another nested for-loop accounting for the Increasing part.
                    m = n - i + 1;
                    for (l = 0; l < i; l++){
                        System.out.print(m + " ");
                        m++;
                    }
                        //printing a new line
                        System.out.println();
        }
 
        //Second for-loop accounting for the Lower Half
        for (i = s / 2 - 1; i >= 0; i--){
            m = n;
            //nested for-loop accounting for the Decreasing Part
            for (j = 0; j < i; j++){
                System.out.print(m + " ");
                m--;
            }
                //another nested for-loop accounting for the Constant Part.
                for (k = 0; k < s - 2 * i; k++){
                    System.out.print(n - i + " ");
                }
                    m = n - i + 1;
                    //another nested for-loop accounting for the Decreasing Part
                    for (l = 0; l < i; l++){
                        System.out.print(m + " ");
                        m++;
                    }
                        //Printing a new line
                        System.out.println();
        }
    }
}
