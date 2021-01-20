/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.beans;

/**
 *
 * @author Mário
 */
public class BeansUsuario {
    private int codigo;
    private String usuNome;
    private String usuTipo;
    private String usuSenha;

    public String getUsuPesquisar() {
        return usuPesquisar;
    }

    public void setUsuPesquisar(String usuPesquisar) {
        this.usuPesquisar = usuPesquisar;
    }
    private String usuPesquisar;

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the usuNome
     */
    public String getUsuNome() {
        return usuNome;
    }

    /**
     * @param usuNome the usuNome to set
     */
    public void setUsuNome(String usuNome) {
        this.usuNome = usuNome;
    }

    /**
     * @return the usuTipo
     */
    public String getUsuTipo() {
        return usuTipo;
    }

    /**
     * @param usuTipo the usuTipo to set
     */
    public void setUsuTipo(String usuTipo) {
        this.usuTipo = usuTipo;
    }

    /**
     * @return the usuSenha
     */
    public String getUsuSenha() {
        return usuSenha;
    }

    /**
     * @param usuSenha the usuSenha to set
     */
    public void setUsuSenha(String usuSenha) {
        this.usuSenha = usuSenha;
    }
    
}
