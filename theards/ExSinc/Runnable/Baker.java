package theards.ExSinc.Runnable;

import java.util.concurrent.ThreadLocalRandom;

import theards.ExSinc.Bread;

public class Baker implements Runnable {
    Bread b;

    public Baker(Bread b){
        this.b = b;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            this.b.makeBread("Mass");
            try {
                Thread.sleep(ThreadLocalRandom.current().nextInt(500, 2000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("We make a bread #" + i);
        }
        
    }
    
}
