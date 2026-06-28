//Uses a for loop to print numbers 1 to 10.
//Uses an if-else statement to check if a number is even or odd.

//1: for loop
//2: check if its even or not with if

package Exe3;

public class forLoop {
    public static void main(String[] args) {
        for(int i=1 ; i<=10 ; i++){
            if(i%2 == 0){
                System.out.println("Number "+ i+ " is even");
            }
            else {
                System.out.println("Number "+i+ " is odd");
            }

        }

    }
}
