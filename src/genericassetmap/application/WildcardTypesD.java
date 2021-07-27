package genericassetmap.application;

import genericassetmap.model.entities.Circle;
import genericassetmap.model.entities.Rectangle;
import genericassetmap.model.service.Shape;

import java.util.ArrayList;
import java.util.List;

public class WildcardTypesD {
    public static void main(String[] args) {

        List<Shape> myShapes = new ArrayList<>();
        myShapes.add(new Rectangle(3.0, 2.0));
        myShapes.add(new Circle(2.0));

        List<Circle> myCircles = new ArrayList<>();
        myCircles.add(new Circle(2.0));
        myCircles.add(new Circle(2.0));

        System.out.println("Total area: " + totalArea(myCircles));

    }

    public static double totalArea(List<? extends Shape> list) {
        double sum = 0.0;
        for (Shape s : list){
            sum += s.area();
        }
        return sum;
    }
}
