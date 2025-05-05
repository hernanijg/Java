package customCLass.PersonClass;

public class Person {
    private String name;
    private String lastname;
    private String email;
    private int age;

    public Person() {
        System.out.println("Init Constructor in Person");
    }

    public Person(String name) {
        System.out.println("Init Constructor in Person1");
        this.name = name;
    }

    public Person(String name, String lastname) {
        this(name);
        this.lastname = lastname;
        System.out.println("Init Constructor in Person2");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
