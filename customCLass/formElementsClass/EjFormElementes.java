package customCLass.formElementsClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjFormElementes {
    public static void main(String[] args) {

        InputFormJava username = new InputFormJava("username");
        InputFormJava password = new InputFormJava("password", "password");
        InputFormJava email = new InputFormJava("email", "email");
        InputFormJava age = new InputFormJava("age", "number");

        TextareaForm experience = new TextareaForm("exp", 5, 9);

        SelectForm language = new SelectForm("language");
        SelectOptions java = new SelectOptions("1", "Java");
        language.addOption(java);
        language.addOption(new SelectOptions("2", "Python"));
        language.addOption(new SelectOptions("3", "JavaScrip"));
        language.addOption(new SelectOptions("4", "TypeScrip"));
        language.addOption(new SelectOptions("5", "PHP"));

        username.setValue("john.doe");
        password.setValue("a1b2c3");
        email.setValue("john.doe@correo.com");
        age.setValue("23");
        experience.setValue("... 10 Y in programming");
        java.setSelected(true);

        List<ElementForm> elements = new ArrayList<>();
        elements.add(username);
        elements.add(password);
        elements.add(email);
        elements.add(age);
        elements.add(language);

        elements.add(experience);

        for (ElementForm e: elements){
            System.out.println(e.writeHtml());
        }

        //Anon Class (This is only for one use)
        ElementForm s = new ElementForm() {
            @Override
            public String writeHtml() {
                return "New example";
            }
        };

        System.out.println(s.writeHtml());
    }
}
