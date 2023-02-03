package OOP5;

public class Presenter {

    View view;
    Model model;

    public Presenter(Model m, View v) {
        model = m;
        view = v;
    }

    public void buttonClickSum() {
        System.out.println("Сумма чисел целочисленная: ");
        int a = view.getValue("a: ");
        int b = view.getValue("b: ");
        model.setX(a);
        model.setY(b);
        int result = model.result();
        view.print(result, "Sum: ");
    }

    public void buttonClickSub() {
        System.out.println("Разность чисел целочисленная: ");
        int a = view.getValue("a: ");
        int b = view.getValue("b: ");
        model.setX(a);
        model.setY(b);
        int result = model.result();
        view.print(result, "Subtraction: ");
    }

    public void buttonClickMult() {
        System.out.println("Умножение чисел целочисленное: ");
        int a = view.getValue("a: ");
        int b = view.getValue("b: ");
        model.setX(a);
        model.setY(b);
        int result = model.result();
        view.print(result, "Multiplication: ");
    }

    public void buttonClickDiv() {
        System.out.println("Деление чисел целочисленное: ");
        int a = view.getValue("a: ");
        int b = view.getValue("b: ");
        model.setX(a);
        model.setY(b);
        int result = model.result();
        view.print(result, "Div: ");
    }

}