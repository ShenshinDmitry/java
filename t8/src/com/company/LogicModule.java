package com.company;

public class LogicModule {
    public static void Sort(int[][] array){
        int idx = 0;
        for (int i = 0; i < array.length; i++){
            if (IsNonDecreasing(array[i])){
                int[] tmp = array[i];
                for (int j = idx; j < i; j++){
                    array[j + 1] = array[j];
                }
                array[idx] = tmp;
                idx++;
            }
        }
    }

    private static boolean IsNonDecreasing(int[] array){
        for (int i = 1; i < array.length; i++){
            if (array[i] < array[i - 1])
            {
                return false;
            }
        }
        return true;
    }
}
