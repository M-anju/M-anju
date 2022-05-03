package com.pluralsight.organized;

public class Arrays {
    public static void main(String[] args) {
        float[] theValues = new float[3];
        theValues[0]= 1.20f;
        theValues[1]= 1.54f;
        theValues[2]= 2.65f;

        float sum=0.0f;

        for (int i=0; i< theValues.length;i++)
            sum += theValues[i];
        System.out.println("the total sum of Arrays: " +sum);
    }
}
