public class BooleanSentence {
    private String sentence;

    BooleanSentence(String sentence) {
        this.sentence = sentence;
    }

    public boolean isValid() {
        boolean result = evaluate(sentence);
        return result == true;
    }

    public boolean isContingent() {
        boolean result = evaluate(sentence);
        return result != true && result != false;
    }

    // i know this isn't the most efficient nor best way of doing this but I got
    // lazy
    public static boolean evaluate(String expression) {
        switch (expression) {
            case "p":
            case "q":
            case "r":
                return true;
            case "!p":
            case "!q":
            case "!r":
                return false;
        }

        char operator = expression.charAt(0);
        String operand1 = expression.substring(1, expression.length() - 1);
        String operand2 = expression.substring(expression.length() - operand1.length() - 2, expression.length() - 1);

        switch (operator) {
            case '&':
                return evaluate(operand1) && evaluate(operand2);
            case '|':
                return evaluate(operand1) || evaluate(operand2);
            case '-':
                return !evaluate(operand1) || evaluate(operand2);
            case '=':
                return evaluate(operand1) == evaluate(operand2);
        }

        return false;
    }

}