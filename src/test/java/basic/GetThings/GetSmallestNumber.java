package basic.GetThings;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GetSmallestNumber {

    private static final Logger logger = LoggerFactory.getLogger(GetSmallestNumber.class);

    static Integer[] numberList = {5, 1, 3, 6, 4, 5};


    private static void usingComparison() {
        logger.info("Using forEach and maxValue, usingComparison function");
        int minNumber = Integer.MAX_VALUE;

        for (Integer number : numberList) {

            if (number < minNumber) {
                minNumber = number;
            }
        }
        logger.info("The min value of this array is: " + minNumber);
    }

    private static void usingArraysLeast() {
        logger.info("Using Arrays Sort, usingArraysLeast function");
        Arrays.sort(numberList);
        int smallestNumber = numberList[0];

        logger.info("The min value of this array is: " + smallestNumber);
    }

    // Using Collections.min() - most concise
    private static void usingCollectionsMin() {
        logger.info("Using Collections.min() function");
        List<Integer> list = Arrays.asList(numberList);
        int smallestNumber = Collections.min(list);
        logger.info("The min value of this array is: " + smallestNumber);
    }

    // Using Java 8 Streams - modern approach
    private static void usingStreams() {
        logger.info("Using Java 8 Streams");
        int smallestNumber = Arrays.stream(numberList)
                .min(Integer::compareTo)
                .orElse(Integer.MAX_VALUE);
        logger.info("The min value of this array is: " + smallestNumber);
    }

    public static void main(String[] args) {
        logger.info("Mention array list is: " + Arrays.toString(numberList));

        GetSmallestNumber.usingComparison();
        GetSmallestNumber.usingArraysLeast();
        GetSmallestNumber.usingCollectionsMin();
        GetSmallestNumber.usingStreams();
    }
}
