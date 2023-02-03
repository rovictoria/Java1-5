package OOP5;

/**
 * Написать программу сложения двух чисел
 */
public class Main {
    public static void main(String[] args) {

        Presenter p = new Presenter(new Sum(), new View());
        p.buttonClick();
        p.buttonClick();
        p.buttonClick();
        p.buttonClick();

    }

}