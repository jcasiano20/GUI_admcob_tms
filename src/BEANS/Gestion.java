package BEANS;

import DAO.Conexion;
import java.sql.ResultSet;
import java.util.ArrayList;


public class Gestion {
    private String id_codtres;
    private String c_destres;
    private String id_codrspta_sub;
    private String c_desrspta_sub;
    private String f_fproceso;
    private String c_codcent;
    private String c_nrodoc;
    private String c_nombre;
    private String c_contrato;
    private String n_idxges;
    private String c_destcon;
    private String f_fecresp;
    private String c_destres_sub;
    private String c_obsges;
    private String c_nomusu;
    private String id_codusu;
    private String id_codtcon;
    private String c_tipodoc;
    private String c_direccion;
    private String c_distprov;
    private String c_telefono;
    private String f_fecasig;
    private String c_destges;
    private String id_codtges;
    private String c_codresp_mt;
    private String c_desresp_mt;


    public String numero_ubicado(String c_codcent) throws Exception{
    Conexion co=new Conexion();
    return co.Nomusu("select distinct c_numubi from contrato where c_codcent='" + c_codcent + "'");
    }

    public String graba_gestion_contrato(String c_codcent, String c_contrato, String f_fproceso,
    String f_fecasig, String f_fecmod, int n_idxges , String id_codtges ,
    String id_codtcon, String id_codtres, String id_codtres_sub, String f_fecresp,
    String f_fecrevi, String f_fecprog, String c_obsges, String id_codusu,String n_impprom,
    String c_codresp_mt, String estado_ges, String numubi) throws Exception{
    Conexion co=new Conexion();
    String cadena=" { call USP_UPD_GESTION_CONTRATO3(" + c_codcent + "," + c_contrato + "," +
    f_fproceso + "," + f_fecasig + "," + f_fecmod + "," + n_idxges  + "," + id_codtges + "," +
    id_codtcon + "," + id_codtres + "," + id_codtres_sub + "," + f_fecresp + "," +
    f_fecrevi + "," + f_fecprog + "," + c_obsges + ",'" + id_codusu + "'," + n_impprom + "," +
    c_codresp_mt + "," + estado_ges + "," + numubi + ") }";
    return co.Ejecutar(cadena);
    }

    public ArrayList lista_gestion_contacto(String id_codper, String c_nrodoc,
    String c_nombre, String id_codtges) throws Exception{
    Conexion co=new Conexion();
    ArrayList lista=new ArrayList();
    ResultSet rs=co.listar(" select * from USP_QRY_GESTION_CONTACTO('" + id_codper + "','" + c_nrodoc + "','" +
    c_nombre + "','" + id_codtges + "') ");
    Gestion ges=new Gestion();    
    while(rs.next()){
    ges=new Gestion();
    ges.setC_codcent(rs.getString("c_codcent"));
    ges.setC_tipodoc(rs.getString("c_tipodoc"));
    ges.setC_nrodoc(rs.getString("c_nrodoc"));
    ges.setC_nombre(rs.getString("c_nombre"));
    ges.setC_direccion(rs.getString("c_direccion"));
    ges.setC_distprov(rs.getString("c_distprov"));
    ges.setC_telefono(rs.getString("c_telefono"));
    ges.setF_fproceso(rs.getString("f_fproceso"));
    ges.setF_fecasig(rs.getString("f_fecasig"));
    ges.setC_destges(rs.getString("c_destges"));
    ges.setN_idxges(rs.getString("n_idxges"));
    ges.setId_codusu(rs.getString("id_codusu"));
    ges.setId_codtges(rs.getString("id_codtges"));
    lista.add(ges);
    }return lista;
    }


    public String elimina_registro_llamada(String f_fproceso, String c_contrato, String c_codcent,
    String id_codtcon, String id_codtres, String id_codusu, String n_idxges) throws Exception{
    Conexion co=new Conexion();
    String cad=" { call USP_DEL_GESTION_LLM('" + f_fproceso + "','" + c_contrato + "','" +
    c_codcent + "','" + id_codtcon + "','" + id_codtres + "','" + id_codusu + "','" + n_idxges  + "') } ";    
    return co.Ejecutar(cad);
    }

