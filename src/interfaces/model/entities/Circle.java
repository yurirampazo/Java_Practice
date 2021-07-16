package interfaces.model.entities;

import interfaces.model.enums.Color;
import interfaces.model.service.Shape;

public class Circle extends AbstractShape {
    private Double radius;

    public Circle () {}

    public Circle(Color color, Double radius) {
        super(color);
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius,2);
    }
}
