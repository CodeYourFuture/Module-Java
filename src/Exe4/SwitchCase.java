//Write a program that uses a switch statement to print the name of the day
// based on an integer (1 = Monday, etc.).

//1: receive number from input and store it in a integer var
//2: check if number is in between 1 and 7 / else alarm
//3: go through of a switch case and print the name of day
package Exe4;
import  java.util.Scanner;


public class SwitchCase {
    static int receiveNumber(){
        System.out.println("Enter a number from 1 to 7: ");
        Scanner inputObj= new Scanner(System.in);
        int iDay=inputObj.nextInt();
        return iDay;
    }
    static void printDay(int iDay){
        switch (iDay){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;


        }

    }

    public static void main (String[] args) {

        int iDay = receiveNumber();
        while (iDay < 1 || iDay > 7) {
            System.out.println("Number should be between 1 and 7. Please enter a number: ");
            iDay = receiveNumber();
        }
        printDay(iDay);


    }
}



