

/*
 * Discussion Six
 * Student Name: Maria Caballero
 * Date: 02/03/2023
 * Program Summary: 
 *          This program creates a method that displays the services a car wash offers. Moreover,
 *          it creates a method of class DiscussionSix that calculates the total amount to pay with
 *          an addition of a discount if the user entered two services, else, if the user did not
 *          entered two services, it just displays the amount of that service without the discount.
 */
import java.util.*;
public class DiscussionSix{
    //Static method that displays the services a car wash offers
    static void CarWash(){
        System.out.println("            Welcome to The Car Wash Lab!");
        System.out.println("Today's PROMO is choose 2 options and we will apply a 20% discount");
        System.out.println("Option 1 - Exterior wash and dry");
        System.out.println("Option 2 - Vacuuming");
        System.out.println("Option 3 - Interior scrubbing and brushing");
        System.out.println("Option 4 - Polishing");
        System.out.println("Option 5 - Sealing and waxing");
        System.out.println("Option 6 - Glass cleaning");
        System.out.println("Option 7 - Paint claying");
        System.out.println("Option 8 - Steam cleaning");
    }
    //here I create my method of class DiscussionSix to calculate the total amount to pay
    //if the user entered two services, else we don't call this method 
    public double TotalAmount(double a, double b){
        //discount amount
        double discount = (a+b) * .20;
        //total amount to pay
        double total = (a+b) - discount;
        //return the calculation of total amount including the discount
        return total;
    }
    //here is my static void main where the program will call my methods
    public static void main(String[] args){
        //creating a scanner for user input
        Scanner scan = new Scanner(System.in);
        //calling my method to display offered services
        CarWash();
        //asking user to enter the services wanted
        System.out.println("What services would you like today?");
        System.out.println("(If you want just one service, please enter zero for second service)");
        System.out.print("Service 1: ");
        //scanning for service one
        int serviceOne = scan.nextInt();
        System.out.print("Service 2: ");
        //scanning for service two
        int serviceTwo = scan.nextInt();
        //closing scanner since we will not use it again
        scan.close();
        //Initializing my two variables that will account for my "TotalAmount" method parameters
        double serviceOnePrice = 0;
        double serviceTwoPrice = 0;
        //creating a switch statement for the possible options for service one the user entered
        switch(serviceOne){
            case 1:
                serviceOnePrice = 25;
                break;
            case 2:
                serviceOnePrice = 15;
                break;
            case 3:
                serviceOnePrice = 40;
                break;
            case 4:
                serviceOnePrice = 50;
                break;
            case 5:
                serviceOnePrice = 35;
                break;
            case 6:
                serviceOnePrice = 30;
                break;
            case 7:
                serviceOnePrice = 100;
                break;
            case 8:
                serviceOnePrice = 80;
                break;
        }
        //creating another switch statement for the possible options for service two the user entered
        switch(serviceTwo){
            case 0:
                serviceTwoPrice = 0;
                break;
            case 1:
                serviceTwoPrice = 25;
                break;
            case 2:
                serviceTwoPrice = 15;
                break;
            case 3:
                serviceTwoPrice = 40;
                break;
            case 4:
                serviceTwoPrice = 50;
                break;
            case 5:
                serviceTwoPrice = 35;
                break;
            case 6:
                serviceTwoPrice = 30;
                break;
            case 7:
                serviceTwoPrice = 100;
                break;
            case 8:
                serviceTwoPrice = 80;
                break;
        }
        //creating an Object of class DiscussionSix to call TotalAmount method
        DiscussionSix myObj = new DiscussionSix();
        //if the serviceTwo was zero then we output the total amount without discount
        if(serviceTwoPrice == 0){
            System.out.println("The total amount to pay is $" + serviceOnePrice);
        //else, if the serviceTwo was more than zero we output the total amount with the discount
        }else{
            System.out.println("The total amount to pay is $" + myObj.TotalAmount(serviceOnePrice,serviceTwoPrice));
        }
        //gratefully ending the program
        System.out.println("Thank you for coming, see you next time!");
    }
}