package builderpattern;

import java.util.List;

//The PizzaBuilder class is responsible for constructing Pizza objects using the builder pattern.
public class PizzaBuilder {
    private int size;
    private String crustType;
    private String sauceType;
    private List<String> toppings;

    public PizzaBuilder(int size) {
        this.size = size;
    }

//  setCrustType method sets and returns the crustType for pizza.
    public PizzaBuilder setCrustType(String crustType) {
        this.crustType = crustType;
        return this;
    }

//  setSauceType method sets and returns the sauceType for pizza.
    public PizzaBuilder setSauceType(String sauceType) {
        this.sauceType = sauceType;
        return this;
    }

// setToppings method sets and returns the toppings for pizza.
    public PizzaBuilder setToppings(List<String> toppings) {
        this.toppings = toppings;
        return this;
    }

//  build method returns a new Pizza object.
    public Pizza build() {
        return new Pizza(size, crustType, sauceType, toppings);
    }
}

