package ru.gb.exceptions;

import ru.gb.exceptions.solutions.Counter;
import ru.gb.exceptions.solutions.task4.MyArrayDataException;
import ru.gb.exceptions.solutions.task4.MyArraySizeException;
import ru.gb.exceptions.solutions.task4.Task4;

public class Main {
    public static void main(String[] args) { // throws Exception
//        Counter solution2 = new Counter();
//        System.out.println(solution2);
//        solution2.add();
//        System.out.println(solution2);
//
//        Counter counter = new Counter();
//        counter.close();
//        counter.add();

        String[][] arr = new String[][] {
                {"1", "1.5", "1.5"},
                {"1", "1.5", "1.5"},
                {"1", "1.5", "1.5"}
        };

        try {
            System.out.println(Task4.sum2d(arr));
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }
    }
}
