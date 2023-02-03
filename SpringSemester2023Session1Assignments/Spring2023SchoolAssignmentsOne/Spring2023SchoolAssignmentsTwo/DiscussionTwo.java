/*Write a Java Program which prompts a user for two numerical values as
 * input does some calculation on them and then print the result along 
 * with meaningful message to the console. Use some interesting formula
 * and not a simple summation.
 */

 import java.util.*;
 public class DiscussionTwo{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("\tMaria's Deli Shop.");
        System.out.println(" -Meat $5.99/lb");
        double meat_cost = 5.99;
        System.out.println(" -Cheese $4.99/lb");
        double cheese_cost = 4.99;
        System.out.println("Today's special: ");
        System.out.println(" -In the purchase of meat you will get a 10% discount.");
        double meat_percentage = 0.10;
        System.out.println(" -In the purchase of cheese you will get 15% discount.");
        double cheese_percentage = 0.15;
        System.out.println("How many pounds of meat you would like today?");
        double meat_lb = scan.nextDouble();
        System.out.println("How many pounds of cheese?");
        double cheese_lb = scan.nextDouble();
        scan.close();
        double meat = meat_lb * meat_cost; //this is the cost of meat without discount
        double cheese = cheese_lb * cheese_cost; //this is the cost of cheese without discount
        double meat_discount = meat * meat_percentage;
        double cheese_discount = cheese * cheese_percentage;
        double total_meat_cost = meat - meat_discount;
        double total_cheese_cost = cheese - cheese_discount;
        double total_cost = total_meat_cost + total_cheese_cost;
        System.out.format("Your total cost is: %.2f", total_cost);
    }
 }