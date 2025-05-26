package StreamApi;

import java.util.stream.Stream;

public class ExStream {
    public static void main(String[] args) {
        //Stream<String> name = Stream.of("P", "J", "K", "L");

        // String[] arr = {"P", "J", "K", "L"};
        // Stream<String> name = Arrays.stream(arr);
        // name.forEach(System.out::println);

        Stream<String> name = Stream.<String>builder().add("P")
            .add("J")
            .add("K")
            .add("L")
            .build();
        name.forEach(System.out::println);
    }
} 