
package principal;

public class LivroPesquisa extends Livro{
    @Override
    public void mostrarDetalhes(){
        System.out.println("Livro: "+getTitulo());
        System.out.println("Não é permitido fazer empréstimo!");
    }
}
