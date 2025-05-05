package Assignment.CompanyPeople;

public class Client extends Person{
    private int clientId;
    private static int autoId;

    public Client() {
        this.clientId = ++autoId;
    }

    public Client(String name) {
        super(name);
    }

    public Client(String name, String lastname) {
        super(name, lastname);
    }

    public Client(String name, String lastname, String fiscalNumber) {
        super(name, lastname, fiscalNumber);
    }

    public Client(String name, String lastname, String fiscalNumber, String address) {
        super(name, lastname,fiscalNumber, address);
    }

    // Getter and Setter methods
    public int getClientId() {return clientId;}
    public void setClientId(int clientId) {this.clientId = clientId;}
    public static int getAutoId() {return autoId;}
    public static void setAutoId(int autoId) {Client.autoId = autoId;}

    @Override
    public String toString() {
        return "Client ID: " + this.clientId + "\n"
                + "Client Full Name: " + this.getName() + " " + this.getLastname() + "\n";
    }
}
