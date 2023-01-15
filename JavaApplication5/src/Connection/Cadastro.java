
package Connection;

import java.sql.Connection;

import java.sql.SQLException;
import java.lang.Exception;

import javaapplication5.Produto;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class Cadastro {
    
    private  Connection connection;
    
    public Cadastro(){
            connection = SingleConnectionBanco.getConnection();
      }
    
    public  void adicionarProduto(Produto prd) throws SQLException{
        
        try{
            System.out.println(prd.getNome());
        System.err.println("Metodo adicionar foi chamado");
        String sql = "insert into produtos( nome, Preco, Unidade, quantEstoque)VALUES (?, ?, ?, ?)";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                
                statement.setString(1, prd.getNome());
                statement.setInt(2, prd.getPreco());
                statement.setInt(3, prd.getUnidade());
                
                statement.setInt(4, prd.getEstoque());
                System.out.println("Salvando: \n Nome:" + prd.getNome()+"\nPreço" + prd.getPreco()+"\nUnidade" + prd.getUnidade()+"\nQuantidade estique:" + prd.getEstoque());
               statement.execute();

                
                connection.commit();
                 connection.close();
                
            
            }
     
        }catch(SQLException e){
            System.out.println("Deu ruim" + e);
            
    }
        
    }
}
