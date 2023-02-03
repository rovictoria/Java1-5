package OOP5;

/**
 * Написать программу сложения двух чисел
 */
public class Main {
    public static void main(String[] args) {

        Presenter p = new Presenter(new Sum(), new View());
        p.buttonClickSum();

        Presenter a = new Presenter(new Subtraction(), new View());
        a.buttonClickSub();

        Presenter b = new Presenter(new Multiplication(), new View());
        b.buttonClickMult();

        Presenter d = new Presenter(new Div(), new View());
        d.buttonClickDiv();

    }

}