package BEANS;

import DAO.Conexion;
import java.sql.*;
import java.util.ArrayList;


public class Periodo {
    private String id_codper;
    private String c_desper;
    private String c_codest;


    public String Grabar_periodo(String id_codper, String c_desper,
    String c_codest, String Accion) throws Exception{
    Conexion co=new Conexion();
    String cadena="";
    if(Accion.equals("new")){
    cadena="INSERT INTO periodo VALUES('" + id_codper + "','" + c_desper +
    "',CAST(now() AS date),'" + c_codest + "')";
    }else{
    cadena="UPDATE periodo SET id_codper='" + id_codper + "',c_desper='" + c_desper +
    "',c_codest='" + c_codest + "' WHERE id_codper='" + id_codper + "'";
    }    
    return co.Ejecutar(cadena);
    }

    public ArrayList periodos() throws Exception{
    Conexion co=new Conexion();
    ArrayList lista=new ArrayList();
    ResultSet rs=co.listar("SELECT id_codper,c_desper,c_codest FROM periodo");
    Periodo per=new Periodo();
    while(rs.next()){
    per=new Periodo();
    per.setId_codper(rs.getString("id_codper"));
    per.setC_desper(rs.getString("c_desper"));
    per.setC_codest(rs.getString("c_codest"));
    lista.add(per);
    }return lista;
    }

    public ArrayList listado_periodos() throws  Exception{
    Conexion co=new Conexion();
    ArrayList lista=new ArrayList();
    String cadena="select id_codper,c_desper from periodo where c_codest='ACT' " +
    " order by f_fecing desc";
    ResultSet rs=co.listar(cadena);
    Periodo per=new Periodo();   
    while(rs.next()){
    per=new Periodo();
    per.setId_codper(rs.getString("id_codper"));
    per.setC_desper(rs.getString("c_desper"));
    lista.add(per);
    }return lista;    
    }

    public String getId_codper() {
        return id_codper;
    }

    public void setId_codper(String id_codper) {
        this.id_codper = id_codper;
    }

    public String getC_desper() {
        return c_desper;
    }

    public void setC_desper(String c_desper) {
        this.c_desper = c_desper;
    }

    /**
     * @return the c_codest
     */
    public String getC_codest() {
        return c_codest;
    }

    /**
     * @param c_codest the c_codest to set
     */
    public void setC_codest(String c_codest) {
        this.c_codest = c_codest;
    }

}
