import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private ArrayList<Command> commands;

    public Menu() {
        commands = new ArrayList<Command>();
    }

    public void addCommand(Command c) {
        commands.add(c);
    }

    public void menu() {
        Scanner sc = new Scanner(System.in);
        int s = 0;
        while (s != -1) {
            for (int i = 0; i < commands.size(); i++) {
                System.out.println(i + ": " + commands.get(i));
            }
            System.out.println("The Exit for -1");
            try {
                s = sc.nextInt();
                commands.get(s).Execute();
            } catch (Exception e) {
            }
        }
        sc.close();
    }

}
