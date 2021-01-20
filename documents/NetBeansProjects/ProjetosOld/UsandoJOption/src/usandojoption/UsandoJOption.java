
package usandojoption;

import javax.swing.JOptionPane;

public class UsandoJOption {

    public static void main(String[] args) {

        String num1=JOptionPane.showInputDialog(null, "Insira um número:");
        String num2=JOptionPane.showInputDialog(null, "Insira outro número:");
       
        int n1=Integer.parseInt(num1);
        int n2=Integer.parseInt(num2);
        
        int soma=n1+n2;
       JOptionPane.showMessageDialog(null, "A soma é: "+soma);
        

    }
    
}
