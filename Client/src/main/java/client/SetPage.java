package client;

import javax.swing.JFrame;

public class SetPage {
    
    JFrame jFrame;
    
    public SetPage() {
        super();
        
        jFrame = new JFrame();
    }
    
    public void SetSize(int arg0, int arg1) {
        
        jFrame.setSize(arg0, arg1);
        
    }
    
    public void SetResizeble(boolean arg0) {
        
        this.jFrame.setResizable(arg0);
        
    }
    
    public void SetTitle(String arg0) {
    
        this.jFrame.setTitle(arg0);
    
    }
    
    public void Page(LoadingPage arg0) {
        
        jFrame.add(arg0);
        
        
    }
    
    public void Page(ProjectExplorerPage arg0) {
        
        jFrame.add(arg0);
        
    }
    
    public void Page(HTMLEditorPage arg0) {
        
        jFrame.add(arg0);
        
        
    }

    @SuppressWarnings({ "oracle.jdeveloper.java.semantic-warning", "deprecation" })
    public void Show() {
        
        this.jFrame.show();
        
    }
    
    @SuppressWarnings({ "oracle.jdeveloper.java.semantic-warning", "deprecation" })
    public void Hide() {
        
        this.jFrame.hide();
        
    }
}
