package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static int[][] testArrays = new int[][]{
            {1,2,3,4,5},
            {5,4,3,2,1},
            {1,1,1,1,1},
            {1,2,1,2,1},
            {1, 3, -2, 11, 7, 3, 3, 2, 4, 2, 7, 12},
            {-2,-1,0,1,2},
            {2,1,0,-2,-1},
            {0,5,4,3,0},
            {8,8,8,8,0},
            {2,2,5,1,2}
    };

    public static void main(String[] args) {
        for (int i = 0; i < testArrays.length; i++){
            System.out.println("Тест " + i);
            PrintArray(testArrays[i]);
            System.out.println("Количество убывающих интервалов: " + IntervalsCount(testArrays[i]));
            System.out.println();
        }

        int[] array = ReadArray();
        System.out.println("Количество убывающих интервалов: " + IntervalsCount(array));
    }

    private static int IntervalsCount(int[] numbers){
        int result = 0;
        boolean inInterval = false;

        for (int i = 1; i < numbers.length; i++){
            if (numbers[i] >= numbers[i - 1])
            {
                inInterval = false;
            }
            else{
                if (!inInterval){
                    result++;
                }
                inInterval = true;
            }
        }
        return result;
    }

    private static int[] ReadArray(){
        System.out.println("Введите массив чисел через пробел:");
        Scanner in = new Scanner(System.in);

        String[] data = in.nextLine().split(" ");
        int[] numbers = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            numbers[i] = Integer.parseInt(data[i]);
        }

        return numbers;
    }

    private static void PrintArray(int[] numbers){
        System.out.println(Arrays.toString(numbers));
    }
}
