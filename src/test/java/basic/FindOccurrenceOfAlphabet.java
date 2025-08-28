package basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class FindOccurrenceOfAlphabet {

    private final Logger logger = LoggerFactory.getLogger(FindOccurrenceOfAlphabet.class);

    public void usingIteration(String toFind) {

        logger.info("With using Iteration function");

        logger.info("String Passed on toFind: " + toFind);
        String sentence = ("Don Bosco Matriculation School").toLowerCase();
        logger.info("Sentence: " + sentence);
        char toFindChar = (toFind.toLowerCase()).charAt(0);
        logger.info("toFindChar: " + toFindChar);

        int occurrence = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (toFindChar == sentence.charAt(i)) {
                occurrence++;
            }
        }
        logger.info("Occurrence of the character in the sentence: " + occurrence);

    }

    public void usingNonIteration(String toFind) {

        logger.info("Without using Iteration function");

        logger.info("String Passed on toFind: " + toFind);
        String sentence = ("Don Bosco Matriculation School").toUpperCase();

        logger.info("Sentence: " + sentence);

        char toFindChar = (toFind.toUpperCase()).charAt(0);
        String stringToFindChar = Character.toString(toFindChar);

        logger.info("stringToFindChar: " + stringToFindChar);


        Integer actualLength = sentence.length();
        String replacedSentence = sentence.replace(stringToFindChar, "");

        Integer afterLength = replacedSentence.length();

        logger.info("Occurrence of the character in the sentence: : " + (actualLength - afterLength));


    }

    public static void main(String[] args) {

        System.out.print("Enter the want to check character: ");
        Scanner scanner = new Scanner(System.in);
        String toFind = scanner.next();

        FindOccurrenceOfAlphabet occurrenceOfAlphabet = new FindOccurrenceOfAlphabet();
        occurrenceOfAlphabet.usingIteration(toFind);
        occurrenceOfAlphabet.usingNonIteration(toFind);
    }

}
