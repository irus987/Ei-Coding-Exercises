package Factory_Pattern;
//Use Case: Vehicle Manufacturing System
public class VehicleFactory {
    public static Vehicle getVehicle(String type) {
        switch (type) {
            case "Car":
                return new Car();
            case "Bike":
                return new Bike();
            case "Truck":
                return new Truck();
            default:
                throw new IllegalArgumentException("Unknown vehicle type.");
        }
    }

    public static void main(String[] args) {
        Vehicle car = VehicleFactory.getVehicle("Car");
        car.create();

        Vehicle bike = VehicleFactory.getVehicle("Bike");
        bike.create();

        Vehicle truck = VehicleFactory.getVehicle("Truck");
        truck.create();
    }
}
