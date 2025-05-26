package theards.theardsClass;

public class NameTheard extends Thread {

    public NameTheard(String name) {
        super(name);
    
    }

    @Override
    public void run() {
        System.out.println("The theard is init");
        for (int i = 0; i < 10; i++) {
            System.out.println(this.getName() + ": " + i);
        }


        super.run();
    }

    
    
}
