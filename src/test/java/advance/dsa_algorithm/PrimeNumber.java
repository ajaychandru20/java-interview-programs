package advance.dsa_algorithm;

public class PrimeNumber {

    // Your original code (with minor formatting)
    public static boolean isPrimeOriginal(int number) {
        if (number <= 1) {
            return false;
        }

        int i = 2;
        boolean isPrime = true;

        while (i < number) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
            i++;
        }
        return isPrime;
    }

    public static void main(String[] args) {
        int number = 197;

        // Using your original approach
        System.out.println("Using original method:");
        System.out.println(number + " is prime: " + isPrimeOriginal(number));

        // Test with various numbers
        int[] testNumbers = {1, 2, 3, 4, 16, 17, 97, 100, 197};
        System.out.println("\nTesting various numbers:");
        for (int num : testNumbers) {
            System.out.println(num + ": " + isPrimeOriginal(num));
        }
    }
}