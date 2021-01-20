
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class TextFieldFrame extends JFrame{
      private JTextField textField1;
      private JTextField textField2;
      private JTextField textField3;
      private JPasswordField passwordField;
      
      public TextFieldFrame(){
          super("Testando JtextField");
          setLayout(new FlowLayout());
          
          textField1= new JTextField(10);
          add(textField1);
          
          textField2=new JTextField("Enter with text here");
          add(textField2);
          
          textField3=new JTextField("Enter with text here", 10);
          
          passwordField=new JPasswordField("Hidden text");
          add(passwordField);
          
          TextFieldHandler handler=new TextFieldHandler();
          textField1.addActionListener(handler);
          textField2.addActionListener(handler);
          textField3.addActionListener(handler);
          passwordField.addActionListener(handler);
      }

    private class TextFieldHandler implements ActionListener{

     
            public void actionPerformed(ActionEvent event){
                String string="";
                
                if(event.getSource()==textField1){
                    string=string.format("TextField1 %s", event.getActionCommand());
                }else
                    if(event.getSource()==textField2){
                    string=string.format("TextField2 %s", event.getActionCommand());
                }else
                        if(event.getSource()==textField3){
                    string=string.format("TextField3 %s", event.getActionCommand());
                }else
                            if(event.getSource()==passwordField){
                    string=string.format("TextField1 %s", event.getActionCommand());
                }
                JOptionPane.showMessageDialog(null, string);
            }
        }
    
}
