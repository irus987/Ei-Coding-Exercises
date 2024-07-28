package Decorator_Pattern;

public class CheeseDecorator extends PizzaDecorator {
    public CheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription() + ", Cheese";
    }

    @Override
    public double getCost() {
        return decoratedPizza.getCost() + 20.0;
    }
}

