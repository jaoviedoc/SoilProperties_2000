
package Frames;


import java.sql.*;

public class ConexionBD {
    Connection cn;
    
    public Connection conexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost/soilproperties","root","");
            System.out.print("Se hizo la conexion exitosa");
        }catch(ClassNotFoundException | SQLException e){
            System.out.println(e.getMessage());
        }return cn;
    }
    
    Statement createStatement(){
        throw new UnsupportedOperationException("No Soportado");
    }
}
