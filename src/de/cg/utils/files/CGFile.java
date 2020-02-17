package de.cg.utils.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import de.cg.utils.Code;

public class CGFile {
    private File file;
    private FileContents fileContents = null; 
    private boolean fileContentsLoaded = false;

    public CGFile(String path) throws IOException {
        file = new File(path);
    }

    public File getFile() {
        return this.file; 
    }

    public void load() throws IOException {
        ArrayList<String> contents = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(file)); 

        String store = ""; 
        while((store = br.readLine()) != null) {
            contents.add(store); 
        }

        br.close();

        if (!contents.isEmpty()) {
            fileContents = new FileContents(contents);
            fileContentsLoaded = true; 
        } else {
            Code.error("Couldn't load contents. REASON: File is empty.");
        }
    }

    public FileContents getContents() {
        if(!fileContentsLoaded)
            try {
                load();
            } catch (IOException e) {
                e.printStackTrace();
            }

        return this.fileContents; 
    }

    public void setContents(FileContents fc) {
        this.fileContents = fc; 
    }

    public void save(File file) throws IOException {
        FileWriter writer = new FileWriter(file);
        String toWrite = ""; 
        for (String str : fileContents.get()) {
            toWrite = toWrite + str + "\n"; 
        } 

        writer.write(toWrite);
        writer.close();
    }

    public void save() throws IOException {
        save(this.file);
    }

    
}