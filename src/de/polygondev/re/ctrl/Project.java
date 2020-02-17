package de.polygondev.re.ctrl;

import de.cg.utils.files.CGFile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Project {

    private String projectPath;

    private String objectsPath = "objects.re";

    public ArrayList<GameObject> registeredObject = new ArrayList<>();

    public Project(String path) {
        this.projectPath = path;
    }

    private void initFiles(String path) {
        //Project path
        try {
            CGFile cgf = new CGFile(path);

            cgf.getFile().createNewFile();



        } catch (IOException e) {
            e.printStackTrace();
        }

        //Object path
    }

}
