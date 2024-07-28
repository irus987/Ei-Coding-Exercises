package Factory_Pattern;
public class Car implements Vehicle {
    @Override
    public void create() {
        System.out.println("Car created.");
    }
}

