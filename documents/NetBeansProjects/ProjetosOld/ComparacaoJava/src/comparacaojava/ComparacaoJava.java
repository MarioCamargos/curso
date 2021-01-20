
package comparacaojava;

import java.util.Scanner;

public class ComparacaoJava {

    public static void main(String[] args) {
    
        Scanner s = new Scanner();
        int a, b;
        
        System.out.println("Digite o primeiro número:");
        a=s.nextLine();
        System.out.println("Digite o segundo número:");
        b=s.nextLine();
        
        if(a>b)
            System.out.println(a+" é maior que "+b);
        else if(b>a)
            System.out.println(b+" é maior que "a);
        else
            System.out.println("São iguais!"); 
    }
    
}
