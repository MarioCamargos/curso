/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexaoBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



/**
 *
 * @author Mário
 */
public class ConexaoBD {
    public Statement stm;
    public ResultSet rs;
    private String driver="com.mysql.jdbc.Driver";
    private String caminho="jdbc:mysql://127.0.0.1:3306/Biblioteca";
    private String senha="1234";
    private String usuario="root";
    public Connection con;
    public void conexao(){
        System.setProperty("jdbc.Drivers", driver);
        try {
            con=DriverManager.getConnection(caminho, usuario, senha);
            //JOptionPane.showMessageDialog(null, "Conexao efetuada com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar!\n"+ex);
        }
        
    }
    public void executaSql(String sql){
        try {
            stm=con.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
            rs=stm.executeQuery(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro Executa SQL!\n"+ex);
        }
        
    }
    public void desconecta(){
        try{
            con.close();
           // JOptionPane.showMessageDialog(null, "BD desconectado com sucesso!");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao fechar conexao com BD:\n"+ex.getMessage());
        }
    }

   
    
}
