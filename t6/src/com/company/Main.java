package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите X:");
        double x = in.nextDouble();
        System.out.println("Введите N:");
        int n = in.nextInt();
        System.out.println("Введите E:");
        double e = in.nextDouble();

        System.out.println("1. Для N членов:       " + CalcForN(x, n));
        System.out.println("2. Для членов > E:     " + CalcForE(x, e));
        System.out.println("3. Для членов > E/10:  " + CalcForE(x, e/10));
        System.out.println("4. Результат Math.log: " + Math.log(1 - x));
    }

    private static double func(int n, double x){
        return - Math.pow(x, n) / n;
    }

    private static double CalcForE(double x, double e) {
        double result = 0;

        int i = 1;
        double item = func(i, x);
        while(Math.abs(item) > e){
            result += item;
            i++;
            item = func(i, x);
        }

        return result;
    }

    private static double CalcForN(double x, int n) {
        double result = 0;

        for (int i = 1; i <= n; i++){
            result += func(i, x);
        }
        return result;
    }
}
