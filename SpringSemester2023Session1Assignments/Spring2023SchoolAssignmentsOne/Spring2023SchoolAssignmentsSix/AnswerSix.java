/*
 * Publisher: Jordan Pope
 * Date: 1.26.23
 * This program finds the amount of even numbers in a range of two numbers. 
 * This program does this by gathering two integers from user input to act as the range, 
 * then will loop through the numbers printing out the even numbers.
 * 
 * Participation Week#6
 * Student Name: Maria Caballero
 * Date: 02/03/2023
 * Program Modification:
 *      I just implemented a method that outputs the amount of odd numbers
 *      in the given range inputted by the user and called that method after
 *      the printEven method already made by my classmate. 
 *      
 */

	// import statements to read input from user and to format time for signature
    import java.util.*;
    import java.time.LocalDateTime;
    import java.time.format.DateTimeFormatter;  
    
    public class AnswerSix {
            // method that loops through two numbers and prints out the even numbers in the given range
        public static void printEven(int evenOne, int evenTwo)
        {
            if(evenOne < evenTwo)
            {
                for(int c = evenOne; c <= evenTwo; c++)
                {
                    if(c%2 == 0)
                    {
                        System.out.print(c+" ");
                    }
                }
            }
            else
            {
                for(int c = evenTwo; c <= evenOne; c++)
                {
                    if(c%2 == 0)
                    {
                        System.out.print(c+" ");
                    }
                }
            }
            System.out.println();
        }
        
        public static void printOdd(int oddOne, int oddTwo)
        {
            if(oddOne < oddTwo)
            {
                for(int c = oddOne; c <= oddTwo; c++)
                {
                    if(!(c%2 == 0))
                    {
                        System.out.print(c+" ");
                    }
                }
            }
            else
            {
                for(int c = oddTwo; c <= oddOne; c++)
                {
                    if(!(c%2 == 0))
                    {
                        System.out.print(c+" ");
                    }
                }
            }
            System.out.println();
        }
        
            //main class
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            
            // Prompts user for input & stores it
            System.out.print("Please enter two integers to find all the even and odd numbers between them: ");
            int numberOne = scan.nextInt();
            int numberTwo = scan.nextInt();
            scan.close();
            // runs method and output
            System.out.println("These are all the even numbers in this range.");
            printEven(numberOne, numberTwo);
            System.out.println();
            System.out.println("These are all the odd numbers in this range.");
            printOdd(numberOne, numberTwo);
            System.out.println("");

            //Implemented a string that Gratefully ends the program
            System.out.println("Thank you for participating.");
            
            //signature
            System.out.println("");
            DateTimeFormatter time = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
            LocalDateTime now = LocalDateTime.now();  
            System.out.println(time.format(now));  
            System.out.println("Jordan Pope");
            //signature of the participant
            System.out.println("Maria Caballero");
        }
    
    }
