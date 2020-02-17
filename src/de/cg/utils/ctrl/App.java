package de.cg.utils.ctrl;

import java.io.IOException;

import de.cg.utils.data.DataHandler;
import de.cg.utils.files.CGFile;
import de.cg.utils.files.FileContents;

/** 
 * This file is used for local debugging
 *
 */
public class App {
    public static void main(String[] args) {
        
        try {
            CGFile cf = new CGFile("demo.txt");
            cf.load(); //Load the CGFile into memory
            FileContents contents = cf.getContents(); //Get contents
                 
            DataHandler handler = new DataHandler(contents); //Create DataHandler
            System.out.println(handler.getFromKeyword("Keyword")); //Get text from keyboard
            System.out.println(handler.getFromSection(2, 2)); //Get text from section (2,2)


            
            
        } catch (IOException e) {
            e.printStackTrace();
        }   

    }       
}           
