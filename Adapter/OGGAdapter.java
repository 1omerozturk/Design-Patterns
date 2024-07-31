public class OGGAdapter extends Music {
    private OGG ogg;

    public OGGAdapter(String i) {
        super(i);
        ogg = new OGG(i);
    }

    @Override
    public void MP3Play() {
        ogg.OGGPlay(1);
    }

}
