
import javax.swing.JFrame;


public class Principal {
    public static void main(String[] args) {
        CadastroUsuario cd = new CadastroUsuario();
        cd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cd.setSize(260, 180);
        cd.setVisible(true);
    }
}
