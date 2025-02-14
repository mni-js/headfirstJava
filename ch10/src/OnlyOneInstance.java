public class OnlyOneInstance {
    private String name;
    private static int count = 0;

    private OnlyOneInstance() {
        name = "안녕";
    }

    public static OnlyOneInstance makeInstance() {
        if (count < 1) {
            count++;
            return new OnlyOneInstance();
        }
        return null;
    }

    public String getName() {
        return name;
    }
}