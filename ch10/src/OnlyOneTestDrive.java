public class OnlyOneTestDrive {
    public static void main(String[] args) {
        OnlyOneInstance one = OnlyOneInstance.makeInstance();
        System.out.println("name1: " + one.getName());

        OnlyOneInstance two = OnlyOneInstance.makeInstance();
        System.out.println("name2: " + two.getName());
    }
}