    public ArrayList gestion_llamada_quitar(String f_fproceso, String id_codper,
    String id_codtcon, String id_codtres, String id_codusu) throws Exception{
    Conexion co=new Conexion();
    ArrayList lista=new ArrayList();
    String cadena=" SELECT * FROM USP_QRY_GESTION_LLM_QUITAR('" + f_fproceso + "','" +
    id_codper + "','" + id_codtcon + "','" + id_codtres + "','" + id_codusu + "') ";
    ResultSet rs=co.listar(cadena);
    Gestion ges=new Gestion();    
    while(rs.next()){
    ges=new Gestion();
    ges.setF_fproceso(rs.getString("f_fproceso"));
    ges.setC_codcent(rs.getString("c_codcent"));
    ges.setC_nrodoc(rs.getString("c_nrodoc"));
    ges.setC_nombre(rs.getString("c_nombre"));
    ges.setC_contrato(rs.getString("c_contrato"));
    ges.setN_idxges(rs.getString("n_idxges"));
    ges.setC_destcon(rs.getString("c_destcon"));
    ges.setC_destres(rs.getString("c_destres"));
    ges.setF_fecresp(rs.getString("f_fecresp"));
    ges.setC_destres_sub(rs.getString("c_destres_sub"));
    ges.setC_obsges(rs.getString("c_obsges"));
    ges.setC_nomusu(rs.getString("c_nomusu"));
    ges.setId_codusu(rs.getString("id_codusu"));
    ges.setId_codtcon(rs.getString("id_codtcon"));
    ges.setId_codtres(rs.getString("id_codtres"));
    lista.add(ges);
    }return lista;
    }

    public ArrayList sub_respuesta_carta(String id_codrspta) throws Exception{
    Conexion co=new Conexion();
    ArrayList lista=new ArrayList();
    ResultSet rs=co.listar("SELECT id_codrspta_sub,c_desrspta_sub FROM rspta_carta " +
    "WHERE c_codest = 'ACT' and id_codrspta like '" + id_codrspta + "' || '%'");
    Gestion ges=new Gestion();
    while(rs.next()){
    ges=new Gestion();
    ges.setId_codrspta_sub(rs.getString("id_codrspta_sub"));
    ges.setC_desrspta_sub(rs.getString("c_desrspta_sub"));
    lista.add(ges);
    }return lista;
    }


    public ArrayList datos_tiposubrespuesta() throws Exception{
    Conexion co=new Conexion();
    ArrayList lista=new ArrayList();
    ResultSet rs=co.listar("select c_codresp_mt, c_desresp_mt from tipo_respuesta_mt " +
    "where c_estregi='ACT'");
    Gestion ges=new Gestion();
    while(rs.next()){
    ges=new Gestion();
    ges.setC_codresp_mt(rs.getString("c_codresp_mt"));
    ges.setC_desresp_mt(rs.getString("c_desresp_mt"));
    lista.add(ges);
    }return lista;
    }


    public ArrayList Respuesta_llam(String id_codtcon) throws  Exception{
    Conexion co=new Conexion();
    ArrayList lista=new ArrayList();
    ResultSet rs=co.listar("select id_codtres,c_destres from tipo_respuesta " +
    "where c_codest='ACT' and id_codtcon like '" + id_codtcon +"' || '%'");
    Gestion llm=new Gestion();
    while(rs.next()){
    llm=new Gestion();
    llm.setId_codtres(rs.getString("id_codtres"));
    llm.setC_destres(rs.getString("c_destres"));
    lista.add(llm);
    }return lista;
    }

    public ArrayList datos_tiposubrespuesta(String id_codtcon, String id_codtres) throws Exception{
    Conexion co=new Conexion();
    ArrayList lista=new ArrayList();
    ResultSet rs=co.listar("SELECT id_codtres_sub,id_codtcon,id_codtres,c_destres_sub FROM tipo_subrspta" +
    " WHERE c_codest='ACT' and id_codtcon='" + id_codtcon + "' AND id_codtres='" + id_codtres + "'");
    Gestion ges=new Gestion();
    while(rs.next()){
    ges=new Gestion();
    ges.setId_codrspta_sub(rs.getString("id_codtres_sub"));
    ges.setC_desrspta_sub(rs.getString("c_destres_sub"));
    lista.add(ges);
    }return lista;
    }


    public String getId_codtres() {
        return id_codtres;
    }

    public void setId_codtres(String id_codtres) {
        this.id_codtres = id_codtres;
    }

    public String getC_destres() {
        return c_destres;
    }

    public void setC_destres(String c_destres) {
        this.c_destres = c_destres;
    }

