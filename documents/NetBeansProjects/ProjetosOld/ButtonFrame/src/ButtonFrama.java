
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class ButtonFrama extends JFrame{
    private JButton plainButton;
    private JButton fancyButton;
    
    public ButtonFrama(){
        super("Testando Botões");
        setLayout(new FlowLayout());
        
        plainButton=new JButton("Plain Button");
        add(plainButton);
        
        Icon icon1=new ImageIcon(getClass().getResource("anchor.png"));
        Icon icon2=new ImageIcon(getClass().getResource("award_star_add.png"));
        fancyButton=new JButton("Fancy Button", icon1);
        fancyButton.setRolloverIcon(icon2);
        add(fancyButton);
        
        ButtonHandler handler = new ButtonHandler();
        plainButton.addActionListener(handler);
        fancyButton.addActionListener(handler);
        
        
        
        
        
    }
    private class ButtonHandler implements ActionListener{
        public void actionPerformed(ActionEvent event){
            JOptionPane.showMessageDialog(ButtonFrama.this, String.format("Você pressionou: %s",event.getActionCommand()));
        }
    }
}
