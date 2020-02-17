package de.polygondev.re.ctrl;

import de.cg.utils.files.CGFile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Project {

    private String projectPath;

    private String objectsPath = "objects.re";

    public HashMap<String, RoomObject> registeredObject = new HashMap<>();

    public ArrayList<RoomObject> placedObjects = new ArrayList<>();

    public CGFile cgf;

    public Project(String path, boolean overwrite) {
        this.projectPath = path;

        initFiles(path, overwrite);
    }

    private void initFiles(String path, boolean overwrite) {
        //Project path
        try {
            this.cgf = new CGFile(path);

            if (!cgf.getFile().exists() || overwrite) cgf.getFile().createNewFile();

        } catch (IOException e) {
            e.printStackTrace();
        }

        //Object path
    }

}
