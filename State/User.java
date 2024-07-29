
public class User implements State {

    private Program program;

    public User(Program p) {
        program = p;
    }

    @Override
    public void Handle() {
        System.out.println("(1) User Settings");
        System.out.println("(2) Service - 1");
        System.out.println("(3) Service - 2");
        System.out.println("(4) Logout");

        program.LogOut();
    }

}
