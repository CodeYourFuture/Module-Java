import java.util.ArrayList;

public class PrimeNumbers {

    static void main(String[] args) {
        ArrayList<Integer> primeNumbersArray = new ArrayList<>();
        for (int i = 1; i <= 1000; i ++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                   break;
                } else {
                    primeNumbersArray.add(i);
                }
            }

        }




    }
}