public class Main {
    public static void main(String[] args) {
        // Example sentences
        BooleanSentence sentence1 = new BooleanSentence("p && q || !r");
        BooleanSentence sentence2 = new BooleanSentence("(p || q) && (p || r)");
        BooleanSentence sentence3 = new BooleanSentence("!(p && q) && (p || q)");

        // Properties of sentences
        boolean valid1 = sentence1.isValid(); // true
        System.out.println(valid1);
        boolean valid2 = sentence2.isValid(); // true
        System.out.println(valid2);
        boolean valid3 = sentence3.isValid(); // true
        System.out.println(valid3);

        boolean contingent1 = sentence1.isContingent(); // true
        System.out.println(contingent1);
        boolean contingent2 = sentence2.isContingent(); // false
        System.out.println(contingent2);
        boolean contingent3 = sentence3.isContingent(); // true
        System.out.println(contingent3);
    }
}