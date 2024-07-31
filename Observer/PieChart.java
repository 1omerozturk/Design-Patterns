
import java.util.ArrayList;

public class PieChart implements Observer {
    private Data source;
    private ArrayList<Integer> data;

    public PieChart(Data d) {
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
        System.out.println("Updating Pie Chart.");
        System.out.println(data);
    }

}
