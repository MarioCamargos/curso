
import java.awt.FlowLayout;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;


public class CheckBoxFrame extends JFrame{
    private JTextField textField;
    private JCheckBox boldcheck;
    private JCheckBox italiancheck;
    
    public CheckBoxFrame(){
    super("Testing");
        setLayout(new FlowLayout());
    
    
        
    boldcheck=new JCheckBox("Bold");
    add(boldcheck);
    
    
    }
    
}
