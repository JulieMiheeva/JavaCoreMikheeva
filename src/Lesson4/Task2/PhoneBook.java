package Lesson4.Task2;

import java.util.HashMap;

public class PhoneBook {

    private HashMap<String, String> stringStringHashMap = new HashMap<>();

    public void add(String phone, String fio) {
        stringStringHashMap.put(phone, fio);
    }

    public String getPhoneByName(String fio) {
        if (stringStringHashMap.containsValue(fio)) {
            String result = "Номера телефонов: ";
            for (String key : stringStringHashMap.keySet()) {
                if (stringStringHashMap.get(key).equals(fio)) result += key + "  ";
            }
            return result;
        } else return "Номер не найден";

    }
}




