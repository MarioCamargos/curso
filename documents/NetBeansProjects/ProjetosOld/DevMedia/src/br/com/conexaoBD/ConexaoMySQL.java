package br.com.conexaoBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoMySQL {
    public static String status = "Não conectou...";
    public static java.sql.Connection getConeConnection(){
        Connection connection=null;
        try{
            String driverName="com.mysql.jdbc.Driver";
            Class.forName(driverName);
            
            //configurando a nossa conexão com Banco de Dados
            String serverName="localhost";
            String myDataBase="mysql";
            String url="jdbc:mysql://"+serverName+"/"+myDataBase;
            String username="root";
            String password="1234";
            connection=DriverManager.getConnection(url,username,password);
            
            //testar conexão
            if(connection!=null){
                status=("STATUS-->nÃO FOI POSSÍVEL REALIZAR A CONEXÃO");
            }else{
                status=("STATUS-->nÃO FOI POSSÍVEL REALIZAR CONEXÃO!");
            }
            return connection;
        }catch(ClassNotFoundException e){
            System.out.println("O Driver especificado não foi encontrado!");
             return null;
        }  catch(SQLException e){
            System.out.println("Não foi possível conectar ao banco de dados");
        }   return null;
    }
    public static String statusConnection(){
    return status;
    }
    public  static boolean FecharConexao(){
        try{
            ConexaoMySQL.getConeConnection().close();
            return true;
        }catch(SQLException e){
            return false;
        }
    }
    public static java.sql.Connection ReiniciarConexao(){
        FecharConexao();
        return ConexaoMySQL.getConeConnection();
    }
}


