package customCLass.PersonClass;

public class Ej {
    public static void main(String[] args) {
        // Alun Ingeritance by Person
        Alun alun = new Alun();
        alun.setName("Juan");
        alun.setLastname("Gutierrez");

        // Teacher Ingeritance by Person
        Teacher teacher = new Teacher();
        teacher.setName("Jhon");
        teacher.setLastname("Doe");
        teacher.setMatter("Math");

        System.out.println("Alun: "
                + alun.getName() + " "
                + alun.getLastname());

        System.out.println("Teacher: "
                + teacher.getName() + " "
                + teacher.getLastname() + " |"
                + "Matter: " + teacher.getMatter()
        );

        // Inheritance by Alun and Alun Ingeritance by Person
        AlunInternational alunInternational = new AlunInternational();
        alunInternational.setName("Mauro");
        alunInternational.setLastname("Boss");
        alunInternational.setNoteLanguage(2.2);
        alunInternational.setSchool("Moron");

        System.out.println(
                alunInternational.getName() + " "
                + alunInternational.getLastname() + " "
                + alunInternational.getNoteLanguage() + " "
                + alunInternational.getSchool()
        );

        System.out.println("Son: " + alunInternational.getClass().getName());
        System.out.println("Father: " +
                alunInternational.getClass().getSuperclass().getName());

        Alun alun1 = new Alun("Mauro", "Perez");

        System.out.println("alun1 = " + alun1.getName());
    }
}
