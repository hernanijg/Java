package operators;

import javax.swing.text.StyledEditorKit;
import java.util.Scanner;

public class LoginOperatorsLogic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean loginUserBasic = loginUserBasic(scan);
        System.out.println("loginUserBasic = " + loginUserBasic);
    }

    public static Boolean loginUserBasic(Scanner scan) {
        String username = "Jhon Doe";
        String password = "12345";

        String username2 = "Jhon";
        String password2 = "123456";

        System.out.println("Ingrese el nombre de usuario: ");
        String u = scan.nextLine();

        System.out.println("Ingrese la password");
        String p = scan.nextLine();

        boolean isAuth = false;

        if ((username.equals(u) && password.equals(p))
                || (username2.equals(u) && password2.equals(p))) {
            isAuth = true;
        }
        
        if (isAuth) {
            System.out.println("Bienvenido Usuario ".concat(u).concat("!"));
        } else {
            System.out.println("Acceso Restringido");
        }

        scan.nextLine(); // Clean Buffer
        return isAuth;
    }



}
