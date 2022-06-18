package Lesson3.Task2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Apple[] apples = new Apple[10];

        Apple apple0 = new Apple(70);
        Apple apple1 = new Apple(70);
        Apple apple2 = new Apple(70);
        Apple apple3 = new Apple(70);
        apples[0] = apple0;
        apples[1] = apple1;
        apples[2] = apple2;
        apples[3] = apple3;
        Box<Apple> box1 = new Box<>(apples);

        Apple[] apples2 = new Apple[10];
        apples2[0] = apple0;
        apples2[1] = apple1;
        apples2[2] = apple2;
        apples2[3] = apple3;
        Apple apple4 = new Apple(70);
        apples2[4] = apple4;
        Box<Apple> box2 = new Box<>(apples2);

        System.out.println(box1.getKgArray() + " кг - вес корзины 1");
        System.out.println(box2.getKgArray() + " кг - вес корзины 2");
        System.out.println(box1.compare(box2) + ": вес корзины 1 равен весу корзины 2");
        System.out.println("Пересыпание из корзины 2 в корзину 1:");
        box1.toEmptyArray(box2);
        System.out.println(box2.getKgArray() + " кг - вес корзины 2");

        Orange[] oranges = new Orange[10];
        Orange orange0 = new Orange(50);
        Orange orange1 = new Orange(50);
        Orange orange2 = new Orange(50);
        Orange orange3 = new Orange(50);
        oranges[0] = orange0;
        oranges[1] = orange1;
        oranges[2] = orange2;
        oranges[3] = orange3;
        Box<Orange> box3 = new Box<>(oranges);
        System.out.println(box3.getKgArray() + " кг - вес корзины 3");
        System.out.println(box1.compare(box3) + ": вес корзины 1 равен весу корзины 3");
    }
}
