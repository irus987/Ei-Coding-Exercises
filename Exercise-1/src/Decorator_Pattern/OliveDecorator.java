package Decorator_Pattern;

public class OliveDecorator extends PizzaDecorator {
    public OliveDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription() + ", Olives";
    }

    @Override
    public double getCost() {
        return decoratedPizza.getCost() + 15.0;
    }
}

