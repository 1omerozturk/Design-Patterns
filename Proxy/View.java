

public class View extends Chart {

    private byte data[];

    public View(String p) {
        filePath = p;
        data = null;
    }

    @Override
    public void Draw() {
        if (data == null) {
            System.out.println("File loading... " + filePath);
            data = new byte[1000000];
            System.out.println("File drawing... (" + filePath + ").");
        } else {

        }
        System.out.println("File drawing... (" + filePath + ").");
    }

    @Override
    public void ChartData() {

    }

}
