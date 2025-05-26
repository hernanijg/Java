package StreamApi.Methods;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import StreamApi.Models.UsersStream;

public class ExStreamFilter {
    public static void main(String[] args) {
        Stream<UsersStream> nUser = Stream
                .of("Pablo Gonzalez", "Jose Marin", "Karen Lopez", "Luisa Ganelo", "Pablo Restrepo")
                .map(n -> new UsersStream(n.split(" ")[0], n.split(" ")[1]))
                .filter(n -> n.getName().equals("Pablo"));

        List<UsersStream> nUserL = nUser.collect(Collectors.toList());
        nUserL.forEach(System.out::println);

        // Optional<UsersStream> nUserO = nUser.findFirst();
        // System.out.println(nUserO.get());

        Boolean nUserB = Stream
                .of("Pablo Gonzalez", "Jose Marin", "Karen Lopez", "Luisa Ganelo", "Pablo Restrepo")
                .map(n -> new UsersStream(n.split(" ")[0], n.split(" ")[1]))
                .anyMatch(u -> u.getName().equals("Pablo"));

        System.out.println(nUserB);

        Long nUserLC = Stream
                .of("Pablo Gonzalez", "Jose Marin", "Karen Lopez", "Luisa Ganelo", "Pablo Restrepo")
                .map(n -> new UsersStream(n.split(" ")[0], n.split(" ")[1]))
                .count();

        System.out.println(nUserLC);
    }
}
