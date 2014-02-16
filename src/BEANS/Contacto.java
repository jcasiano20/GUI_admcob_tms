package BEANS;

import DAO.Conexion;
import java.sql.ResultSet;
import java.util.ArrayList;


public class Contacto {
    private String c_codcent;
    private String c_tipodoc;
    private String c_nrodoc;
    private String c_tpersona;
    private String c_nombre;
    private String c_direccion;
    private String c_telefono;
    private String c_codpostal;
    private String c_codestado;
    private String c_codprov;
    private String c_coddist;
    private String c_ubigeo;
    private String c_dpto;
    private String c_distprov;
    private String c_tipofono1;
    private String c_prefijo1;
    private String c_fono1;
    private String c_extension1;
    private String c_tipofono2;
    private String c_prefijo2;
    private String c_fono2;
    private String c_extension2;
    private String c_tipofono3;
    private String c_prefijo3;
    private String c_fono3;
    private String c_extension3;
    private String c_tipofono4;
    private String c_prefijo4;
    private String c_fono4;
    private String c_extension4;
    private String c_tipofono5;
    private String c_prefijo5;
    private String c_fono5;
    private String c_extension5;
    private String c_email;
    private String id_idxreg;
    private String f_fecing;
    private String c_tipo;
    private String c_prefijo;
    private String c_numero;
    private String c_anexo;
    private String c_coddepa;
    private String c_desdist;
    private String c_flgimp;
    private String c_tipfono;
    private String c_destipo;
    private String f_fecasig;
    private String f_fproceso;
    private String n_idxges;
    private String id_codtges;
    private String c_destges;

    

    public String elimina_direccion(String c_codcent)throws Exception{
    Conexion co=new Conexion();
    String cadena="DELETE FROM contacto_direccion WHERE c_codcent='" + c_codcent + "'";
    return co.Ejecutar(cadena);
    }
    
    public String inserta_contacto_telefono(String c_codcent, String f_fecing, String c_tipo,
    String c_prefijo, String c_numero, String c_anexo)throws Exception{
    Conexion co=new Conexion();
    String cadena=" { call USQ_INS_CONTACTO_TELEFONO(" + c_codcent + "," + f_fecing + "," + c_tipo + "," +
    c_prefijo + "," + c_numero + "," + c_anexo + ") }";
    return co.Ejecutar(cadena);
    }

    public String inserta_contacto_direccion(String c_codcent, String f_fecing, String c_coddepa,
    String c_codprov, String c_coddist, String c_direccion, String c_flgimp)throws Exception{
    Conexion co=new Conexion();
    String cadena=" { call USP_INS_CONTACTO_DIRECCION(" + c_codcent + "," + f_fecing + "," + c_coddepa + "," +
    c_codprov + "," + c_coddist + "," + c_direccion + "," + c_flgimp + ") }";
    return co.Ejecutar(cadena);
    }

    public String elimina_telefono(String c_codcent)throws Exception{
    Conexion co=new Conexion();
    String cadena="DELETE FROM contacto_telefono WHERE c_codcent='" + c_codcent + "'";
    return co.Ejecutar(cadena);
    }

    public ArrayList contacto_gestion_historia(String c_codcent, String f_fproceso,
    String id_codper) throws Exception{
    Conexion co=new Conexion();
    ArrayList lista=new ArrayList();
    ResultSet rs=co.listar(" select * from USP_QRY_CONTACTO_HIST('" + c_codcent + "','" +
    f_fproceso + "','" +  id_codper + "') ");
    Contacto con=new Contacto();
    while(rs.next()){
    con=new Contacto();
    con.setF_fecasig(rs.getString("f_fecasig"));
    con.setF_fproceso(rs.getString("f_fproceso"));
    con.setC_codcent(rs.getString("c_codcent"));
    con.setN_idxges(rs.getString("n_idxges"));
    con.setId_codtges(rs.getString("id_codtges"));
    con.setC_destges(rs.getString("c_destges"));
    con.setC_tipodoc(rs.getString("c_tipodoc"));
    con.setC_nrodoc(rs.getString("c_nrodoc"));
    con.setC_tpersona(rs.getString("c_tpersona"));
    con.setC_nombre(rs.getString("c_nombre"));
    lista.add(con);
    }return lista;
    }

