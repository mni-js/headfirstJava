public abstract class Animal2 {
    private String name;

    public String getName() {
        return name;
    }

    public Animal2(String theName) {
        name = theName;
        System.out.println("Animal 탄생");
    }
}