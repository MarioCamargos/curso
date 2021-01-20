/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.beans;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modeloConnection.ConexaoBD;

/**
 *
 * @author Mário
 */
public class DaoUsuario {
        ConexaoBD conex=new ConexaoBD();
    BeansUsuario mod= new BeansUsuario();
     public void Salvar(BeansUsuario mod){
        conex.conexao();
        try {
            PreparedStatement pst=conex.con.prepareStatement("INSERT INTO usuarios(usu_name, usu_tipo, usu_senha) VALUES(?, ?, ?)");
            pst.setString(1, mod.getUsuNome());
            pst.setString(2, mod.getUsuTipo());
            pst.setString(3, mod.getUsuSenha());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Usuario inserido com successifuly!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao inserir usuario!"+ex);
        }
        conex.desconecta();
        
    }
    public void excluir(BeansUsuario mod){
        conex.conexao();
        try {
            PreparedStatement pst=conex.con.prepareStatement("delete from medicos where id=?");
            pst.setInt(1, mod.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados excluídos com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir os dados\nErro: "+ex);
        }
        
        conex.desconecta();
    }
    public BeansUsuario buscaUsuario(BeansUsuario mod){
        conex.conexao();
        conex.executaSql("select * from usuarios where usu_nome like '%"+mod.getUsuPesquisar()+"%'");
        try {
            conex.rs.first();
            mod.setCodigo(conex.rs.getInt("usu_cod"));
            mod.setUsuNome(conex.rs.getString("usu_nome"));
            mod.setUsuTipo(conex.rs.getString("usu_tipo"));
            mod.setUsuSenha(conex.rs.getString("usu_senha"));
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Usuario não cadastrado!"+ex);
        }
        conex.desconecta();
        return mod;
    }
}
