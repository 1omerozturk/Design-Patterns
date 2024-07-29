public class Lamb {
    private int lamb;

    public Lamb() {
        lamb = 0;
    }

    public void onLamb() {
        System.out.println("Lamb opened.");
        lamb = 1;
    }

    public void offLamb() {
        System.out.println("Lamb closed.");
        lamb = 0;
    }

    public int lambValue() {
        return lamb;
    }

}
