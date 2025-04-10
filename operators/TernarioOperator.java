package operators;

import java.util.Scanner;

public class TernarioOperator {
    public static void main(String[] args) {
        String state = "";
        double promedio = 0.0,
                matematicas = 0.0,
                ciencias = 0.0,
                historia = 0.0;

        System.out.println("Bienvenido");
        Scanner scan = new Scanner(System.in);

        matematicas = takeNotes(scan, "matematicas");
        ciencias = takeNotes(scan, "ciencias");
        historia = takeNotes(scan, "historia");

        promedio = (matematicas + ciencias + historia) / 3;

        state = promedio >= 5.49 ? "Aprobado" : "Rechazado";
        System.out.printf("state = ".concat(state).concat(" con una nota de %.2f"), promedio);

    }

    public static double takeNotes(Scanner scan, String materia){
        System.out.println("Ingrese la nota de ".concat(materia));
        return scan.nextDouble();
    }
}
