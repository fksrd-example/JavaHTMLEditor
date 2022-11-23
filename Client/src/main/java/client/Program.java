package client;

import java.io.IOException;

import javax.swing.JFrame;

public class Program {
    @SuppressWarnings({ "oracle.jdeveloper.java.semantic-warning", "deprecation" })
    public static void main(String[] args) throws IOException {
        
        SetPage setPage = new SetPage();
        
        setPage.SetSize(436, 245);
        setPage.SetResizeble(false);
        LoadingPage loadingPage = new LoadingPage(setPage);
        setPage.SetTitle("HTML Editor");
        setPage.Page(loadingPage);
        setPage.Show();
        
    }
}
