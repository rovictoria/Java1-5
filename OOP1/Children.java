package OOP1;

public class Children extends Parents {
    private String firstName;
    private String lastName;
    private int age;
    private String status;

    public Children(String firstName, String lastName, int age, String status) {
        this.status = status;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;

    }

    @Override
    public String toString() {
        return "Ребенок: " + firstName + " " + lastName + ". Возраст: " + age + ". " + status + ".";
    }
}