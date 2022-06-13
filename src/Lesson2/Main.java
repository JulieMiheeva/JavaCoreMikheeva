package Lesson2;

import java.util.Arrays;

public class Main {
    static String[][] correctArray = {{"5", "1", "7", "2"}, {"6", "8", "2", "4"}, {"5", "3", "1", "7"}, {"1", "1", "5", "7"}};
    static String[][] arraySE = {{"5", "3", "1"}, {"2", "7", "9"}, {"9", "7", "1"}, {"4", "6", "3"}};
    static String[][] arrayDE = {{"p", "8", "9", "4"}, {"9", "1", "6", "5"}, {"3", "6", "6", "2"}, {"8", "4", "9", "2"}};

    static int sizeX = 4;

    static int sizeY = 4;


    public static void main(String[] args) {
        try {
            System.out.println("Array's sum: " + getSum(correctArray));
        } catch (MyArraySizeException | MyArrayDataException ae) {
            System.out.println(ae.getMessage());
        }

        try {
            System.out.println("Array's sum: " + getSum(arraySE));
        } catch (MyArraySizeException | MyArrayDataException ae) {
            System.out.println(ae.getMessage());
        }

        try {
            System.out.println("Array's sum: " + getSum(arrayDE));
        } catch (MyArraySizeException | MyArrayDataException ae) {
            System.out.println(ae.getMessage());
        }
    }
    static void checkValue(String[][] array) throws MyArraySizeException{
        if(array.length!=sizeX || array[0].length!=sizeY) throw new MyArraySizeException();
    }
    static Integer getSum(String[][] array) throws MyArrayDataException,MyArraySizeException{
        checkValue(array);
        Integer result = 0;
        int i =0;
        int j =0;
        try {
            for (; i < array.length; i++) {
                j =0;
                for (; j < array.length; j++) {
                    result = result + Integer.parseInt(array[i][j]);
                }
            }
        } catch (NumberFormatException ex){
            throw new  MyArrayDataException("Not a number in the position: " + i+","+j);
        }
        return result;
    }
}

