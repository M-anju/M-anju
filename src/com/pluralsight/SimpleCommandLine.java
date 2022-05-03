package com.pluralsight;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SimpleCommandLine {
    public static void main(String[] args) {
//        if(args.length<1)
//        {
//            System.out.println("The are no arguments passed to the class");
//        }
//        else{
//            for(String s: args)
//            {
//                System.out.println(s);
//            }
//            System.out.println("The Number of arguments passed are "+args.length);
//        }
        if(args.length ==0)
        {
            showUsage();
            return;
        }
        else
        {
            String filename=args[0];
            if(!Files.exists(Paths.get(filename)))
            {
                System.out.println("\n File Not Found...!! "+filename);
                return;
            }
            showFileLines(filename);
        }
    }

    private static void showFileLines(String filename) {
        System.out.println();

        try (BufferedReader reader = Files.newBufferedReader(Paths.get(filename))) {
            String line=null;
            while((line = reader.readLine()) !=null)
            {
                System.out.println(line);
            }
        }catch (Exception e)
        {
            System.out.println(e.getClass().getSimpleName() +"-"+e.getMessage());
        }
    }

    public static void showUsage()
    {
        System.out.println();
        System.out.println("Please provide the filename to process on the command line");
    }
}
