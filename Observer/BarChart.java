
import java.util.ArrayList;

public class BarChart implements Observer {
    private Data source;
    private ArrayList<Integer> data;

    public BarChart(Data d) {
        data = new ArrayList<Integer>();
        source = d;
        for (int i : source.getData())
            data.add(i);
    }

    @Override
    public void Update() {
        data.clear();
        for (int i : source.getData())
            data.add(i);
        System.out.println("Updating Bar Chart.");
        System.out.println(data);
    }
}
