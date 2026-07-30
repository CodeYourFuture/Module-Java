import java.util.Arrays;
import java.util.List;

/**
 * This class provide utkility methods to work with strings
 */
public class StringUtilities {
    /**
     * Check wheather a string reads the same forward and backwards
     * @param s the string to be checked
     * @return true if the string provided is palindrom and false if it is not.
     */

    public boolean isPalindrome(String s) {
        String reversed = new StringBuilder(s)
                .reverse()
                .toString();

        return s.equals(reversed);
    }

    /**
     * Splits comma separated string into a list of strings
     * @param s is the comma separated string to be splited
     * @return a list containing values separated by comma
     */

    public List<String> splitCommaSeparatedLine(String s) {
        return Arrays.asList(s.split(","));
    }
}