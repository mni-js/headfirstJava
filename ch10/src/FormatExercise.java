public class FormatExercise {
    public static void main(String[] args) {
        long hardToRead = 1000000000;
        long easierToRead = 1_000_000_000;
        long legalButSilly = 10_0000_0000;

        String sentence1 = String.format("I have %.2f bugs to fix.", 476578.09876);
        System.out.println(sentence1);

        String sentence2 = String.format("I have %.2f, bugs to fix.", 476578.09876);
        System.out.println(sentence2);

        String sentence3 = String.format("I have %,.2f bugs to fix.", 476578.09876);
        System.out.println(sentence3);

        // String sentence4 = String.format("I have %.,2f bugs to fix.", 476578.09876);
        // System.out.println(sentence4);

        String sentence5 = String.format("%,6.1f", 42.0);
        System.out.println(sentence5);

        String sentence6 = String.format("I have %,20.2f bugs to fix.", 123476578.09876);
        System.out.println(sentence6);

        String sentence7 = String.format("%c", 1000001);
        System.out.println(sentence7);
    }
}
