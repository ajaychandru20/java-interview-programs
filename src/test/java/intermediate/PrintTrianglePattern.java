package intermediate;

import java.util.Scanner;

public class PrintTrianglePattern {


    private static void usingStar(Integer givenNumber) {

        int row, column;

        for (row = 0; row < givenNumber; row++) {

            for (column = 0; column <= row; column++) {

                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    private static void usingNumber(Integer givenNumber) {

        int row, column;
        int numberStartFrom = 1;

        for (row = 0; row < givenNumber; row++) {
            for (column = 0; column <= row; column++) {
                System.out.print(numberStartFrom + " ");
                numberStartFrom += 1;
            }
            System.out.println("");
        }

    }


    public static void main(String[] args) {
        Integer GivenNumber;

        System.out.print("Enter number of times want to print the line: ");
        Scanner scanner = new Scanner(System.in);
        GivenNumber = scanner.nextInt();
        System.out.println("Print the triangle by Stars");
        PrintTrianglePattern.usingStar(GivenNumber);
        System.out.println("Print the triangle by Number");
        PrintTrianglePattern.usingNumber(GivenNumber);

    }
}
