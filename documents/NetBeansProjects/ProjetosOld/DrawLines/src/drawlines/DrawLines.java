package drawlines;

import java.awt.Frame;
import javax.swing.JFrame;

public class DrawLines {

    public static void main(String[] args) {
        DrawPanel d= new DrawPanel();
        Frame f=new JFrame();
        f.setVisible(true);
        f.add(d);
        f.setSize(250, 250);
    }
    
}
