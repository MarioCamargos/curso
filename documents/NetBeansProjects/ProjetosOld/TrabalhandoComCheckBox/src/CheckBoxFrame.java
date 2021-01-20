
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;


public class CheckBoxFrame extends JFrame{
    private JTextField textField;
    private JCheckBox boldCheckBox;
    private JCheckBox italianCheckBox;
    
    public CheckBoxFrame(){
        super("Testing CheckBox");
        setLayout(new FlowLayout());
        
        textField = new JTextField("Watch the font style", 20);
        textField.setFont(new Font("Serif", Font.PLAIN, 14));
        add(textField);
        
        boldCheckBox=new JCheckBox("Negrito");
        italianCheckBox=new JCheckBox("Italian");
        add(boldCheckBox);
        add(italianCheckBox);
        CheckBoxHandler handler=new CheckBoxHandler();
        boldCheckBox.addItemListener(handler);
        italianCheckBox.addItemListener(handler);
        
    }
    private class CheckBoxHandler implements ItemListener{
    
        public void itemStateChanged(ItemEvent event){
            Font font=null;
            if(boldCheckBox.isSelected() && italianCheckBox.isSelected())
                font=new Font("Serif", Font.BOLD+Font.ITALIC, 14);
            else if(boldCheckBox.isSelected())
                font= new Font("Serif", Font.BOLD, 14);
                        else if(italianCheckBox.isSelected())
                            font=new Font("Serif", Font.ITALIC, 14);
                            else
                                font=new Font("Serif", Font.PLAIN, 14);
                                
            textField.setFont(font);
            
        }
    }
}
