package ru.gb.exceptions.solutions;

import java.io.IOException;

/**
 Задание 2.
 Создайте класс Counter, у которого есть метод add(), увеличивающий значение
 внутренней int переменной на 1. Сделайте так, чтобы с объектом такого типа
 можно было работать в блоке try-with-resources. Подумайте, что должно происходить
 при закрытии этого ресурса? Напишите метод для проверки, закрыт ли ресурс.
 При попытке вызвать add() у закрытого ресурса, должен выброситься IOException
 */
public class Counter implements AutoCloseable { // это класс Counter
    private int count; // можно сделать Integer, тогда closed не нужна
    private boolean closed = false;

    public void add() throws IOException{
        if (closed) throw new IOException("Нет доступа к закрытому ресурсу");
        count++;
    }

    public int getCount() {
        return count;
    }

    @Override
    public void close() {
        System.out.println("Ресурсы класса Solution2 закрыты");
        closed = true;
    }

    @Override
    public String toString() {
        return "Solution2{" +
                "count=" + count +
                '}';
    }
}
