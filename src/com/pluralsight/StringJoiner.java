//package com.pluralsight;
//
//public class StringJoiner {
//    public static void main(String[] args) {
//        java.util.StringJoiner sj =new java.util.StringJoiner("], [", "{[", "]}");
//        sj.add("alpha");
//        sj.add("beta");
//        sj.add("gama");
//        String stringResult=sj.toString();
//        System.out.println("the out put strings are "+ stringResult);
//    }
//}
//package com.pluralsight;
//
//public class StringJoiner {
//    public static void main(String[] args) {
//        java.util.StringJoiner sj = new java.util.StringJoiner(", ","{ "," }");
//        sj.add("EMPTY");
//        sj.add("");
//        String result=sj.toString();
//        System.out.println("the OUTPUT OF THE STRING JOINER WITH THE ONLY DELIMITER IS " +result);
//    }
//}

package com.pluralsight;

public class StringJoiner {
    public static void main(String[] args) {
        int a1=10,a2=15,a3=20,a4=25,a5=30;
        double avgDiff=((a1-a2)+(a2-a3)+(a3-a4)+(a4-a5))/3.0d;

        String s1="MY NEPHEWS ARE "+a1+", "+a2+", "+a3+", "+a4+", "+"AND "+a5+" YEARS OLD";
        System.out.println("ME: "+s1);
        String s2= String.format("MY NEPHEWS ARE %d, %d, %d, %d, AND %d YEARS OLD",a1,a2,a3,a4,a5);
        System.out.println("ME: "+s2);
        String s3= "THE AVERAGE AGE BETWEEN IS "+avgDiff+" YEARS";
        System.out.println("THE AVERAGE AGE DIFFERENCE "+ s3);
        String s4= String.format("THE AVERAGE AGE BETWEEN IS %.1f YEARS",avgDiff);
        System.out.println("THE AVERAGE AGE DIFFERENCE "+s4);
    }
}