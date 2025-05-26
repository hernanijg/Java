package theards.ExSinc.Runnable;
import theards.ExSinc.Bread;

public class Consumer implements Runnable{
    Bread b;

    public Consumer (Bread b) {
        this.b = b;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            this.b.consumeBread();
            System.out.println("The consume eat a bread #" + i);
        }
    }
}