    public ArrayList registro_contacto(String c_codcent) throws Exception{
    Conexion co=new Conexion();
    ArrayList lista=new ArrayList();    
    ResultSet rs=co.listar(" select * from USP_QRY_REG_CONTACTO('" + c_codcent + "') ");
    Contacto con=new Contacto();
    while(rs.next()){
    con=new Contacto();
    con.setC_codcent(rs.getString("c_codcent"));
    con.setC_tipodoc(rs.getString("c_tipodoc"));
    con.setC_nrodoc(rs.getString("c_nrodoc"));
    con.setC_tpersona(rs.getString("c_tpersona"));
    con.setC_nombre(rs.getString("c_nombre"));
    con.setC_direccion(rs.getString("c_direccion"));
    con.setC_telefono(rs.getString("c_telefono"));
    con.setC_codpostal(rs.getString("c_codpostal"));
    con.setC_codestado(rs.getString("c_codestado"));
    con.setC_codprov(rs.getString("c_codprov"));
    con.setC_coddist(rs.getString("c_coddist"));
    con.setC_ubigeo(rs.getString("c_ubigeo"));
    con.setC_dpto(rs.getString("c_dpto"));
    con.setC_distprov(rs.getString("c_distprov"));
    con.setC_tipofono1(rs.getString("c_tipofono1"));
    con.setC_prefijo1(rs.getString("c_prefijo1"));
    con.setC_fono1(rs.getString("c_fono1"));
    con.setC_extension1(rs.getString("c_extension1"));
    con.setC_tipofono2(rs.getString("c_tipofono2"));
    con.setC_prefijo2(rs.getString("c_prefijo2"));
    con.setC_fono2(rs.getString("c_fono2"));
    con.setC_extension2(rs.getString("c_extension2"));
    con.setC_tipofono3(rs.getString("c_tipofono3"));
    con.setC_prefijo3(rs.getString("c_prefijo3"));
    con.setC_fono3(rs.getString("c_fono3"));
    con.setC_extension3(rs.getString("c_extension3"));
    con.setC_tipofono4(rs.getString("c_tipofono4"));
    con.setC_prefijo4(rs.getString("c_prefijo4"));
    con.setC_fono4(rs.getString("c_fono4"));
    con.setC_extension4(rs.getString("c_extension4"));
    con.setC_tipofono5(rs.getString("c_tipofono5"));
    con.setC_prefijo5(rs.getString("c_prefijo5"));
    con.setC_fono5(rs.getString("c_fono5"));
    con.setC_extension5(rs.getString("c_extension5"));
    con.setC_email(rs.getString("c_email"));
    lista.add(con);
    }return lista;
    }


    public ArrayList contacto_telefono(String c_codcent) throws Exception{
    Conexion co=new Conexion();
    ArrayList lista=new ArrayList();
    ResultSet rs=co.listar(" SELECT * FROM contacto_telefono where c_codcent='" + c_codcent + "'");
    Contacto con=new Contacto();
    while(rs.next()){
    con=new Contacto();
    con.setC_codcent(rs.getString("c_codcent"));
    con.setId_idxreg(rs.getString("id_idxreg"));
    con.setF_fecing(rs.getString("f_fecing"));
    con.setC_tipo(rs.getString("c_tipo"));
    con.setC_prefijo(rs.getString("c_prefijo"));
    con.setC_numero(rs.getString("c_numero"));
    con.setC_anexo(rs.getString("c_anexo"));
    lista.add(con);
    }return lista;
    }


