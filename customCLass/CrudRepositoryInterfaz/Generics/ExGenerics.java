package customCLass.CrudRepositoryInterfaz.Generics;

import customCLass.CrudRepositoryInterfaz.Model.Client;
import customCLass.CrudRepositoryInterfaz.Model.ClientPremium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ExGenerics {
    public static void main(String[] args) {
        List<Client> clients= new ArrayList<>();
        clients.add(new Client("Jhon", "Doe"));


        Client a = clients.get(0);
        Client b = clients.iterator().next();

        Client[] cArray = {
                new Client("Jhon", "Doe"),
                new Client("Andres", "Dummi")
        };
        Integer[] iArray = {1,2,3};

        List<Client> cArray2 = fromArrayToList(cArray);
        cArray2.forEach(System.out::println);

        List<Integer> iArray2 = fromArrayToList(iArray);
        iArray2.forEach(System.out::println);

        List<String> names = fromArrayToList(new String[] {"Andres", "Pepe", "Jhond"}, iArray);
        names.forEach(System.out::println);

        List<ClientPremium> clientPremiumList = fromArrayToList(new ClientPremium[]{
                new ClientPremium("Jhon", "Doe"),
        });

        printClient(cArray2);
        printClient(clients);
        printClient(clientPremiumList);

        System.out.println("Max in 1, 9, 4 is: " + max(1,9,4));
        System.out.println("Max in 3.9, 11.6, 7.78 is: " + max(3.9,11.6,7.78));
        System.out.println("Max in carrot, apple, strawberries: " + max("carrot","apple","strawberries"));
    }


    public static <T> List<T> fromArrayToList(T[] c) {

        return Arrays.asList(c);
    }

    public static <T extends Client> List<T> fromArrayToList(T[] c) {

        return Arrays.asList(c);
    }

    public static <T, G> List<T> fromArrayToList(T[] c, G[] g) {
        for (G e: g) System.out.println("e = " + e);

        return Arrays.asList(c);
    }

    public static void printClient(List<? extends Client> clients) {
        clients.forEach(System.out::println);
    }

    public static <T extends Comparable<T>> T max(T a, T b, T c) {
        T max = a;
        if(b.compareTo(max) > 0) max = b;
        if(c.compareTo(max) > 0) max = c;

        return max;
    }
}
