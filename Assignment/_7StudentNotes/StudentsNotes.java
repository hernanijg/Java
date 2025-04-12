package Assignment._7StudentNotes;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentsNotes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter how many students you want to evaluate: ");
        int studentsCount = 0;
        try {
            studentsCount = scan.nextInt();
            scan.nextLine(); // Clean buffer
        } catch (Exception e) {
            System.out.println("You must enter a number");
            scan.nextLine();
            main(args); // Restart program if invalid input
        }

        ArrayList<Students> students = studentsTake(scan, studentsCount);

        /* Averages calculation */
        double average = 0.0;          // Overall average (base is 7)
        double averageUp = 0.0;        // Average for notes > 5
        int averageUpC = 0;            // Count of notes > 5
        double averageMedium = 0.0;     // Average for notes < 4 && > 1
        int averageMediumC = 0;        // Count of notes < 4 && > 1
        double averageLow = 0.0;       // Average for notes == 1
        int averageLowC = 0;           // Count of notes == 1

        // Labeled loop for better control
        average:
        for (Students student : students) {
            double note = student.getStudentNote();
            average += note; // Sum all notes for overall average

            // Categorize notes
            if (note == 1) {
                averageLow += note;
                averageLowC++;
                continue average; // Skip to next student
            } else {
                if (note >= 5) {
                    averageUp += note;
                    averageUpC++;
                    continue average;
                } else if (note <= 4) {
                    averageMedium += note;
                    averageMediumC++;
                    continue average;
                }
            }
        }

        // Calculate final averages
        average = average / studentsCount;
        averageUp = averageUpC > 0 ? averageUp / averageUpC : 0.0;  // Ternary to avoid division by zero
        averageMedium = averageMediumC > 0 ? averageMedium / averageMediumC : 0.0;
        averageLow = averageLowC > 0 ? averageLow / averageLowC : 0.0;

        System.out.printf(
                "Averages:"
                        .concat("\nStudents with 1: %d")
                        .concat("\nAverage with 5 or higher: %.1f")
                        .concat("\nAverage with less than 4 but more than 1: %.1f")
                        .concat("\nClass average: %.1f"),
                averageLowC, averageUp, averageMedium, average
        );
    }

    /**
     * Collects student notes
     * @param scan Scanner object
     * @param studentsCount Number of students to process
     * @return ArrayList of Students
     */
    public static ArrayList<Students> studentsTake(Scanner scan, int studentsCount) {
        ArrayList<Students> students = new ArrayList<>();
        boolean statusR = true;  // Status flag for retry mechanism
        double note = 0.0;

        // Labeled loop for student processing
        studentsAssign:
        for (int i = 1; i <= studentsCount; i++) {
            if (statusR) {
                System.out.println("Student #: " + i);
                students.add(new Students());
                note = takeNote(scan);

                if (note <= 7) {
                    students.get(i - 1).StudentNote(note);
                } else {
                    System.out.println("Enter a valid note");
                    --i;        // Decrement counter to retry
                    statusR = false;
                    continue studentsAssign;
                }
            } else {
                note = takeNote(scan);
                if (note <= 7) {
                    students.get(i - 1).StudentNote(note);
                    statusR = true;
                } else {
                    System.out.println("Enter a valid note");
                    --i;
                    continue studentsAssign;
                }
            }

            if (note == 0) {
                System.out.println("Error: Terminating Program");
                System.exit(0);
            }
        }
        return students;
    }

    /**
     * Helper method to safely get a note from user input
     * @param scan Scanner object
     * @return Valid note as double
     */
    public static double takeNote(Scanner scan) {
        double note = 0.0;
        try {
            System.out.println("Enter the student's test note: ");
            note = scan.nextDouble();
            scan.nextLine(); // Clean buffer
        } catch (Exception e) {
            System.out.println("You must enter a number");
            scan.nextLine();
            return takeNote(scan); // Recursive retry
        }
        return note;
    }
}

/**
 * Student class to store name and note information
 */
class Students {
    private String studentName = "";
    private double studentNote = 0.0;

    // Setters
    public void StudentName(String student) {
        this.studentName = student;
    }

    public void StudentNote(double note) {
        this.studentNote = note;
    }

    // Getters
    public String getStudentName() {
        return this.studentName;
    }

    public double getStudentNote() {
        return this.studentNote;
    }

    @Override // Override default toString()
    public String toString() {
        return "Student: " + this.studentName + "\nNote: " + this.studentNote;
    }
}