
public class Undefined implements State{
    private Program program;

    public Undefined(Program p){
        program=p;
    }

@Override
public void Handle() {
    System.out.println("(1) Sign In");
    System.out.println("(2) User Login");
    System.out.println("(3) Admin Login");
    program.Admin();
}
}
