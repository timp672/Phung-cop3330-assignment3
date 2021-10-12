/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Tim Phung
 */
package ex45;

import java.io.*;
import java.util.*;

public class ex45
{
    //read file and replace method
    public static void readAndReplace(Scanner scanFile,FileWriter writer) throws IOException {
        try{
            while (scanFile.hasNext())
            {
                String string = scanFile.nextLine();

                string = string.replaceAll("utilize","use");

                writer.write(string);
                writer.write("\n");
            }
        }
        finally
        {
            scanFile.close();
        }
        writer.close();

    }
    public static void main( String[] args ) throws IOException
    {
        Scanner scan = new Scanner(System.in);
        //input file directory
        File file = new File("src\\main\\java\\ex45\\exercise45_input.txt");
        Scanner scanFile = new Scanner(file);
        //user input
        System.out.print("\nEnter the name of the Output File: ");
        String outputFile = scan.next();
        //write file
        FileWriter writer = new FileWriter("src\\main\\java\\ex45\\" +outputFile);
        readAndReplace(scanFile,writer);
    }
}
