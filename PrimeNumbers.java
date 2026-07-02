import java.util.ArrayList;

public class PrimeNumbers {

    static void main(String[] args) {
        ArrayList<Integer> primeNumbersArray = new ArrayList<>();
        for (int i = 1; i <= 1000; i ++) {
            for (int j = 1; j <= 1000; j++) {
                if (i % 1 == i && i % i == 0 && i % j != 0) {
                    primeNumbersArray.add(i);
                }
            }
        }

    }
}