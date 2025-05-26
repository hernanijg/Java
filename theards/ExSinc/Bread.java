package theards.ExSinc;

public class Bread {
    private String bread;
    private boolean available;

    public Bread () {}

    public synchronized void makeBread(String bread){
        while (available) {
            try {
                wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } 

        this.bread = bread;
        this.available = true;
        notify();

    }

    public synchronized String consumeBread() {
        while (!available) {
            try {
                wait();
            } catch (Exception e) {
                e.printStackTrace();
            }    
        }

        this.available = false;
        notify();
        return this.bread;
    }
}
