public class Television {
    private int channel;

    public Television() {
        channel = 1;
    }

    public void changeChannel(int c) {
        channel = c;
    }

    public void nextChannel() {
        channel++;
    }

    public void previousChannel() {
        channel--;
    }

    public int currentChannel() {
        return channel;
    }
}
