package arraysandlists.entities;

public class Product {
    
    private String name;
    private double price;

    public Product (String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Product () {}

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public double getPrice(){
        return price;
    }
}
