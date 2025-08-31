package basic;

public class ConvertStringCase {

    public void usingBuiltInMethod(String input) {

        System.out.println("usingBuiltInMethod: " + input);
        System.out.println("Using toLowerCase(): " + input.toLowerCase());
        System.out.println("Using toUpperCase(): " + input.toUpperCase());


    }

    public void usingASCIIFormulaHigherToLower(String input) {

        System.out.println("usingASCIIFormulaHigherToLower(): " + input);
        char[] charInputArray = input.toCharArray();

        for (int i = 0; i < input.length(); i++) {
            if (charInputArray[i] >= 65 && charInputArray[i] <= 90) {
                charInputArray[i] = (char) (charInputArray[i] + 32);
            }
        }

        for (char value : charInputArray) {
            System.out.print(value);
        }
        System.out.println("");
    }

    public void usingASCHIIFormulaLowerToHigher(String input) {

        System.out.println("usingASCHIIFormulaLowerToHigher: " + input);
        char[] inputCharArray = input.toCharArray();

        for (int i = 0; i < input.length(); i++) {

            if (inputCharArray[i] >= 97 && inputCharArray[i] <= 122) {
                inputCharArray[i] = (char) (inputCharArray[i] - 32);
            }

        }

        for (char value:inputCharArray){
            System.out.print(value);

        }

    }


    public static void main(String[] args) {

        ConvertStringCase stringCase = new ConvertStringCase();
        stringCase.usingBuiltInMethod("Hi this is AJAY. C");
        stringCase.usingASCIIFormulaHigherToLower("Hi MY Name IS AJAY.C");
        stringCase.usingASCHIIFormulaLowerToHigher("hi my NAME is ajay.c");
    }


}
