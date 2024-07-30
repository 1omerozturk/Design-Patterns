public class AppleFactory implements ElectronicDeviceFactory {
    @Override
    public Laptop createLaptop() {
        return new MacBook();
    }

    @Override
    public Phone createPhone() {
        return new iPhone();
    }
}
