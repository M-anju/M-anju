package com.pluralsight.organized;

public class CalcEngineArryas {
    public static void main(String[] args) {
        double[] leftval = {100.34d, 54.54d, 35.65d, 28.78d};
        double[] rightval = {15.62d, 48.65d, 85.95d, 26.75d};
        char[] opCode = {'d', 'a', 's', 'm'};
        double result[] = new double[opCode.length];

        for(int i=0; i<opCode.length; i++)
        {
            switch (opCode[i]){
                case 'a':
                    result[i]=leftval[i] + rightval[i];
                    break;
                case 's':
                    result[i] =leftval[i] - rightval[i];
                    break;
                case 'm':
                    result[i] =leftval[i] * rightval[i];
                    break;
                case 'd':
                    result[i]= rightval[i] !=0 ? leftval[i] / rightval[i] : 0.0d;
                    break;
                default:
                    System.out.println("Invalid opCode : "+opCode[i]);
                    result[i] = 0.0d;
                    break;
            }
        }
        for(double res : result)
            System.out.println("The Result of each Opcode: "+res);
    }

}
