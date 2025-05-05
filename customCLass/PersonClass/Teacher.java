package customCLass.PersonClass;

public class Teacher extends Person{
    private String matter;

    public Teacher() {
        System.out.println("Init Constructor in Teacher");
    }

    public String getMatter() {
        return matter;
    }

    public void setMatter(String matter) {
        this.matter = matter;
    }
}
