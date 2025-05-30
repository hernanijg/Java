package Patterns.Composite;

public class Ex {
    public static void main(String[] args) {
        System.out.println("Welcome to Ex file dude....");
        Directory root = new Directory("Documents");
        Directory java = new Directory("Java");

        java.addComponent(new File("pattern-composite.doc"));

        Directory stream = new Directory("Api Stream");
        stream.addComponent(new File("stream-map.doc"));

        java.addComponent(stream);
        root.addComponent(java);
        root.addComponent(new File("cv.pdf"));

        System.out.println(root.show(0));
        
    }
}
