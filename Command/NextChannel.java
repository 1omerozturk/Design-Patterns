public class NextChannel implements Command {

    private Television tv;

    public NextChannel(Television t) {
        tv = t;
    }

    @Override
    public void Execute() {
        tv.nextChannel();
        System.out.println("Current channel: " + tv.currentChannel());
    }

    @Override
    public String toString() {
        return "Next channel";
    }

}
