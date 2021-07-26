package genericassetmap.model.service;

import genericassetmap.model.entities.Product;

import java.util.List;

public class CalculationService {
    public static <T extends Comparable<T>> T max(List<T> list) {
        if (list.isEmpty()) {
            throw new IllegalStateException("List must not be empty!");
        }
        T max = list.get(0);
        for (T item : list) {
            if (item.compareTo(max) > 0) {
                max = item;
            } //compareTo não precisa que instancie a comparable.
        }
        return max;
    }
}
