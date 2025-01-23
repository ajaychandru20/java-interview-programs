package basic;

import java.util.*;

public class ReverseString {

    public void useReverseFunction() {
        String name = "ajay";

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(name);
        System.out.println("This is the Given value: " + name + ", This is the Reversed String value: " + stringBuffer.reverse());

    }

    public void useForLoopMethod() {


        String name = "Learn Code!";

        char[] charArray = name.toCharArray();
        int totalLength = charArray.length;

        String reversedName = "";

        for (int i = totalLength - 1; i >= 0; i--) {
            reversedName = reversedName + charArray[i];
        }
        System.out.println("Reversed value using For loop: " + reversedName);

    }

    public void useCollectionToReverse() {
        String name = "ReverseCollection";

        char[] charArray = name.toCharArray();

        System.out.println("Original charArray: " + Arrays.toString(charArray));

        List<Character> list = new ArrayList<>();

        // Adding characters to the list
        for (Character character : charArray) {
            list.add(character);
        }

        // Reversing the list
        Collections.reverse(list);

        // Using ListIterator to iterate over the reversed list
        ListIterator<Character> iterator = list.listIterator();

        System.out.print("Reversed List: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
        }
        System.out.println(); // Print a new line for neatness
    }


    public static void main(String[] args) {

        ReverseString reverseString = new ReverseString();
        reverseString.useReverseFunction();
        reverseString.useForLoopMethod();
        reverseString.useCollectionToReverse();
    }


}
