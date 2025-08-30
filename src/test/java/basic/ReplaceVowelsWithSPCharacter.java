package basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.List;

public class ReplaceVowelsWithSPCharacter {

    private final Logger logger = LoggerFactory.getLogger(ReplaceVowelsWithSPCharacter.class);
    String sentence = "I want to become an Senior well known software tester";

    public void usingIteration() {
        logger.info("Using for loop iteration, to replace the character");
        logger.info("sentence: " + sentence);

        char[] sentenceCharArray = sentence.toCharArray();
        List<String> vowelsList = Arrays.asList("A", "E", "I", "O", "U", "a", "e", "i", "o", "u");
        for (int i = 0; i < sentence.length(); i++) {

            if (vowelsList.contains(String.valueOf(sentenceCharArray[i]))) {
                sentenceCharArray[i] = '*';
            }
        }
        String replacedSentence = new String(sentenceCharArray);
        logger.info("using Loop char and convert into string: " + replacedSentence);

        System.out.println("Print the pattern for char using print: ");
        for (char element : sentenceCharArray) {
            System.out.print(element);
        }

    }

    public void usingRegExpression() {

        logger.info("Using RegExp, to replace the character");
        String regString = sentence.replaceAll("[AEIOUaeiou]", "*");
        logger.info("Print the * string using Regex: " + regString);

        String regStringTwo = sentence.replaceAll("[AEIOUaeiou]", "\\$");
        logger.info("Print the $ string using Regex: " + regStringTwo);

    }

    public static void main(String[] args) {

        ReplaceVowelsWithSPCharacter vowelsWithSPCharacter = new ReplaceVowelsWithSPCharacter();
        vowelsWithSPCharacter.usingIteration();
        vowelsWithSPCharacter.usingRegExpression();
    }
}
