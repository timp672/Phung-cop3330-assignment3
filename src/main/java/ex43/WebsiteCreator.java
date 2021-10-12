package ex43;

import java.io.*;

public class WebsiteCreator {
    String siteName;
    String author;
    String path;
    //create website string
    public String createWebsite()
    {
        String directory = path + siteName;
        File folder = new File(directory);

        folder.mkdirs();
        return directory;
    }
    //create js string
    public String createJS()
    {
        String directory = path + siteName + "/js";
        File folder = new File(directory);

        folder.mkdirs();
        return directory;
    }
    //create css string
    public String createCSS()
    {
        String directory = path + siteName + "/css";
        File folder = new File(directory);

        folder.mkdirs();
        return directory;
    }
    //create html string
    public String createHTML()
    {
        String directory = path + siteName + "/index.html";
        String html = "<title> " + siteName + " </title>\n<meta> " + author + " </meta>";

        File folder = new File(directory);
        //writing in format for html
        try{
            BufferedWriter write = new BufferedWriter(new FileWriter(folder));
            write.write(html);
            write.close();
            return directory;
        }catch (Exception ex){
            return "Failure in file";
        }
    }

}
