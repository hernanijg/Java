package Assignment._12CompanyPeople;

public class Consume {
    public static void main(String[] args) {
        Employee newEmployee = new Employee("Jhon", "Doe", "5555-5", "Sheridan rd, Illinois");
        System.out.println("===== New Employer Info: ");
        System.out.println(newEmployee);

        Manager newManager =  new Manager("Noor", "Astiyarte", "3333-4",  "guess, California", 20.0F, 44.4F);
        System.out.println("===== New Manager: ");
        System.out.println(newManager);

        Client newClient = new Client("Marilyn", "Gonzalez", "4444-4", "guess, California");
        System.out.println("===== New Client: ");
        System.out.println(newClient); // => New Client: \n Client ID: 0 \n Client Full Name: Marilyn Gonzalez


    }
}
