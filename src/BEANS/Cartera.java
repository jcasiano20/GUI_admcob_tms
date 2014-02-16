package BEANS;

import DAO.Conexion;
import com.sun.org.apache.bcel.internal.generic.FLOAD;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Cartera {

    private String c_territorio;
    private String c_distprov;
    private String f_fproceso;
    private String c_agencia;
    private String c_gestor;
    private String c_oficina;
    private String c_subprod;
    private String c_nomsubpro;
    private String c_contrato;
    private String c_codcent;
    private String c_tpersona;
    private String c_nombre;
    private String c_divisa;
    private String c_direccion;
    private String c_telefono;
    private String c_codpostal;
    private String c_codestado;
    private String c_codprov;
    private String c_coddist;
    private String f_fincumpli;
    private String c_ubigeo;
    private String c_dpto;
    private String c_tramodia;
    private String c_tipodoc;
    private String c_nrodoc;
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
    private String c_provision;
    private String c_tarrastre;
    private String c_dessubpro;
    private String c_nombof;
    private String c_clientevip;
    private String c_sobreendeu;
    private String c_provmayor;
    private String c_scoriesp;
    private String c_inclin;
    private String c_msueldo1;
    private String c_bajaph;
    private Double n_saldohoy;
    private Double n_impprov;
    private Double n_deutotobli;
    private Double n_deutotclie;
    private int n_diasvenc;
    private String c_coddepa;
    private String c_desdepa;
    private String c_desprov;
    private String c_desdist;
    private String num_contr;
    private String dve_max;
    private String tot_sol;
    private String tot_dol;
    private String tot_gen;
    private String f_fecasig_ult;
    private String id_codtcon;
    private String c_destcon;
    private String id_codtres;
    private String c_destres;
    private String f_fecprog_ult;
    private String id_codusu;
    private String c_nomusu;
    private String b_flgasi;
    private String b_flgrec;
    private String n_numrec;
    private String f_fecing;
    private String c_flgnuev;
    private String c_nomsubpro_car;
    private String c_divisa_car;
    private String c_flgdir;
    private String c_dirimp;
    private String c_disimp;
    private String f_fproceso_ges;
    private String f_fecimp;
    private String c_desrspta;
    private String c_desrspta_sub;
    private String f_fecha_generacion_registro;
    private String f_fecha_ingreso;
    private String c_oficina2;
    private String c_producto;
    private String c_marca;
    private String c_tipo_telefono1;
    private String c_prefijo_telefono1;
    private String c_telefono1;
    private String c_extencion1;
    private String c_tipo_telefono2;
    private String c_prefijo_telefono2;
    private String c_telefono2;
    private String c_extencion2;
    private String c_direccion1;
    private String c_departamento1;
    private String c_provincia1;
    private String c_distrito1;
    private String c_direccion2;
    private String c_departamento2;
    private String c_provincia2;
    private String c_distrito2;
    private String f_ult_fecasig;
    private String c_ult_id_codtcon;
    private String c_ult_c_destcon;
    private String c_ult_id_codtres;
    private String c_ult_c_destres;
    private String f_ult_fecresp;
    private String c_ult_id_codusu;
    private String c_ult_c_nomusu;
    private String in_return;
    private String N_saldohoy2;
    private String N_diasvenc2;


    public ArrayList lista_impresion_cartas(String id_codper, String f_fproceso,
    String c_nrodoc, String c_nombre, String c_distprov, String pid_codtcon,
    String pid_codtres, String pc_nrodoc_secuencia) throws Exception{
    Conexion co=new Conexion();
    ArrayList lista=new ArrayList();
    String cadena=" SELECT * FROM usp_qry_impresion_cartas('" + id_codper + "','" + f_fproceso + "','" +
    c_nrodoc.trim() + "','" + c_nombre.trim() + "','" + c_distprov + "','" + pid_codtcon + "','" +
    pid_codtres + "','" + pc_nrodoc_secuencia + "') ";
    ResultSet rs=co.listar(cadena);    
    Cartera car=new Cartera();
    while(rs.next()){
    car=new Cartera();
    car.setF_fproceso(rs.getString("if_fproceso"));
    car.setC_codcent(rs.getString("ic_codcent"));
    car.setC_contrato(rs.getString("ic_contrato"));
    car.setC_tipodoc(rs.getString("ic_tipodoc"));
    car.setC_nrodoc(rs.getString("ic_nrodoc"));
    car.setC_nombre(rs.getString("ic_nombre"));
    car.setC_nomsubpro_car(rs.getString("ic_nomsubpro_car"));
    car.setC_nomsubpro(rs.getString("ic_nomsubpro"));
    car.setC_dessubpro(rs.getString("ic_dessubpro"));
    car.setC_divisa_car(rs.getString("ic_divisa_car"));
    car.setC_divisa(rs.getString("ic_divisa"));
    car.setN_saldohoy(Double.parseDouble(rs.getString("in_saldohoy")));
    car.setN_diasvenc(Integer.parseInt(rs.getString("in_diasvenc")));
    car.setC_flgdir(rs.getString("ic_flgdir"));
    car.setC_dirimp(rs.getString("ic_dirimp"));
    car.setC_disimp(rs.getString("ic_disimp"));
    car.setF_fproceso_ges(rs.getString("if_fproceso_ges"));
    car.setF_fecimp(rs.getString("if_fecimp"));
    car.setC_desrspta(rs.getString("ic_desrspta"));
    car.setC_desrspta_sub(rs.getString("ic_desrspta_sub"));
    car.setF_fecasig_ult(rs.getString("if_fecasig_ult"));
    car.setId_codtcon(rs.getString("iid_codtcon"));
    car.setC_destcon(rs.getString("ic_destcon"));
    car.setId_codtres(rs.getString("iid_codtres"));
    car.setC_destres(rs.getString("ic_destres"));
    lista.add(car);
    }return lista;
    }

    public String Asignacion_Cartera(String c_codcent, String f_fproceso, String id_codusu ,
    String id_codtges , String b_flgrec)throws Exception{
    Conexion co=new Conexion();
    String cad=" { call USP_INS_GESTION_CONTRATO('" + c_codcent + "','" + f_fproceso + "','" +
    id_codusu + "','" + id_codtges + "','" + b_flgrec + "') }" ;    
    return co.Ejecutar(cad);
    }


    public String eliminar_data() throws Exception{
     Conexion co=new Conexion();
     return co.Ejecutar("truncate data");
    }


    public ArrayList lista_reporte_cartera(String id_codper) throws Exception{
    Conexion co=new Conexion();
    ArrayList lista=new ArrayList();
    ResultSet rs=co.listar(" SELECT * FROM usp_prc_migrar_cartera('" + id_codper + "')");
    Cartera car=new Cartera();
    int i=0;
    while(rs.next()){
    car=new Cartera();
    car.setF_fproceso(rs.getString("if_fproceso"));
    car.setC_agencia(rs.getString("ic_agencia"));
    car.setC_gestor(rs.getString("ic_gestor"));
    car.setC_territorio(rs.getString("ic_territorio"));
    car.setC_oficina(rs.getString("ic_oficina"));
    car.setC_subprod(rs.getString("ic_subprod"));
    car.setC_nomsubpro(rs.getString("ic_nomsubpro"));
    car.setC_contrato(rs.getString("ic_contrato"));
    car.setC_codcent(rs.getString("ic_codcent"));
    car.setC_tpersona(rs.getString("ic_tpersona"));
    car.setC_nombre(rs.getString("ic_nombre"));
    car.setC_divisa(rs.getString("ic_divisa"));
    car.setN_saldohoy2(rs.getString("in_saldohoy"));
    car.setC_direccion(rs.getString("ic_direccion"));
    car.setC_telefono(rs.getString("ic_telefono"));
    car.setC_codpostal(rs.getString("ic_codpostal"));
    car.setC_codestado(rs.getString("ic_codestado"));
    car.setC_codprov(rs.getString("ic_codprov"));
    car.setC_coddist(rs.getString("ic_coddist"));
    car.setF_fincumpli(rs.getString("if_fincumpli"));
    car.setN_diasvenc2(rs.getString("in_diasvenc"));
    car.setC_ubigeo(rs.getString("ic_ubigeo"));
    car.setC_dpto(rs.getString("ic_dpto"));
    car.setC_distprov(rs.getString("ic_distprov"));
    car.setC_tramodia(rs.getString("ic_tramodia"));
    car.setC_tipodoc(rs.getString("ic_tipodoc"));
    car.setC_nrodoc(rs.getString("ic_nrodoc"));
    car.setC_tipofono1(rs.getString("ic_tipofono1"));
    car.setC_prefijo1(rs.getString("ic_prefijo1"));
    car.setC_fono1(rs.getString("ic_fono1"));
    car.setC_extension1(rs.getString("ic_extension1"));
    car.setC_tipofono2(rs.getString("ic_tipofono2"));
    car.setC_prefijo2(rs.getString("ic_prefijo2"));
    car.setC_fono2(rs.getString("ic_fono2"));
    car.setC_extension2(rs.getString("ic_extension2"));
    car.setC_tipofono3(rs.getString("ic_tipofono3"));
    car.setC_prefijo3(rs.getString("ic_prefijo3"));
    car.setC_fono3(rs.getString("ic_fono3"));
    car.setC_extension3(rs.getString("ic_extension3"));
    car.setC_tipofono4(rs.getString("ic_tipofono4"));
    car.setC_prefijo4(rs.getString("ic_prefijo4"));
    car.setC_fono4(rs.getString("ic_fono4"));
    car.setC_extension4(rs.getString("ic_extension4"));
    car.setC_tipofono5(rs.getString("ic_tipofono5"));
    car.setC_prefijo5(rs.getString("ic_prefijo5"));
    car.setC_fono5(rs.getString("ic_fono5"));
    car.setC_extension5(rs.getString("ic_extension5"));
    car.setC_email(rs.getString("ic_email"));
    car.setF_fecha_generacion_registro(rs.getString("if_fecha_generacion_registro"));
    car.setF_fecha_ingreso(rs.getString("if_fecha_ingreso"));
    car.setC_oficina2(rs.getString("ic_oficina2"));
    car.setC_producto(rs.getString("ic_producto"));
    car.setC_marca(rs.getString("ic_marca"));
    car.setC_tipo_telefono1(rs.getString("ic_tipo_telefono1"));
    car.setC_prefijo_telefono1(rs.getString("ic_prefijo_telefono1"));
    car.setC_telefono1(rs.getString("ic_telefono1"));
    car.setC_extencion1(rs.getString("ic_extencion1"));
    car.setC_tipo_telefono2(rs.getString("ic_tipo_telefono2"));
    car.setC_prefijo_telefono2(rs.getString("ic_prefijo_telefono2"));
    car.setC_telefono2(rs.getString("ic_telefono2"));
    car.setC_extencion2(rs.getString("ic_extencion2"));
    car.setC_direccion1(rs.getString("ic_direccion1"));
    car.setC_departamento1(rs.getString("ic_departamento1"));
    car.setC_provincia1(rs.getString("ic_provincia1"));
    car.setC_distrito1(rs.getString("ic_distrito1"));
    car.setC_direccion2(rs.getString("ic_direccion2"));
    car.setC_departamento2(rs.getString("ic_departamento2"));
    car.setC_provincia2(rs.getString("ic_provincia2"));
    car.setC_distrito2(rs.getString("ic_distrito2"));
    car.setF_ult_fecasig(rs.getString("if_ult_fecasig"));
    car.setC_ult_id_codtcon(rs.getString("ic_ult_id_codtcon"));
    car.setC_ult_c_destcon(rs.getString("ic_ult_c_destcon"));
    car.setC_ult_id_codtres(rs.getString("ic_ult_id_codtres"));
    car.setC_ult_c_destres(rs.getString("ic_ult_c_destres"));
    car.setF_ult_fecresp(rs.getString("if_ult_fecresp"));
    car.setC_ult_id_codusu(rs.getString("ic_ult_id_codusu"));
    car.setC_ult_c_nomusu(rs.getString("ic_ult_c_nomusu"));
    car.setIn_return(rs.getString("in_return"));   
    lista.add(car);
    }return lista;
    }

    public String migrar_cartera(/*String f_fproceso, String c_agencia, String c_gestor,
    String c_territorio, String c_oficina, String c_subprod, String c_dessubpro,
    String c_contrato, String c_codcent, String c_tpersona, String c_nombre,
    String c_divisa, Float n_saldohoy, String c_direccion, String c_telefono,
    String c_codpostal, String c_codestado, String c_codprov, String c_coddist,
    String f_fincumpli, Integer n_diasvenc, String c_ubigeo, String c_dpto,
    String c_distprov, String c_tramodia, String c_tipodoc, String c_nrodoc,
    String c_tipofono1, String c_prefijo1, String c_fono1, String c_extension1,
    String c_tipofono2, String c_prefijo2, String c_fono2, String c_extension2,
    String c_tipofono3, String c_prefijo3, String c_fono3, String c_extension3,
    String c_tipofono4, String c_prefijo4, String c_fono4, String c_extension4,
    String c_tipofono5, String c_prefijo5, String c_fono5, String c_extension5,
    String c_email, String c_provision, String c_tarrastre, Double n_impprov,
    Double n_deutotobli, Double n_deutotclie, String c_nomsubpro, String c_nombof,
    String c_clientevip, String c_sobreendeu, String c_provmayor, String c_scoriesp,
    String c_inclin, String c_msueldo1, String c_bajaph, String id_codper*/String cadena){
    try{    
    Conexion co=new Conexion();    
    String ingreso="insert into data values('" + cadena.replace("'", " ") + "')";
//    String cadena="{ call usp_ins_cartera(" + f_fproceso + "," +  c_agencia + "," + c_gestor + "," +
//    c_territorio + "," + c_oficina + "," + c_subprod + "," +  c_dessubpro + "," + c_contrato + "," +
//    c_codcent + "," + c_tpersona + "," + c_nombre + "," + c_divisa + "," + n_saldohoy + "," +
//    c_direccion + "," + c_telefono + "," + c_codpostal + "," + c_codestado + "," + c_codprov + "," +
//    c_coddist + "," + f_fincumpli + "," + n_diasvenc + "," + c_ubigeo + "," + c_dpto + "," +
//    c_distprov + "," + c_tramodia + "," + c_tipodoc + "," + c_nrodoc + "," + c_tipofono1 + "," +
//    c_prefijo1 + "," + c_fono1 + "," + c_extension1 + "," + c_tipofono2 + "," + c_prefijo2 + "," +
//    c_fono2 + "," + c_extension2 + "," + c_tipofono3 + "," + c_prefijo3 + "," + c_fono3 + "," +
//    c_extension3 + "," + c_tipofono4 + "," + c_prefijo4 + "," + c_fono4 + "," + c_extension4 + "," +
//    c_tipofono5 + "," + c_prefijo5 + "," + c_fono5 + "," + c_extension5 + "," + c_email + "," +
//    c_provision + "," + c_tarrastre + "," + n_impprov + "," + n_deutotobli + "," + n_deutotclie + "," +
//    c_nomsubpro + "," + c_nombof + "," + c_clientevip + "," + c_sobreendeu + "," + c_provmayor + "," +
//    c_scoriesp + "," + c_inclin + "," + c_msueldo1 + "," + c_bajaph + "," + id_codper + ") }";
    return co.Ejecutar(ingreso);
    }catch(Exception e){
    JOptionPane.showMessageDialog(null, e.getMessage());
    return null;
    }
    }


    public ArrayList listado_cartera(String f_fproceso, String id_codper, String c_nrodoc,
    String c_nombre, String c_territorio, String c_distprov, String b_flgasi,
    String b_flgrec, String id_codusu, String id_codtcon, String id_codtres,
    String poper_dv, String pval_dv_a, String pval_dv_b, String poper_dt, String pval_dt_a,
    String pval_dt_b, String producto, String c_arrastre, String str) throws Exception{
    Conexion co=new Conexion();
    ArrayList lista=new ArrayList();
    String cadena ="select * from usp_qry_cartera_libre('" + f_fproceso + "','" +
    id_codper + "','" + c_nrodoc.trim() + "','" + c_nombre.toUpperCase().trim() + "','" + c_territorio + "','" +
    c_distprov + "','" + b_flgasi + "','" + b_flgrec + "','" + id_codusu + "','" +
    id_codtcon + "','" + id_codtres + "','" + poper_dv + "','" +
    pval_dv_a + "','" + pval_dv_b + "','" + poper_dt + "','" + pval_dt_a + "','" +
    pval_dt_b + "','" + producto + "','" + c_arrastre + "','TELEGESTION') " + str;    
               
    ResultSet rs=co.listar(cadena);
       
    Cartera car=new Cartera();
    while(rs.next()){
    car=new Cartera();
    car.setF_fproceso(rs.getString("if_fproceso"));
    car.setC_codcent(rs.getString("ic_codcent"));
    car.setC_nrodoc(rs.getString("ic_nrodoc"));
    car.setC_nombre(rs.getString("ic_nombre"));
    car.setC_territorio(rs.getString("ic_territorio"));
    car.setNum_contr(rs.getString("inum_contr"));
    car.setDve_max(rs.getString("idve_max"));
    car.setTot_sol(rs.getString("itot_sol"));
    car.setTot_dol(rs.getString("itot_dol"));
    car.setTot_gen(rs.getString("itot_gen"));
    car.setF_fecasig_ult(rs.getString("if_fecasig_ult"));
    car.setId_codtcon(rs.getString("iid_codtcon"));
    car.setC_destcon(rs.getString("ic_destcon"));
    car.setId_codtres(rs.getString("iid_codtres"));
    car.setC_destres(rs.getString("ic_destres"));
    car.setF_fecprog_ult(rs.getString("if_fecprog_ult"));
    car.setId_codusu(rs.getString("iid_codusu"));
    car.setC_nomusu(rs.getString("ic_nomusu"));
    car.setC_provision(rs.getString("ic_tarrastre"));
    car.setB_flgasi(rs.getString("ib_flgasi"));
    car.setB_flgrec(rs.getString("ib_flgrec"));
    car.setN_numrec(rs.getString("in_numrec"));
    car.setF_fecing(rs.getString("if_fecing"));
    car.setC_flgnuev(rs.getString("ic_flgnuev"));
    lista.add(car);
    }return lista;
    }

    public ArrayList datos_territorio() throws Exception{
    Conexion co=new Conexion();
    ArrayList lista=new ArrayList();
    ResultSet rs=co.listar("SELECT DISTINCT c_territorio FROM contrato where c_territorio IS NOT NULL ORDER BY c_territorio");
    Cartera car=new Cartera();
    while(rs.next()){
    car=new Cartera();
    car.setC_territorio(rs.getString("c_territorio"));
    lista.add(car);
    }return lista;
    }

    public ArrayList datos_distprov() throws Exception{
    Conexion co=new Conexion();
    ArrayList lista=new ArrayList();
    ResultSet rs=co.listar("SELECT DISTINCT c_distprov FROM CONTACTO where " +
    "c_distprov IS NOT NULL ORDER BY c_distprov");
    Cartera car=new Cartera();
    while(rs.next()){
    car=new Cartera();
    car.setC_distprov(rs.getString("c_distprov"));
    lista.add(car);
    }return lista;
    }

    public ArrayList datos_departamento() throws Exception{
    Conexion co=new Conexion();
    ArrayList lista= new ArrayList();
    ResultSet rs=co.listar("SELECT c_coddepa,c_desdepa FROM ubigeo_depa ORDER BY c_desdepa ASC");
    Cartera car=new Cartera();
    while(rs.next()){
    car=new Cartera();
    car.setC_coddepa(rs.getString("c_coddepa"));
    car.setC_desdepa(rs.getString("c_desdepa"));
    lista.add(car);
    }return lista;
    }

    public ArrayList datos_provincia(String c_coddepa) throws Exception{
    Conexion co=new Conexion();
    ArrayList lista= new ArrayList();
    ResultSet rs=co.listar("SELECT c_codprov, c_desprov FROM ubigeo_prov" +
    " WHERE c_coddepa='" + c_coddepa + "' ORDER BY c_desprov ASC");
    Cartera car=new Cartera();
    while(rs.next()){
    car=new Cartera();
    car.setC_codprov(rs.getString("c_codprov"));
    car.setC_desprov(rs.getString("c_desprov"));
    lista.add(car);
    }return lista;
    }

    public ArrayList datos_distrito(String c_coddepa, String c_codprov) throws Exception{
    Conexion co=new Conexion();
    ArrayList lista= new ArrayList();
    ResultSet rs=co.listar("SELECT c_coddist,c_desdist FROM ubigeo_dist" +
    " WHERE c_coddepa='" + c_coddepa + "' AND c_codprov='" + c_codprov +
    "' ORDER BY c_desdist ASC");
    Cartera car=new Cartera();
    while(rs.next()){
    car=new Cartera();
    car.setC_coddist(rs.getString("c_coddist"));
    car.setC_desdist(rs.getString("c_desdist"));
    lista.add(car);
    }return lista;
    }


    public String getC_territorio() {
        return c_territorio;
    }

    public void setC_territorio(String c_territorio) {
        this.c_territorio = c_territorio;
    }

    public String getC_distprov() {
        return c_distprov;
    }

    public void setC_distprov(String c_distprov) {
        this.c_distprov = c_distprov;
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
     * @return the c_agencia
     */
    public String getC_agencia() {
        return c_agencia;
    }

    /**
     * @param c_agencia the c_agencia to set
     */
    public void setC_agencia(String c_agencia) {
        this.c_agencia = c_agencia;
    }

    /**
     * @return the c_gestor
     */
    public String getC_gestor() {
        return c_gestor;
    }

    /**
     * @param c_gestor the c_gestor to set
     */
    public void setC_gestor(String c_gestor) {
        this.c_gestor = c_gestor;
    }

    /**
     * @return the c_oficina
     */
    public String getC_oficina() {
        return c_oficina;
    }

    /**
     * @param c_oficina the c_oficina to set
     */
    public void setC_oficina(String c_oficina) {
        this.c_oficina = c_oficina;
    }

    /**
     * @return the c_subprod
     */
    public String getC_subprod() {
        return c_subprod;
    }

    /**
     * @param c_subprod the c_subprod to set
     */
    public void setC_subprod(String c_subprod) {
        this.c_subprod = c_subprod;
    }

    /**
     * @return the c_nomsubpro
     */
    public String getC_nomsubpro() {
        return c_nomsubpro;
    }

    /**
     * @param c_nomsubpro the c_nomsubpro to set
     */
    public void setC_nomsubpro(String c_nomsubpro) {
        this.c_nomsubpro = c_nomsubpro;
    }

    /**
     * @return the c_contrato
     */
    public String getC_contrato() {
        return c_contrato;
    }

    /**
     * @param c_contrato the c_contrato to set
     */
    public void setC_contrato(String c_contrato) {
        this.c_contrato = c_contrato;
    }

    /**
     * @return the c_codcent
     */
    public String getC_codcent() {
        return c_codcent;
    }

    /**
     * @param c_codcent the c_codcent to set
     */
    public void setC_codcent(String c_codcent) {
        this.c_codcent = c_codcent;
    }

    /**
     * @return the c_tpersona
     */
    public String getC_tpersona() {
        return c_tpersona;
    }

    /**
     * @param c_tpersona the c_tpersona to set
     */
    public void setC_tpersona(String c_tpersona) {
        this.c_tpersona = c_tpersona;
    }

    /**
     * @return the c_nombre
     */
    public String getC_nombre() {
        return c_nombre;
    }

    /**
     * @param c_nombre the c_nombre to set
     */
    public void setC_nombre(String c_nombre) {
        this.c_nombre = c_nombre;
    }

    /**
     * @return the c_divisa
     */
    public String getC_divisa() {
        return c_divisa;
    }

    /**
     * @param c_divisa the c_divisa to set
     */
    public void setC_divisa(String c_divisa) {
        this.c_divisa = c_divisa;
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
     * @return the c_codpostal
     */
    public String getC_codpostal() {
        return c_codpostal;
    }

    /**
     * @param c_codpostal the c_codpostal to set
     */
    public void setC_codpostal(String c_codpostal) {
        this.c_codpostal = c_codpostal;
    }

    /**
     * @return the c_codestado
     */
    public String getC_codestado() {
        return c_codestado;
    }

    /**
     * @param c_codestado the c_codestado to set
     */
    public void setC_codestado(String c_codestado) {
        this.c_codestado = c_codestado;
    }

    /**
     * @return the c_codprov
     */
    public String getC_codprov() {
        return c_codprov;
    }

    /**
     * @param c_codprov the c_codprov to set
     */
    public void setC_codprov(String c_codprov) {
        this.c_codprov = c_codprov;
    }

    /**
     * @return the c_coddist
     */
    public String getC_coddist() {
        return c_coddist;
    }

    /**
     * @param c_coddist the c_coddist to set
     */
    public void setC_coddist(String c_coddist) {
        this.c_coddist = c_coddist;
    }

    /**
     * @return the f_fincumpli
     */
    public String getF_fincumpli() {
        return f_fincumpli;
    }

    /**
     * @param f_fincumpli the f_fincumpli to set
     */
    public void setF_fincumpli(String f_fincumpli) {
        this.f_fincumpli = f_fincumpli;
    }

    /**
     * @return the c_ubigeo
     */
    public String getC_ubigeo() {
        return c_ubigeo;
    }

    /**
     * @param c_ubigeo the c_ubigeo to set
     */
    public void setC_ubigeo(String c_ubigeo) {
        this.c_ubigeo = c_ubigeo;
    }

    /**
     * @return the c_dpto
     */
    public String getC_dpto() {
        return c_dpto;
    }

    /**
     * @param c_dpto the c_dpto to set
     */
    public void setC_dpto(String c_dpto) {
        this.c_dpto = c_dpto;
    }

    /**
     * @return the c_tramodia
     */
    public String getC_tramodia() {
        return c_tramodia;
    }

    /**
     * @param c_tramodia the c_tramodia to set
     */
    public void setC_tramodia(String c_tramodia) {
        this.c_tramodia = c_tramodia;
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
     * @return the c_nrodoc
     */
    public String getC_nrodoc() {
        return c_nrodoc;
    }

    /**
     * @param c_nrodoc the c_nrodoc to set
     */
    public void setC_nrodoc(String c_nrodoc) {
        this.c_nrodoc = c_nrodoc;
    }

    /**
     * @return the c_tipofono1
     */
    public String getC_tipofono1() {
        return c_tipofono1;
    }

    /**
     * @param c_tipofono1 the c_tipofono1 to set
     */
    public void setC_tipofono1(String c_tipofono1) {
        this.c_tipofono1 = c_tipofono1;
    }

    /**
     * @return the c_prefijo1
     */
    public String getC_prefijo1() {
        return c_prefijo1;
    }

    /**
     * @param c_prefijo1 the c_prefijo1 to set
     */
    public void setC_prefijo1(String c_prefijo1) {
        this.c_prefijo1 = c_prefijo1;
    }

    /**
     * @return the c_fono1
     */
    public String getC_fono1() {
        return c_fono1;
    }

    /**
     * @param c_fono1 the c_fono1 to set
     */
    public void setC_fono1(String c_fono1) {
        this.c_fono1 = c_fono1;
    }

    /**
     * @return the c_extension1
     */
    public String getC_extension1() {
        return c_extension1;
    }

    /**
     * @param c_extension1 the c_extension1 to set
     */
    public void setC_extension1(String c_extension1) {
        this.c_extension1 = c_extension1;
    }

    /**
     * @return the c_tipofono2
     */
    public String getC_tipofono2() {
        return c_tipofono2;
    }

    /**
     * @param c_tipofono2 the c_tipofono2 to set
     */
    public void setC_tipofono2(String c_tipofono2) {
        this.c_tipofono2 = c_tipofono2;
    }

    /**
     * @return the c_prefijo2
     */
    public String getC_prefijo2() {
        return c_prefijo2;
    }

    /**
     * @param c_prefijo2 the c_prefijo2 to set
     */
    public void setC_prefijo2(String c_prefijo2) {
        this.c_prefijo2 = c_prefijo2;
    }

    /**
     * @return the c_fono2
     */
    public String getC_fono2() {
        return c_fono2;
    }

    /**
     * @param c_fono2 the c_fono2 to set
     */
    public void setC_fono2(String c_fono2) {
        this.c_fono2 = c_fono2;
    }

    /**
     * @return the c_extension2
     */
    public String getC_extension2() {
        return c_extension2;
    }

    /**
     * @param c_extension2 the c_extension2 to set
     */
    public void setC_extension2(String c_extension2) {
        this.c_extension2 = c_extension2;
    }

    /**
     * @return the c_tipofono3
     */
    public String getC_tipofono3() {
        return c_tipofono3;
    }

    /**
     * @param c_tipofono3 the c_tipofono3 to set
     */
    public void setC_tipofono3(String c_tipofono3) {
        this.c_tipofono3 = c_tipofono3;
    }

    /**
     * @return the c_prefijo3
     */
    public String getC_prefijo3() {
        return c_prefijo3;
    }

    /**
     * @param c_prefijo3 the c_prefijo3 to set
     */
    public void setC_prefijo3(String c_prefijo3) {
        this.c_prefijo3 = c_prefijo3;
    }

    /**
     * @return the c_fono3
     */
    public String getC_fono3() {
        return c_fono3;
    }

    /**
     * @param c_fono3 the c_fono3 to set
     */
    public void setC_fono3(String c_fono3) {
        this.c_fono3 = c_fono3;
    }

    /**
     * @return the c_extension3
     */
    public String getC_extension3() {
        return c_extension3;
    }

    /**
     * @param c_extension3 the c_extension3 to set
     */
    public void setC_extension3(String c_extension3) {
        this.c_extension3 = c_extension3;
    }

    /**
     * @return the c_tipofono4
     */
    public String getC_tipofono4() {
        return c_tipofono4;
    }

    /**
     * @param c_tipofono4 the c_tipofono4 to set
     */
    public void setC_tipofono4(String c_tipofono4) {
        this.c_tipofono4 = c_tipofono4;
    }

    /**
     * @return the c_prefijo4
     */
    public String getC_prefijo4() {
        return c_prefijo4;
    }

    /**
     * @param c_prefijo4 the c_prefijo4 to set
     */
    public void setC_prefijo4(String c_prefijo4) {
        this.c_prefijo4 = c_prefijo4;
    }

    /**
     * @return the c_fono4
     */
    public String getC_fono4() {
        return c_fono4;
    }

    /**
     * @param c_fono4 the c_fono4 to set
     */
    public void setC_fono4(String c_fono4) {
        this.c_fono4 = c_fono4;
    }

    /**
     * @return the c_extension4
     */
    public String getC_extension4() {
        return c_extension4;
    }

    /**
     * @param c_extension4 the c_extension4 to set
     */
    public void setC_extension4(String c_extension4) {
        this.c_extension4 = c_extension4;
    }

    /**
     * @return the c_tipofono5
     */
    public String getC_tipofono5() {
        return c_tipofono5;
    }

    /**
     * @param c_tipofono5 the c_tipofono5 to set
     */
    public void setC_tipofono5(String c_tipofono5) {
        this.c_tipofono5 = c_tipofono5;
    }

    /**
     * @return the c_prefijo5
     */
    public String getC_prefijo5() {
        return c_prefijo5;
    }

    /**
     * @param c_prefijo5 the c_prefijo5 to set
     */
    public void setC_prefijo5(String c_prefijo5) {
        this.c_prefijo5 = c_prefijo5;
    }

    /**
     * @return the c_fono5
     */
    public String getC_fono5() {
        return c_fono5;
    }

    /**
     * @param c_fono5 the c_fono5 to set
     */
    public void setC_fono5(String c_fono5) {
        this.c_fono5 = c_fono5;
    }

    /**
     * @return the c_extension5
     */
    public String getC_extension5() {
        return c_extension5;
    }

    /**
     * @param c_extension5 the c_extension5 to set
     */
    public void setC_extension5(String c_extension5) {
        this.c_extension5 = c_extension5;
    }

    /**
     * @return the c_email
     */
    public String getC_email() {
        return c_email;
    }

    /**
     * @param c_email the c_email to set
     */
    public void setC_email(String c_email) {
        this.c_email = c_email;
    }

    /**
     * @return the c_provision
     */
    public String getC_provision() {
        return c_provision;
    }

    /**
     * @param c_provision the c_provision to set
     */
    public void setC_provision(String c_provision) {
        this.c_provision = c_provision;
    }

    /**
     * @return the c_tarrastre
     */
    public String getC_tarrastre() {
        return c_tarrastre;
    }

    /**
     * @param c_tarrastre the c_tarrastre to set
     */
    public void setC_tarrastre(String c_tarrastre) {
        this.c_tarrastre = c_tarrastre;
    }

    /**
     * @return the c_dessubpro
     */
    public String getC_dessubpro() {
        return c_dessubpro;
    }

    /**
     * @param c_dessubpro the c_dessubpro to set
     */
    public void setC_dessubpro(String c_dessubpro) {
        this.c_dessubpro = c_dessubpro;
    }

    /**
     * @return the c_nombof
     */
    public String getC_nombof() {
        return c_nombof;
    }

    /**
     * @param c_nombof the c_nombof to set
     */
    public void setC_nombof(String c_nombof) {
        this.c_nombof = c_nombof;
    }

    /**
     * @return the c_clientevip
     */
    public String getC_clientevip() {
        return c_clientevip;
    }

    /**
     * @param c_clientevip the c_clientevip to set
     */
    public void setC_clientevip(String c_clientevip) {
        this.c_clientevip = c_clientevip;
    }

    /**
     * @return the c_sobreendeu
     */
    public String getC_sobreendeu() {
        return c_sobreendeu;
    }

    /**
     * @param c_sobreendeu the c_sobreendeu to set
     */
    public void setC_sobreendeu(String c_sobreendeu) {
        this.c_sobreendeu = c_sobreendeu;
    }

    /**
     * @return the c_provmayor
     */
    public String getC_provmayor() {
        return c_provmayor;
    }

    /**
     * @param c_provmayor the c_provmayor to set
     */
    public void setC_provmayor(String c_provmayor) {
        this.c_provmayor = c_provmayor;
    }

    /**
     * @return the c_scoriesp
     */
    public String getC_scoriesp() {
        return c_scoriesp;
    }

    /**
     * @param c_scoriesp the c_scoriesp to set
     */
    public void setC_scoriesp(String c_scoriesp) {
        this.c_scoriesp = c_scoriesp;
    }

    /**
     * @return the c_inclin
     */
    public String getC_inclin() {
        return c_inclin;
    }

    /**
     * @param c_inclin the c_inclin to set
     */
    public void setC_inclin(String c_inclin) {
        this.c_inclin = c_inclin;
    }

    /**
     * @return the c_msueldo1
     */
    public String getC_msueldo1() {
        return c_msueldo1;
    }

    /**
     * @param c_msueldo1 the c_msueldo1 to set
     */
    public void setC_msueldo1(String c_msueldo1) {
        this.c_msueldo1 = c_msueldo1;
    }

    /**
     * @return the c_bajaph
     */
    public String getC_bajaph() {
        return c_bajaph;
    }

    /**
     * @param c_bajaph the c_bajaph to set
     */
    public void setC_bajaph(String c_bajaph) {
        this.c_bajaph = c_bajaph;
    }

    /**
     * @return the n_saldohoy
     */
    public Double getN_saldohoy() {
        return n_saldohoy;
    }

    /**
     * @param n_saldohoy the n_saldohoy to set
     */
    public void setN_saldohoy(Double n_saldohoy) {
        this.n_saldohoy = n_saldohoy;
    }

    /**
     * @return the n_impprov
     */
    public Double getN_impprov() {
        return n_impprov;
    }

    /**
     * @param n_impprov the n_impprov to set
     */
    public void setN_impprov(Double n_impprov) {
        this.n_impprov = n_impprov;
    }

    /**
     * @return the n_deutotobli
     */
    public Double getN_deutotobli() {
        return n_deutotobli;
    }

    /**
     * @param n_deutotobli the n_deutotobli to set
     */
    public void setN_deutotobli(Double n_deutotobli) {
        this.n_deutotobli = n_deutotobli;
    }

    /**
     * @return the n_deutotclie
     */
    public Double getN_deutotclie() {
        return n_deutotclie;
    }

    /**
     * @param n_deutotclie the n_deutotclie to set
     */
    public void setN_deutotclie(Double n_deutotclie) {
        this.n_deutotclie = n_deutotclie;
    }

    /**
     * @return the n_diasvenc
     */
    public int getN_diasvenc() {
        return n_diasvenc;
    }

    /**
     * @param n_diasvenc the n_diasvenc to set
     */
    public void setN_diasvenc(int n_diasvenc) {
        this.n_diasvenc = n_diasvenc;
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
     * @return the c_desdepa
     */
    public String getC_desdepa() {
        return c_desdepa;
    }

    /**
     * @param c_desdepa the c_desdepa to set
     */
    public void setC_desdepa(String c_desdepa) {
        this.c_desdepa = c_desdepa;
    }

    /**
     * @return the c_desprov
     */
    public String getC_desprov() {
        return c_desprov;
    }

    /**
     * @param c_desprov the c_desprov to set
     */
    public void setC_desprov(String c_desprov) {
        this.c_desprov = c_desprov;
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
     * @return the num_contr
     */
    public String getNum_contr() {
        return num_contr;
    }

    /**
     * @param num_contr the num_contr to set
     */
    public void setNum_contr(String num_contr) {
        this.num_contr = num_contr;
    }

    /**
     * @return the dve_max
     */
    public String getDve_max() {
        return dve_max;
    }

    /**
     * @param dve_max the dve_max to set
     */
    public void setDve_max(String dve_max) {
        this.dve_max = dve_max;
    }

    /**
     * @return the tot_sol
     */
    public String getTot_sol() {
        return tot_sol;
    }

    /**
     * @param tot_sol the tot_sol to set
     */
    public void setTot_sol(String tot_sol) {
        this.tot_sol = tot_sol;
    }

    /**
     * @return the tot_dol
     */
    public String getTot_dol() {
        return tot_dol;
    }

    /**
     * @param tot_dol the tot_dol to set
     */
    public void setTot_dol(String tot_dol) {
        this.tot_dol = tot_dol;
    }

    /**
     * @return the tot_gen
     */
    public String getTot_gen() {
        return tot_gen;
    }

    /**
     * @param tot_gen the tot_gen to set
     */
    public void setTot_gen(String tot_gen) {
        this.tot_gen = tot_gen;
    }

    /**
     * @return the f_fecasig_ult
     */
    public String getF_fecasig_ult() {
        return f_fecasig_ult;
    }

    /**
     * @param f_fecasig_ult the f_fecasig_ult to set
     */
    public void setF_fecasig_ult(String f_fecasig_ult) {
        this.f_fecasig_ult = f_fecasig_ult;
    }

    /**
     * @return the id_codtcon
     */
    public String getId_codtcon() {
        return id_codtcon;
    }

    /**
     * @param id_codtcon the id_codtcon to set
     */
    public void setId_codtcon(String id_codtcon) {
        this.id_codtcon = id_codtcon;
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
     * @return the id_codtres
     */
    public String getId_codtres() {
        return id_codtres;
    }

    /**
     * @param id_codtres the id_codtres to set
     */
    public void setId_codtres(String id_codtres) {
        this.id_codtres = id_codtres;
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
     * @return the f_fecprog_ult
     */
    public String getF_fecprog_ult() {
        return f_fecprog_ult;
    }

    /**
     * @param f_fecprog_ult the f_fecprog_ult to set
     */
    public void setF_fecprog_ult(String f_fecprog_ult) {
        this.f_fecprog_ult = f_fecprog_ult;
    }

    /**
     * @return the id_codusu
     */
    public String getId_codusu() {
        return id_codusu;
    }

    /**
     * @param id_codusu the id_codusu to set
     */
    public void setId_codusu(String id_codusu) {
        this.id_codusu = id_codusu;
    }

    /**
     * @return the c_nomusu
     */
    public String getC_nomusu() {
        return c_nomusu;
    }

    /**
     * @param c_nomusu the c_nomusu to set
     */
    public void setC_nomusu(String c_nomusu) {
        this.c_nomusu = c_nomusu;
    }

    /**
     * @return the b_flgasi
     */
    public String getB_flgasi() {
        return b_flgasi;
    }

    /**
     * @param b_flgasi the b_flgasi to set
     */
    public void setB_flgasi(String b_flgasi) {
        this.b_flgasi = b_flgasi;
    }

    /**
     * @return the b_flgrec
     */
    public String getB_flgrec() {
        return b_flgrec;
    }

    /**
     * @param b_flgrec the b_flgrec to set
     */
    public void setB_flgrec(String b_flgrec) {
        this.b_flgrec = b_flgrec;
    }

    /**
     * @return the n_numrec
     */
    public String getN_numrec() {
        return n_numrec;
    }

    /**
     * @param n_numrec the n_numrec to set
     */
    public void setN_numrec(String n_numrec) {
        this.n_numrec = n_numrec;
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
     * @return the c_flgnuev
     */
    public String getC_flgnuev() {
        return c_flgnuev;
    }

    /**
     * @param c_flgnuev the c_flgnuev to set
     */
    public void setC_flgnuev(String c_flgnuev) {
        this.c_flgnuev = c_flgnuev;
    }

    /**
     * @return the c_nomsubpro_car
     */
    public String getC_nomsubpro_car() {
        return c_nomsubpro_car;
    }

    /**
     * @param c_nomsubpro_car the c_nomsubpro_car to set
     */
    public void setC_nomsubpro_car(String c_nomsubpro_car) {
        this.c_nomsubpro_car = c_nomsubpro_car;
    }

    /**
     * @return the c_divisa_car
     */
    public String getC_divisa_car() {
        return c_divisa_car;
    }

    /**
     * @param c_divisa_car the c_divisa_car to set
     */
    public void setC_divisa_car(String c_divisa_car) {
        this.c_divisa_car = c_divisa_car;
    }

    /**
     * @return the c_flgdir
     */
    public String getC_flgdir() {
        return c_flgdir;
    }

    /**
     * @param c_flgdir the c_flgdir to set
     */
    public void setC_flgdir(String c_flgdir) {
        this.c_flgdir = c_flgdir;
    }

    /**
     * @return the c_dirimp
     */
    public String getC_dirimp() {
        return c_dirimp;
    }

    /**
     * @param c_dirimp the c_dirimp to set
     */
    public void setC_dirimp(String c_dirimp) {
        this.c_dirimp = c_dirimp;
    }

    /**
     * @return the c_disimp
     */
    public String getC_disimp() {
        return c_disimp;
    }

    /**
     * @param c_disimp the c_disimp to set
     */
    public void setC_disimp(String c_disimp) {
        this.c_disimp = c_disimp;
    }

    /**
     * @return the f_fproceso_ges
     */
    public String getF_fproceso_ges() {
        return f_fproceso_ges;
    }

    /**
     * @param f_fproceso_ges the f_fproceso_ges to set
     */
    public void setF_fproceso_ges(String f_fproceso_ges) {
        this.f_fproceso_ges = f_fproceso_ges;
    }

    /**
     * @return the f_fecimp
     */
    public String getF_fecimp() {
        return f_fecimp;
    }

    /**
     * @param f_fecimp the f_fecimp to set
     */
    public void setF_fecimp(String f_fecimp) {
        this.f_fecimp = f_fecimp;
    }

    /**
     * @return the c_desrspta
     */
    public String getC_desrspta() {
        return c_desrspta;
    }

    /**
     * @param c_desrspta the c_desrspta to set
     */
    public void setC_desrspta(String c_desrspta) {
        this.c_desrspta = c_desrspta;
    }

    /**
     * @return the c_desrspta_sub
     */
    public String getC_desrspta_sub() {
        return c_desrspta_sub;
    }

    /**
     * @param c_desrspta_sub the c_desrspta_sub to set
     */
    public void setC_desrspta_sub(String c_desrspta_sub) {
        this.c_desrspta_sub = c_desrspta_sub;
    }

    /**
     * @return the f_fecha_generacion_registro
     */
    public String getF_fecha_generacion_registro() {
        return f_fecha_generacion_registro;
    }

    /**
     * @param f_fecha_generacion_registro the f_fecha_generacion_registro to set
     */
    public void setF_fecha_generacion_registro(String f_fecha_generacion_registro) {
        this.f_fecha_generacion_registro = f_fecha_generacion_registro;
    }

    /**
     * @return the f_fecha_ingreso
     */
    public String getF_fecha_ingreso() {
        return f_fecha_ingreso;
    }

    /**
     * @param f_fecha_ingreso the f_fecha_ingreso to set
     */
    public void setF_fecha_ingreso(String f_fecha_ingreso) {
        this.f_fecha_ingreso = f_fecha_ingreso;
    }

    /**
     * @return the c_oficina2
     */
    public String getC_oficina2() {
        return c_oficina2;
    }

    /**
     * @param c_oficina2 the c_oficina2 to set
     */
    public void setC_oficina2(String c_oficina2) {
        this.c_oficina2 = c_oficina2;
    }

    /**
     * @return the c_producto
     */
    public String getC_producto() {
        return c_producto;
    }

    /**
     * @param c_producto the c_producto to set
     */
    public void setC_producto(String c_producto) {
        this.c_producto = c_producto;
    }

    /**
     * @return the c_marca
     */
    public String getC_marca() {
        return c_marca;
    }

    /**
     * @param c_marca the c_marca to set
     */
    public void setC_marca(String c_marca) {
        this.c_marca = c_marca;
    }

    /**
     * @return the c_tipo_telefono1
     */
    public String getC_tipo_telefono1() {
        return c_tipo_telefono1;
    }

    /**
     * @param c_tipo_telefono1 the c_tipo_telefono1 to set
     */
    public void setC_tipo_telefono1(String c_tipo_telefono1) {
        this.c_tipo_telefono1 = c_tipo_telefono1;
    }

    /**
     * @return the c_prefijo_telefono1
     */
    public String getC_prefijo_telefono1() {
        return c_prefijo_telefono1;
    }

    /**
     * @param c_prefijo_telefono1 the c_prefijo_telefono1 to set
     */
    public void setC_prefijo_telefono1(String c_prefijo_telefono1) {
        this.c_prefijo_telefono1 = c_prefijo_telefono1;
    }

    /**
     * @return the c_telefono1
     */
    public String getC_telefono1() {
        return c_telefono1;
    }

    /**
     * @param c_telefono1 the c_telefono1 to set
     */
    public void setC_telefono1(String c_telefono1) {
        this.c_telefono1 = c_telefono1;
    }

    /**
     * @return the c_extencion1
     */
    public String getC_extencion1() {
        return c_extencion1;
    }

    /**
     * @param c_extencion1 the c_extencion1 to set
     */
    public void setC_extencion1(String c_extencion1) {
        this.c_extencion1 = c_extencion1;
    }

    /**
     * @return the c_tipo_telefono2
     */
    public String getC_tipo_telefono2() {
        return c_tipo_telefono2;
    }

    /**
     * @param c_tipo_telefono2 the c_tipo_telefono2 to set
     */
    public void setC_tipo_telefono2(String c_tipo_telefono2) {
        this.c_tipo_telefono2 = c_tipo_telefono2;
    }

    /**
     * @return the c_prefijo_telefono2
     */
    public String getC_prefijo_telefono2() {
        return c_prefijo_telefono2;
    }

    /**
     * @param c_prefijo_telefono2 the c_prefijo_telefono2 to set
     */
    public void setC_prefijo_telefono2(String c_prefijo_telefono2) {
        this.c_prefijo_telefono2 = c_prefijo_telefono2;
    }

    /**
     * @return the c_telefono2
     */
    public String getC_telefono2() {
        return c_telefono2;
    }

    /**
     * @param c_telefono2 the c_telefono2 to set
     */
    public void setC_telefono2(String c_telefono2) {
        this.c_telefono2 = c_telefono2;
    }

    /**
     * @return the c_extencion2
     */
    public String getC_extencion2() {
        return c_extencion2;
    }

    /**
     * @param c_extencion2 the c_extencion2 to set
     */
    public void setC_extencion2(String c_extencion2) {
        this.c_extencion2 = c_extencion2;
    }

    /**
     * @return the c_direccion1
     */
    public String getC_direccion1() {
        return c_direccion1;
    }

    /**
     * @param c_direccion1 the c_direccion1 to set
     */
    public void setC_direccion1(String c_direccion1) {
        this.c_direccion1 = c_direccion1;
    }

    /**
     * @return the c_departamento1
     */
    public String getC_departamento1() {
        return c_departamento1;
    }

    /**
     * @param c_departamento1 the c_departamento1 to set
     */
    public void setC_departamento1(String c_departamento1) {
        this.c_departamento1 = c_departamento1;
    }

    /**
     * @return the c_provincia1
     */
    public String getC_provincia1() {
        return c_provincia1;
    }

    /**
     * @param c_provincia1 the c_provincia1 to set
     */
    public void setC_provincia1(String c_provincia1) {
        this.c_provincia1 = c_provincia1;
    }

    /**
     * @return the c_distrito1
     */
    public String getC_distrito1() {
        return c_distrito1;
    }

    /**
     * @param c_distrito1 the c_distrito1 to set
     */
    public void setC_distrito1(String c_distrito1) {
        this.c_distrito1 = c_distrito1;
    }

    /**
     * @return the c_direccion2
     */
    public String getC_direccion2() {
        return c_direccion2;
    }

    /**
     * @param c_direccion2 the c_direccion2 to set
     */
    public void setC_direccion2(String c_direccion2) {
        this.c_direccion2 = c_direccion2;
    }

    /**
     * @return the c_departamento2
     */
    public String getC_departamento2() {
        return c_departamento2;
    }

    /**
     * @param c_departamento2 the c_departamento2 to set
     */
    public void setC_departamento2(String c_departamento2) {
        this.c_departamento2 = c_departamento2;
    }

    /**
     * @return the c_provincia2
     */
    public String getC_provincia2() {
        return c_provincia2;
    }

    /**
     * @param c_provincia2 the c_provincia2 to set
     */
    public void setC_provincia2(String c_provincia2) {
        this.c_provincia2 = c_provincia2;
    }

    /**
     * @return the c_distrito2
     */
    public String getC_distrito2() {
        return c_distrito2;
    }

    /**
     * @param c_distrito2 the c_distrito2 to set
     */
    public void setC_distrito2(String c_distrito2) {
        this.c_distrito2 = c_distrito2;
    }

    /**
     * @return the f_ult_fecasig
     */
    public String getF_ult_fecasig() {
        return f_ult_fecasig;
    }

    /**
     * @param f_ult_fecasig the f_ult_fecasig to set
     */
    public void setF_ult_fecasig(String f_ult_fecasig) {
        this.f_ult_fecasig = f_ult_fecasig;
    }

    /**
     * @return the c_ult_id_codtcon
     */
    public String getC_ult_id_codtcon() {
        return c_ult_id_codtcon;
    }

    /**
     * @param c_ult_id_codtcon the c_ult_id_codtcon to set
     */
    public void setC_ult_id_codtcon(String c_ult_id_codtcon) {
        this.c_ult_id_codtcon = c_ult_id_codtcon;
    }

    /**
     * @return the c_ult_c_destcon
     */
    public String getC_ult_c_destcon() {
        return c_ult_c_destcon;
    }

    /**
     * @param c_ult_c_destcon the c_ult_c_destcon to set
     */
    public void setC_ult_c_destcon(String c_ult_c_destcon) {
        this.c_ult_c_destcon = c_ult_c_destcon;
    }

    /**
     * @return the c_ult_id_codtres
     */
    public String getC_ult_id_codtres() {
        return c_ult_id_codtres;
    }

    /**
     * @param c_ult_id_codtres the c_ult_id_codtres to set
     */
    public void setC_ult_id_codtres(String c_ult_id_codtres) {
        this.c_ult_id_codtres = c_ult_id_codtres;
    }

    /**
     * @return the c_ult_c_destres
     */
    public String getC_ult_c_destres() {
        return c_ult_c_destres;
    }

    /**
     * @param c_ult_c_destres the c_ult_c_destres to set
     */
    public void setC_ult_c_destres(String c_ult_c_destres) {
        this.c_ult_c_destres = c_ult_c_destres;
    }

    /**
     * @return the f_ult_fecresp
     */
    public String getF_ult_fecresp() {
        return f_ult_fecresp;
    }

    /**
     * @param f_ult_fecresp the f_ult_fecresp to set
     */
    public void setF_ult_fecresp(String f_ult_fecresp) {
        this.f_ult_fecresp = f_ult_fecresp;
    }

    /**
     * @return the c_ult_id_codusu
     */
    public String getC_ult_id_codusu() {
        return c_ult_id_codusu;
    }

    /**
     * @param c_ult_id_codusu the c_ult_id_codusu to set
     */
    public void setC_ult_id_codusu(String c_ult_id_codusu) {
        this.c_ult_id_codusu = c_ult_id_codusu;
    }

    /**
     * @return the c_ult_c_nomusu
     */
    public String getC_ult_c_nomusu() {
        return c_ult_c_nomusu;
    }

    /**
     * @param c_ult_c_nomusu the c_ult_c_nomusu to set
     */
    public void setC_ult_c_nomusu(String c_ult_c_nomusu) {
        this.c_ult_c_nomusu = c_ult_c_nomusu;
    }

    /**
     * @return the in_return
     */
    public String getIn_return() {
        return in_return;
    }

    /**
     * @param in_return the in_return to set
     */
    public void setIn_return(String in_return) {
        this.in_return = in_return;
    }

    /**
     * @return the N_saldohoy2
     */
    public String getN_saldohoy2() {
        return N_saldohoy2;
    }

    /**
     * @param N_saldohoy2 the N_saldohoy2 to set
     */
    public void setN_saldohoy2(String N_saldohoy2) {
        this.N_saldohoy2 = N_saldohoy2;
    }

    /**
     * @return the N_diasvenc2
     */
    public String getN_diasvenc2() {
        return N_diasvenc2;
    }

    /**
     * @param N_diasvenc2 the N_diasvenc2 to set
     */
    public void setN_diasvenc2(String N_diasvenc2) {
        this.N_diasvenc2 = N_diasvenc2;
    }
}
