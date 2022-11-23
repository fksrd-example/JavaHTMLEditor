package client;



public class SetPath {
    public SetPath() {
        super();
    }
    
    public static String GetSettingsPath() {
        
        if(WhatOS.IsWindows()) {
            
            String HomePath = GetUserPath();
            
            return  HomePath + "\\AppData\\Local\\com.fksrd.HTMLEditor";
        
        }
        
        return null;
        
    }
    
    public static String GetUserPath() {
        
        return System.getProperty("user.home");
        
    }
}
