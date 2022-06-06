package main;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CsvLogger {

    private String filePath = "/home/ded/Downloads/Telegram Desktop/tpo2/src/test/resources/output";

    private final char CSV_SEPARATOR = ',';
    private final int[] numerators = new int[] {1, 1, 1, 2, 3, 5, 1, -1, -1, -3};
    private final int[] denominators = new int[] {6, 4, 3, 3, 4, 6, 2, 2, 4, 4};

    public CsvLogger(String fileName) {
        this.filePath = filePath + fileName;
    }

    public void log(Computer computer) {
        String csvString = "";

        try {
            Files.deleteIfExists(Paths.get(this.filePath));
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (PrintStream printStream = new PrintStream(new FileOutputStream(filePath, true))) {
            for (int i = 0; i < numerators.length; i += 1) {

                Double result = computer.calculate(numerators[i] * Math.PI / denominators[i]);

                csvString = String.format("%f%s %f\n", numerators[i] * Math.PI / denominators[i], CSV_SEPARATOR, result);
                printStream.print(csvString);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
