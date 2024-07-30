public class Client {
    private Laptop laptop;
    private Phone phone;

    public Client(ElectronicDeviceFactory factory) {
        laptop = factory.createLaptop();
        phone = factory.createPhone();
    }

    public void useDevices() {
        laptop.start();
        phone.call();
    }

    public static void main(String[] args) {
        ElectronicDeviceFactory appleFactory = new AppleFactory();
        Client appleClient = new Client(appleFactory);
        appleClient.useDevices();

        ElectronicDeviceFactory samsungFactory = new SamsungFactory();
        Client samsungClient = new Client(samsungFactory);
        samsungClient.useDevices();
    }
}
