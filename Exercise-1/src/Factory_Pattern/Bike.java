package Factory_Pattern;

public class Bike implements Vehicle {
    @Override
    public void create() {
        System.out.println("Bike created.");
    }
}
