package intermediate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Collections;

public class SwapTwoVariable {
    private final Logger logger = LoggerFactory.getLogger(SwapTwoVariable.class);
    int a;
    int b;
    int c;

    public void usingThirdVariable() {
        logger.info("usingThirdVariable function");
        a = 10;
        b = 20;
        logger.info("This is before swapping: " + "a = " + a + ", " + "b = " + b);
        c = a;
        a = b;
        b = c;
        logger.info("This is after swapping: " + "a = " + a + ", " + "b = " + b);
    }
    public void usingThirdVariableWithArray() {
        logger.info("usingThirdVariableWithArray function");
        a = 10;
        b = 20;
        logger.info("This is before swapping: " + "a = " + a + ", " + "b = " + b);

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(a);
        arrayList.add(b);

        //method 1
        Collections.reverse(arrayList);

        a = arrayList.get(0);
        b = arrayList.get(1);

//        // method 2
//        List<Integer> reversedList = arrayList.reversed();
//        a = reversedList.get(0);
//        b = reversedList.get(1);

        logger.info("This is after swapping: " + "a = " + a + ", " + "b = " + b);
    }

    public void usingWithOutThirdVariable(){
        logger.info("usingWithOutThirdVariable function");
        int firstValue = 20;
        int secondValue = 40;

        logger.info("This is before swapping: " + "a = " + a + ", " + "b = " + b);

        firstValue = firstValue - secondValue;
        secondValue = firstValue + secondValue;
        firstValue = secondValue - firstValue;

        logger.info("This is after swapping: " + "firstValue = " + firstValue + ", " + "secondValue = " + secondValue);

    }

    public void swapWithXOR() {
        logger.info("swapWithXOR function");
        a = 10;
        b = 20;
        logger.info("Before swap (XOR): a = " + a + ", b = " + b);

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        logger.info("After swap (XOR): a = " + a + ", b = " + b);
    }


    public static void main(String[] args) {
        SwapTwoVariable swapTwoVariable = new SwapTwoVariable();
        swapTwoVariable.usingThirdVariable();
        swapTwoVariable.usingThirdVariableWithArray();
        swapTwoVariable.usingWithOutThirdVariable();
        swapTwoVariable.swapWithXOR();
    }
}
