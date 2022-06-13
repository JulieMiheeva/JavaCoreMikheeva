package Lesson1;

public class teamMember {
    private String name;
    private int canRun;

    public teamMember(String name, int canRun) {
        this.name = name;
        this.canRun = canRun;
    }
    public void info() {
        System.out.println("teamMember" + name + "can run" + canRun);
    }

    public String getName() {
        return name;
    }

    public int getCanRun() {
        return canRun;
    }
}
