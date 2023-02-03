/*
*Task: Discussion #3
*Student Name: Maria Caballero
*Date: 01/22/2023
*Program Summary: 
    Java program which prompts a user for input and depending on
    that input prints the corresponding output using if-else statements
 */

import java.util.*;
public class DiscussionThree{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the next information:");
        
        //Asking user for height in inches
        System.out.print("height (in inches)? ");
        double height = scan.nextDouble();
        //Asking user for weight in pounds
        System.out.print("weight (in pounds)? ");
        double weight = scan.nextDouble();
        //Printing a new line
        System.out.println();
        //closing scanner since we are done with it
        scan.close();
        //Computes a person's BMI based on their height and weight.
        double bodyMass = (weight * 703 / height / height);
        //Outputs information about person's BMI and weight status.
        System.out.printf("Person body mass index = %.2f\n", bodyMass);
        //comparing body mass to check if it's underweight, normal, overweight, or obese
        if(bodyMass < 18.5){
            System.out.println("BMI = underweight");
        }else if(bodyMass < 25){
            System.out.println("BMI = normal");
        }else if(bodyMass < 30){
            System.out.println("BMI = overweight");
        }else{
            System.out.println("BMI = obese");
        }
        //Gratefully ending the program
        System.out.println("Thank you for participating, have a good day!");
    }
}

