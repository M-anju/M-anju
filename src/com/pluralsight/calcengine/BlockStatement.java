package com.pluralsight.calcengine;

public class BlockStatement {
    public static void main(String[] args) {
        int v1 = 30, v2 = 20;
        final int diff;

        if ( v1 > v2 ) {
            diff = v1 - v2;
            System.out.println("v1 is bigger than v2, diff= " + diff);
        }
        else
            diff = v2 - v1;
            System.out.println("v2 is bigger than v1, diff= "+diff);
    }
}
