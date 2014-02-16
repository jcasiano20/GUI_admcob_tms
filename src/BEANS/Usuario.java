
package BEANS;

import DAO.Conexion;
import java.sql.*;
import java.util.ArrayList;

public class Usuario {
    private String id_codusu;
    private String c_nomusu;
    private String c_passusu;
    private String c_tipusu;
    private String c_codest;

    public String graba_usuario(String id_codusu, String c_nomusu, String c_passusu ,
    String c_tipusu, String c_codest, String c_acc) throws Exception{
    Conexion co=new Conexion();
    String cadena="";
    if(c_acc.equals("new")){
      cadena="{ call USP_INS_USUARIO('" + id_codusu + "','" + c_nomusu + "','" +
      c_passusu + "','" + c_tipusu + "','" + c_codest + "')}";
    }else{
      cadena="{ call USP_UPD_USUARIO('" + id_codusu + "','" + c_nomusu + "','" +
      c_passusu + "','" + c_tipusu + "','" + c_codest + "')}";
    }
    return co.Ejecutar(cadena);
    }

    public ArrayList logueo(String id_codusu,String pass) throws Exception{
    Conexion co=new Conexion();  
    ArrayList lista=new ArrayList();
    ResultSet rs=co.listar("select id_codusu,c_nomusu from usuario where id_codusu='" + id_codusu + "' and " +
    "c_passusu='" + pass + "' and c_tipusu='ADM' and c_codest='ACT'");
    Usuario usu=new Usuario();
    while(rs.next()){
    usu=new Usuario();
    usu.setId_codusu(rs.getString("id_codusu"));
    usu.setC_nomusu(rs.getString("c_nomusu"));
    lista.add(usu);
    }return lista;
    }

    public String Nombre_usuario(String c_codusu) throws Exception{
    Conexion co=new Conexion();
    String cad="select c_nomusu from usuario where id_codusu='" + c_codusu + "'";
    return co.Nomusu(cad);
    }

    public ArrayList listado_teleoperadores() throws Exception{
    Conexion co=new Conexion();
    ArrayList lista=new ArrayList();
    ResultSet rs=co.listar("select id_codusu,c_nomusu from usuario where " +
    " c_codest='ACT' and c_tipusu='GES'");
    Usuario usu=new Usuario();
    while(rs.next()){
    usu=new Usuario();
    usu.setId_codusu(rs.getString("id_codusu"));
    usu.setC_nomusu(rs.getString("c_nomusu"));
    lista.add(usu);
    }return lista;
    }


    public ArrayList listado_usuarios() throws Exception{
    Conexion co=new Conexion();
    ArrayList lista=new ArrayList();
    ResultSet rs=co.listar("SELECT id_codusu,c_nomusu,c_passusu,c_tipusu,c_codest " +
    " FROM usuario WHERE c_tipusu IN ('GES','ADM')");
    Usuario usu=new Usuario();
    while(rs.next()){
    usu=new Usuario();
    usu.setId_codusu(rs.getString("id_codusu"));
    usu.setC_nomusu(rs.getString("c_nomusu"));
    usu.setC_passusu(rs.getString("c_passusu"));
    usu.setC_tipusu(rs.getString("c_tipusu"));
    usu.setC_codest(rs.getString("c_codest"));
    lista.add(usu);
    }return lista;
    }

    public String getId_codusu() {
        return id_codusu;
    }

    public void setId_codusu(String id_codusu) {
        this.id_codusu = id_codusu;
    }

    public String getC_nomusu() {
        return c_nomusu;
    }

    public void setC_nomusu(String c_nomusu) {
        this.c_nomusu = c_nomusu;
    }

    public String getC_passusu() {
        return c_passusu;
    }

    public void setC_passusu(String c_passusu) {
        this.c_passusu = c_passusu;
    }

    public String getC_tipusu() {
        return c_tipusu;
    }

    public void setC_tipusu(String c_tipusu) {
        this.c_tipusu = c_tipusu;
    }

    public String getC_codest() {
        return c_codest;
    }

    public void setC_codest(String c_codest) {
        this.c_codest = c_codest;
    }
   
}
