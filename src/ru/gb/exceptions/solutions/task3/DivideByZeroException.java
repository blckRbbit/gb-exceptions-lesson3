package ru.gb.exceptions.solutions.task3;

public class DivideByZeroException  extends ArithmeticException {
    public DivideByZeroException() {
        super("Делить на ноль нельзя!");
    }

    public DivideByZeroException(String message) {
        super(message);
    }
}
