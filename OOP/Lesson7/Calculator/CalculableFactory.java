package OOP.Lesson7.Calculator;

import OOP.Lesson7.Complex.Complex;

public class CalculableFactory implements ICalculableFactory{
    @Override
    public Calculable create(Complex firstArg) {
        return new Calculator(firstArg);
    }
}