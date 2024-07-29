public class Truck extends Vehicle {
    public Truck(String plateNumber) {
        super(plateNumber);
    }

    @Override
    public void stop() {
        System.out.println("Truck " + getPlateNumber() + " is stopping.");
    }

    @Override
    public void move() {
        System.out.println("Truck " + getPlateNumber() + " is moving.");
    }
}
