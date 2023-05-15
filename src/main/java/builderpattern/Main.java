package builderpattern;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // create a new pizza object using PizzaBuilder class.
        Pizza pizza = new PizzaBuilder(15)
                              .setCrustType("thick")
                              .setSauceType("pastasauce")
                              .setToppings(Arrays.asList("cheese", "corn", "onion"))
                              .build();
        System.out.println(pizza);
    }







}
