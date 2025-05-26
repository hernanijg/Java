package StreamApi.Methods;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import StreamApi.Models.UsersStream;

public class ExStreamMap {
    public static void main(String[] args) {
        Stream<String> name = Stream
        .of("Pablo", "Jose", "Karen", "Luisa")
        .map(String::toUpperCase)
        //.peek(System.out::println)
        .map(String::toLowerCase);

        List<String> list = name.collect(Collectors.toList());
        list.forEach(System.out::println);

        Stream<UsersStream> nUser = Stream
        .of("Pablo", "Jose", "Karen", "Luisa")
        .map(n -> new UsersStream(n, null))
        .peek(System.out::println)
        .map(e -> {
            String n = e.getName().toLowerCase();
            e.setName(n);
            return e;
        });

        List<UsersStream> nUserL = nUser.collect(Collectors.toList());
        nUserL.forEach(System.out::println);
    }
}
