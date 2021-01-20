
package principal1;

import java.util.Scanner;


public class Principal1 {

    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        Secretaria sec=new Secretaria();
        OperadorProducao op=new OperadorProducao();
        
        
        
        String nome;
        double salario;
        int cargo,cpf;
        
        
        
        
        
        
        
        
        System.out.println("Digite seu nome:");
        nome=sc.nextLine();
       
        System.out.println("Digite seu salario:");
        salario=sc.nextDouble();
       
        System.out.println("Digite seu CPF:");
        cpf=sc.nextInt();
        
        
        
        
        
        
        
        System.out.println("Escolha seu cargo:/n1-Secretaria/n2-Operador de Producao");
        cargo=sc.nextInt();
        
        
        
        
    if (cargo==1){
        sec.calcularHoraExtra(); 
    }
   
    
    else if(cargo==2){
        op.calcularHoraExtra();
    }
    
    
    else{
        System.out.println("Opção invalida");
    }
    
    
    
    
    
        System.out.println("Digite a quantidade de hora extra do mes:");
        calcularHoraExtra=sc.nextline();
        
        
        System.out.println("Informações: \"+getNome()+getCPF()+getSalario()+calcularhoraextra");
    
    
    
    
    
    
    
    }
    }