package intermediate;

import java.util.Arrays;
import java.util.HashSet;

public class FindMissingAlphabet {
    public static void main(String[] args) {
        String givenString = "abcd";
        String removedSpaceGivenString = givenString.replaceAll(" ","");
        String[] splitRemovedSpaceGivenString = removedSpaceGivenString.split("");
        System.out.println(Arrays.asList(splitRemovedSpaceGivenString));

        String totalAlphabet = "abcdefghijklmnopqrstuvwxyz";

        String[] splitTotalAlphabet = totalAlphabet.split("");

        HashSet<String> givenStringSet = new HashSet<>(Arrays.asList(splitRemovedSpaceGivenString));

        HashSet<String> alphabetStringSet = new HashSet<>(Arrays.asList(splitTotalAlphabet));

        alphabetStringSet.removeAll(givenStringSet);

        System.out.println(alphabetStringSet);



    }
}
