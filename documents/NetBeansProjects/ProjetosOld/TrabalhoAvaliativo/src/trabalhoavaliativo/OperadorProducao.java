
package trabalhoavaliativo;

public class OperadorProducao extends Funcionario{

    @Override
    public double calcularHoraExtra(double quantidadeDeHoras) {
    
        return getSalario() / 220 *1.80 * quantidadeDeHoras;
    }
    
}
