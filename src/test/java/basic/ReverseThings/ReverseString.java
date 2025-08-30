package basic.ReverseThings;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

public class ReverseString {
    private final Logger logger = LoggerFactory.getLogger(ReverseString.class);

    public void useReverseFunction() {
        String name = "ajay";

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(name);
        logger.info("This is the Given value: " + name + ", This is the Reversed String value: " + stringBuffer.reverse());

    }

    public void useForLoopMethod() {


        String name = "Learn Code!";

        char[] charArray = name.toCharArray();
        int totalLength = charArray.length;

        String reversedName = "";

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = totalLength - 1; i >= 0; i--) {
            stringBuilder.append(charArray[i]);
        }
        reversedName = stringBuilder.toString();
        logger.info("Reversed value using For loop: " + reversedName);

    }

    public void useCollectionToReverse() {
        String name = "ReverseCollection";

        char[] charArray = name.toCharArray();

        logger.info("Original charArray: " + Arrays.toString(charArray));

        List<Character> list = new ArrayList<>();

        // Adding characters to the list
        for (Character character : charArray) {
            list.add(character);
        }

        // Reversing the list
        Collections.reverse(list);

        // Using ListIterator to iterate over the reversed list
        ListIterator<Character> iterator = list.listIterator();

        StringBuilder reversedString = new StringBuilder("Reversed List: ");
        while (iterator.hasNext()) {
            reversedString.append(iterator.next());
        }
        logger.info(reversedString.toString());
    }


    public static void main(String[] args) {

        ReverseString reverseString = new ReverseString();
        reverseString.useReverseFunction();
        reverseString.useForLoopMethod();
        reverseString.useCollectionToReverse();
    }


}
