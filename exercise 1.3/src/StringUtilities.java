import java.util.Arrays;
import java.util.List;

public class StringUtilities {
    public boolean isPalindrome(String s) {

        String reversedString = new StringBuilder(s).reverse().toString();

        return s.equals(reversedString);
    }


    public List<String> splitCommaSeparatedLine(String s) {

        String[] stringsArray = s.split("\\s*,\\s*");


        List<String> stringsList = Arrays.asList(stringsArray);

        return stringsList;

    }
}

/*
Q1: Did writing the test cases upfront help you focus on the behaviour you needed to implement?
A1: Indeed it did. It helped focus solely on the behaviour expected from the method, rather than shifting
    the focus on implementing tests tailored very specifically for a pre-existing method.

Q2: Did you manage to think of edge cases that should be covered?
A2: Yes, and a few have already been added as test cases with a comment to their side indicating they are edge cases.

Q3: Conversely, what can be a downside (e.g. what tends to happen) if you write tests for a pre-existing implementation?
A3: There will be a bias in the sense that tests will be written in order to pass a test case rather than focusing
on the main picture which is the overall behaviour of the method/ logic and therefore they might miss testing edge cases.
Additionally, if requriements might evelove or change meaning that the logic we're testing might change in its behaviour
or even become obselete and no longer needed. In this case, and therefore resources were wasteed on writting tests beforehand.

 */