package Lesson5;

public class AppData {

    public AppData(String[] header, int[][] data) {
        this.header = header;
        this.data = data;
    }

    private String[] header;
    private int[][] data;


    public void setHeader(String[] header) {
        this.header = header;
    }

    public void setData(int[][] data)
    {
        this.data = data;
    }
}
