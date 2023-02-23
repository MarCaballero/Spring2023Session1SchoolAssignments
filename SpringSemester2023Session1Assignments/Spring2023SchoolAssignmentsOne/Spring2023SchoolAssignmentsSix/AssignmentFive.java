/*
 * Student Name: Maria Caballero
 * Date: 02/11/2023
 * Program Summary:
 *      This program will:
 *          1) Prompt the user to input which action they want to take:
 *              a. Convert cubic feet to U.S. bushels
 *              b. Convert miles to kilometers
 *              c. Determine graduation with honors title
 *              d. Exit program
 *          2) Calculate the output according to the input
 *              a. cubic feet to U.S. bushels using following formula.
 *                  double cubicFootToBushel = 0.803564  --> we will multiply this number with the
 *                  inputted number from given user data 
 *              b. double mileToKm = 1.60934   --> we will multiply this number with the
 *                  inputted number from given user data
 *              C. double studentGPA = scan.nextDouble();
 *                 String studentTitle;
 *                 switch(studentGPA)
 *                      case 1 when (studentGPA >= 3.5 and studentGPA <= 3.7):
 *                             studentTitle = "Cum Laude";
 *                              break;
 *                      case 2 when (studentGPA >= 3.8 and studentGPA <= 3.9):  
 *                              studentTitle = "Magna Cum Laude";
 *                              break;
 *                      case 3 when (studentGPA >= 4):  
 *                              studentTitle = "Summa Cum Laude";
 *                              break;
 *              d. Exit program:
 *                  System.out.println("Thank you for participating. Have a good day!")
 */
//importing scanner
import java.util.*;
//importing decimal format
import java.text.DecimalFormat;

public class AssignmentFive {
    //Introduction method that will promp the menu to the user
    static void Intro(){
        System.out.println("         Welcome to the task computation Menu!");
        System.out.println("This are the tasks we offer for you: ");
        System.out.println("    a. Convert cubic feet to U.S. bushels.");
        System.out.println("    b. Convert miles to kilometers.");
        System.out.println("    c. Determine graduation with honors title.");
        System.out.println("    d.Exit Program.");
    }
    //gratefully ending the program method that will get call at last
    static void End(){
        System.out.println("Thank you for using the program. Have a good day!");
    }

    //userChoice = "A" then we call this method:
    public double FeetToBushels(double userVariable){
        double cubicFootToBushel = 0.803564; 
        double calculation = userVariable * cubicFootToBushel;
        return calculation;
    }
    //userChoice = "B" then we call this method:
    public double MilesToKilometers(double userVariable){
        double mileToKm = 1.60934;
        double calculation = userVariable * mileToKm;
        return calculation; 
    }
    //userChoice = "C" then we call this method:
    public String HonorsTitle(double userValue){
        String studentTitle;
        String StringVariable = String.valueOf(userValue);
        switch(StringVariable){
            case "3.5": 
                studentTitle = "Congratulations, you have graduated with Cum Laude honors.";
                    break;
            case "3.6": 
                studentTitle = "Congratulations, you have graduated with Cum Laude honors.";
                break;
            case "3.7": 
            studentTitle = "Congratulations, you have graduated with Cum Laude honors.";
                break;
            case "3.8":  
            studentTitle = "Congratulations, you have graduated with Magna Cum Laude honors.";
                break;
            case "3.9":  
            studentTitle = "Congratulations, you have graduated with Magna Cum Laude honors.";
                break;
            case "4":  
            studentTitle = "Congratulations, you have graduated with Summa Cum Laude.";
                break;
            default:
            studentTitle = "Sorry, you did not graduate with an honors title.";
                break;
        }
        return studentTitle;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Intro();
        System.out.print("Enter the task: ");
        String userChoice = scan.nextLine();
        userChoice = userChoice.toUpperCase();
        //creating object to display my output in the format %.5f (5 decimal places)
        DecimalFormat df_obj = new DecimalFormat("#.#####");
        
        if(userChoice.equals("A")){
            //creating an object for FeetToBushels method
            AssignmentFive myobj = new AssignmentFive();
            System.out.print("Please enter cubic feet to convert: ");
            //Scanning user input if option = "A"
            double userData = scan.nextDouble();
            System.out.println(userData + " cubic feet = " + df_obj.format(myobj.FeetToBushels(userData)) + " U.S. bushels.");
            //calling exit method
            End();

        }else if(userChoice.equals("B")){
            //creating an object for MilesToKilometers method
            AssignmentFive myobj = new AssignmentFive();
            System.out.print("Please enter miles to convert: ");
            //Scanning user input if option = "B"
            double userData = scan.nextDouble();
            System.out.println(userData + " miles = " + df_obj.format(myobj.MilesToKilometers(userData)) + " kilometers.");
            //calling exit method
            End();
            
        }else if(userChoice.equals("C")){
            //creating an object for HonorsTitle method
            AssignmentFive myobj = new AssignmentFive();
            System.out.print("Please enter GPA: ");
            //Scanning user input if option = "C"
            double userData = scan.nextDouble();
            System.out.println(userData + " GPA = " + myobj.HonorsTitle(userData));
            //calling exit method
            End();

        }else if(userChoice.equals("D")){
            //calling my exit method for option = "D"
            End();
        }
        //closing Scanner
        scan.close();

    }
}
