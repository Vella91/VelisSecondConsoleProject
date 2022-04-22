package com.exceptionslecture;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class FixThisCode {
    public static FileWriter getFileWriter(String filePath) throws IOException {
        FileWriter fileWriter = new FileWriter(filePath, true);
        return fileWriter;
    }
    public static void printToFile(FileWriter fileWriter, String text, int repeat) throws IOException {
        for (int i = 0; i < repeat; i++) {
            fileWriter.write(text + "\n");
        }
        fileWriter.flush();
        fileWriter.close();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter file path: ");
        String filePath = scanner.nextLine();
        System.out.println("Enter int for how many times");
        int howManyTimesToPrintTheTextToFile = scanner.nextInt();
        System.out.println("Enter text to add: ");
        String textToAdd = scanner.next();
        try {
            printToFile(getFileWriter(filePath), textToAdd, howManyTimesToPrintTheTextToFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
