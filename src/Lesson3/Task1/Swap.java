package Lesson3.Task1;

public class Swap <U> {

    U agent;

    public U[] swapElements(U[] array, int A, int B){
        agent = array[A];
        array[A] = array[B];
        array[B] = agent;
        return array;
    }
}
