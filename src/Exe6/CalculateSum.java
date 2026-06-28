package Exe6;
import java.util.Scanner;



public class CalculateSum {
    /**
     * Calculates the sum of two integers.
     *
     * @param num1 the first integer
     * @param num2 the second integer
     * @return the sum of num1 and num2
     */

    public static int calculateSum(int num1, int num2){
        return num1 + num2;
    }
    public static void main(String[] args){
        Scanner inputObj= new Scanner(System.in);
        int num1,num2;
        System.out.println("Please enter the first number: ");
        num1= inputObj.nextInt();
        System.out.println("Please enter the second number: ");
        num2= inputObj.nextInt();
        System.out.println("The sum is: " + calculateSum(num1,num2));

    }

}
