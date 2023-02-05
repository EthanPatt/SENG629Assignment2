
//   Coded by:     Ethan Pattison
//   Course:       SENG 620 - Assignment 2 - Task 4 
//   Professor:    Dr Abusharkh
//   Date:         1/24/2023

package javaapplication45;


// Import scanner class to get keyboard data from user 
import java.util.Scanner;

public class JavaApplication45 {

    public static void main(String[] args) {

// Declare varibles
    char CurrentPackage;
    int NumOfHours;
    double Total = 0;
 
// Initialize scanner objects
    Scanner keyboard = new Scanner(System.in);
    
// Ask the user to enter the number of miles driven
    System.out.println("Welcome to the Monthly bill Calculator! ");
    System.out.println("Enter your current internet package (A,B,C): ");
    CurrentPackage = keyboard.next().charAt(0);
    
// Ask the user to enter the gallons of gas used
    System.out.println("Enter the number of hours used: ");
    NumOfHours = keyboard.nextInt();

// Set up the case switch for the 3 Packages
    switch(CurrentPackage)
    {
        case 'A','a':
        {
            if (NumOfHours<=10)
                Total = 9.95;
            else
                Total = 9.95 +((NumOfHours-10)*2.0);
        }
        break;
        case 'B','b':
        {
            if (NumOfHours<=20)
                Total = 14.95;
            else
                Total = 14.95 +((NumOfHours-20)*1.0);
        }
        break;
        case 'C','c':
        Total = 19.95;
        break;
        
        default: System.out.println("Not a valid Package");
    }
    System.out.println("Monthly bill on Package " + CurrentPackage + " is: $" +Total);
}
}

