
package usandoscanner;

import java.util.Scanner;

public class UsandoScanner {

   
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a, b, soma;
        System.out.println("Digite o primeiro número:");
        a=s.nextInt();
        System.out.println("DIgite o segundo número:");
        b=s.nextInt();
        
        soma=a+b;
        
        System.out.println("A soma é: "+soma);
        
    }
    
}
