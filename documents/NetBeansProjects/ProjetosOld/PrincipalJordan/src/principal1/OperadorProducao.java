
package principal1;


public class OperadorProducao extends Funcionario{
  
    
    @Override
    public void calcularHoraExtra(){
        return getsalario()/220*1.80*quantidadeDeHoras;   
    }

    void calcularhoraextra() {
       return getsalario()/220*1.80*quantidadeDeHoras;     }
    
}
