import java.util.ArrayList;

public class PrimeNumbers {

    private static void getPrimeNumbers() {
        ArrayList<Integer> primeNumbersArray = new ArrayList<>();
        for (int i = 1; i <= 1000; i ++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    break;
                }
            }
            primeNumbersArray.add(i);
        }


        System.out.println(primeNumbersArray);
    }
    }


    static void main(String[] args) {

    }
}

