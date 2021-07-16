package interfaces.model.entities;

import interfaces.model.enums.Color;
import interfaces.model.service.Shape;

public abstract class AbstractShape implements Shape {
    private Color color;

    public AbstractShape(Color color) {
        this.color = color;
    }

    public AbstractShape() {

    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
