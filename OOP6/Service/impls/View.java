package OOP6.Service.impls;

import OOP6.Model.MathResult;

public interface View {
    void showMathResult(MathResult result);

    Integer enteringNumbers();

    int showMenu();
}