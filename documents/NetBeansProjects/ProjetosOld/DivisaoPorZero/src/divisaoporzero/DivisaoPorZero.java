package divisaoporzero;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisaoPorZero {
    public static int quociente(int num1, int num2){
        return num1/num2;
    }
    public static void main(String[] args) {
        boolean b=true;
        while(b){
           try{
              
               int n1, n2;
               Scanner s=new Scanner(System.in);
               System.out.println("Digite um número:");
               n1=s.nextInt();
               System.out.println("Digite outro número:");
               n2=s.nextInt();
               int resultado=quociente(n1, n2);
               System.out.println("O resultado é: "+resultado);
               b=false;
               }catch(ArithmeticException arithmeticException){
                   System.out.println("O número não pode ser dividido por 0.");
                   
               }catch(InputMismatchException inputMismatchException){
                   System.err.println("Coloque um inteiro válido!"+inputMismatchException);
               }
        }
    }
    
}
