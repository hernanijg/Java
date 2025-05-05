package Assignment._13ProductoWarehouse;

public class NotPerceivable extends Product{
    private int content;
    private int calories;

    // Constructor
    public NotPerceivable(){}
    public NotPerceivable(int content) {
        this.content = content;
    }
    public NotPerceivable(int content, int calories) {
        this.content = content;
        this.calories = calories;
    }
    public NotPerceivable(String name, int content, int calories) {
        super(name);
        this.content = content;
        this.calories = calories;
    }
    public NotPerceivable(String name, Double price, int content, int calories) {
        super(name, price);
        this.content = content;
        this.calories = calories;
    }

    // Getter and Setter
    public int getContent() {return content;}
    public void setContent(int content) {this.content = content;}
    public int getCalories() {return calories;}
    public void setCalories(int calories) {this.calories = calories;}

    @Override
    public String toString() {
        StringBuilder message = new StringBuilder(super.toString());
        message.append(this.content > 0 ? "Content: " + this.content + "\n" : "");
        message.append(this.calories > 0 ? "Calories: " + this.calories + "\n" : "");
        String lastMessage = message.toString();
        return lastMessage;
    }
}
