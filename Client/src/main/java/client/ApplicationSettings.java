package client;

import java.io.File;
import java.io.IOException;

public class ApplicationSettings {

    @SuppressWarnings("oracle.jdeveloper.java.unrestricted-field-access")
    public File SettingsFile;
    
    public ApplicationSettings() throws IOException {
        super();
        
        if(WhatOS.IsWindows()) {
            
            SettingsFile = new File(SetPath.GetSettingsPath() + "\\ApplicationSettings.xml");
            if(!SettingsFile.exists()) {
                SettingsFile.createNewFile();
            }
            
        }
    }

}
