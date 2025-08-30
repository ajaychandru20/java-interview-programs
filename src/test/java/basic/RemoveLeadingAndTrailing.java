package basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RemoveLeadingAndTrailing {

    private static Logger logger = LoggerFactory.getLogger(RemoveLeadingAndTrailing.class);
    static String sentence = " Hello World! ";

    public void usingTrimFunction() {
        logger.info("usingTrimFunction:[" + sentence.trim() + "]");
    }

    public void usingStripFunction() {
        logger.info("usingStripFunction - strip():[" + sentence.strip() + "]");
        logger.info("usingStripFunction - stripLeading():[" + sentence.stripLeading() + "]");
        logger.info("usingStripFunction - stripTrailing():[" + sentence.stripTrailing() + "]");
    }

    public void usingRegexFunction() {

        logger.info("usingRegexFunction - remove Leading, Trailing:[" + sentence.replaceAll("^[ \t]+|[ \t]+$", "") + "]");
        logger.info("usingRegexFunction - remove Leading, Trailing:[" + sentence.replaceAll("^[ \t]", "") + "]");
        logger.info("usingRegexFunction - remove Leading, Trailing:[" + sentence.replaceAll("[ \t]+$", "") + "]");

    }

    public static void main(String[] args) {

        logger.info("Sentence of variable:[" + sentence + "]");

        RemoveLeadingAndTrailing removeLeadingAndTrailing = new RemoveLeadingAndTrailing();
        removeLeadingAndTrailing.usingTrimFunction();
        removeLeadingAndTrailing.usingStripFunction();
        removeLeadingAndTrailing.usingRegexFunction();

    }
}
