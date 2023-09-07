
package projectdbjava17;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.Dbcon;


public class ProjectDbJava17 {


    public static void main(String[] args) {
        Dbcon con=new Dbcon();
        
        String sql="insert into students(name,age) values(?,?)";
        
        try {
            PreparedStatement ps=con.getCon().prepareStatement(sql);
            
            ps.setString(1,"Sabit");
            ps.setInt(2,21);
            
            ps.executeUpdate();
            System.out.println("Ok");
            
        } catch (SQLException ex) {
            Logger.getLogger(ProjectDbJava17.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
