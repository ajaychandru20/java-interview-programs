package basic.ReverseThings;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ReverseSentence {

    private static final Logger logger = LoggerFactory.getLogger(ReverseSentence.class);

    public static void main(String[] args) {
        String sentence = "I want to become SDET";
        
        String[] splitSentence = sentence.split(" ");
        logger.info("Number of words: {}", splitSentence.length);
        logger.info("First word: {}", splitSentence[0]);
        
        // Build original sentence string
        StringBuilder originalBuilder = new StringBuilder();
        for (String word : splitSentence) {
            originalBuilder.append(word).append(" ");
        }
        logger.info("Original sentence: {}", originalBuilder.toString().trim());
        
        // Build reversed sentence using StringBuilder (method 1)
        StringBuilder reversedBuilder = new StringBuilder();
        for (int i = splitSentence.length - 1; i >= 0; i--) {
            reversedBuilder.append(splitSentence[i]).append(" ");
        }
        logger.info("Reversed sentence (method 1): {}", reversedBuilder.toString().trim());
        
        // Build reversed sentence using string concatenation (method 2)
        String reversedSentence = "";
        for (int i = splitSentence.length - 1; i >= 0; i--) {
            reversedSentence += (splitSentence[i] + " ");
        }
        logger.info("Reversed sentence (method 2): {}", reversedSentence.trim());
    }
}
