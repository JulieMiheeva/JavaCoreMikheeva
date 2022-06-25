package Task1;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("слово");
        set.add("слово");
        set.add("лето");
        set.add("словарь");
        set.add("слово");
        set.add("функция");
        set.add("функция");
        set.add("лето");
        set.add("море");
        set.add("зима");
        System.out.println(set);
        System.out.println(set.size() + " уникальных слов");

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("слово");
        arrayList.add("слово");
        arrayList.add("лето");
        arrayList.add("словарь");
        arrayList.add("слово");
        arrayList.add("функция");
        arrayList.add("функция");
        arrayList.add("лето");
        arrayList.add("море");
        arrayList.add("зима");
        Map<String, Long> frequency =
                arrayList.stream().collect(Collectors.groupingBy(
                        Function.identity(), Collectors.counting()));

        frequency.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}



