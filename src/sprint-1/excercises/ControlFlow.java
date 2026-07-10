//Exercise 2.3
//Goal: Compare Java control flow with JavaScript.
//Write a program that:
//Uses a for loop to print numbers 1 to 10.
//Uses an if-else statement to check if a number is even or odd.
//Bonus: Rewrite the same logic in JavaScript and note the differences in syntax.
// This is a class definition. A class is a blueprint for objects.

public class ControlFlow {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            if (i % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        }
    }
}

//JavaScript equivant to compare control flow
// Print numbers from 1 to 10
//for (let i = 1; i <= 10; i++) {
//        console.log(i);
// Check whether the number is even or odd
//    if (i % 2 === 0) {
//        console.log("even");
//        } else {
//        console.log("odd");
// } }
