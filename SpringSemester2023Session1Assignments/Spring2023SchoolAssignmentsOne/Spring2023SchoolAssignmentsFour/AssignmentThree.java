/*
 * Assignment Three
 * Student Name: Maria Caballero
 * Date: 01/27/2023
 * Program Summary:
 *          This program will calculate a gamer's total XP score with a bonus per level.
 *          The program is as follows:
 *              1) Prompt and read user's input for the gamer's name, Level 1 XP(L1), Level
 *              2 XP (L2), Level 3 XP (L3), and Engagement score (ES). User Scanner to read input.
 *              2) Each XP score input will be in whole numbers between 10 - 100 and in increments of 5.
 *              The total XP score with bonuses should be calculated as follows 
 *                  L1+L1*0.20+L2+L2*0.30+L3+L3*0.50+ES+ES*0.60
 *              3)Output the gamer's information and the total calculated XP score (including bonuses).
 *              4) Prompt the user as to whether they want to calculate total XP for another gamer and 
 *              repeat the input/output processing
 *              5) Allow user to exit the program without inputting gamer's data
 */

//Importing necessary packages for Scanner
import java.util.*;

public class AssignmentThree{
    public static void main(String[] args){
        //Creating two Scanner objects, one to read text and another one to read integers inputted by the user
        Scanner scan = new Scanner(System.in);
        Scanner scanText = new Scanner(System.in);
        //Outputting the title of our program
        System.out.println("        Welcome to the Total XP calculation program!");
        //Declaring variables that are going to be used later in the program
        int L1;
        int L2;
        int L3;
        int ES;
        String gamerName;
        //Asking user if he wants to enter gamer's data, if so we loop, if not then we don't loop
        System.out.print("Do you want to enter gamer's data (yes or no)? ");
        //Scanning user answer
        String userInput = scan.next();
        //Printing a new line
        System.out.println();
        //creating while loop. If the user entered "yes" we loop, if not, we go straight to the end of loop
        while(userInput.equalsIgnoreCase("yes")){
        //while the user input keeps being "yes", we ask for the gamer's data starting with name
        System.out.print("Enter gamer's name => ");
        //Scanning gamer name
        gamerName = scanText.nextLine();
        //We then ask for user to enter the scores for each level, separated by spaces
        System.out.print("Enter gamer's level XP scores separated by space: L1 L2 L3 ES => ");
        //Scanning user scores
        L1 = scan.nextInt();
        L2 = scan.nextInt();
        L3 = scan.nextInt();
        ES = scan.nextInt();
        //Printing a new line
        System.out.println();
        //Outputting the given data
        System.out.println("Gamer Name: " + gamerName + " L1 = " + L1 + " L2 = " + L2 + " L3 = " + L3 + " ES = " + ES);
        //Calculating the final score the user will get
        double finalScore = L1 + (L1*0.20) + L2 + (L2*.30) + L3 + (L3*.50)+ ES + (ES*.60);
        //Printing out the final score
        System.out.println("Final XP score with bonuses = " + finalScore);
        //Printing a new line
        System.out.println();
        //Asking user if he want's to continue giving data for another player
        System.out.print("Do you want to enter another gamer's data (yes or no)? ");
        //Scanning the user answer to check if we will loop again
        userInput = scan.next();
        //Printing a new line
        System.out.println();
        }
        //Closing scanner objects since they will not be used again, once the user entered "no"
        scan.close();
        scanText.close();
        //Printing a new line
        System.out.println();
        //Gratefully ending the program
        System.out.println("Thank you for using the Total XP calculation program! ");
        System.out.println("Have a nice day!");
    }
}