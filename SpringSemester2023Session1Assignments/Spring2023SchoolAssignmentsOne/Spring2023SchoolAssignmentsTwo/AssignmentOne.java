/*
Author: Maria Caballero
Date: 01/15/2023
Summary - Java program that:

 * 1) Prompts a user to enter customer id, the unit proce in this format (e.g. 3.75),
 * quantity (as a whole number), product description, and discount in this format
 * (e.g., .10). Use a Scanner for input.
 * 
 * 2) Calculates the customer's overall order total before and after the discount.
 * 
 * 3) Displays the input data along with the order total before and after the discount 
 * to the console. 
 * 
 * To calculate the order total after discount: Unit price multiplied by quantity
 * To calculate the order total after discount: (Unit price multiplied by quantity)
 * multiplied by 1 minus (unit price multiplied by quantity) multiplied by the discount.
 * 
 * Example: Given unit price of 5.00 with a quantity of 2, and the discount of .10:
 * (5.00*2) = 10.00 order total before discount and (5.00*2) * 1-(5.00*2) * .10 = 9.0 total
 * after discount. 
 */

import java.util.*; //importing the necessary packages for java scanner
public class AssignmentOne { //My class
    public static void main(String[] args){ //Java main() method where compiler is call
        Scanner scan = new Scanner(System.in); //creating my Scanner object name scan
        System.out.print("What is the customer ID? "); //outputting for user to input name
        String customerID = scan.nextLine(); //scanning customer ID

        System.out.println("Hello " + customerID + " please enter the following:");

        System.out.print("\tProduct description - "); //outputting for the user to input product description
        String productDescription = scan.nextLine(); //scanning product description

        System.out.print("\tUnit price - "); //outputting for the user to input unit price
        double unitPrice = scan.nextDouble(); //scanning unit price of product

        System.out.print("\tUnit quantity - "); //outputting for the user to input unit quantity
        int unitQuantity = scan.nextInt(); //scanning unit price of quantity

        System.out.print("\tUnit discount (in .00 format)- "); //scanning product discount
        double unitDiscount = scan.nextDouble(); //scanning product discount
        scan.close(); //Scanner not use again, therefore it is close

        double order_total_before_discount = unitPrice * unitQuantity; //calculating order total price before discount
        double order_total_after_discount = order_total_before_discount * 1 - order_total_before_discount * unitDiscount; //calculating order total price after discount
        
        System.out.printf("The total price of your " + productDescription + " before discount is: %.2f", order_total_before_discount); //outputting the order total price before discount to the user
        System.out.println(); //new line
        System.out.printf("The total price of your " + productDescription + " after discount is: %.2f", order_total_after_discount); //outputting the order total price after discount to the user 
        System.out.println(); //new line
        System.out.print("Thank you for your purchase!"); //gratefully end the program.
    }
}
