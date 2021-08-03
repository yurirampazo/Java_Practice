package lambdaexpressions.model.entities;

import java.util.Objects;

public class Product {
    private String name;
    private Double price;

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public static boolean staticProductPredicate(Product p){
        return p.getPrice() >= 100;
    }

    public boolean nonStaticProductPredicate(){
        return price >= 100;
    }

    public static void priceUpdate(Product p) {
        p.setPrice(p.getPrice() * 1.1);
    }


    public void nonStaticPriceUpdate() {
        //price = price * 1.1;
        setPrice(getPrice() * 1.1);
    }

    @Override
    public String toString(){
        return name + ", " + String.format("%.2f", price);
    }
}