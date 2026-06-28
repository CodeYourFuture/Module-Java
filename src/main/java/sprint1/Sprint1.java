package sprint1;
import java.util.Scanner;

public class Sprint1 {



    // exercise one : private method to print the prime number smaller than 1000.
    private static void printPrimeNumbers() {

            // loop through numbers from 2 to 1000
            // start loop from 2 because 1 is not a prime number
            for (int number = 2; number <= 1000; number++) {

                // 2 is the prime number
                boolean isPrime = true;
                // check if number has any divisors
                for (int divisor = 2; divisor <= Math.sqrt(number); divisor++) {
                    if (number % divisor == 0) {
                        isPrime = false;
                        break;
                    }
                }
                // print prime numbers
                if (isPrime) {
                    System.out.println(number);
                }
            }
        }


        private static int reverseNumber(int num) {

        int rev = 0;

        while (num != 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }

        return rev;
    }


        // main method where I call me methods

        public static void main(String[] args) {

        // User can choose which method to be executed.

        Scanner scanner = new Scanner (System.in);

        System.out.println("Choose option");
        System.out.println("1 - Print prime number");
        System.out.println("2 - Reverse Number ");

        int option = scanner.nextInt();



        if (option == 1 ){
            printPrimeNumbers();
        } else if (option==2){
            System.out.println("Enter your number for reverse");

            // user enter their number

            int num = scanner.nextInt();
            int result = reverseNumber(num);
            System.out.println("The reverse number is  " +  result);
        } else {System.out.println("invalid option");}

        }
    }
