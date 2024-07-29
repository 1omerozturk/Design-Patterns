
public class Adminstrator implements State {
    private Program program;

    public Adminstrator(Program p) {
        program = p;
    }

    @Override
    public void Handle() {
        System.out.println("(1) Add User");
        System.out.println("(2) Update User");
        System.out.println("(3) Delete User");
        System.out.println("(4) Logout");

        program.Login();
    }
    
}
