
package principal;

public class Principal {

    public static void main(String[] args) {
        Livro l = new Livro();
        l.setQtdPaginas(600);
        l.setTitulo("São Petersburgo");
        l.setPaginasLidas(245);
        l.mostrarDetalhes();
        
        LivroPesquisa lp = new LivroPesquisa();
        lp.setQtdPaginas(800);
        lp.setTitulo("Enciclopédia");
        lp.setPaginasLidas(120);
        lp.mostrarDetalhes();
                
    }
    
}
