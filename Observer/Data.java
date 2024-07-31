
import java.util.ArrayList;
import java.util.*;

public class Data implements Subject {
    private ArrayList<Integer> list;
    private ArrayList<Observer> observers;
    private Random random;

    public Data() {
        random = new Random(System.currentTimeMillis());
        list = new ArrayList<Integer>();
        list.add(random.nextInt(100));
        list.add(random.nextInt(100));
        list.add(random.nextInt(100));
        observers = new ArrayList<Observer>();
    }

    @Override
    public void Attach(Observer o) {
        observers.add(o);
    }

    @Override
    public void Detach(Observer o) {
        observers.remove(o);
    }

    @Override
    public void Notify() {
        for (Observer o : observers) {
            o.Update();
        }
    }

    public void newData() {
        list.add(random.nextInt(100));
    }

    public ArrayList<Integer> getData() {
        return list;
    }
}
