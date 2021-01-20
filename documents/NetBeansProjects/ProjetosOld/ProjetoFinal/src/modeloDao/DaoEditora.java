/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDao;

import modeloConnection.ConexaoBD;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modeloDados.Editora;
import view.Cad_Editora;

/**
 *
 * @author Mário
 */
public class DaoEditora {
    ConexaoBD conex=new ConexaoBD();
    Editora ed=new Editora();
    public void excluir(Editora ed){
        conex.conexao();
        try {
            PreparedStatement pst=conex.con.prepareStatement("delete from cad_editora where id=?");
            pst.setInt(1, ed.getCod());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados excluídos com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir os dados\nErro: "+ex);
        }
        
        conex.desconecta();
    }
    
    public void Salvar(Editora ed){
        conex.conexao();
        try {
            PreparedStatement pst=conex.con.prepareStatement("INSERT INTO cad_editora VALUES(?, ?, ?)");
            pst.setString(1, ed.getNome());
            
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados inseridos com successifuly!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao inserir"+ex);
        }
        conex.desconecta();
        
    }
    public void editar(Editora ed){
        conex.conexao();
        try {
            PreparedStatement pst=conex.con.prepareStatement("update cad_editora set nome=?, especialidade_medico=?, crm=? where id=?");
            pst.setString(1, ed.getNome());
            
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na alteração dos dados!\nErro: "+ex);
        }
        conex.desconecta();
    }
    public Editora editora(Editora mod){
        conex.conexao();
        conex.executaSql("select * from cad_editora where nome like '%"+mod.getPesquisa()+"%'");
        try {
            conex.rs.first();
            mod.setCod(conex.rs.getInt("id"));
            mod.setNome(conex.rs.getString("nome"));

            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Não cadastrado!"+ex);
        }
        conex.desconecta();
        return mod;
    }
}
