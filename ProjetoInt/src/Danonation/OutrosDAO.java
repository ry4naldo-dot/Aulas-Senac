
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
public class OutrosDAO {
    
    private Connection connection;
    public OutrosDAO() throws SQLException{
        
        connection = ConnectionDB.getConnection();
        
    }
    
    //LocalDate dataAtual = LocalDate.now();
    
    // CREATE
    public int InserirOutros(Outros outro){
        try{
            
            String sql = "Insert into outros (nomeDoador,itemNome, quantidade,dataValida,inf_id) values(?,?,?,?,?)";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, outro.getNome());
            stmt.setString(2, outro.getItem());
            stmt.setInt(3, outro.getQuantidade());
            stmt.setString(4, outro.getDatastring());
            stmt.setString(5,outro.getInfID());
            stmt.execute();
            
            return 1;
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
            return 0;
            
        }
    }
    
    // SELECT / READ usuario
    public List<Outros> getOutros(){
        
        List<Outros> outros = new ArrayList<>();
        
        try{
            
            String sql = "select * from outros";
            PreparedStatement stmt = connection.prepareStatement(sql);
            
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                
                int id = rs.getInt("id");
                String nomeDoador = rs.getString("nomeDoador");
                String itemNome = rs.getString("itemNome");
                int quantidade = rs.getInt("quantidade");
                String dataValidade = rs.getString("dataValida");
                String inf_id = rs.getString("inf_id");
                
                outros.add(new Outros(id, nomeDoador, itemNome, quantidade,dataValidade, inf_id));
                
            }
            
        }catch(SQLException e){
            
            e.printStackTrace();
            
        }
        return outros;
    }
    
    //UPDATE
    public int updateOutros(Outros outro){
        
        try{
            
            String sql = "update outros set nomeDoador=?, itemNome=?,quantidade=?,dataValida=?,inf_id=? where id=?";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, outro.getNome());
            stmt.setString(2, outro.getItem());
            stmt.setInt(3, outro.getQuantidade());
            stmt.setString(4, outro.getDatastring());
            stmt.setString(5, outro.getInfID());
            stmt.setInt(6, outro.getId());
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
