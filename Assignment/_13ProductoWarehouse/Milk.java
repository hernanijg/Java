package Assignment._13ProductoWarehouse;

public class Milk extends Product{
    private int count;
    private int protein;

    //Constructor
    public Milk(){}
    public Milk(int count) {
        this.count = count;
    }
    public Milk(int count, int protein) {
        this.count = count;
        this.protein = protein;
    }
    public Milk(String name, int count, int protein) {
        super(name);
        this.count = count;
        this.protein = protein;
    }
    public Milk(String name, Double price, int count, int protein) {
        super(name, price);
        this.count = count;
        this.protein = protein;
    }

    // Getter and Setter
    public int getCount() {return count;}
    public void setCount(int count) {this.count = count;}
    public int getProtein() {return protein;}
    public void setProtein(int protein) {this.protein = protein;}

    @Override
    public String toString() {
        StringBuilder message = new StringBuilder(super.toString());
        message.append(this.count > 0 ? "Count: " + this.count + "\n" : "");
        message.append(this.protein > 0 ? "Protein: " + this.protein + "\n" : "");
        String lastMessage = message.toString();
        return lastMessage;
    }
}
