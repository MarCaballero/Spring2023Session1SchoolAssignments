import java.util.Scanner;

/*
 * Discussion Week 4
 * Student: Maria Caballero
 * Date: 01/23/2023
 * Program Summary:
 *      This program will contain a while loop where it will be executed just if the user entered an integer 
 *      which will account for the number of siblings they have and within the while loop it will ask for their
 *      names. Else, if the user don't have any siblings, it will display another message.  
 * 
 */

public class DiscussionFour {
    public static void main(String[] args){
        //creating a new Scanner
        Scanner scan = new Scanner(System.in);
        //Outputting title of the program to the user
        System.out.println("                                Online Shopping List");
        //asking user to enter the items he/she will buy 
        System.out.println("Please enter the items that you are adding into your bag (press enter again when done). ");
        //Scanning items entered
        String itemName = scan.nextLine();
        //Initializing the variable that will account for the number of items the user inputted
        int itemCount = 0;
        //while the itemName is not empty perform "while" loop
        while(!itemName.isEmpty()){
            //keep count of the number of items the user inputted
            itemCount++;
            //keep scanning for items 
            itemName = scan.nextLine();
        }
        //closing the Scanner since it will not be used anymore
        scan.close();
        //if the number of items is more than zero, output the number of items the user inputted
        if(itemCount > 0){
            System.out.println("You have added " + itemCount + " items into your bag" );
        //else if the user didn't input any items, let the user know he doesn't have any items into their bag
        }else{
            System.out.println("You didn't add any items into your bag");
        }
        //Gratefully ending the program
        System.out.println("Thank you for shopping with us. Have a nice day!");
    }
}
