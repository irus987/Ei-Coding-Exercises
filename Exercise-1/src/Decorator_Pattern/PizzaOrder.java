package Decorator_Pattern;

public class PizzaOrder {
    public static void main(String[] args) {
        Pizza pizza = new PlainPizza();
        System.out.println(pizza.getDescription() + " Cost: " + pizza.getCost());

        pizza = new CheeseDecorator(pizza);
        System.out.println(pizza.getDescription() + " Cost: " + pizza.getCost());

        pizza = new OliveDecorator(pizza);
        System.out.println(pizza.getDescription() + " Cost: " + pizza.getCost());
    }
}
