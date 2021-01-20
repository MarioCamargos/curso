
package principal1;


public class Secretaria extends Funcionario {

    @Override
    public void calcularHoraExtra(){
    return getsalario()/220*1.60*quantidadeDeHoras;        
    }

    void calcularhoraextra() {
        return getsalario()/220*1.60*quantidadeDeHoras;   
    }
    
}