    public ArrayList contacto_direccion(String c_codcent) throws Exception{
    Conexion co=new Conexion();
    ArrayList lista=new ArrayList();
    ResultSet rs=co.listar("SELECT cd.c_codcent,cd.id_idxreg,cd.f_fecing,cd.c_coddepa,cd.c_codprov,cd.c_coddist," +
    "cd.c_direccion,ud.c_desdist,cd.c_flgimp FROM contacto_direccion cd,ubigeo_dist ud " +
    "WHERE cd.c_coddepa = ud.c_coddepa AND cd.c_codprov = ud.c_codprov AND " +
    "cd.c_coddist = ud.c_coddist AND cd.c_codcent='" + c_codcent + "'");
    Contacto con=new Contacto();
    while(rs.next()){
    con=new Contacto();
    con.setC_codcent(rs.getString("c_codcent"));
    con.setId_idxreg(rs.getString("id_idxreg"));
    con.setF_fecing(rs.getString("f_fecing"));
    con.setC_coddepa(rs.getString("c_coddepa"));
    con.setC_codprov(rs.getString("c_codprov"));
    con.setC_coddist(rs.getString("c_coddist"));
    con.setC_direccion(rs.getString("c_direccion"));
    con.setC_desdist(rs.getString("c_desdist"));
    con.setC_flgimp(rs.getString("c_flgimp"));
    lista.add(con);
    }return lista;
    }
    
    public ArrayList verificacontactoref(String c_codcent) throws Exception{
    Conexion co=new Conexion();
    ArrayList lista=new ArrayList();
    ResultSet rs=co.listar("SELECT 'n_nroreg'=COUNT(*) FROM CONTACTO_REFI WHERE c_codcent = '" +  
    c_codcent + "'");
    Contacto con=new Contacto();
    while(rs.next()){
    con=new Contacto();
    con.setC_codcent(rs.getString("n_nroreg"));   
    lista.add(con);
    }return lista;
    }


    public ResultSet Consulta_bdteleges(String nro_doc, String c_tipbd)throws Exception{
    Conexion co=new Conexion();    
    String cadena="";
        if(c_tipbd.equals("tel")){
        cadena="usp_qry_telefonica";
        }else if(c_tipbd.equals("ess")){
        cadena="usp_qry_essalud_numdoc";
        }else if(c_tipbd.equals("bon")){
        cadena="usp_qry_bonus";
        }else if(c_tipbd.equals("cmr")){
        cadena="usp_qry_tc_cmr";
        }

      ResultSet rs=co.listar_telegest("SELECT * FROM " + cadena + "('" + nro_doc + "')" );
      return rs;
      }



    public String getC_codcent() {
        return c_codcent;
    }

    public void setC_codcent(String c_codcent) {
        this.c_codcent = c_codcent;
    }

    public String getC_tipodoc() {
        return c_tipodoc;
    }

    public void setC_tipodoc(String c_tipodoc) {
        this.c_tipodoc = c_tipodoc;
    }

    public String getC_nrodoc() {
        return c_nrodoc;
    }

    public void setC_nrodoc(String c_nrodoc) {
        this.c_nrodoc = c_nrodoc;
    }

    public String getC_tpersona() {
        return c_tpersona;
    }

    public void setC_tpersona(String c_tpersona) {
        this.c_tpersona = c_tpersona;
    }

    public String getC_nombre() {
        return c_nombre;
    }

    public void setC_nombre(String c_nombre) {
        this.c_nombre = c_nombre;
    }

    public String getC_direccion() {
        return c_direccion;
    }

    public void setC_direccion(String c_direccion) {
        this.c_direccion = c_direccion;
    }

    public String getC_telefono() {
        return c_telefono;
    }

    public void setC_telefono(String c_telefono) {
        this.c_telefono = c_telefono;
    }

    public String getC_codpostal() {
        return c_codpostal;
    }

    public void setC_codpostal(String c_codpostal) {
        this.c_codpostal = c_codpostal;
    }

    public String getC_codestado() {
        return c_codestado;
    }

    public void setC_codestado(String c_codestado) {
        this.c_codestado = c_codestado;
    }

    public String getC_codprov() {
        return c_codprov;
    }

    public void setC_codprov(String c_codprov) {
        this.c_codprov = c_codprov;
    }

    public String getC_coddist() {
        return c_coddist;
    }

    public void setC_coddist(String c_coddist) {
        this.c_coddist = c_coddist;
    }

    public String getC_ubigeo() {
        return c_ubigeo;
    }

    public void setC_ubigeo(String c_ubigeo) {
        this.c_ubigeo = c_ubigeo;
    }

