package theards.theardsClass;

import theards.runnable.ExSinc;

public class ExSincPrint implements Runnable{
    private String f1,f2; 

    public ExSincPrint(String f1, String f2) {
        this.f1 = f1;
        this.f2 = f2;
    }

    @Override
    public void run() {
        ExSinc.printTask(f1, f2);
    }
}
