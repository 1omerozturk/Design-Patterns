
public class Main {
    public static void infos(Chart c) {
        c.ChartData();
    }

    public static void drawScreen(Chart c) {
        c.Draw();
    }

    public static void main(String[] args) {
        ViewProxy v = new ViewProxy("image.jpg");
        infos(v);
        drawScreen(v);

        ViewProxy y = new ViewProxy("img.jpg");
        infos(y);
        drawScreen(v);
        drawScreen(y);
    }
}
