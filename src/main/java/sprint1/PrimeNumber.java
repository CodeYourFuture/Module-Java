package sprint1;

public class PrimeNumber {

    public static void printPrimeNumbers() {

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

        public static void main(String[] args) {
            printPrimeNumbers();
        }
    }
