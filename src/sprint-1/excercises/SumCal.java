//Exercise 3.2
//Create a method calculateSum that takes two integers and returns their sum
//Add JavaDoc comments explaining the method

public class SumCal {
    public static void main(String[] args) {
        int result = calculateSum(10, 20);
        System.out.println("The sum is: " + result);
    }

    /**
     * calculate the sum of two integer
     * @param num1 the first integer
     * @param num2 the second integer
     * @return the sum of num1 and num2
     */
    private static int calculateSum(int num1, int num2) {
        return num1 + num2;
    }
}
