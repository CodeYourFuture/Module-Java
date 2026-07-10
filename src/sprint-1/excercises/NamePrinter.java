//Exercise 2.4
//Write a program that uses a switch statement to print the name of the day based on an integer
//(1 = Monday, etc.)
//Explain why switch in Java differs from JavaScript (e.g. type safety)
//Answer
//Java's switch statement is more type safer. I noticed experessions must be compatible types and label must match.
//this is checked at compile time and avoids error during runtime in JS switch uses strict equality for comparision
//the language is dynamically typed which means type is checked and errors are found when the program is running
//this makes it less safer than java
public class NamePrinter {
    public static void main(String[] args) {
        int day = 3;
        switch (day) {
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
            default:
                System.out.println("Invalid day");
        }
    }
}