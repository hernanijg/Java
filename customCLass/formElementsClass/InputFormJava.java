package customCLass.formElementsClass;

public class InputFormJava extends ElementForm {
    private String type = "text";

    public InputFormJava(String name) {
        super(name);
    }

    public InputFormJava(String name, String type) {
        super(name);
        this.type = type;
    }

    public String getType() {return type;}
    public void setType(String type) {this.type = type;}

    @Override
    public String writeHtml() {
        return "<input type='" + this.type
                + "' name='" + this.name
                +"' value='" + this.value + "'>";
    }
}
