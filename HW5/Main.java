package HW5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// import static HW5.ChessBoard.createBoard;
import static HW5.Sort.printArray;
import static HW5.List.getList;

public class Main {
    public static void main(String[] args) {
        personPhoneNumber();
        personal();
        getSort();
    }

    /**
     * 1. Реализуйте структуру телефонной книги с помощью HashMap, учитывая,
     * что 1 человек может иметь несколько телефонов.
     */
    public static void personPhoneNumber() {
        PhoneBook people = new PhoneBook();
        people.add("Иванов Иван", "89952528384");
        people.add("Степанов Артур", "89792228381");
        people.add("Степанов Артур", "89992328382");
        people.add("Петров Алексей", "89942428383");
        people.add("Круглова Амина", "89932628385");

        System.out.println("1. Поиск номера человека внутри программы:");
        System.out.println(people.find("Степанов Артур"));
    }

    /**
     * Пусть дан список сотрудников:
     * Написать программу, которая найдет и выведет повторяющиеся имена
     * с количеством повторений. Отсортировать по убыванию популярности.
     */
    private static void personal() {
        List people = new List();
        people.add("Иван", "Иванов");
        people.add("Светлана", "Петрова");
        people.add("Кристина", "Белова");
        people.add("Анна", "Мусина");
        people.add("Анна", "Крутова");
        people.add("Иван", "Юрин");
        people.add("Петр", "Лыков");
        people.add("Павел", "Чернов");
        people.add("Петр", "Чернышов");
        people.add("Мария", "Федорова");
        people.add("Марина", "Светлова");
        people.add("Мария", "Савина");
        people.add("Мария", "Рыкова");
        people.add("Марина", "Лугова");
        people.add("Анна", "Владимирова");
        people.add("Иван", "Мечников");
        people.add("Петр", "Петин");
        people.add("Иван", "Ежов");

        System.out.println("2. Количество повторений имён для тел. книги: ");
        getList();
    }

    /**
     * 3. Реализовать алгоритм пирамидальной сортировки (HeapSort)
     */
    public static void getSort() {
        int arr[] = { 13, 565, 565, 45, 58, 12, 869, 356, 56 };
        Sort ob = new Sort();
        ob.sort(arr);

        System.out.println("3. Пирамидально отсортированный: ");
        printArray(arr);
    }
}