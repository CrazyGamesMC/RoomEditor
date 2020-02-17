package de.cg.utils.files;

import java.util.ArrayList;
import java.util.Arrays;

public class FileContents {
    private ArrayList<String> contents = new ArrayList<>(); 

    public FileContents(ArrayList<String> contents) {
        this.contents = contents; 
    }

    public String[] get() {
        return this.contents.toArray(new String[contents.size()]); 
    }

    public ArrayList<String> getArrayList() {
        return this.contents;
    }

    public void set(String[] contents) {
       this.contents = (ArrayList<String>) Arrays.asList(contents);
    }

    public void set(ArrayList<String> contents) {
        this.contents = contents; 
    }

    public void print() {
        for (String str : contents) {
            System.out.println(str);
        }
    }

    public void edit(int line, String newString) {
        contents.set(line, newString);
    }

    public void append(String str) {
        contents.add(str); 
    }

    

    

}