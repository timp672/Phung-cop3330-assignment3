/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Tim Phung
 */
package ex46;

import java.io.*;
import java.util.*;

public class ex46
{
    //read file method
    public static void readFile(Scanner file, Map<String,Integer> SI)
    {
        //while file still has input
        while (file.hasNextLine())
        {
            String str = file.next();
            if(SI.containsKey(str))
                SI.put(str,SI.get(str)+1);
            else
                SI.put(str,1);
        }
    }
    //printing histogram method
    public static void printHistogram(Map<String,Integer> SI)
    {
        //format and print *'s for each word
        for (String key:SI.keySet())
        {
            System.out.printf("%-10s", key+ ":");
            for (int i = SI.get(key); i>0; i--)
                System.out.print("*");
            System.out.println();
        }
    }
    //main
    public static void main( String[] args ) throws IOException
    {
        Scanner file = new Scanner(new File("src\\main\\java\\ex46\\exercise46_input.txt"));
        Map<String,Integer> SI = new TreeMap<String,Integer>();

        readFile(file,SI);

        printHistogram(SI);
    }
}
