package basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;
import java.util.stream.IntStream;

public class FindElementInArray {

    private static final Logger logger = LoggerFactory.getLogger(FindElementInArray.class);
    private static final int[] listOfNumbers = {1, 3, 4, 5, 8, 2, 9};

    public static void usingTraditionalMethod(Integer checkNumber) {
        logger.info("Using traditional loop method to check if element exists");
        
        boolean found = false;
        for (int number : listOfNumbers) {
            if (number == checkNumber) {
                found = true;
                break;
            }
        }
        
        if (found) {
            logger.info("Number {} is present in the array!", checkNumber);
        } else {
            logger.info("Number {} is not present in the array!", checkNumber);
        }
    }

    public static void usingStreamMethod(Integer checkNumber) {
        logger.info("Using Java 8 Stream method to check if element exists");
        
        boolean found = IntStream.of(listOfNumbers).anyMatch(element -> element == checkNumber);
        
        if (found) {
            logger.info("Number {} is present in the array!", checkNumber);
        } else {
            logger.info("Number {} is not present in the array!", checkNumber);
        }
    }

    public static void main(String[] args) {
        logger.info("Starting FindElementInArray program");
        
        try (Scanner scanner = new Scanner(System.in)) {
            logger.info("Enter the number to check: ");
            Integer passedNumber = scanner.nextInt();
            
            logger.info("Searching for number: {}", passedNumber);
            logger.info("Array contents: {}", java.util.Arrays.toString(listOfNumbers));
            
            usingTraditionalMethod(passedNumber);
            usingStreamMethod(passedNumber);
            
        } catch (Exception e) {
            logger.error("Error occurred while reading input: {}", e.getMessage());
        }
        
        logger.info("FindElementInArray program completed");
    }
}
