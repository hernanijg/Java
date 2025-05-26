package theards.ExSinc;
import theards.ExSinc.Runnable.Baker;
import theards.ExSinc.Runnable.Consumer;

public class Consume {
    public static void main(String[] args) {
        Bread b =new Bread();

        new Thread(new Baker(b)).start();
        new Thread(new Consumer(b)).start();
        
    }
}
