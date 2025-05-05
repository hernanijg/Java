package Assignment._12CompanyPeople;

public class Person {
    private String name;
    private String lastname;
    private String fiscalNumber;
    private String address;

    // Cosntructors
    public Person(){}

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }
    public Person(String name, String lastname, String fiscalNumber) {
        this(name, lastname);
        this.fiscalNumber = fiscalNumber;
    }

    public Person(String name, String lastname, String fiscalNumber, String address) {
        this(name, lastname,fiscalNumber);
        this.address = address;
    }

    // Getter and Setter Methods
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public String getLastname() {return lastname;}
    public void setLastname(String lastname) {this.lastname = lastname;}
    public String getFiscalNumber() {return fiscalNumber;}
    public void setFiscalNumber(String fiscalNumber) {this.fiscalNumber = fiscalNumber;}
    public String getAddress() {return address;}
    public void setAddress(String address) {this.address = address;}

    @Override
    public String toString() {
        StringBuilder message = new StringBuilder();
        message.append(this.name != null ? "Name: " + this.name + "\n" : "");
        message.append(this.lastname != null ? "LastName: " + this.lastname + "\n" : "");
        message.append(this.fiscalNumber != null ? "Fiscal Number: " + this.fiscalNumber + "\n" : "");
        message.append(this.address != null ? "Address: " + this.address + "\n" : "");

        String finalMessage = message.toString();
        return finalMessage;
    }
}
