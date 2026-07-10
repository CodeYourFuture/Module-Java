//Exercise 2.1
//Goal: Practice basic syntax and keywords.
//
//Create a program that:
//
//Declares variables of different primitive types (int, double, boolean, char).
//Prints their values to the console.
//Add comments explaining what each keyword does (e.g., public, static, void).

//the access modifier "public" allows the class or method to be accessed from anywhere
public class PrimitiveDataTypeExcerices{
    //static tells main belongs to the class rather than an object.
    //void means this method doesnt return a value.
    public static void main(String[] args){
        int myAge = 20;
        double height = 1.70;
        boolean isWorking = false;
        char mathGrade = 'A';

        System.out.println("Age:" + myAge);
        System.out.println("Height is:" + height);
        System.out.println("Is Working: " + isWorking);
        System.out.println("Grade:" + mathGrade);
    }
}