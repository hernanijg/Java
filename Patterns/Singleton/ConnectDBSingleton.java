package Patterns.Singleton;

public class ConnectDBSingleton {
    /**
     *  Static == This instance always is same, if u chance in once file
     *  the all folder can see that change
     */
    private static ConnectDBSingleton instance;

    private ConnectDBSingleton() {
        System.out.println("Connect By Database/");
    }

    // Limited the instance created
    public static ConnectDBSingleton getInstance() {
        if( !(instance instanceof ConnectDBSingleton) ) 
            instance = new ConnectDBSingleton();

        return instance;
    }
}
