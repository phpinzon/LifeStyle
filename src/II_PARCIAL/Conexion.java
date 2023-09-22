
package II_PARCIAL;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author pedro
 */
public class Conexion {
    Connection con; 
    
    public Conexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bdnegocio", "root", "");
        }catch (Exception e){
            System.out.println("No se puede establecer coneccion con la base de datos. Error "+e);
        }
    }
    public Connection getConnection(){
        return con;
    }
}
