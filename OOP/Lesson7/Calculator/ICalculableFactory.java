package OOP.Lesson7.Calculator;

import OOP.Lesson7.Complex.Complex;

public interface ICalculableFactory {
    Calculable create(Complex firstArg);
}