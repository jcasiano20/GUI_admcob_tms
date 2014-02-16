
package BEANS;

import DAO.Conexion;
import java.sql.ResultSet;
import java.util.ArrayList;


public class Contratos {
    private String f_fecasig;
    private String c_contrato;
    private String c_gestor;
    private String c_territorio;
    private String c_tramodia;
    private String c_subprod;
    private String c_nomsubpro;
    private String c_dessubpro;
    private String c_oficina;
    private String c_nombof;
    private String c_divisa;
    private String n_saldohoy;
    private String f_fincumpli;
    private String n_diasvenc;
    private String c_provision;
    private String c_tarrastre;
    private String n_impprov;
    private String n_deutotobli;
    private String n_deutotclie;
    private String f_fecasig_ult;
    private String c_destcon_ult;
    private String c_destres_ult;
    private String f_fecresp_ult;
    private String f_fecprog_ult;
    private String id_codtcon;
    private String id_codtres;
    private String id_codtres_sub;
    private String f_fecresp;
    private String c_obsges;
    private String f_fecrevi;
    private String f_fecprog;
    private String n_impprom;
    private String c_destres;
    private String c_destcon;
    private String c_destres_sub;
    private String c_codresp_mt;
    private String c_estcuen_mt;
    private String c_numubi;


    public ArrayList contrato_gestion_historia(String f_fproceso, String id_codper, String c_codcent,
    int n_idxges, String f_fecasig, String id_codtges) throws Exception{
    Conexion co=new Conexion();
    ArrayList lista=new ArrayList();
    ResultSet rs=co.listar(" SELECT * FROM USP_QRY_CONTRATO_HIST('" + f_fproceso + "','" + id_codper + "','"
    + c_codcent + "'," + n_idxges + ",'" + f_fecasig + "','" + id_codtges + "') ");
    System.out.println(" SELECT * FROM USP_QRY_CONTRATO_HIST('" + f_fproceso + "','" + id_codper + "','"
    + c_codcent + "'," + n_idxges + ",'" + f_fecasig + "','" + id_codtges + "') ");
    Contratos con=new Contratos();
    while(rs.next()){
    con=new Contratos();
    con.setC_contrato(rs.getString("c_contrato"));
    con.setC_subprod(rs.getString("c_subprod"));
    con.setC_nomsubpro(rs.getString("c_nomsubpro"));
    con.setC_dessubpro(rs.getString("c_dessubpro"));
    con.setC_divisa(rs.getString("c_divisa"));
    con.setN_saldohoy(rs.getString("n_saldohoy"));
    con.setF_fincumpli(rs.getString("f_fincumpli"));
    con.setN_diasvenc(rs.getString("n_diasvenc"));
    con.setN_impprov(rs.getString("n_impprov"));
    con.setN_deutotobli(rs.getString("n_deutotobli"));
    con.setN_deutotclie(rs.getString("n_deutotclie"));
    con.setC_destcon(rs.getString("c_destcon"));
    con.setC_destres(rs.getString("c_destres"));
    con.setF_fecresp(rs.getString("f_fecresp"));
    con.setC_destres_sub(rs.getString("c_destres_sub"));
    con.setC_obsges(rs.getString("c_obsges"));
    con.setC_numubi(rs.getString("c_numubi"));
    lista.add(con);
    }return lista;
    }

