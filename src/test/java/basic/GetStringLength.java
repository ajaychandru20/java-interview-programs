package basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class GetStringLength {

    private static final Logger logger = LoggerFactory.getLogger(GetStringLength.class);

    private static void usingLengthMethod(String value) {

        logger.info("Length of the string usingLengthMethod: " + value.length());
    }

    private static void usingForEachMethod(String value) {

        char[] charArray = value.toCharArray();

        int length = 0;
        for (char c : charArray) {
            length++;
        }
        logger.info("Length of the string usingForEachMethod: " + length);
    }


    public static void main(String[] args) {
        String inputString;
        System.out.print("Enter the String to check the length: ");
        Scanner scanner = new Scanner(System.in);
        inputString = scanner.nextLine();

        GetStringLength.usingLengthMethod(inputString);
        GetStringLength.usingForEachMethod(inputString);

    }
}
