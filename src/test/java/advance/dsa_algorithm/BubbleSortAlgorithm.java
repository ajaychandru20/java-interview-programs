package advance.dsa_algorithm;

import java.util.Arrays;

public class BubbleSortAlgorithm {

    public static void bubbleSort(int[] args) {

        // i = 1 , i < length, ++
        // j = 0, j < length - 1, ++
        // j > j + 1
        // swap.


        for (int i = 1; i < args.length; i++) {
            boolean swap = false;
            for (int j = 0; j < args.length - 1; j++) {
                if (args[j] > args[j + 1]) {
                    swap = true;
                    int temp = args[j];
                    args[j] = args[j + 1];
                    args[j + 1] = temp;
                }
            }
            if (!swap){
                break;
            }
        }
        System.out.println(Arrays.toString(args));

    }

    public static void main(String[] args) {
        int[] numberList = {1, 5, 3, 3, 8, 22, 4, 11};

        BubbleSortAlgorithm.bubbleSort(numberList);
    }
}