    public ArrayList registro_contrato(String c_codcent, String f_fproceso, String id_codtges,
    String n_idxges, String id_codusu) throws Exception{
    Conexion co=new Conexion();
    ArrayList lista=new ArrayList();
    String cadena=" select * from USP_QRY_GES_CONTRATO2('" + c_codcent + "','" + f_fproceso + "','" + id_codtges + "'," +
    n_idxges + ",'" + id_codusu + "') ";
    System.out.println(cadena);
    ResultSet rs=co.listar(cadena);
    Contratos con=new Contratos();
    while(rs.next()){
    con=new Contratos();
    con.setF_fecasig(rs.getString("f_fecasig"));
    con.setC_contrato(rs.getString("c_contrato"));
    con.setC_gestor(rs.getString("c_gestor"));
    con.setC_territorio(rs.getString("c_territorio"));
    con.setC_tramodia(rs.getString("c_tramodia"));
    con.setC_subprod(rs.getString("c_subprod"));
    con.setC_nomsubpro(rs.getString("c_nomsubpro"));
    con.setC_dessubpro(rs.getString("c_dessubpro"));
    con.setC_oficina(rs.getString("c_oficina"));
    con.setC_nombof(rs.getString("c_nombof"));
    con.setC_divisa(rs.getString("c_divisa"));
    con.setN_saldohoy(rs.getString("n_saldohoy"));
    con.setF_fincumpli(rs.getString("f_fincumpli"));
    con.setN_diasvenc(rs.getString("n_diasvenc"));
    con.setC_provision(rs.getString("c_provision"));
    con.setC_tarrastre(rs.getString("c_tarrastre"));
    con.setN_impprov(rs.getString("n_impprov"));
    con.setN_deutotobli(rs.getString("n_deutotobli"));
    con.setN_deutotclie(rs.getString("n_deutotclie"));
    con.setF_fecasig_ult(rs.getString("f_fecasig_ult"));
    con.setC_destcon_ult(rs.getString("c_destcon_ult"));
    con.setC_destres_ult(rs.getString("c_destres_ult"));
    con.setF_fecresp_ult(rs.getString("f_fecresp_ult"));
    con.setF_fecprog_ult(rs.getString("f_fecprog_ult"));
    con.setId_codtcon(rs.getString("id_codtcon"));
    con.setId_codtres(rs.getString("id_codtres"));
    con.setId_codtres_sub(rs.getString("id_codtres_sub"));
    con.setF_fecresp(rs.getString("f_fecresp"));
    con.setC_obsges(rs.getString("c_obsges"));
    con.setF_fecrevi(rs.getString("f_fecrevi"));
    con.setF_fecprog(rs.getString("f_fecprog"));
    con.setN_impprom(rs.getString("n_impprom"));
    con.setC_destres(rs.getString("c_destres"));
    con.setC_codresp_mt(rs.getString("c_codresp_mt"));
    con.setC_estcuen_mt(rs.getString("c_estcuen_mt"));
    lista.add(con);
    }return lista;
    }

    public int verificacontactoref(String c_codcent) throws Exception{
    Conexion co=new Conexion();   
    ResultSet rs=co.listar("SELECT 'n_nroreg'=COUNT(*) FROM CONTACTO_REFI WHERE c_codcent = '" + c_codcent + "'");
    int cantidad=0;
    while(rs.next()){
    cantidad=cantidad + 1;
    }return cantidad;
    }

    public int validaexistecontratoref(String c_contrato) throws Exception{
    Conexion co=new Conexion();   
    ResultSet rs=co.listar("SELECT 'n_nroreg'=COUNT(*) FROM refinanciacion_contrato " +
    "WHERE c_contrato = '" + c_contrato + "'");
    int cantidad=0;
    while(rs.next()){
    cantidad=cantidad + 1;
    }return cantidad;
    }



    public String getF_fecasig() {
        return f_fecasig;
    }

    public void setF_fecasig(String f_fecasig) {
        this.f_fecasig = f_fecasig;
    }

    public String getC_contrato() {
        return c_contrato;
    }

    public void setC_contrato(String c_contrato) {
        this.c_contrato = c_contrato;
    }

    public String getC_gestor() {
        return c_gestor;
    }

    public void setC_gestor(String c_gestor) {
        this.c_gestor = c_gestor;
    }

    public String getC_territorio() {
        return c_territorio;
    }

    public void setC_territorio(String c_territorio) {
        this.c_territorio = c_territorio;
    }

    public String getC_tramodia() {
        return c_tramodia;
    }

    public void setC_tramodia(String c_tramodia) {
        this.c_tramodia = c_tramodia;
    }

    public String getC_subprod() {
        return c_subprod;
    }

    public void setC_subprod(String c_subprod) {
        this.c_subprod = c_subprod;
    }

    public String getC_nomsubpro() {
        return c_nomsubpro;
    }

    public void setC_nomsubpro(String c_nomsubpro) {
        this.c_nomsubpro = c_nomsubpro;
    }

    public String getC_dessubpro() {
        return c_dessubpro;
    }

    public void setC_dessubpro(String c_dessubpro) {
        this.c_dessubpro = c_dessubpro;
    }

    public String getC_oficina() {
        return c_oficina;
    }

    public void setC_oficina(String c_oficina) {
        this.c_oficina = c_oficina;
    }

    public String getC_nombof() {
        return c_nombof;
    }

    public void setC_nombof(String c_nombof) {
        this.c_nombof = c_nombof;
    }

    public String getC_divisa() {
        return c_divisa;
    }

    public void setC_divisa(String c_divisa) {
        this.c_divisa = c_divisa;
    }

    public String getN_saldohoy() {
        return n_saldohoy;
    }

    public void setN_saldohoy(String n_saldohoy) {
        this.n_saldohoy = n_saldohoy;
    }

    public String getF_fincumpli() {
        return f_fincumpli;
    }

    public void setF_fincumpli(String f_fincumpli) {
        this.f_fincumpli = f_fincumpli;
    }

    public String getN_diasvenc() {
        return n_diasvenc;
    }

    public void setN_diasvenc(String n_diasvenc) {
        this.n_diasvenc = n_diasvenc;
    }

