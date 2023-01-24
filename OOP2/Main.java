package OOP2;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Хороший ключ", "Переменная");

        Mutable2 changeMutable = new Mutable2("Неизменяемый клас", map); // init
        Mutable1 mutable = new Mutable1("Изменяемый класс", map);

        System.out.println("Результат в неизменяемом классе, как мы получим map");
        changeMutable.getFieldMap().put("Плохой ключ", "Другое значение");
        changeMutable.getFieldMap().keySet().forEach(e -> System.out.println(e));

        System.out.println("Результат в изменяемом классе, как мы получим map");
        mutable.getFieldMap().put("Плохой ключ", "Другое значение");
        mutable.getFieldMap().keySet().forEach(e -> System.out.println(e));

        System.out.println("");
        System.out.println("Результат после изменения исходного map в неизменяемом классе");
        map.put("Иной ключ", "Иное значение");

        changeMutable.getFieldMap().keySet().forEach(e -> System.out.println(e));
        System.out.println("Результат после изменения исходного map в изменяемом классе");
        mutable.getFieldMap().keySet().forEach(e -> System.out.println(e));
    }
}