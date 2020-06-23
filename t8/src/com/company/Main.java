package com.company;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        InputArgs inputArgs = parseCmdArgs(args);
        int[][] array = IoModule.ReadArray(inputArgs.InputFile);
        LogicModule.Sort(array);
        IoModule.PrintArray(inputArgs.OutputFile, array);
    }

    public static InputArgs parseCmdArgs(String[] args){
        InputArgs result = new InputArgs();
        result.InputFile = args[0];
        result.OutputFile = args[1];
        return result;
    }
}
