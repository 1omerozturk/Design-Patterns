public class Car extends Vehicle {
    public Car(String plateNumber) {
        super(plateNumber);
    }

    @Override
    public void stop() {
        System.out.println("Car " + getPlateNumber() + " is stopping.");
    }

    @Override
    public void move() {
        System.out.println("Car " + getPlateNumber() + " is moving.");
    }
}
