public class Main {
    public static void main(String[] args) {
        VehicleFactory vehicleFactory = new VehicleFactory();

        Vehicle car = vehicleFactory.getVehicle("CAR", "34ABC34");
        car.move();
        car.stop();

        Vehicle truck = vehicleFactory.getVehicle("TRUCK", "35XYZ35");
        truck.move();
        truck.stop();
    }
}
