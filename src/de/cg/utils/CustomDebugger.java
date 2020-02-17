package de.cg.utils; 

public class CustomDebugger {

    public void onDebug(String msg) {
        System.out.println("DEBUG: " + msg);
    }

    public void onError(String msg) {
        System.err.println("ERROR: " + msg);
    }

}