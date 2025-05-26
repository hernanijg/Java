package theards;

import theards.theardsClass.NameTheard;

public class ExtenderTheard {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new NameTheard("Jhon Doe");
        t.start();

        Thread t2 = new NameTheard("Maria");
        t2.start();

        Thread t3 = new NameTheard("Jose");
        t3.start();

        // Thread.sleep(1); // => Main Pause
        System.out.println(t.getState());

        // new Thread(new TravelTask("Pascua Islam")).start();
        // new Thread(new TravelTask("Juan Fernandez")).start();
        // new Thread(new TravelTask("France")).start();

        Runnable travel = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(i + " = " + Thread.currentThread().getName());
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Finally i travel to: " + Thread.currentThread().getName());
        };

        new Thread(travel, "Pascua Islam").start();
        new Thread(travel, "Islam Chiloe").start();

        System.out.println("Continuos...");

        
    }
}
