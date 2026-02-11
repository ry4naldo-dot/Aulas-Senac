
package Danonation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
/**
 *
 * @author RYANGABRIELDAROSA
 */
public class DoadorDAO {
    
    private Connection connection;
    public DoadorDAO() throws SQLException{
        
        connection = ConnectionDB.getConnection();
        
    }
    
    //LocalDate dataAtual = LocalDate.now();
    
    // CREATE
    public int InserirDoador(Doador doador){
        try{
            
            String sql = "Insert into doador (nome_doador,sobrenome_doador, idade,numeroT,cpf) values(?,?,?,?,?)";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, doador.getNomeDoa());
            stmt.setString(2, doador.getSobreDoa());
            stmt.setInt(3, doador.getIdade());
            stmt.setString(4, doador.getNumeroT());
            stmt.setString(5, doador.getCpf());
            stmt.execute();
            
            return 1;
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
            return 0;
            
        }
    }
    
    // SELECT / READ usuario
    public List<Doador> getDoador(){
        
        List<Doador> doadores = new ArrayList<>();
        
        try{
            
            String sql = "select * from doador";
            PreparedStatement stmt = connection.prepareStatement(sql);
            
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                
                String nome_doador = rs.getString("nome_doador");
                String sobrenome_doador = rs.getString("sobrenome_doador");
                int idade = rs.getInt("idade");
                String numeroT = rs.getString("numeroT");
                String cpf = rs.getString("cpf");
                
                doadores.add(new Doador(nome_doador, sobrenome_doador, idade,numeroT, cpf));
                
            }
            
        }catch(SQLException e){
            
            e.printStackTrace();
            
        }
        return doadores;
    }
    
    //UPDATE
    public int updateDoador(Doador doador){
        
        try{
            
            String sql = "update doador set nome_doador=?, sobrenome_doador=?,idade=?,numeroT=? where cpf=?";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, doador.getNomeDoa());
            stmt.setString(2, doador.getSobreDoa());
            stmt.setInt(3, doador.getIdade());
            stmt.setString(4, doador.getNumeroT());
            stmt.setString(5, doador.getCpf());
            stmt.executeUpdate();
            return 1;
            
        }catch(SQLException e){
            
            return 0;
        }
    }
    
}