    public String getC_dpto() {
        return c_dpto;
    }

    public void setC_dpto(String c_dpto) {
        this.c_dpto = c_dpto;
    }

    public String getC_distprov() {
        return c_distprov;
    }

    public void setC_distprov(String c_distprov) {
        this.c_distprov = c_distprov;
    }

    public String getC_tipofono1() {
        return c_tipofono1;
    }

    public void setC_tipofono1(String c_tipofono1) {
        this.c_tipofono1 = c_tipofono1;
    }

    public String getC_prefijo1() {
        return c_prefijo1;
    }

    public void setC_prefijo1(String c_prefijo1) {
        this.c_prefijo1 = c_prefijo1;
    }

    public String getC_fono1() {
        return c_fono1;
    }

    public void setC_fono1(String c_fono1) {
        this.c_fono1 = c_fono1;
    }

    public String getC_extension1() {
        return c_extension1;
    }

    public void setC_extension1(String c_extension1) {
        this.c_extension1 = c_extension1;
    }

    public String getC_tipofono2() {
        return c_tipofono2;
    }

    public void setC_tipofono2(String c_tipofono2) {
        this.c_tipofono2 = c_tipofono2;
    }

    public String getC_prefijo2() {
        return c_prefijo2;
    }

    public void setC_prefijo2(String c_prefijo2) {
        this.c_prefijo2 = c_prefijo2;
    }

    public String getC_fono2() {
        return c_fono2;
    }

    public void setC_fono2(String c_fono2) {
        this.c_fono2 = c_fono2;
    }

    public String getC_extension2() {
        return c_extension2;
    }

    public void setC_extension2(String c_extension2) {
        this.c_extension2 = c_extension2;
    }

    public String getC_tipofono3() {
        return c_tipofono3;
    }

    public void setC_tipofono3(String c_tipofono3) {
        this.c_tipofono3 = c_tipofono3;
    }

    public String getC_prefijo3() {
        return c_prefijo3;
    }

    public void setC_prefijo3(String c_prefijo3) {
        this.c_prefijo3 = c_prefijo3;
    }

    public String getC_fono3() {
        return c_fono3;
    }

    public void setC_fono3(String c_fono3) {
        this.c_fono3 = c_fono3;
    }

    public String getC_extension3() {
        return c_extension3;
    }

    public void setC_extension3(String c_extension3) {
        this.c_extension3 = c_extension3;
    }

    public String getC_tipofono4() {
        return c_tipofono4;
    }

    public void setC_tipofono4(String c_tipofono4) {
        this.c_tipofono4 = c_tipofono4;
    }

    public String getC_prefijo4() {
        return c_prefijo4;
    }

    public void setC_prefijo4(String c_prefijo4) {
        this.c_prefijo4 = c_prefijo4;
    }

    public String getC_fono4() {
        return c_fono4;
    }

    public void setC_fono4(String c_fono4) {
        this.c_fono4 = c_fono4;
    }

    public String getC_extension4() {
        return c_extension4;
    }

    public void setC_extension4(String c_extension4) {
        this.c_extension4 = c_extension4;
    }

    public String getC_tipofono5() {
        return c_tipofono5;
    }

    public void setC_tipofono5(String c_tipofono5) {
        this.c_tipofono5 = c_tipofono5;
    }

    public String getC_prefijo5() {
        return c_prefijo5;
    }

    public void setC_prefijo5(String c_prefijo5) {
        this.c_prefijo5 = c_prefijo5;
    }

    public String getC_fono5() {
        return c_fono5;
    }

    public void setC_fono5(String c_fono5) {
        this.c_fono5 = c_fono5;
    }

    public String getC_extension5() {
        return c_extension5;
    }

    public void setC_extension5(String c_extension5) {
        this.c_extension5 = c_extension5;
    }

    public String getC_email() {
        return c_email;
    }

    public void setC_email(String c_email) {
        this.c_email = c_email;
    }

    /**
     * @return the id_idxreg
     */
    public String getId_idxreg() {
        return id_idxreg;
    }

    /**
     * @param id_idxreg the id_idxreg to set
     */
    public void setId_idxreg(String id_idxreg) {
        this.id_idxreg = id_idxreg;
    }

