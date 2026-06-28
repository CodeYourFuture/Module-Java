package reversenumber;
import java.util.Scanner;
/**
 * A program that reverses the digits of a number.
 */

public class ReverseNumber {
    /**
     * Takes an integer and returns the same number with its digits in reverse order.
     *
     * @param number the number to reverse
     * @return the number with its digits reversed
     */

    private static int reverseNumber(int number){
        int reversedNumber=0;
        while(number>0) {
            reversedNumber=(reversedNumber*10)+(number%10);
            number=number/10;

        }
    return reversedNumber;
    }

    public static void main(String[] args){
        int number=0;
        Scanner inputObj= new Scanner(System.in);
        System.out.println("Please enter a number: ");
        number=inputObj.nextInt();

        System.out.println("Reversed number: " + reverseNumber(number));


    }
}
