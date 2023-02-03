/*Remember: In order to have an application, we have to have a <class name>  and
 *  Write a Java program which will display an answer to one of the classmate's discusssionOne File.
    * 1)Assign a variable with your name for introduction
    * 2)Assign another variable that will display a string saying "It is nice to meet you, dear....Answer = "classmate name"
*/
import java.util.*;
public class AnswerOne{
//Remember that every program must have a "public static void main" to be able to run
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello! My name is: ");
            sc.nextLine();
            String classmateName;
            System.out.println("What it's your name: ");
            classmateName = sc.nextLine();
            System.out.println("It is nice meeting you " + classmateName + ". Good luck this semester.");
            sc.close();
    }

}
