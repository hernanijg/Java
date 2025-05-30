package Patterns.Singleton;

public class Ex {
    public static void main(String[] args) {
        /** The normal instance create 10 instances in this case
         *  But this pattern limited the instances and we only can
         *  Create once instance. 
         */
        for (int i = 0; i < 10; i++) {
            ConnectDBSingleton con = ConnectDBSingleton.getInstance();
            System.out.println("Con = " + con);
        }
    }
}
