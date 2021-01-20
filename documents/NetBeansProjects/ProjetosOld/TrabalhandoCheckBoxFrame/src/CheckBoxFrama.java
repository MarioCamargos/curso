
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.TextField;
import java.util.Locale;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;


public class CheckBoxFrama extends JFrame{
    private JTextField textField;
    private JCheckBox boldCheckBox;
    private JCheckBox italianCheckBox;
    public CheckBoxFrama(){
        super("Testando CheckBox");
        setLayout(new FlowLayout());
        textField = new JTextField("Marque um estilo de fonte", 20);
        textField.setFont(new Font("Serif", Font.PLAIN, 14));
        add(textField);
        boldCheckBox = new JCheckBox("Negrito");
        italianCheckBox = new JCheckBox("Itálico");
        add(boldCheckBox);
        add(italianCheckBox);
        
        CheckBoxHandler handler=new CheckBoxHandler();
        boldCheckBox.addItemListener(handler);
        italianCheckBox.addItemListener(handler);
        
        
        
    }
       private class CheckBoxHandler implements ItemListener(){
    public void itemStateChanged(ItemEvent event){
        Font font=null;
    }
}
}

