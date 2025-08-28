package basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReplaceVowelsWithSPCharacter {

    private final Logger logger = LoggerFactory.getLogger(ReplaceVowelsWithSPCharacter.class);

    public void usingIteration() {
        logger.info("Using for loop iteration, to replace the character");
        String sentence = "I want to become an Senior well known software tester";

        char[] sentenceCharArray = sentence.toCharArray();
        List<String> vowelsList = Arrays.asList("A", "E", "I", "O", "U", "a", "e", "i", "o", "u");
        for (int i = 0; i < sentence.length(); i++) {

            if (vowelsList.contains(String.valueOf(sentenceCharArray[i]))) {
                sentenceCharArray[i] = '*';
            }
        }
        String replacedSentence = new String(sentenceCharArray);
        System.out.println(replacedSentence);
        for (char element: sentenceCharArray){
            System.out.print(element);
        }

    }

    public void usingRegExpression(){

    }

    public static void main(String[] args) {

        ReplaceVowelsWithSPCharacter vowelsWithSPCharacter = new ReplaceVowelsWithSPCharacter();
        vowelsWithSPCharacter.usingIteration();
    }
}
