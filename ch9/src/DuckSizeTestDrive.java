public class DuckSizeTestDrive {
    public static void main(String[] args) {
        Duck a = new Duck();
        Duck b = new Duck(50);

        System.out.println("a size: " + a.getSize());
        System.out.println("b size: " + b.getSize());
    }
}