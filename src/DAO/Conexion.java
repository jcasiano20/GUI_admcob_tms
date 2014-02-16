
package DAO;

import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion {
    Connection cn;
    Connection cn2;
    //String user = "telegest";
    //String pass = "telegest2011$";
    String user = "postgres";
    String pass = "linux";
    
    //String url = "jdbc:sqlserver://AKATSUKI-F515FF:1433;databaseName=BDBBVA_TMSV2;";
    //String url = "jdbc:postgresql://192.168.1.200/bdbbva_tmsv2";
    String url = "jdbc:postgresql://127.0.0.1:5432/BDTELEGESTION";
    String url2 = "jdbc:postgresql://127.0.0.1:5432/BDTELEGESTION";

    public Conexion(){
    try{   
    Class.forName("org.postgresql.Driver");
    cn=DriverManager.getConnection(url,user,pass);
    }catch(Exception ioE){
    JOptionPane.showMessageDialog(null, "No se pudo establecer conexion : " + ioE);
    }
    }

    public Connection cone(){
     try{
     Class.forName("org.postgresql.Driver");
     cn2=DriverManager.getConnection(url2,user,pass);
     return cn2;
     }catch(Exception e){
      JOptionPane.showMessageDialog(null, e.getMessage());
      return null;
     }
    }



    public ResultSet listar(String cad){
    try{
    PreparedStatement pt=cn.prepareStatement(cad);
    ResultSet rs=pt.executeQuery();    
    return rs;
    }catch(Exception e){
    JOptionPane.showMessageDialog(null, e.getMessage());
    return null;
    }finally{
        try{
            cn.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    }

    public ResultSet listar_telegest(String cad){
    try{
    PreparedStatement pt=cone().prepareStatement(cad);
    ResultSet rs=pt.executeQuery();
    return rs;
    }catch(Exception e){
    JOptionPane.showMessageDialog(null, e.getMessage());
    return null;
    }finally{
        try{
            cn2.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    }

    public String Ejecutar(String cad){
    try{
    PreparedStatement pt=cn.prepareCall(cad);
    int rs=pt.executeUpdate();    
    return "Total de Registros afectados :" + rs;
    }catch(Exception e){
    JOptionPane.showMessageDialog(null, e.getMessage());
    return null;
    }finally{
        try{
            cn.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    }


    public String Nomusu(String cad){
    String nombre="";
    try{
    PreparedStatement pt=cn.prepareStatement(cad);
    ResultSet rs=pt.executeQuery();
    while(rs.next()){
    nombre=rs.getString(1);
    }return nombre;
    }catch(Exception e){
    JOptionPane.showMessageDialog(null, e.getMessage());
    return null;
    }finally{
        try{
           cn.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    }

}
