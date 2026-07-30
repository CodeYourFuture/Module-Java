package sprint3.excercises.exercise3;

import java.util.Arrays;
import java.util.List;

public class StringUtilitiesNew {

    public boolean isPalindrome(String s) {
        String reversed = new StringBuilder(s)
                .reverse()
                .toString();

        return s.equals(reversed);
    }

    public List<String> splitCommaSeparatedLine(String s) {
        return Arrays.asList(s.split(","));
    }
}