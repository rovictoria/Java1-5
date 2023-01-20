package OOP1;

public class Parents extends Grandparents {
    private String firstName;
    private String lastName;
    private int age;
    private String status;

    public String mother() {
        status = "Мать";
        firstName = "Людмила";
        lastName = "Петрова";
        age = 35;
        return String.format("Статус: %s. Имя: %s %s. Возраст: %d.", status, firstName, lastName, age);
    }

    public String father() {
        status = "Отец";
        firstName = "Руслан";
        lastName = "Петров";
        age = 37;
        return String.format("Статус: %s. Имя: %s %s. Возраст: %d.", status, firstName, lastName, age);
    }
}