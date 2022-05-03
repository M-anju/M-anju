package com.pluralsight.organized;

public class CalcEngineMethod {
    public static void main(String[] args) {
        double[] leftVal= {100.02d,90.25d, 80.56d, 63.78d};
        double[] rightVal= {25.45d, 50.56d, 75.15d, 100.89d};
        char[] opCode= { 'd', 'a', 's', 'm'};
        double result[] =new double[opCode.length];

        for (int i=0; i< opCode.length; i++){
            result[i]= execute(opCode[i], leftVal[i], rightVal[i]);
        }

        for (double r : result){
            System.out.println(" The Final result with the opCode " +r);
        }
    }

    static double execute(char opCode, double lVal, double rVal){
       double res;

       switch (opCode)
       {
           case 'a':
               res= lVal + rVal;
               break;
           case 's':
               res= lVal - rVal;
               break;
           case 'm':
               res= lVal * rVal;
               break;
           case 'd':
               res= rVal !=0 ? lVal / rVal : 0.0d;
               break;
           default:
               System.out.println("Invalid opCode: ");
               res = 0.0d;
               break;
       }
       return res;
    }
}
