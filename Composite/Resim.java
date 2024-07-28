public class Resim implements Icerik {
    private String resimYolu;

    public Resim(String r) {
        resimYolu = r;
    }

    @Override
    public void Operation() {
        System.out.println("<img src='" + resimYolu + "'/>");

    }

    @Override
    public void Add(Icerik i) {
        return;
    }

    @Override
    public void Remove(Icerik i) {
        return;

    }

    @Override
    public Icerik GetChild(int i) {

        return null;
    }

}
