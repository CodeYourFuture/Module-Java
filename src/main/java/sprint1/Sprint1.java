package sprint1;

import java.util.Scanner;

public class Sprint1 {

    /**
     * Prints all prime numbers up to 1000.
     */
    private static void printPrimeNumbers() {

        for (int number = 2; number <= 1000; number++) {

            boolean isPrime = true;

            // check if number has any divisors
            for (int divisor = 2; divisor < number; divisor++) {
                if (number % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(number);
            }
        }
    }

    /**
     * Reverses the digits of a given number.
     * Example: 123 becomes 321.
     */
    private static int reverseNumber(int num) {

        int rev = 0;

        while (num != 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }

        return rev;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose option");
        System.out.println("1 - Print prime number");
        System.out.println("2 - Reverse Number");

        int option = 0;

        // safe input for menu
        try {
            option = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.nextLine();
            return;
        }

        if (option == 1) {

            printPrimeNumbers();

        } else if (option == 2) {

            System.out.println("Enter your number for reverse:");

            int num = 0;

            try {
                num = scanner.nextInt();
                int result = reverseNumber(num);
                System.out.println("The reverse number is " + result);
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a whole number.");
                scanner.nextLine();
            }

        } else {
            System.out.println("Invalid option");
        }
    }
}