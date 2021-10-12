/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Tim Phung
 */
package ex41;

import java.io.*;
import java.util.*;

public class ex41
{
        //read in the input
        public static void readFile(Scanner scan, ArrayList<String> names)
        {
                while (scan.hasNextLine())
                {
                        names.add(scan.nextLine());
                }
        }
        //write in output
        public static void outputNames(ArrayList<String> names) throws IOException
        {
                FileWriter output = new FileWriter("src\\main\\java\\ex41\\exercise41_output.txt");
                //header
                output.write("Total of " + names.size() + " names\n");
                output.write("--------------------\n");
                //write and format names
                for (String i : names)
                {
                        output.write(i + "\n");
                }
                output.close();
        }

        public static void main( String[] args ) throws FileNotFoundException {
                Scanner scan = new Scanner(new File("src\\main\\java\\ex41\\exercise41_input.txt"));
                ArrayList<String> names = new ArrayList<>();

                readFile(scan, names);
                //sort
                Collections.sort(names, String.CASE_INSENSITIVE_ORDER);

                scan.close();

                try{
                        outputNames(names);
                }
                catch (Exception e){
                        System.out.print("Error reading file\n");
                }
        }
}
