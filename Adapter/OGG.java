public class OGG {
    private String musicName;

    public OGG(String s) {
        musicName = s;
    }

    public void OGGPlay(int speed) {
        System.out.println("Playing " + musicName + " at speed " + speed);
    }
}
