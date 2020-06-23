package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class IoModule {
    public static int[][] ReadArray(String path) throws FileNotFoundException {
        Scanner in = new Scanner(new File(path));

        int linesCount = in.nextInt();
        in.nextLine();

        int[][] result = new int[linesCount][];
        int arrayIdx = 0;
        while (in.hasNextLine()){
            String nextLine = in.nextLine();
            String[] data = nextLine.split(" ");
            int[] numbers = new int[data.length];
            for (int i = 0; i < data.length; i++) {
                numbers[i] = Integer.parseInt(data[i]);
            }

            result[arrayIdx++] = numbers;
        }

        return result;
    }

    public static void PrintArray(String path, int[][] numbers) throws IOException {
        FileWriter myWriter = new FileWriter(path);
        for (int i = 0; i < numbers.length; i++){
            myWriter.write(Arrays.toString(numbers[i]) + "\r\n");
        }
        myWriter.close();
    }
}
