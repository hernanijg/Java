package Patterns.Observer;

public class Factory extends Observable {
    private String name;
    private int price;

    public Factory(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void changePrice(int price) {
        this.price = price;
        notifyObservers();
    }

    @Override
    public String toString() {
        return getName() +
                " New Price $" +
                getPrice();
    }
}
