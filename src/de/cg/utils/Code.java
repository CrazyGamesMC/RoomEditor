package de.cg.utils; 

public class Code {

    private static CustomDebugger cd = new CustomDebugger();

    public static void debug(String msg) {
        cd.onDebug(msg);
    }

    public static void error(String msg) {
        cd.onError(msg); 
    }

    public static void setCustomDebugger(CustomDebugger cd) {
        Code.cd = cd; 
    }

}