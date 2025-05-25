package theards.runnable;

public class TravelTask implements Runnable {
    private String name;


    public TravelTask() {
    }

    public TravelTask(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            System.out.println(i + " = " + name);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Finally i travel to: " + name);
    }
   
}
