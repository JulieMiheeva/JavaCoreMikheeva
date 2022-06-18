package Lesson3.Task1;

import java.util.Arrays;

public class Main {
    static String[] arrayString = {"2", "4", "6", "8", "10"};

    public static void main(String[] args) {
        Swap<Object> swapArrayClass = new Swap<>();
        try {
            System.out.println(Arrays.toString(swapArrayClass.swapElements(arrayString, 0, 2)));
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        }
    }
}