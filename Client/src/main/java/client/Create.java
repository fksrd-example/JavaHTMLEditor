package client;

import java.io.File;
import java.io.IOException;

public class Create {
    
    public Create() {
        super();
    }
    
    public static void File(String arg0, String arg1) throws IOException {
        
        if (WhatOS.IsWindows()) {
            File file = new File(arg0 + "\\" + arg1);
            file.createNewFile();
        }
        
    }
    
    public static void Folder(String arg0, String arg1) {
        
        if (WhatOS.IsWindows()) {
            File file = new File(arg0 + "\\" + arg1);
            file.mkdir();
        }
        
    }
    
}
