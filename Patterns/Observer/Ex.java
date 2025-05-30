package Patterns.Observer;

public class Ex {
    public static void main(String[] args) {
        System.out.println("Welcome to ex file dude...");
        Factory google = new Factory("Google", 1000);
        google.addObserver(observable -> {
            System.out.println("John: " + observable);
        });

        google.addObserver(observable -> {
            System.out.println("Luis: " + observable);
        });

        google.addObserver(observable -> {
            System.out.println("Mauro: " + observable);
        });

        google.changePrice(2000);


        google.changePrice(1500);

    }
}
