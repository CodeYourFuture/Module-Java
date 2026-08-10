public class ReverseNumbers {

    /**
     * reverseNumber() method takes a number and return its reverse
     * @param number is an integer
     * @return is the reverse of that integer
     */
    private static int reverseNumber(int number) {
        int absNumber = Math.abs(number);
        String stringifiedNumber = Integer.toString(absNumber);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = stringifiedNumber.length() - 1; i >= 0 ; i --) {
            stringBuilder.append(stringifiedNumber.charAt(i));

        }

        int reversedNumber = Integer.valueOf(stringBuilder.toString());

        if(number < 0) {
            return -reversedNumber;
        }

        return reversedNumber;
    }

    public static void main(String[] args) {
        System.out.println(reverseNumber(-453));
    }
}
