public class Duck {
    private int size;

    public Duck() {
        size = 52;
    }

    public int getSize() {
        return size;
    }

    public static int maxy(int x, int y) {
        if (x >= y) {
            return x;
        }
        return y;
    }
}
