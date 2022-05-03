package com.pluralsight.String;

public class StringBUilder {
    public static void main(String[] args) {
        String Location = "Florida";
        int flightNumber = 175;
        StringBuilder sb = new StringBuilder(40);
        sb.append("I flew to ");
        sb.append(Location);
        sb.append(" on flight #");
        sb.append(flightNumber);
        String msg =sb.toString();
        System.out.println("message= "+msg);
        String time= "9:00";
        int pos = sb.indexOf(" on");
        sb.insert(pos, " at ");
        sb.insert(pos+4, time);
        msg = sb.toString();
        System.out.println("Message after INSERT "+msg);
    }
}
