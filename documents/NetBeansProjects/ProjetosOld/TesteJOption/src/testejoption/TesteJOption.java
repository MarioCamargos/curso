
package testejoption;

import javax.swing.JOptionPane;

public class TesteJOption {

    public static void main(String[] args) {
        int num1,num2, soma;
        try{
        String n1=JOptionPane.showInputDialog(null, "Digite um número:", "Programa que soma dois números", JOptionPane.WARNING_MESSAGE);
        num1=Integer.parseInt(n1);
        String n2=JOptionPane.showInputDialog(null, "Digite outro número:", "Programa que soma dois números", JOptionPane.WARNING_MESSAGE);
        num2=Integer.parseInt(n2);
        
        soma=num1+num2;
        
        JOptionPane.showMessageDialog(null, "A soma é: "+soma, "Programa que soma dois números", JOptionPane.INFORMATION_MESSAGE);
        
        }catch(NumberFormatException j){
            JOptionPane.showMessageDialog(null, "É necessário colocar um número válido!"+j);
        }
        
    }
    
}
