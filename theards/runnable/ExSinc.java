package theards.runnable;

import theards.theardsClass.ExSincPrint;

public class ExSinc {
    public static void main(String[] args) {
        new Thread(new ExSincPrint("Hello, ", "How are u")).start();
        new Thread(new ExSincPrint("Hey, ", "What are u doing?")).start();
    }

    // We use a syncronized for a theards functions.
    public synchronized static void printTask(String f1, String f2){
        System.out.println(f1);

        try {
            Thread.sleep(500);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(f2);
    }
}
