package de.cg.utils.data;

import de.cg.utils.Code;
import de.cg.utils.files.FileContents;

public class DataHandler {

    private FileContents fileContents; 
    private String splitter = ";";

    public DataHandler(FileContents fc) {
        this.fileContents = fc; 
    }

    public void setSplitter(String splitter) {
        this.splitter = splitter; 
    }

    public String getFromSection(int row, int column) {
        row--;
        column--;
        return fileContents.get()[row].split(splitter)[column];
    }

    public String[] getRow(int row) {
        return fileContents.get()[row].split(splitter);
    }

    public String getFromKeyword(String keyword) {

        for (String row : fileContents.get()) {
            String[] columns = row.split(":");
            if (columns[0].equals(keyword)) {
                return columns[1];
            }
        }

        Code.error("Data Handler - Keyword not found");
        return null; 
    }
}