    public String getC_provision() {
        return c_provision;
    }

    public void setC_provision(String c_provision) {
        this.c_provision = c_provision;
    }

    public String getC_tarrastre() {
        return c_tarrastre;
    }

    public void setC_tarrastre(String c_tarrastre) {
        this.c_tarrastre = c_tarrastre;
    }

    public String getN_impprov() {
        return n_impprov;
    }

    public void setN_impprov(String n_impprov) {
        this.n_impprov = n_impprov;
    }

    public String getN_deutotobli() {
        return n_deutotobli;
    }

    public void setN_deutotobli(String n_deutotobli) {
        this.n_deutotobli = n_deutotobli;
    }

    public String getN_deutotclie() {
        return n_deutotclie;
    }

    public void setN_deutotclie(String n_deutotclie) {
        this.n_deutotclie = n_deutotclie;
    }

    public String getF_fecasig_ult() {
        return f_fecasig_ult;
    }

    public void setF_fecasig_ult(String f_fecasig_ult) {
        this.f_fecasig_ult = f_fecasig_ult;
    }

    public String getC_destcon_ult() {
        return c_destcon_ult;
    }

    public void setC_destcon_ult(String c_destcon_ult) {
        this.c_destcon_ult = c_destcon_ult;
    }

    public String getC_destres_ult() {
        return c_destres_ult;
    }

    public void setC_destres_ult(String c_destres_ult) {
        this.c_destres_ult = c_destres_ult;
    }

    public String getF_fecresp_ult() {
        return f_fecresp_ult;
    }

    public void setF_fecresp_ult(String f_fecresp_ult) {
        this.f_fecresp_ult = f_fecresp_ult;
    }

    public String getF_fecprog_ult() {
        return f_fecprog_ult;
    }

    public void setF_fecprog_ult(String f_fecprog_ult) {
        this.f_fecprog_ult = f_fecprog_ult;
    }

    public String getId_codtcon() {
        return id_codtcon;
    }

    public void setId_codtcon(String id_codtcon) {
        this.id_codtcon = id_codtcon;
    }

    public String getId_codtres() {
        return id_codtres;
    }

    public void setId_codtres(String id_codtres) {
        this.id_codtres = id_codtres;
    }

    public String getId_codtres_sub() {
        return id_codtres_sub;
    }

    public void setId_codtres_sub(String id_codtres_sub) {
        this.id_codtres_sub = id_codtres_sub;
    }

    public String getF_fecresp() {
        return f_fecresp;
    }

    public void setF_fecresp(String f_fecresp) {
        this.f_fecresp = f_fecresp;
    }

    public String getC_obsges() {
        return c_obsges;
    }

    public void setC_obsges(String c_obsges) {
        this.c_obsges = c_obsges;
    }

    public String getF_fecrevi() {
        return f_fecrevi;
    }

    public void setF_fecrevi(String f_fecrevi) {
        this.f_fecrevi = f_fecrevi;
    }

    public String getF_fecprog() {
        return f_fecprog;
    }

    public void setF_fecprog(String f_fecprog) {
        this.f_fecprog = f_fecprog;
    }

    public String getN_impprom() {
        return n_impprom;
    }

    public void setN_impprom(String n_impprom) {
        this.n_impprom = n_impprom;
    }

    /**
     * @return the c_destres
     */
    public String getC_destres() {
        return c_destres;
    }

    /**
     * @param c_destres the c_destres to set
     */
    public void setC_destres(String c_destres) {
        this.c_destres = c_destres;
    }

    /**
     * @return the c_destcon
     */
    public String getC_destcon() {
        return c_destcon;
    }

    /**
     * @param c_destcon the c_destcon to set
     */
    public void setC_destcon(String c_destcon) {
        this.c_destcon = c_destcon;
    }

    /**
     * @return the c_destres_sub
     */
    public String getC_destres_sub() {
        return c_destres_sub;
    }

    /**
     * @param c_destres_sub the c_destres_sub to set
     */
    public void setC_destres_sub(String c_destres_sub) {
        this.c_destres_sub = c_destres_sub;
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
     * @return the c_estcuen_mt
     */
    public String getC_estcuen_mt() {
        return c_estcuen_mt;
    }

    /**
     * @param c_estcuen_mt the c_estcuen_mt to set
     */
    public void setC_estcuen_mt(String c_estcuen_mt) {
        this.c_estcuen_mt = c_estcuen_mt;
    }

    /**
     * @return the c_numubi
     */
    public String getC_numubi() {
        return c_numubi;
    }

    /**
     * @param c_numubi the c_numubi to set
     */
    public void setC_numubi(String c_numubi) {
        this.c_numubi = c_numubi;
    }
}
