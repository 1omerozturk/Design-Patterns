public class Program {
    private State s;
    public Program(){
        s=new Adminstrator(this);
    }
    public void run(){
        s.Handle();
    }
    public void Login(){
        s=new User(this);
        run();
    }
    public void Admin()
    {
        s=new Adminstrator(this);
        run();
    }
    public void LogOut(){
        s=new Undefined(this);
    }
}
