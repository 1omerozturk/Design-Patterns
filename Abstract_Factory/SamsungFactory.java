public class SamsungFactory implements ElectronicDeviceFactory {
    @Override
    public Laptop createLaptop() {
        return new GalaxyBook();
    }

    @Override
    public Phone createPhone() {
        return new GalaxyPhone();
    }
}
