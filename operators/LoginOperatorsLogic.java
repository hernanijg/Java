package operators;

import java.util.Scanner;

public class LoginOperatorsLogic {
    public static void main(String[] args) {
        String username = "Jhon Doe";
        String password = "12345";

        String username2 = "Jhon";
        String password2 = "123456";

        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese el nombre de usuario: ");
        String u = scan.nextLine();

        System.out.println("Ingrese la password");
        String p = scan.nextLine();

        boolean isAuth = false;

        if ( (username.equals(u) && password.equals(p))
              ||  (username2.equals(u) && password2.equals(p)) ){
            isAuth = true;
        }
        if (isAuth){
            System.out.println("Bienvenido Usuario ".concat(u).concat("!"));
        } else {
            System.out.println("Acceso Restringido");
        }
    }
}
