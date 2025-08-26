package basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class FindPositionOfASCII {

    private static final Logger logger = LoggerFactory.getLogger(FindPositionOfASCII.class);

    public static void findPositionOfLetter(String input) {
        if (input == null || input.trim().isEmpty()) {
            logger.warn("Input is null or empty");
            return;
        }

        char[] letters = input.trim().toCharArray();
        logger.info("Processing input: '{}'", input.trim());
        logger.info("Number of characters to process: {}", letters.length);

        for (int i = 0; i < letters.length; i++) {
            char currentChar = letters[i];
            
            if (Character.isLetter(currentChar)) {
                processLetter(currentChar, i + 1);
            } else {
                logger.info("Character at position {}: '{}' is not a letter (ASCII: {})", 
                    i + 1, currentChar, (int) currentChar);
            }
        }
    }

    private static void processLetter(char letter, int position) {
        char upperCase = Character.toUpperCase(letter);
        char lowerCase = Character.toLowerCase(letter);
        
        int upperCaseASCII = (int) upperCase;
        int lowerCaseASCII = (int) lowerCase;
        
        // Calculate alphabet position (A=1, B=2, etc.)
        int alphabetPosition = upperCaseASCII - 64; // 'A' is ASCII 65, so 65-64=1
        
        logger.info("=== Character at position {} ===", position);
        logger.info("Original character: '{}'", letter);
        logger.info("Uppercase: '{}' (ASCII: {})", upperCase, upperCaseASCII);
        logger.info("Lowercase: '{}' (ASCII: {})", lowerCase, lowerCaseASCII);
        logger.info("Alphabet position: {}", alphabetPosition);
        
        if (Character.isUpperCase(letter)) {
            logger.info("Input character '{}' is uppercase", letter);
        } else {
            logger.info("Input character '{}' is lowercase", letter);
        }
    }

    public static void demonstrateWithHardcodedValues() {
        logger.info("=== Demonstration with hardcoded values ===");
        String[] examples = {"A", "abc", "XyZ", "Hello World!"};
        
        for (String example : examples) {
            logger.info("\n--- Processing: '{}' ---", example);
            findPositionOfLetter(example);
        }
    }

    public static void main(String[] args) {
        logger.info("Starting FindPositionOfASCII program");
        
        // First demonstrate with some examples
//        demonstrateWithHardcodedValues();
        
        // Then get user input
        logger.info("\n=== Interactive Input Section ===");
        
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter letters to find their ASCII values and positions: ");
            String userInput = scanner.nextLine();
            
            logger.info("User entered: '{}'", userInput);
            findPositionOfLetter(userInput);
            
        } catch (Exception e) {
            logger.error("Error occurred while reading input: {}", e.getMessage());
        }
        
        logger.info("FindPositionOfASCII program completed");
    }
}
