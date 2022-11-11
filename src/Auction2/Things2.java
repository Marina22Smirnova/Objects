package Auction2;

public class Things2 {

    private double price;
    private String name;
    private boolean condition;

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getCondition() {
        return this.condition;
    }

    public void setCondition(boolean condition) {
        this.condition = condition;
    }

    public Things2(double price, String name, boolean condition) {
        setPrice(price);
        setName(name);
        setCondition(condition);
    }
}