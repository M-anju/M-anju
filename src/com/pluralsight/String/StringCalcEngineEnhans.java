package com.pluralsight.String;

import java.util.Scanner;

public class StringCalcEngineEnhans {
    public static void main(String[] args) {
        double[] leftVals = {100.0d, 25.0d, 225.0d, 11.0d};
        double[] rightVals = { 50.0d, 92.0d, 17.0d, 3.0d};
        char[] opCodes = { 'd', 'a', 's', 'm' };
        double[] results = new double[opCodes.length];

        if( args.length == 0 )
        {
            for ( int i=0; i< opCodes.length; i++ ){
                results[i] = execute( opCodes[i], leftVals[i], rightVals[i]);
            }
            for (double res : results)
            {
                System.out.println(" The Result with out Command Line Values are: " +res);
            }
        }else if(args.length == 1 && args[0].equals("interactive")){
            executeInteractively();
        }
        else if (args.length == 3){
            handleCommandLine(args);
        }else
            System.out.println( " Please provide an operation code and 2 numeric values");
    }

    private static void handleCommandLine(String[] args) {
        char opCode = args[0].charAt(0);
        double leftVals = Double.parseDouble(args[1]);
        double rightVls = Double.parseDouble(args[2]);
        double res =execute(opCode, leftVals, rightVls);
        System.out.println("The Result of Command Line Argument Vlaues are: "+res);
    }
    static void executeInteractively(){
        System.out.println(" Enter an operation and two numbers: ");
        Scanner sc =new Scanner(System.in);
        String userInput=sc.nextLine();
        String[] parts=userInput.split(" ");
        performOperation(parts);
    }

    private static void performOperation(String[] parts) {
        char opCode= opCodeFromString(parts[0]);
        double leftVal= valueFromWord(parts[1]);
        double rightVal= valueFromWord(parts[2]);
        double res = execute(opCode, leftVal, rightVal);
        System.out.println("Result : "+res);
    }

    static double execute ( char opCode, double lVal, double rVal)
    {
        double res;
        switch (opCode)
        {
            case 'a':
                res = lVal + rVal ;
                break;
            case 's':
                res = lVal - rVal;
                break;
            case 'm':
                res = lVal * rVal;
                break;
            case  'd':
                res = rVal != 0 ? lVal / rVal : 0.0d;
                break;

            default:
                res = 0.0d;
                break;
        }
        return res;
    }

    static char opCodeFromString(String oprationName)
    {
        char opCode = oprationName.charAt(0);
        return opCode;
    }

    static double valueFromWord(String word){
        String[] numberWords ={
                "zero", "one", "two", "three", "four",
                "five", "six", "seven","eight", "nine"
        };
        double value = 0d;
        for(int index=0; index< numberWords.length; index++){
            if(word.equals(numberWords[index])){
                value =index;
                break;
            }
        }
        return value;
    }

}
