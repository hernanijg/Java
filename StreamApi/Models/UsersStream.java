package StreamApi.Models;

public class UsersStream {
    String name;
    String lastName;


    public UsersStream(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    

    @Override
    public String toString() {
        return "name=" + getName() ;
    }

}
