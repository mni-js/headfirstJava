public class DuckTestDrive {
    public static void main(String[] args) {
        Duck duck = new Duck();
        System.out.println("duck's size: " + duck.getSize());

        int max1 = Duck.maxy(5, 9);
        int max2 = duck.maxy(5, 9);
        System.out.println("max1: " + max1 + ", max2: " + max2);
    }
}
