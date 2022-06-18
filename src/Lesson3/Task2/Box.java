package Lesson3.Task2;

public class Box <T extends Fruit> {

    T[] fruitArray;

    public Box(T[] fruitArray){
        this.fruitArray = fruitArray;
    }
    public Integer getKgArray(){
        Integer result = 0;
        for(T t: getFruitArray()){
            if(t!=null) {
                Integer value = t.getConvertToKg();
                result = result + value;
            }
        }
        return result;
    }

    public Boolean compare(Box<? extends Fruit> box){
        if(this.getKgArray().intValue() == box.getKgArray().intValue()) return true;
        return false;
    }
    public void toEmptyArray(Box<T> box){
        System.out.println("В текущей корзине до: " + box.getKgArray() + " кг");
        System.out.println("В целевой корзине до: " + this.getKgArray() + " кг");
        for(int i = 0; i<box.getFruitArray().length;i++){
            if(box.getFruitArray()[i]!=null) {
                this.getFruitArray()[getWeight()] = box.getFruitArray()[i];
                box.getFruitArray()[i] = null;
            }
        }
        System.out.println("В текущей корзине после: " + box.getKgArray() + " кг");
        System.out.println("В целевой корзине после: " + this.getKgArray() + " кг");

    }
    public T[] getFruitArray() {
        return fruitArray;
    }
    private int getWeight(){
        int result = 0;
        for(T t: getFruitArray()){
            if(t!=null)result++;
        }
        return result;
    }
}
