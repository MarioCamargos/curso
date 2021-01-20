
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;


public class LabelFrama extends JFrame{
    private JLabel label1;
    private JLabel label2;
    
    public LabelFrama(){
        super("Testando JLabel");
        setLayout(new FlowLayout());
        
        label1=new JLabel("Label com texto");
        label1.setToolTipText("This is label");
        add(label1);
        
        label2=new JLabel();
        label2.setText("Testando");
        label2.setHorizontalTextPosition(SwingConstants.CENTER);
        label2.setVerticalTextPosition(SwingConstants.BOTTOM);
        label2.setToolTipText("This is label");
        add(label2);
        
        
        
    }
}
