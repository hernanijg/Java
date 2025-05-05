package Assignment.CompanyPeople;

public class Employee extends Person{
    private double remuneration;
    private int employeeId;
    protected static int autoEmployeeId;

    {this.employeeId = ++autoEmployeeId;}

    public Employee () {}

    public Employee(String name, double remuneration) {
        super(name);
        this.remuneration = remuneration;
    }

    public Employee(String name, String lastname, double remuneration) {
        super(name, lastname);
        this.remuneration = remuneration;
    }

    public Employee(String name, String lastname, String fiscalNumber, double remuneration) {
        super(name, lastname, fiscalNumber);
        this.remuneration = remuneration;
    }

    public Employee(String name, String lastname, String fiscalNumber, String address, double remuneration) {
        super(name, lastname,fiscalNumber, address);
        this.remuneration = remuneration;
    }

    public Employee(String name, String lastname, String fiscalNumber, String address) {
        super(name, lastname,fiscalNumber, address);
    }

    // Getter and Setter
    public double getRemuneration() {return remuneration;}
    public void setRemuneration(double remuneration) {this.remuneration = remuneration;}
    public int getEmployeeId() {return employeeId;}
    public void setEmployeeId(int employeeId) {this.employeeId = employeeId;}
    public static int getAutoEmployeeId() {return autoEmployeeId;}
    public static void setAutoEmployeeId(int autoEmployeeId) {Employee.autoEmployeeId = autoEmployeeId;}

    public void increaseRemuneration(int porcent){
        double increase = this.remuneration * (porcent / 100);
        this.remuneration += increase;
    }

    @Override
    public String toString() {
        String lastMessage = super.toString();

        lastMessage += this.remuneration != 0.0 ? "Remuneration: " + this.remuneration + "\n" : "";
        lastMessage += "Employee Id: " + this.employeeId + "\n";

        return lastMessage;
    }
}
