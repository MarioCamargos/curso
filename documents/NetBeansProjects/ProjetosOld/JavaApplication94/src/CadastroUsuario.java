
import java.awt.FlowLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;


public class CadastroUsuario extends JFrame{
   private JLabel label1;
   private JLabel label2;
   private JLabel label3;
   public CadastroUsuario(){
    super("Testando labels");
    
       setLayout(new FlowLayout());
       label1=new JLabel("Sò texto");
       label1.setToolTipText("Só texto");
       add(label1);
       
       Icon bug=new ImageIcon(getClass().getResource("clock.png"));
       label2=new JLabel("Texto com ícone",bug, SwingConstants.LEFT);
       label2.setToolTipText("Texto e ícone");
       add(label2);
       
       label3=new JLabel();
       label3.setText("Tudo junto");
       label3.setIcon(bug);
       label3.setHorizontalTextPosition(SwingConstants.CENTER);
       label3.setVerticalTextPosition(SwingConstants.BOTTOM);
       add(label3);
       
    }
        
    
    
}
