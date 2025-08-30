package basic.GetThings;

public class GetVowelsCount {


    public static void main(String[] args) {

        String sentence = ("A quick brown fox jumps over the lazy dog").toLowerCase();
        Integer vowelsCount = 0;

        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            String cs = String.valueOf(c);
            if (cs.equals("a") || cs.equals("e") || cs.equals("i") || cs.equals("o") || cs.equals("u")) {

                vowelsCount++;
            }

        }
        System.out.println("sentence length: " + sentence.length());
        System.out.println("Vowels Count: "+ vowelsCount);


    }
}
