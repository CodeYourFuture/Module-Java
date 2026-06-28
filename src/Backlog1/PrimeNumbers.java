package Backlog1;

/**
 * Prints all prime numbers from 1 to 1000.
 * A prime number has exactly two divisors:
 * 1 and itself.
 */

/**
 * Loop from 1 to limit.
 * For each number, check all numbers from 1 to itself.
 * If i % j == 0, increase the counter.
 * If the counter is 2, the number is prime, so print it.
 */


public class PrimeNumbers {
    private static void printPrimeNumbers(int limit){
        for(int i=1;i<=limit;i++){
            int counter=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    counter++;
                }

            }
            if (counter==2){
                System.out.print(" "+i);
            }

        }
    }
    public static void main(String[] args){

        printPrimeNumbers(1000);

    }
}
