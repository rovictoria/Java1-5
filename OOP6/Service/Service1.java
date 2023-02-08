package OOP6.Service;

import OOP6.Model.MathResult;
import OOP6.Service.impls.MathOperations;

public class Service1 implements MathOperations {
    public MathResult sum(int a, int b) {
        return new MathResult(a + b);
    }

    @Override
    public MathResult difference(int a, int b) {
        return new MathResult(a - b);
    }

    @Override
    public MathResult multiplication(int a, int b) {
        return new MathResult(a * b);
    }

    @Override
    public MathResult division(int a, int b) {
        return new MathResult(a / b);
    }
}