/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDao;

import modeloConnection.ConexaoBD;
import modelo.beans.BeansMedico;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Mário
 */
public class DaoMedico {
    ConexaoBD conex=new ConexaoBD();
    BeansMedico mod= new BeansMedico();
    public void excluir(BeansMedico mod){
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
    
    public void Salvar(BeansMedico mod){
        conex.conexao();
        try {
            PreparedStatement pst=conex.con.prepareStatement("INSERT INTO medicos(nome, especialidade_medico, crm) VALUES(?, ?, ?)");
            pst.setString(1, mod.getNome());
            pst.setString(2, mod.getEspecialidade());
            pst.setString(3, mod.getCrm());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados inseridos com successifuly!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao inserir"+ex);
        }
        conex.desconecta();
        
    }
    public void editar(BeansMedico mod){
        conex.conexao();
        try {
            PreparedStatement pst=conex.con.prepareStatement("update medicos set nome=?, especialidade_medico=?, crm=? where id=?");
            pst.setString(1, mod.getNome());
            pst.setString(2, mod.getEspecialidade());
            pst.setString(3, mod.getCrm());
            pst.setInt(4, mod.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na alteração dos dados!\nErro: "+ex);
        }
        conex.desconecta();
    }
    public BeansMedico buscaMedico(BeansMedico mod){
        conex.conexao();
        conex.executaSql("select * from medicos where nome like '%"+mod.getPesquisa()+"%'");
        try {
            conex.rs.first();
            mod.setCodigo(conex.rs.getInt("id"));
            mod.setNome(conex.rs.getString("nome"));
            mod.setEspecialidade(conex.rs.getString("especialidade_medico"));
            mod.setCrm(conex.rs.getString("crm"));
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Medico não cadastrado!"+ex);
        }
        conex.desconecta();
        return mod;
    }
}
