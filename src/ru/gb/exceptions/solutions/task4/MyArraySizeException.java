package ru.gb.exceptions.solutions.task4;

public class MyArraySizeException extends Exception {
    public MyArraySizeException() {
        super("Двумерный массив должен быть размером 3х3");
    }
}
