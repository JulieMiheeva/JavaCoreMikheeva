package Lesson3.Task2;

public abstract class Fruit {

    private String name;
    private Integer convertToKg;

    public Fruit(String name, Integer convertToKg) {
        this.name = name;
        this.convertToKg = convertToKg;
    }
    public String getName() {
        return name;
    }
    public Integer getConvertToKg() {
        return convertToKg;
    }
}