    /**
     * @return the f_fecing
     */
    public String getF_fecing() {
        return f_fecing;
    }

    /**
     * @param f_fecing the f_fecing to set
     */
    public void setF_fecing(String f_fecing) {
        this.f_fecing = f_fecing;
    }

    /**
     * @return the c_tipo
     */
    public String getC_tipo() {
        return c_tipo;
    }

    /**
     * @param c_tipo the c_tipo to set
     */
    public void setC_tipo(String c_tipo) {
        this.c_tipo = c_tipo;
    }

    /**
     * @return the c_prefijo
     */
    public String getC_prefijo() {
        return c_prefijo;
    }

    /**
     * @param c_prefijo the c_prefijo to set
     */
    public void setC_prefijo(String c_prefijo) {
        this.c_prefijo = c_prefijo;
    }

    /**
     * @return the c_numero
     */
    public String getC_numero() {
        return c_numero;
    }

    /**
     * @param c_numero the c_numero to set
     */
    public void setC_numero(String c_numero) {
        this.c_numero = c_numero;
    }

    /**
     * @return the c_anexo
     */
    public String getC_anexo() {
        return c_anexo;
    }

    /**
     * @param c_anexo the c_anexo to set
     */
    public void setC_anexo(String c_anexo) {
        this.c_anexo = c_anexo;
    }

    /**
     * @return the c_coddepa
     */
    public String getC_coddepa() {
        return c_coddepa;
    }

    /**
     * @param c_coddepa the c_coddepa to set
     */
    public void setC_coddepa(String c_coddepa) {
        this.c_coddepa = c_coddepa;
    }

    /**
     * @return the c_desdist
     */
    public String getC_desdist() {
        return c_desdist;
    }

    /**
     * @param c_desdist the c_desdist to set
     */
    public void setC_desdist(String c_desdist) {
        this.c_desdist = c_desdist;
    }

    /**
     * @return the c_flgimp
     */
    public String getC_flgimp() {
        return c_flgimp;
    }

    /**
     * @param c_flgimp the c_flgimp to set
     */
    public void setC_flgimp(String c_flgimp) {
        this.c_flgimp = c_flgimp;
    }

    /**
     * @return the c_tipfono
     */
    public String getC_tipfono() {
        return c_tipfono;
    }

    /**
     * @param c_tipfono the c_tipfono to set
     */
    public void setC_tipfono(String c_tipfono) {
        this.c_tipfono = c_tipfono;
    }

    /**
     * @return the c_destipo
     */
    public String getC_destipo() {
        return c_destipo;
    }

    /**
     * @param c_destipo the c_destipo to set
     */
    public void setC_destipo(String c_destipo) {
        this.c_destipo = c_destipo;
    }

    /**
     * @return the f_fecasig
     */
    public String getF_fecasig() {
        return f_fecasig;
    }

    /**
     * @param f_fecasig the f_fecasig to set
     */
    public void setF_fecasig(String f_fecasig) {
        this.f_fecasig = f_fecasig;
    }

    /**
     * @return the f_fproceso
     */
    public String getF_fproceso() {
        return f_fproceso;
    }

    /**
     * @param f_fproceso the f_fproceso to set
     */
    public void setF_fproceso(String f_fproceso) {
        this.f_fproceso = f_fproceso;
    }

    /**
     * @return the n_idxges
     */
    public String getN_idxges() {
        return n_idxges;
    }

    /**
     * @param n_idxges the n_idxges to set
     */
    public void setN_idxges(String n_idxges) {
        this.n_idxges = n_idxges;
    }

    /**
     * @return the id_codtges
     */
    public String getId_codtges() {
        return id_codtges;
    }

    /**
     * @param id_codtges the id_codtges to set
     */
    public void setId_codtges(String id_codtges) {
        this.id_codtges = id_codtges;
    }

    /**
     * @return the c_destges
     */
    public String getC_destges() {
        return c_destges;
    }

    /**
     * @param c_destges the c_destges to set
     */
    public void setC_destges(String c_destges) {
        this.c_destges = c_destges;
    }


}
