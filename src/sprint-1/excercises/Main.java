//Exercise 2.2
//Goal: Identify and fix compilation errors.
//Remove a semicolon or misspell a keyword in your code.
//Observe the compilation error in IntelliJ.
//Fix the error and re-run the program

public class Main{
    public static void main(){
        int MyAge = 20;
        double hight = 1.70;
        boolean isWorking = false;
        char MathGrade = 'A';

        System.out.println("Age:" + MyAge);
        System.out.println("Height is:" + hight);
        System.out.println("Is Working:" + isWorking);
        System.out.println("Grade:" + MathGrade);
    }
}

//Myage on line 15
//java: cannot find symbol
//symbol:   variable Myage
//location: class Main

