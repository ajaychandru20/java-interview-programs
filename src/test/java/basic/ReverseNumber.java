package basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class ReverseNumber {
    private final Logger logger = LoggerFactory.getLogger(ReverseNumber.class);

    private void reverseNumber() {
        int givenNumber = 0;
        int reversedNumber = 0;

        System.out.println("Enter the reverse number: ");

        Scanner scanner = new Scanner(System.in);
        givenNumber = scanner.nextInt();

        logger.info("The Given number is: " + givenNumber);

        while (givenNumber != 0) {
            reversedNumber = reversedNumber * 10;
            reversedNumber = reversedNumber + givenNumber % 10;
            givenNumber = givenNumber / 10;
        }
        logger.info("The Reversed number is: " + reversedNumber);

    }

    public static void main(String[] args) {

        ReverseNumber number = new ReverseNumber();
        number.reverseNumber();

    }
}
