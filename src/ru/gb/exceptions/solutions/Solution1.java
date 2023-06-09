package ru.gb.exceptions.solutions;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Solution1 {
    public static void main(String[] args) {
        try {
            doSomething();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void doSomething() throws IOException {
        File file = new File("something.txt");
        FileReader reader = new FileReader(file);
        while (reader.ready()) System.out.println(reader.read());
        // либо просто так:
//        throw new IOException(); тут сказать про память и анонимные объекты
    }
}
