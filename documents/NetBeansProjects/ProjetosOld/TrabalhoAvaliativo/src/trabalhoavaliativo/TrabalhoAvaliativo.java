/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhoavaliativo;

import java.util.Scanner;

/**
 *
 * @author Mário
 */
public class TrabalhoAvaliativo {

    public static void main(String[] args) {
        Secretaria s=new Secretaria();
        OperadorProducao op=new OperadorProducao();
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Digite o nome:");
        String nome=sc.nextLine();
        s.setNome(nome);
        System.out.println("Digite o cpf");
        int cpf=sc.nextInt();
        s.setCpf(cpf);
        System.out.println("Digite o salário");
        Double salario=sc.nextDouble();
        s.setSalario(salario);
        System.out.println("Digite a quantidade de horas:");
        Double horas=sc.nextDouble();
        
        System.out.println("Nome: "+nome+"CPF"+cpf+"Salario"+salario+"Valor da hora extra: "+s.calcularHoraExtra(horas));
    }
    
}
