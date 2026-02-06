
package projetoint;

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
    public int InserirDoacao(Doador doacao){
        try{
            
            String sql = "Insert into informacoes (nome_doador,sobrenome_doador,numeroT,itemNome,quantidade,dataValida) values(?,?,?,?,?,?)";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, doacao.getNome());
            stmt.setString(2, doacao.getSobrenome());
            stmt.setString(3, doacao.getNumero());
            stmt.setString(4, doacao.getItem());
            stmt.setString(5, doacao.getQuant());
            stmt.setString(6, doacao.getDatastring());
            stmt.execute();
            
            return 1;
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
            return 0;
            
        }
    }
    
    // SELECT / READ usuario
    public List<Doador> getDoacoes(){
        
        List<Doador> doacoes = new ArrayList<>();
        
        try{
            
            String sql = "select * from informacoes";
            PreparedStatement stmt = connection.prepareStatement(sql);
            
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                
                int id = rs.getInt("id");
                String nome_doador = rs.getString("nome_doador");
                String sobrenome_doador = rs.getString("sobrenome_doador");
                String numeroT = rs.getString("numeroT");
                String itemNome = rs.getString("itemNome");
                String quantidade = rs.getString("quantidade");
                String dataValidade = rs.getString("dataValida");
                
                doacoes.add(new Doador(id, nome_doador, sobrenome_doador, numeroT, itemNome, quantidade,dataValidade));
                
            }
            
        }catch(SQLException e){
            
            e.printStackTrace();
            
        }
        return doacoes;
    }
    
    //UPDATE
    public int updateDoacao(Doador doacao){
        
        try{
            
            String sql = "update informacoes set nome_doador=?, sobrenome_doador=?,numeroT=?,itemNome=?,quantidade,dataValida where id=?";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, doacao.getNome());
            stmt.setString(2, doacao.getSobrenome());
            stmt.setString(3, doacao.getNumero());
            stmt.setString(4, doacao.getItem());
            stmt.setString(5, doacao.getQuant());
            stmt.setString(6, doacao.getDatastring());
            stmt.setInt(7, doacao.getId());
            stmt.executeUpdate();
            return 1;
            
        }catch(SQLException e){
            
            return 0;
        }
    }
    
    // DELETE
    /*public void deleteUsuario(int id){
        
        try{
            
            String sql = "delete from usuarios where id=?";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1,id);
            stmt.executeUpdate();
            
        }catch(SQLException e){
            
            e.printStackTrace();
            
        }
    }*/
    
}
