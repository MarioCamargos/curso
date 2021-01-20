
import java.awt.FlowLayout;
import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;



public class TelaSelecaoFormulario extends JFrame{
    private JLabel labelEscolha;
    
    private JRadioButton pf;
    private JRadioButton pj;
    private JButton botaoConfirmar;
    public TelaSelecaoFormulario(){
        super("Seleção de Pessoa");
        setLayout(new FlowLayout());
        labelEscolha=new JLabel("Escolha o tipo de pessoa:");
        add(labelEscolha);
        
        pf=new JRadioButton("Pessoa Física");
        add(pf);
        
        pj=new JRadioButton("Pessoa Jurídica");
        add(pj);
        
        botaoConfirmar=new JButton("Enviar");
        add(botaoConfirmar);
    }
    
}
