package client;

public class WhatOS {
    public WhatOS() {
        super();
    }
    
    public static String OS() {
    
        return System.getProperty("os.name");
    
    }
    
    public static Boolean IsWindows() {
        
        return OS().startsWith("Windows");
        
    }
}
