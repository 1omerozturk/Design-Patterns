public class LambOnOff implements Command {

    Lamb lamb;

    public LambOnOff(Lamb l) {
        lamb = l;
    }

    @Override
    public void Execute() {
        if (lamb.lambValue() == 1)
            lamb.offLamb();
        else
            lamb.onLamb();
    }

    @Override
    public String toString() {
        if (lamb.lambValue() == 1)
            return "Off Lamb";
        else
            return "On Lamb";
    }

}
