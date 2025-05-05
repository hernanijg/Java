package Assignment.CompanyPeople;

public class Manager extends Employee {
    private double budget;

    // Constructor
    public Manager(double budget) {
        this.budget = budget;
    }

    public Manager(String name, double remuneration, double budget) {
        super(name, remuneration);
        this.budget = budget;
    }

    public Manager(String name, String lastname, double remuneration, double budget) {
        super(name, lastname, remuneration);
        this.budget = budget;
    }

    public Manager(String name, String lastname, String fiscalNumber, double remuneration, double budget) {
        super(name, lastname, fiscalNumber, remuneration);
        this.budget = budget;
    }

    public Manager(String name, String lastname, String fiscalNumber, String address, double remuneration, double budget) {
        super(name, lastname, fiscalNumber, address, remuneration);
        this.budget = budget;
    }

    // Getter and Setter
    public double getBudget() {return budget;}
    public void setBudget(double budget) {this.budget = budget;}

    @Override
    public String toString() {
       String lastMessage = super.toString();
       lastMessage += this.budget != 0.0 ? "Budget: " + this.budget + "\n" : "";
       return lastMessage;
    }
}
