package customCLass.PersonClass;

public class AlunInternational extends Alun {
    private String country;
    private double noteLanguage;

    public AlunInternational() {
        System.out.println("Init Constructor in AlunInternational");
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getNoteLanguage() {
        return noteLanguage;
    }

    public void setNoteLanguage(double noteLanguage) {
        this.noteLanguage = noteLanguage;
    }
}
