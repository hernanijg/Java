package customCLass.PersonClass;

public class Alun extends Person{
    private String School;
    private double noteMath;
    private double noteHistory;

    public Alun() {
        System.out.println("Init Constructor in Alun");
    }

    public Alun(String name) {
        super(name);
        System.out.println("Init Constructor in Alun");
    }

    public Alun(String name, String lastName) {
        super(name, lastName);
        System.out.println("Init Constructor in Alun");
    }


    public String getSchool() {
        return School;
    }

    public void setSchool(String school) {
        School = school;
    }

    public double getNoteMath() {
        return noteMath;
    }

    public void setNoteMath(double noteMath) {
        this.noteMath = noteMath;
    }

    public double getNoteHistory() {
        return noteHistory;
    }

    public void setNoteHistory(double noteHistory) {
        this.noteHistory = noteHistory;
    }
}
