
public class ViewProxy extends Chart {

    public View v;

    public ViewProxy(String p) {
        filePath = p;
        v = new View(p);
    }

    @Override
    public void Draw() {
        v.Draw();
    }

    @Override
    public void ChartData() {
        System.out.println("File name: " + filePath);
    }

}
