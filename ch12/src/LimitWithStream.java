import java.util.stream.Stream;
import java.util.List;

class LimitWithStream {
    public static void main(String[] args) {
        List<String> strings = List.of("I", "am", "a", "list", "of", "Strings");
        Stream<String> stream = strings.stream();
        Stream<String> limit = stream.limit(4);
        System.out.println("limit = " + limit);
    }
}
