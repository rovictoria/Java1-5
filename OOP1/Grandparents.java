package OOP1;

public class Grandparents {
    private String firstName;
    private String lastName;
    private int age;
    private String status;

    public String grandMother1() {
        status = "Бабушка по матери";
        firstName = "Алина";
        lastName = "Килова";
        age = 63;
        return String.format("Статус: %s. Имя: %s %s. Возраст: %d.", status, firstName, lastName, age);
    }

    public String grandFather1() {
        status = "Дедушка по матери";
        firstName = "Петр";
        lastName = "Килов";
        age = 64;
        return String.format("Статус: %s. Имя: %s %s. Возраст: %d.", status, firstName, lastName, age);
    }

    public String grandMother2() {
        status = "Бабушка по отцу";
        firstName = "Алина";
        lastName = "Петрова";
        age = 63;
        return String.format("Статус: %s. Имя: %s %s. Возраст: %d.", status, firstName, lastName, age);
    }

    public String grandFather2() {
        status = "Дедушка по отцу";
        firstName = "Антон";
        lastName = "Петров";
        age = 65;
        return String.format("Статус: %s. Имя: %s %s. Возраст: %d.", status, firstName, lastName, age);
    }

}