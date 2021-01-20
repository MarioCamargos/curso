
package principal;

public class Livro {
    private String titulo; 
    private int qtdPaginas; 
    private int paginasLidas; 

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getQtdPaginas() {
        return qtdPaginas;
    }

    public void setQtdPaginas(int qtdPaginas) {
        this.qtdPaginas = qtdPaginas;
    }

    public int getPaginasLidas() {
        return paginasLidas;
    }

    public void setPaginasLidas(int paginasLidas) {
        this.paginasLidas = paginasLidas;
    }

    public void mostrarDetalhes(){ 
    System.out.println("O título do livro e: " + getTitulo()); 
    System.out.println("A quantidade de páginas é: "+getQtdPaginas()); 
    System.out.println("A quantidade de páginas lidas são: "+getPaginasLidas()); 
} 

}
