package ru.gb.exceptions.solutions;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Solution0 {
    public void rwLine(Path pathRead, Path pathWrite) throws IOException {
        try(BufferedReader in = Files.newBufferedReader(pathRead);
            BufferedWriter out = Files.newBufferedWriter(pathWrite);
        ) {
            out.write(in.readLine());
        }
    }
}
