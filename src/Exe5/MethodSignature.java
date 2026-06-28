package Exe5;
import java.util.Scanner;
public class MethodSignature {

//      private: This method can only be accessed inside this class.
//      static: This method belongs to the class, so it can be called without creating an object.
//      String: This is the return type. The method returns a String.
//      greetUser: This is the method name.
//      String userName: This is the method parameter. It accepts a String called userName.

    private static String greetUser(String userName) {
        return "Hello "+userName;
    }
    public static void main(String[] args){
        System.out.println("Please enter your name: ");
        Scanner inObj= new Scanner(System.in);
        String userName=inObj.nextLine();

        System.out.println(greetUser(userName));
        }
    }


