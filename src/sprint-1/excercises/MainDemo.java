//Exercise 3.1
//Goal: Write a method signature which takes parameters.
//Create a private method called greetUser that:
//Accepts a String name as a parameter.
//Returns a greeting message like “Hello, Alice!”.
//Call this method from a main method and print the result.
//Explain each part of the method signature for the name method.

public class MainDemo {
    public static void main(String[] args) {
        //call the greetUser method and print the returned greeting
        System.out.println(greetUser("Alice"));
    }
    //Private method that accepts a name and returns a greeting
    private static String greetUser(String name) {
        return "Hello, " + name + "!";
    }
}