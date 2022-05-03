package com.pluralsight.String;

public class StringEquality {
    public static void main(String[] args) {
        String s1= "I Love";
        s1 += " java";
        String s2 ="I ";
        s2 += "Love java";

        if( s1 == s2 ){
            System.out.println(" The Strings are equal");
        }
        else if(s1.equals(s2)) {
            System.out.println(" Both the Strings are Equal " + s1);
        }
        else
            System.out.println(" The strings are not equal ");
    }
}
