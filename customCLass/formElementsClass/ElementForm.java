package customCLass.formElementsClass;

abstract public class ElementForm {
    protected String value;
    protected String name;

    public ElementForm() {
    }

    public ElementForm(String name) {
        this();
        this.name = name;
    }

    public void setValue(String value) {this.value = value;}

    /* This is a protocol
     * the methods body are in sons
     */
    abstract public String writeHtml();

}
