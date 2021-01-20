
package joption;

import javax.swing.JOptionPane;

public class JOption {

    public static void main(String[] args) {
    
        /**
         * Programa que soma dois número
         */
        String num=JOptionPane.showInputDialog(null, "Digite um número:");
        String num2=JOptionPane.showInputDialog(null, "O primeiro número digitado foi: "+num+"\nAgora digite outro número:");
        int numero1=Integer.parseInt(num);
        int numero2=Integer.parseInt(num2);
        int soma=numero1+numero2;
        
        JOptionPane.showMessageDialog(null, "A soma é: "+soma);
        JOptionPane.s   
    }
    
}
