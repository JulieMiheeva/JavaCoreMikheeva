package Lesson4.Task2;

public class Main {
    public static void main(String[] args) {
        PhoneBook PhoneBook = new PhoneBook();
        PhoneBook.add("89122230507","Иванов Иван");
        PhoneBook.add("89226615448","Иванов Иван");
        PhoneBook.add("89134156333","Антонова Алиса");
        PhoneBook.add("89095678994","Иванов Иван");
        PhoneBook.add("89115289634","Петров Сергей");

        System.out.println(PhoneBook.getPhoneByName("Иванов Иван"));
        System.out.println(PhoneBook.getPhoneByName("Михеева Юля"));
    }
}
