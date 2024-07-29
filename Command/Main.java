public class Main {
    public static void main(String[] args) {
        Menu m = new Menu();
        LambOnOff cmd_Lamb = new LambOnOff(new Lamb());
        Television tv = new Television();
        PreviousChannel cmd_previous = new PreviousChannel(tv);
        NextChannel cmd_next = new NextChannel(tv);

        m.addCommand(cmd_Lamb);
        m.addCommand(cmd_previous);
        m.addCommand(cmd_next);

        m.menu();

    }
}
