package lambdaexpressions.model.util;

import lambdaexpressions.model.entities.Product;

import java.util.Locale;
import java.util.function.Function;

public class UpperCaseName implements Function<Product, String> {

    @Override
    public String apply(Product p) {
        return p.getName().toUpperCase(Locale.ROOT);
    }
}
