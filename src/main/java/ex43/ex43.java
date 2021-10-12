/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Tim Phung
 */
package ex43;

import java.util.*;

public class ex43
{

    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        WebsiteCreator newSite = new WebsiteCreator();

        String siteName;
        String author;
        String readJS;
        String readCSS;
        //scan user input
        System.out.print("Site name: ");
        siteName = scan.nextLine();
        newSite.siteName = siteName;

        System.out.print("Author: ");
        author = scan.nextLine();
        newSite.author = author;

        System.out.print("Do you want a folder for JavaScript? ");
        readJS = scan.nextLine();

        System.out.print("Do you want a folder for CSS? ");
        readCSS = scan.nextLine();

        newSite.path = "src/main/java/ex43/";

        System.out.println("Created " + newSite.createWebsite());
        System.out.println("Created " + newSite.createHTML());

        //if css or js created
        if(readCSS.equals("y"))
            System.out.println("Created " + newSite.createCSS());
        if(readJS.equals("y"))
            System.out.println("Created " + newSite.createJS());

    }
}
