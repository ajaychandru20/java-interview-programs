package basic.GetThings;

public class GetNumberAddFromString {

    public static void main(String[] args) {
        String sentence = "Monday, October 20, 2025 to Wednesday, October 22, 2025";

        int sumOfNumber = 0;

        for (int i = 0; i < sentence.length(); i++) {

            char sentenceElement = sentence.charAt(i);
            if (Character.isDigit(sentenceElement)) {
                sumOfNumber = sumOfNumber + Character.getNumericValue(sentenceElement);
            }
        }

        System.out.println("The sum of number occurred in this string is:" +sumOfNumber);

    }
}
