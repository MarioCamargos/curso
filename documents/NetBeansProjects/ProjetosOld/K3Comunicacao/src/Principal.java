
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mário
 */
public class Principal {
    public static void main(String[] args) {
        TelaSelecaoFormulario ts= new TelaSelecaoFormulario();
        ts.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ts.setVisible(true);
        ts.setSize(200, 250);
        
        
    }
}
