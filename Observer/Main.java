
public class Main {
    public static void main(String[] args) {
        Data d = new Data();
        PieChart pie = new PieChart(d);
        BarChart bar = new BarChart(d);

        d.Attach(pie);
        d.Attach(bar);

        d.newData();
        d.newData();

        d.Detach(bar);

        d.newData();
    }
}
