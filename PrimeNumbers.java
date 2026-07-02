
public class PrimeNumbers {

    private static void getPrimNumbers() {

        for (int i = 1; i <= 1000; i ++) {
            boolean isPrimeNumber = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }
            if (isPrimeNumber) {
                System.out.println(i);
            }

        }



    }

        public static void main(String[] args) {
            getPrimNumbers();
        }


    }



