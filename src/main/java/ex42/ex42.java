/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Tim Phung
 */
package ex42;

import java.io.*;
import java.util.*;

public class ex42
{
    //read names for printing
    public static void readNames(String names)
    {
        try{
            File file = new File(names);
            Scanner scan = new Scanner(file);

            while (scan.hasNext())
            {
                String s = scan.nextLine();
                //formatting input
                String[] temp = s.split(",");
                System.out.printf("%-13s%-13s%-13s\n", temp[0], temp[1], temp[2]);
            }
        } catch (FileNotFoundException e){
            System.out.print("Error reading file");
        }
    }

    public static void main( String[] args )
    {

        ex42 name = new ex42();
        //print and structured format
        System.out.printf("%-13s%-13s%-13s\n", "Last", "First", "Salary");
        System.out.println("--------------------------------");
        name.readNames("src\\main\\java\\ex42\\exercise42_input.txt");

    }
}

