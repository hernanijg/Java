package Patterns.Decorator;

public class Text implements Formate {
    protected String text;

    public Text(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public String giveFormate() {

        return getText();
    }

}
