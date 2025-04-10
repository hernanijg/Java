package operators;

import javax.swing.text.StyledEditorKit;
import java.util.Scanner;

public class LoginOperatorsLogic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        boolean loginUserBasic = loginUserBasic(scan);
//        System.out.println("loginUserBasic = " + loginUserBasic);

        boolean loginUserArray = loginUserArray(scan);
        System.out.println("loginUserArray = " + loginUserArray);
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
    public static boolean loginUserArray(Scanner scan){
        String[] usernames = new String[2];
        String[] passwords = new String[2];
        usernames[0] = "Jhon Doe";
        passwords[0] = "12345";

        usernames[1] = "Jhon";
        passwords[1] = "123456";
        // that is like = String[] usernames = {"Jhon Doe", "Jhon"}

        System.out.println("Ingrese el usuario");
        String u = scan.nextLine();

        System.out.println("Ingrese la password");
        String p = scan.nextLine();

        boolean isAuth = false;

        for (int i = 0; i < usernames.length; i++){
            if(usernames[i].equals(u) && passwords[i].equals(p)){
                isAuth = true;
                break;
            }
        }

        if (!isAuth){
            System.out.println("Error, El usuario no existe");
        }

        scan.nextLine(); // Clean Buffer
        return  isAuth;
    }


}
