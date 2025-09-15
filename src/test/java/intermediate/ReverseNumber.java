package intermediate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class ReverseNumber {
    private final Logger logger = LoggerFactory.getLogger(ReverseNumber.class);

    private void reverseNumber() {
        System.out.println("Enter the number to reverse: ");

        Scanner scanner = new Scanner(System.in);
        int givenNumber = scanner.nextInt();
        int originalNumber = givenNumber; // Store original for logging
        int reversedNumber = 0;

        logger.info("The Given number is: " + givenNumber);

        while (givenNumber != 0) {
            reversedNumber = reversedNumber * 10;
            reversedNumber = reversedNumber + givenNumber % 10;
            givenNumber = givenNumber / 10;
        }
        logger.info("The Reversed number is: " + reversedNumber);
        scanner.close();
    }

    public static void main(String[] args) {
        ReverseNumber number = new ReverseNumber();
        number.reverseNumber();
    }
}