    public String getId_codrspta_sub() {
        return id_codrspta_sub;
    }

    public void setId_codrspta_sub(String id_codrspta_sub) {
        this.id_codrspta_sub = id_codrspta_sub;
    }

    public String getC_desrspta_sub() {
        return c_desrspta_sub;
    }

    public void setC_desrspta_sub(String c_desrspta_sub) {
        this.c_desrspta_sub = c_desrspta_sub;
    }

    public String getF_fproceso() {
        return f_fproceso;
    }

    public void setF_fproceso(String f_fproceso) {
        this.f_fproceso = f_fproceso;
    }

    public String getC_codcent() {
        return c_codcent;
    }

    public void setC_codcent(String c_codcent) {
        this.c_codcent = c_codcent;
    }

    public String getC_nrodoc() {
        return c_nrodoc;
    }

    public void setC_nrodoc(String c_nrodoc) {
        this.c_nrodoc = c_nrodoc;
    }

    public String getC_nombre() {
        return c_nombre;
    }

    public void setC_nombre(String c_nombre) {
        this.c_nombre = c_nombre;
    }

    public String getC_contrato() {
        return c_contrato;
    }

    public void setC_contrato(String c_contrato) {
        this.c_contrato = c_contrato;
    }

    public String getN_idxges() {
        return n_idxges;
    }

    public void setN_idxges(String n_idxges) {
        this.n_idxges = n_idxges;
    }

    public String getC_destcon() {
        return c_destcon;
    }

    public void setC_destcon(String c_destcon) {
        this.c_destcon = c_destcon;
    }

    public String getF_fecresp() {
        return f_fecresp;
    }

    public void setF_fecresp(String f_fecresp) {
        this.f_fecresp = f_fecresp;
    }

    public String getC_destres_sub() {
        return c_destres_sub;
    }

    public void setC_destres_sub(String c_destres_sub) {
        this.c_destres_sub = c_destres_sub;
    }

    public String getC_obsges() {
        return c_obsges;
    }

    public void setC_obsges(String c_obsges) {
        this.c_obsges = c_obsges;
    }

    public String getC_nomusu() {
        return c_nomusu;
    }

    public void setC_nomusu(String c_nomusu) {
        this.c_nomusu = c_nomusu;
    }

    public String getId_codusu() {
        return id_codusu;
    }

    public void setId_codusu(String id_codusu) {
        this.id_codusu = id_codusu;
    }

    public String getId_codtcon() {
        return id_codtcon;
    }

    public void setId_codtcon(String id_codtcon) {
        this.id_codtcon = id_codtcon;
    }

    /**
     * @return the c_tipodoc
     */
    public String getC_tipodoc() {
        return c_tipodoc;
    }

    /**
     * @param c_tipodoc the c_tipodoc to set
     */
    public void setC_tipodoc(String c_tipodoc) {
        this.c_tipodoc = c_tipodoc;
    }

    /**
     * @return the c_direccion
     */
    public String getC_direccion() {
        return c_direccion;
    }

    /**
     * @param c_direccion the c_direccion to set
     */
    public void setC_direccion(String c_direccion) {
        this.c_direccion = c_direccion;
    }

    /**
     * @return the c_distprov
     */
    public String getC_distprov() {
        return c_distprov;
    }

    /**
     * @param c_distprov the c_distprov to set
     */
    public void setC_distprov(String c_distprov) {
        this.c_distprov = c_distprov;
    }

    /**
     * @return the c_telefono
     */
    public String getC_telefono() {
        return c_telefono;
    }

    /**
     * @param c_telefono the c_telefono to set
     */
    public void setC_telefono(String c_telefono) {
        this.c_telefono = c_telefono;
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
     * @return the c_codresp_mt
     */
    public String getC_codresp_mt() {
        return c_codresp_mt;
    }

    /**
     * @param c_codresp_mt the c_codresp_mt to set
     */
    public void setC_codresp_mt(String c_codresp_mt) {
        this.c_codresp_mt = c_codresp_mt;
    }

    /**
     * @return the c_desresp_mt
     */
    public String getC_desresp_mt() {
        return c_desresp_mt;
    }

    /**
     * @param c_desresp_mt the c_desresp_mt to set
     */
    public void setC_desresp_mt(String c_desresp_mt) {
        this.c_desresp_mt = c_desresp_mt;
    }

   }
