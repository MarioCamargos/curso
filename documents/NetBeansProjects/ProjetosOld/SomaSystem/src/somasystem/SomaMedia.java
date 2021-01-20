
package somasystem;

import java.util.Scanner;

public class SomaMedia {

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        double num1, num2, num3, soma, media;
        System.out.println("Digite um número:");
        num1=s.nextDouble();
        System.out.println("Digite outro número:");
        num2=s.nextDouble();
        System.out.println("Digite outro número");
        num3=s.nextDouble();
        
        soma=num1+num2+num3;
        
        media=soma/3;
        
        System.out.println("O valor da soma é: "+soma);
        System.out.println("O valor da medua é: "+media);
     
    }
    
}
