/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhoavaliativo;

/**
 *
 * @author Mário
 */
public class Secretaria extends Funcionario{

    @Override
    public double calcularHoraExtra(double quantidadeDeHoras) {
        
    return getSalario() / 220 *1.60 * quantidadeDeHoras;
        
    }
    
}
