/*
 * Author: Maria Caballero
 * Date: 01/24/2023
 * Program Summary:
 *          1)The program will prompt the user to enter two numbers between 200 and 1000
 *              and a symbol of operation such as '+', '-', '*', and '/' using Scanner
 *          2)The code will use nested if statements or switch to perform the operation
 *              on the two numbers
 *          3)If the provided nested if statement symbol is valid, the program will display
 *              the inputted data along with the result of the calculation to the console.
 *          4)If the provided nested if statement symbol is not valid, the program then will
 *              display an error message to the user
 *          Test 1 - Valid symbol and numbers within the given range:
 *              Input:
 *                  First number - 850
 *                  Second number - 579
 *                  Symbol - *
 *              Output: 850 * 579 = 492150
 * 
 *          Test 2 - Invalid symbol:
 *              Input:
 *                  First number - 250
 *                  Second number - 510
 *                  Symbol - @
 *              Output: "Sorry, but you inputted an invalid symbol, please try again."
 * 
 *          Test 3 - Numbers not within the corresponding range:
 *              Input:
 *                  First number - 45
 *                  Second number - 1200
 *                  Symbol - /
 *              Output: "Sorry, but you inputted numbers that are NOT within the corresponding range, 
 *                       please try again."
 * 
 *          Test 4 - One number out of range:
 *              Input:
 *                  First number - 2
 *                  Second number - 260
 *                  Symbol - +
 *              Output: "Sorry, but you inputted numbers that are NOT within the corresponding range, 
 *                       please try again."
 * 
 *          Test 5 - Invalid symbol and numbers not within the corresponding range:
 *              Input:
 *                  First number - 25
 *                  Second number - 88
 *                  Symbol - ^
 *              Output: "Sorry, you inputted numbers NOT within the corresponding range 
 *                       and invalid symbol, please try again."
 */

 //Importing the Scanner
 import java.util.*;
 public class AssignmentTwo{
    public static void main(String[] args){
        //creating the scanner for the user to input data
        Scanner scan = new Scanner(System.in);
        //Letting the user know he/she will need to input two number within 200  and 1000
        System.out.println("Please enter 2 numbers between 200 and 1000:");
        //making the user to enter the chosen numbers
        System.out.print("First number - ");
        //creating first number variable and reading number
        int firstNum = scan.nextInt();
        System.out.print("Second number - ");
        //creating second number variable and reading number
        int secondNum = scan.nextInt();
        //making user to enter the chosen symbol
        System.out.print("Now, enter a valid symbol (+, -, *, /) - ");
        //creating the char variable and reading the symbol
        char symbol = scan.next().charAt(0);
        //We close Scanner since we will not use it again
        scan.close();
        //Here we are making if-statements to check that the user entered numbers within the corresponding range
        if((firstNum >= 200 && firstNum <= 1000) && (secondNum >= 200 && secondNum <= 1000)){
            //Making if-else nested statements to check the user entered the corresponding symbols
            if(symbol == '+'){
                //if the symbol is '+' then we will calculate an addition with the two numbers given
                System.out.println(firstNum + " + " + secondNum + " = " + (firstNum + secondNum));
            }else if(symbol == '-'){
                //if the symbol is '-' then we will calculate a subtraction with the two numbers given 
                System.out.println(firstNum + " - " + secondNum + " = " + (firstNum - secondNum));
            }else if( symbol == '*'){
                //if the symbol is '*' then we will calculate a multiplication with the two numbers given
                System.out.println(firstNum + " * " + secondNum + " = " + (firstNum * secondNum));
            }else if(symbol == '/'){
                //if the symbol is '/' then we will calculate a division with the two numbers given
                System.out.println(firstNum + " / " + secondNum + " = " + (firstNum / secondNum));
            }else{
                //else if the symbol is not a valid one, we will display an error message
                System.out.println("Sorry, but you inputted an invalid symbol, please try again.");
            }
        }else{
            //if the first number and/or second number are not within the given range, but the symbol
            //is valid then we will display an error message
            if(symbol == '+' || symbol == '-' || symbol == '*' || symbol == '/'){
                System.out.println("Sorry, but you inputted numbers that are NOT within the corresponding range, please try again.");
            }else{
            //else if numbers and symbol are wrong then we will display another error message
                System.out.println("Sorry, you inputted numbers NOT within the corresponding range and invalid symbol, please try again.");
            }
        }
    }
 }