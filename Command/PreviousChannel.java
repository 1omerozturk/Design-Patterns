public class PreviousChannel implements Command {

    private Television tv;

    public PreviousChannel(Television t) {
        tv = t;
    }

    @Override
    public void Execute() {
        tv.previousChannel();
        System.out.println("Current channel: " + tv.currentChannel());
    }

    @Override
    public String toString() {
        return "Previous channel";
    }

}
