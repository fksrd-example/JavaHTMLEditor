package client;

import javax.swing.JFrame;

public class Program {
    @SuppressWarnings({ "oracle.jdeveloper.java.semantic-warning", "deprecation" })
    public static void main(String[] args) {
        
        JFrame jFrame = new JFrame("HTML Editor");
        jFrame.setSize(436, 245);
        jFrame.setResizable(false);
        jFrame.add(new LoadingPage());
        jFrame.show();
        
    }
}
