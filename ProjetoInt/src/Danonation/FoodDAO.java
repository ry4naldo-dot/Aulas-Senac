
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
public class FoodDAO {
    
    private Connection connection;
    public FoodDAO() throws SQLException{
        
        connection = ConnectionDB.getConnection();
        
    }
    
    //LocalDate dataAtual = LocalDate.now();
    
    // CREATE
    public int InserirFood(Food food){
        try{
            
            String sql = "Insert into food (nomeDoador,comida, peso,dataValida,inf_id) values(?,?,?,?,?)";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, food.getNomeF());
            stmt.setString(2, food.getComida());
            stmt.setDouble(3, food.getPeso());
            stmt.setString(4, food.getDataFstring());
            stmt.setString(5, food.getInfID());
            stmt.execute();
            
            return 1;
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
            return 0;
            
        }
    }
    
    // SELECT / READ usuario
    public List<Food> getFood(){
        
        List<Food> foods = new ArrayList<>();
        
        try{
            
            String sql = "select * from food";
            PreparedStatement stmt = connection.prepareStatement(sql);
            
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                
                int id = rs.getInt("id");
                String nomeDoador = rs.getString("nomeDoador");
                String comida = rs.getString("comida");
                double peso = rs.getDouble("peso");
                String dataValidade = rs.getString("dataValida");
                String inf_id = rs.getString("inf_id");
                
                foods.add(new Food(id, nomeDoador, comida, peso,dataValidade, inf_id));
                
            }
            
        }catch(SQLException e){
            
            e.printStackTrace();
            
        }
        return foods;
    }
    
    //UPDATE
    public int updateFood(Food food){
        
        try{
            
            String sql = "update food set nomeDoador=?, comida=?,peso=?,dataValida=?,inf_id=? where id=?";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, food.getNomeF());
            stmt.setString(2, food.getComida());
            stmt.setDouble(3, food.getPeso());
            stmt.setString(4, food.getDataFstring());
            stmt.setString(5, food.getInfID());
            stmt.setInt(6, food.getId());
            stmt.executeUpdate();
            return 1;
            
        }catch(SQLException e){
            
            return 0;
        }
    }
    
}
