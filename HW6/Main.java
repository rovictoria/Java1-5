package HW6;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        filterSelection(createCriterion());
    }

    /**
     * 1. Подумать над структурой класса Ноутбук для магазина техники - выделить
     * поля и методы. Реализовать в java.
     * 2. Создать множество ноутбуков.
     * 3. Написать метод, который будет запрашивать у пользователя критерий (или
     * критерии) фильтрации и выведет ноутбуки,
     * отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
     * “Введите цифру, соответствующую необходимому критерию:
     * 1 - ОЗУ
     * 2 - Объем ЖД
     * 3 - Операционная система
     * 4 - Цвет …
     * 1. Далее нужно запросить минимальные значения для указанных критериев -
     * сохранить параметры фильтрации можно также в Map.
     * 2. Отфильтровать ноутбуки их первоначального множества и вывести проходящие
     * по условиям.
     */

    private static Set<Object> createLaptopSet() {
        Laptop laptop = new Laptop("Apple", "MKGP3", 16, 512, "Mac OS", "Black");
        Laptop laptop1 = new Laptop("Lenovo", "V15ADA", 4, 256, "Windows 11", "Black");
        Laptop laptop2 = new Laptop("Lenovo", "14ADA05", 4, 128, "Windows 11", "Gray");
        Laptop laptop3 = new Laptop("Asus", "VivaBook", 8, 256, "Windows 11", "Black");
        Laptop laptop4 = new Laptop("Acer", "A71542GR44", 8, 512, "Windows 11", "Gray");
        Laptop laptop5 = new Laptop("Asus", "ZenBook15", 8, 256, "Windows 10", "Black");
        Laptop laptop6 = new Laptop("Dell", "G15", 8, 1000, "Windows 11", "White");

        Set<Object> setLaptop = new HashSet<>();
        setLaptop.add(laptop);
        setLaptop.add(laptop1);
        setLaptop.add(laptop2);
        setLaptop.add(laptop3);
        setLaptop.add(laptop4);
        setLaptop.add(laptop5);
        setLaptop.add(laptop6);

        return setLaptop;
    }

    private static int createCriterion() {
        Map<Integer, String> criterion = new HashMap<Integer, String>();
        criterion.put(1, "ОЗУ");
        criterion.put(2, "Объем ЖД");
        criterion.put(3, "Операционная система");
        criterion.put(4, "Цвет");

        System.out.println("Параметры для фильтрации ноутбуков: " + "\n" + criterion);
        System.out.print("Введите выбранное значение: ");
        Scanner scanner = new Scanner(System.in);
        int selectedCriterion = scanner.nextInt();
        return selectedCriterion;
    }

    private static void filterSelection(int selectedCriterion) {
        if (selectedCriterion == 1) {
            filter1(createLaptopSet());
        } else if (selectedCriterion == 2) {
            filter2(createLaptopSet());
        } else if (selectedCriterion == 3) {
            filter3(createLaptopSet());
        } else if (selectedCriterion == 4) {
            filter4(createLaptopSet());
        } else
            System.out.println("Введено несуществующее значение");
    }

    private static void filter1(Set<Object> setLaptop) {
        System.out.print("Введите необходимый объем ОЗУ (4, 6, 8, 16): ");
        Scanner scanner1 = new Scanner(System.in);
        int size1 = scanner1.nextInt();
        String sizeRam = "ram=" + size1;
        for (var item : setLaptop) {
            String laptop = item.toString();
            if (laptop.contains(sizeRam)) {
                System.out.println(item);
            }
        }
    }

    private static void filter2(Set<Object> setLaptop) {
        System.out.print("Введите необходимый объем ЖД (150, 200, 250, 500): ");
        Scanner scanner2 = new Scanner(System.in);
        int size2 = scanner2.nextInt();
        String sizeSsd = "ssd=" + size2;
        for (var item : setLaptop) {
            String laptop = item.toString();
            if (laptop.contains(sizeSsd)) {
                System.out.println(item);
            }
        }
    }

    private static void filter3(Set<Object> setLaptop) {
        System.out.println("1 - Windows 7" + "\n" + "2 - Windows 8" + "\n" + "3 - Windows 11");
        System.out.print("Введите выбранную ОС: ");
        Scanner scanner3 = new Scanner(System.in);
        int selectedOs = scanner3.nextInt();
        String os = null;
        if (selectedOs == 1) {
            os = "Windows 7";
        } else if (selectedOs == 2) {
            os = "Windows 10";
        } else if (selectedOs == 3) {
            os = "Windows 11";
        } else
            System.out.println("Введено несуществующее значение");
        for (var item : setLaptop) {
            String laptop = item.toString();
            if (laptop.contains(os)) {
                System.out.println(item);
            }
        }
    }

    private static void filter4(Set<Object> setLaptop) {
        System.out.println("1 - Black" + "\n" + "2 - White" + "\n" + "3 - Gray");
        System.out.println("Введите значение выбранного цвета: ");
        Scanner scanner3 = new Scanner(System.in);
        int selectedColor = scanner3.nextInt();
        String color = null;
        if (selectedColor == 1) {
            color = "Black";
        } else if (selectedColor == 2) {
            color = "White";
        } else if (selectedColor == 3) {
            color = "Gray";
        } else
            System.out.println("Введено несуществующее значение");
        for (var item : setLaptop) {
            String laptop = item.toString();
            if (laptop.contains(color)) {
                System.out.println(item);
            }
        }
    }
}