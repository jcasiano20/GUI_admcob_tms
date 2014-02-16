
package BEANS;

import DAO.Conexion;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Reportes {
    private String f_fproceso;
    private String c_agencia;
    private String c_gestor;
    private String c_territorio;
    private String c_oficina;
    private String c_subprod;
    private String c_nomsubpro;
    private String c_contrato;
    private String c_codcent;
    private String c_tpersona;
    private String c_nombre;
    private String c_divisa;
    private String n_saldohoy;
    private String c_direccion;
    private String c_telefono;
    private String c_codpostal;
    private String c_codestado;
    private String c_codprov;
    private String c_coddist;
    private String f_fincumpli;
    private String n_diasvenc;
    private String c_ubigeo;
    private String c_dpto;
    private String c_distprov;
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
    private String n_impprov;
    private String n_deutotobli;
    private String n_deutotclie;
    private String c_dessubpro;
    private String c_nombof;
    private String c_clientevip;
    private String c_sobreendeu;
    private String c_provmayor;
    private String c_scoriesp;
    private String c_inclin;
    private String c_msueldo1;
    private String c_bajaph;
    private String f_fecasig;
    private String f_fecmod;
    private String n_idxges;
    private String id_codtges;
    private String c_destges;
    private String id_codtcon;
    private String c_destcon;
    private String id_codtres;
    private String c_destres;
    private String c_destres_sub;
    private String n_priorep;
    private String f_fecresp;
    private String f_fecrevi;
    private String c_obsges;
    private String c_tipo;
    private String c_prefijo;
    private String c_numero;
    private String c_anexo;
    private String c_direccion2;
    private String c_coddepa;
    private String c_codprov2;
    private String c_coddist2;
    private String c_igual;
    private String c_destcon_mgllm;
    private String c_destres_mgllm;
    private String f_fecresp_mgllm;
    private String n_impprom_mgllm;
    private String c_obsges_mgllm;
    private String c_nomusu_mgllm;
    private String c_desresp_mt_mgllm;
    private String c_estcuen_mt_mgllm;
    private String c_destcon_ugllm;
    private String c_destres_ugllm;
    private String f_fecresp_ugllm;
    private String n_impprom_ugllm;
    private String c_obsges_ugllm;
    private String c_nomusu_ugllm;
    private String c_desresp_mt_ugllm;
    private String c_estcuen_mt_ugllm;
    private String f_fecresp_mgcam;
    private String n_impprom_mgcam;
    private String c_obsges_mgcam;
    private String c_nomges_mgcam;
    private String c_desresp_mt_mgcam;
    private String c_estcuen_mt_mgcam;
    private String f_fecprog;
    private String c_nomusu;
    private String n_impprom;
    private String tc_codcent;
    private String f_fecimp;
    private String f_fecing_rspta;
    private String c_desrspta;
    private String c_desrspta_sub;
    private String id_codtres_sub;
    private String c_nomges;
    private String max_diasvenc;
    private String c_contrato_1;
    private String c_dessubpro_1;
    private String c_nomsubpro_1;
    private String c_divisa_1;
    private String n_saldohoy_1;
    private String n_diasvenc_1;
    private String c_contrato_2;
    private String c_dessubpro_2;
    private String c_nomsubpro_2;
    private String c_divisa_2;
    private String n_saldohoy_2;
    private String n_diasvenc_2;
    private String c_contrato_3;
    private String c_dessubpro_3;
    private String c_nomsubpro_3;
    private String c_divisa_3;
    private String n_saldohoy_3;
    private String n_diasvenc_3;
    private String c_contrato_4;
    private String c_dessubpro_4;
    private String c_nomsubpro_4;
    private String c_divisa_4;
    private String n_saldohoy_4;
    private String n_diasvenc_4;
    private String c_contrato_5;
    private String c_dessubpro_5;
    private String c_nomsubpro_5;
    private String c_divisa_5;
    private String n_saldohoy_5;
    private String n_diasvenc_5;
    private String c_contrato_6;
    private String c_dessubpro_6;
    private String c_nomsubpro_6;
    private String c_divisa_6;
    private String n_saldohoy_6;
    private String n_diasvenc_6;
    private String direccion_encontrada;
    private String distrito_encontrado;
    private String f_impresion1;
    private String id_codtres1;
    private String id_codusu1;
    private String f_impresion2;
    private String id_codtres2;
    private String id_codusu2;
    private String f_impresion3;
    private String id_codtres3;
    private String id_codusu3;
    private String f_impresion4;
    private String id_codtres4;
    private String id_codusu4;
    private String f_impresion5;
    private String id_codtres5;
    private String id_codusu5;
    private String f_impresion6;
    private String id_codtres6;
    private String id_codusu6;
    private String f_fecimp_ult;
    private String c_codrspta;
    private String c_cuad_plano;
    private String c_cuad_x;
    private String c_cuad_y;

    public ArrayList reporte_avance_gestion(String fecha1, String fecha2) throws Exception{
        Conexion co=new Conexion();
        ArrayList lista=new ArrayList();
        ResultSet rs=co.listar("select * from usp_qry_reporte_avance('" + fecha1 + "','" +
        fecha2 + "')");
        Reportes re=new Reportes();

        while(rs.next()){
           re=new Reportes();
           String fecpro, fecmod;
           fecpro=rs.getString("if_fproceso").substring(8, 10) + "/" +
           rs.getString("if_fproceso").substring(5, 7) + "/" +
           rs.getString("if_fproceso").substring(0, 4);

           fecmod=rs.getString("if_fecmod").substring(8, 10) + "/" +
           rs.getString("if_fecmod").substring(5, 7) + "/" +
           rs.getString("if_fecmod").substring(0, 4) + " " +
           rs.getString("if_fecmod").substring(11, 16);

           re.setC_codcent(rs.getString("ic_codcent"));
           re.setC_contrato(rs.getString("ic_contrato"));
           re.setF_fproceso(fecpro);
           re.setC_nombre(rs.getString("ic_nombre"));
           re.setC_nomsubpro(rs.getString("ic_nomsubpro"));
           re.setC_territorio(rs.getString("ic_territorio"));
           re.setC_divisa(rs.getString("ic_divisa"));
           re.setN_saldohoy(rs.getString("in_saldohoy"));
           re.setN_diasvenc(rs.getString("in_diasvenc"));
           re.setId_codtcon(rs.getString("iid_codtcon"));
           re.setId_codtres(rs.getString("iid_codtres"));
           re.setC_obsges(rs.getString("ic_obsges"));
           re.setF_fecmod(fecmod);
           lista.add(re);
        }return lista;
    }

    public ArrayList reporte_gestion_mitaxi(String f_fecini, String f_fecfin,
     String id_codper) throws Exception{
     Conexion co=new Conexion();
     ArrayList lista=new ArrayList();
     ResultSet rs=co.listar(" SELECT * FROM USP_QRY_REPORTE_SEMANAL_MTAXI('" + f_fecini + "','" +
     f_fecfin + "','" + id_codper + "') ");
     Reportes re=new Reportes();

      while(rs.next()){
      re=new Reportes();    
      re.setC_codcent(rs.getString("c_codcent"));
      re.setC_nombof(rs.getString("c_nombof"));
      re.setC_dessubpro(rs.getString("c_dessubpro"));
      re.setC_contrato(rs.getString("c_contrato"));
      re.setTc_codcent(rs.getString("tc_codcent"));
      re.setC_nombre(rs.getString("c_nombre"));
      re.setC_divisa(rs.getString("c_divisa"));
      re.setN_saldohoy(rs.getString("n_saldohoy"));
      re.setN_diasvenc(rs.getString("n_diasvenc"));
      re.setC_destcon_mgllm(rs.getString("c_destcon_mgllm"));
      re.setC_destres_mgllm(rs.getString("c_destres_mgllm"));
      re.setF_fecresp_mgllm(rs.getString("f_fecresp_mgllm"));
      re.setN_impprom_mgllm(rs.getString("n_impprom_mgllm"));
      re.setC_obsges_mgllm(rs.getString("c_obsges_mgllm"));
      re.setC_nomusu_mgllm(rs.getString("c_nomusu_mgllm"));
      re.setC_desresp_mt_mgllm(rs.getString("c_desresp_mt_mgllm"));
      re.setC_estcuen_mt_mgllm(rs.getString("c_estcuen_mt_mgllm"));
      re.setC_destcon_ugllm(rs.getString("c_destcon_ugllm"));
      re.setC_destres_ugllm(rs.getString("c_destres_ugllm"));
      re.setF_fecresp_ugllm(rs.getString("f_fecresp_ugllm"));
      re.setN_impprom_ugllm(rs.getString("n_impprom_ugllm"));
      re.setC_obsges_ugllm(rs.getString("c_obsges_ugllm"));
      re.setC_nomusu_ugllm(rs.getString("c_nomusu_ugllm"));
      re.setC_desresp_mt_ugllm(rs.getString("c_desresp_mt_ugllm"));
      re.setC_estcuen_mt_ugllm(rs.getString("c_estcuen_mt_ugllm"));
      re.setF_fecresp_mgcam(rs.getString("f_fecresp_mgcam"));
      re.setN_impprom_mgcam(rs.getString("n_impprom_mgcam"));
      re.setC_obsges_mgcam(rs.getString("c_obsges_mgcam"));
      re.setC_nomges_mgcam(rs.getString("c_nomges_mgcam"));
      re.setC_desresp_mt_mgcam(rs.getString("c_desresp_mt_mgcam"));
      re.setC_estcuen_mt_mgcam(rs.getString("c_estcuen_mt_mgcam"));
      lista.add(re);
     }return lista;
    }


    public ResultSet reporte_gestion_web(String f_fproceso, String f_fecing) throws Exception{
    Conexion co=new Conexion();    
    ResultSet rs=co.listar(" SELECT * FROM USP_QRY_REPORTE_GESTION('" + f_fproceso + "','" + f_fecing + "') ");
    return rs;
    }

    public ArrayList reporte_impresion_cartas2(String f_fproceso, String c_nrodoc,
    String c_nombre, String id_codper) throws Exception{
    Conexion co=new Conexion();
    ArrayList lista=new ArrayList();
    String cadena=" SELECT * FROM USP_QRY_REPORTE_IMPRESION_CARTAS3('" + f_fproceso + "','" + c_nrodoc + "','" +
    c_nombre + "','" + id_codper + "') ";
    ResultSet rs=co.listar(cadena);
    Reportes re=new Reportes();
    while(rs.next()){
    re=new Reportes();

    re.setC_codcent(rs.getString("xc_codcent"));
    re.setC_nrodoc(rs.getString("xc_nrodoc"));
    re.setC_nombre(rs.getString("xc_nombre"));
    re.setC_direccion(rs.getString("xc_direccion"));
    re.setC_distprov(rs.getString("xc_distprov"));
    re.setMax_diasvenc(rs.getString("xmax_diasvenc"));
    re.setDireccion_encontrada(rs.getString("xdireccion_encontrada"));
    re.setDistrito_encontrado(rs.getString("xdistrito_encontrado"));

    re.setC_contrato_1(rs.getString("xc_contrato_1"));
    re.setC_dessubpro_1(rs.getString("xc_dessubpro_1"));
    re.setC_nomsubpro_1(rs.getString("xc_nomsubpro_1"));
    re.setC_divisa_1(rs.getString("xc_divisa_1"));
    re.setN_saldohoy_1(rs.getString("xn_saldohoy_1"));
    re.setN_diasvenc_1(rs.getString("xn_diasvenc_1"));

    re.setC_contrato_2(rs.getString("xc_contrato_2"));
    re.setC_dessubpro_2(rs.getString("xc_dessubpro_2"));
    re.setC_nomsubpro_2(rs.getString("xc_nomsubpro_2"));
    re.setC_divisa_2(rs.getString("xc_divisa_2"));
    re.setN_saldohoy_2(rs.getString("xn_saldohoy_2"));
    re.setN_diasvenc_2(rs.getString("xn_diasvenc_2"));

    re.setC_contrato_3(rs.getString("xc_contrato_3"));
    re.setC_dessubpro_3(rs.getString("xc_dessubpro_3"));
    re.setC_nomsubpro_3(rs.getString("xc_nomsubpro_3"));
    re.setC_divisa_3(rs.getString("xc_divisa_3"));
    re.setN_saldohoy_3(rs.getString("xn_saldohoy_3"));
    re.setN_diasvenc_3(rs.getString("xn_diasvenc_3"));

    re.setC_contrato_4(rs.getString("xc_contrato_4"));
    re.setC_dessubpro_4(rs.getString("xc_dessubpro_4"));
    re.setC_nomsubpro_4(rs.getString("xc_nomsubpro_4"));
    re.setC_divisa_4(rs.getString("xc_divisa_4"));
    re.setN_saldohoy_4(rs.getString("xn_saldohoy_4"));
    re.setN_diasvenc_4(rs.getString("xn_diasvenc_4"));

    re.setC_contrato_5(rs.getString("xc_contrato_5"));
    re.setC_dessubpro_5(rs.getString("xc_dessubpro_5"));
    re.setC_nomsubpro_5(rs.getString("xc_nomsubpro_5"));
    re.setC_divisa_5(rs.getString("xc_divisa_5"));
    re.setN_saldohoy_5(rs.getString("xn_saldohoy_5"));
    re.setN_diasvenc_5(rs.getString("xn_diasvenc_5"));

    re.setC_contrato_6(rs.getString("xc_contrato_6"));
    re.setC_dessubpro_6(rs.getString("xc_dessubpro_6"));
    re.setC_nomsubpro_6(rs.getString("xc_nomsubpro_6"));
    re.setC_divisa_6(rs.getString("xc_divisa_6"));
    re.setN_saldohoy_6(rs.getString("xn_saldohoy_6"));
    re.setN_diasvenc_6(rs.getString("xn_diasvenc_6"));

    re.setF_fecimp_ult(rs.getString("xf_fecimp_ult"));
    re.setC_codrspta(rs.getString("xc_codrspta"));
    re.setC_desrspta_sub(rs.getString("xc_desrspta_sub"));
    re.setF_fproceso(rs.getString("xf_fproceso"));
    re.setC_destcon(rs.getString("xc_destcon"));
    re.setC_destres(rs.getString("xc_destres"));   
    re.setC_cuad_plano(rs.getString("xc_cuad_plano"));
    re.setC_cuad_x(rs.getString("xc_cuad_x"));
    re.setC_cuad_y(rs.getString("xc_cuad_y"));
    lista.add(re);
    }return lista;
    }
    
    public ArrayList reporte_consolidado_cierre(String id_codper, String id_codtges) throws Exception{
    Conexion co=new Conexion();
    ArrayList lista=new ArrayList();
    ResultSet rs=co.listar(" SELECT * FROM USP_QRY_REPORTE_CONSOLIDADO_CIERRE('" + id_codper + "','" + id_codtges + "')");
    Reportes re=new Reportes();
    while(rs.next()){
     re=new Reportes();
     re.setF_fproceso(rs.getString("f_fproceso"));
     re.setC_agencia(rs.getString("c_agencia"));
     re.setC_gestor(rs.getString("c_gestor"));
     re.setC_territorio(rs.getString("c_territorio"));
     re.setC_oficina(rs.getString("c_oficina"));
     re.setC_subprod(rs.getString("c_subprod"));
     re.setC_nomsubpro(rs.getString("c_nomsubpro"));
     re.setC_contrato(rs.getString("c_contrato"));
     re.setC_codcent(rs.getString("c_codcent"));
     re.setC_tpersona(rs.getString("c_tpersona"));
     re.setC_nombre(rs.getString("c_nombre"));
     re.setC_divisa(rs.getString("c_divisa"));
     re.setN_saldohoy(rs.getString("n_saldohoy"));
     re.setC_direccion(rs.getString("c_direccion"));
     re.setC_telefono(rs.getString("c_telefono"));
     re.setC_codpostal(rs.getString("c_codpostal"));
     re.setC_codestado(rs.getString("c_codestado"));
     re.setC_codprov(rs.getString("c_codprov"));
     re.setC_coddist(rs.getString("c_coddist"));
     re.setF_fincumpli(rs.getString("f_fincumpli"));
     re.setN_diasvenc(rs.getString("n_diasvenc"));
     re.setC_ubigeo(rs.getString("c_ubigeo"));
     re.setC_dpto(rs.getString("c_dpto"));
     re.setC_distprov(rs.getString("c_distprov"));
     re.setC_tramodia(rs.getString("c_tramodia"));
     re.setC_tipodoc(rs.getString("c_tipodoc"));
     re.setC_nrodoc(rs.getString("c_nrodoc"));
     re.setC_tipofono1(rs.getString("c_tipofono1"));
     re.setC_prefijo1(rs.getString("c_prefijo1"));
     re.setC_fono1(rs.getString("c_fono1"));
     re.setC_extension1(rs.getString("c_extension1"));
     re.setC_tipofono2(rs.getString("c_tipofono2"));
     re.setC_prefijo2(rs.getString("c_prefijo2"));
     re.setC_fono2(rs.getString("c_fono2"));
     re.setC_extension2(rs.getString("c_extension2"));
     re.setC_tipofono3(rs.getString("c_tipofono3"));
     re.setC_prefijo3(rs.getString("c_prefijo3"));
     re.setC_fono3(rs.getString("c_fono3"));
     re.setC_extension3(rs.getString("c_extension3"));
     re.setC_tipofono4(rs.getString("c_tipofono4"));
     re.setC_prefijo4(rs.getString("c_prefijo4"));
     re.setC_fono4(rs.getString("c_fono4"));
     re.setC_extension4(rs.getString("c_extension4"));
     re.setC_tipofono5(rs.getString("c_tipofono5"));
     re.setC_prefijo5(rs.getString("c_prefijo5"));
     re.setC_fono5(rs.getString("c_fono5"));
     re.setC_extension5(rs.getString("c_extension5"));
     re.setC_email(rs.getString("c_email"));
     re.setC_provision(rs.getString("c_provision"));
     re.setC_tarrastre(rs.getString("c_tarrastre"));
     re.setN_impprov(rs.getString("n_impprov"));
     re.setN_deutotobli(rs.getString("n_deutotobli"));
     re.setN_deutotclie(rs.getString("n_deutotclie"));
     re.setC_dessubpro(rs.getString("c_dessubpro"));
     re.setC_nombof(rs.getString("c_nombof"));
     re.setC_clientevip(rs.getString("c_clientevip"));
     re.setC_sobreendeu(rs.getString("c_sobreendeu"));
     re.setC_provmayor(rs.getString("c_provmayor"));
     re.setC_scoriesp(rs.getString("c_scoriesp"));
     re.setC_inclin(rs.getString("c_inclin"));
     re.setC_msueldo1(rs.getString("c_msueldo1"));
     re.setC_bajaph(rs.getString("c_bajaph"));
     re.setF_fecasig(rs.getString("f_fecasig"));
     re.setF_fecmod(rs.getString("f_fecmod"));
     re.setN_idxges(rs.getString("n_idxges"));
     re.setC_destges(rs.getString("c_destges"));
     re.setC_destcon(rs.getString("c_destcon"));
     re.setC_destres(rs.getString("c_destres"));
     re.setC_destres_sub(rs.getString("c_destres_sub"));
     re.setF_fecresp(rs.getString("f_fecresp"));
     re.setC_obsges(rs.getString("c_obsges"));
     re.setC_nomusu(rs.getString("c_nomusu"));
     lista.add(re);
    }return lista;
    }

    public ResultSet reporte_historial(String id_codper, String id_codtges) throws Exception{
    Conexion co=new Conexion();
    ResultSet rs=co.listar(" SELECT * FROM USP_QRY_REPORTE_HISTORIAL('" + id_codper + "','" + id_codtges + "') ");
    return rs;
    }

    public ArrayList reporte_impresion_cartas(String f_fecimp_ini, String f_fecimp_fin, String c_nrodoc,
    String c_nombre, String id_codper, String id_codrspta, String id_codrspta_sub, String id_codtcon,
    String id_codtres) throws Exception{
    Conexion co=new Conexion();
    ArrayList lista=new ArrayList();
    ResultSet rs=co.listar(" SELECT * FROM USP_QRY_REPORTE_GESTION_CARTAS('" + f_fecimp_ini + "','" +
    f_fecimp_fin + "','" + c_nrodoc + "','" + c_nombre + "','" + id_codper + "','" + id_codrspta + "','" +
    id_codrspta_sub + "','" + id_codtcon + "','" + id_codtres + "') ");
    Reportes re=new Reportes();
    while(rs.next()){
    re=new Reportes();
    re.setF_fproceso(rs.getString("f_fproceso"));
    re.setC_agencia(rs.getString("c_agencia"));
    re.setC_gestor(rs.getString("c_gestor"));
    re.setC_territorio(rs.getString("c_territorio"));
    re.setC_oficina(rs.getString("c_oficina"));
    re.setC_subprod(rs.getString("c_subprod"));
    re.setC_nomsubpro(rs.getString("c_nomsubpro"));
    re.setC_contrato(rs.getString("c_contrato"));
    re.setC_codcent(rs.getString("c_codcent"));
    re.setC_tpersona(rs.getString("c_tpersona"));
    re.setC_nombre(rs.getString("c_nombre"));
    re.setC_divisa(rs.getString("c_divisa"));
    re.setN_saldohoy(rs.getString("n_saldohoy"));
    re.setC_direccion(rs.getString("c_direccion"));
    re.setC_telefono(rs.getString("c_telefono"));
    re.setC_codpostal(rs.getString("c_codpostal"));
    re.setC_codestado(rs.getString("c_codestado"));
    re.setC_codprov(rs.getString("c_codprov"));
    re.setC_coddist(rs.getString("c_coddist"));
    re.setF_fincumpli(rs.getString("f_fincumpli"));
    re.setN_diasvenc(rs.getString("n_diasvenc"));
    re.setC_ubigeo(rs.getString("c_ubigeo"));
    re.setC_dpto(rs.getString("c_dpto"));
    re.setC_distprov(rs.getString("c_distprov"));
    re.setC_tramodia(rs.getString("c_tramodia"));
    re.setC_tipodoc(rs.getString("c_tipodoc"));
    re.setC_nrodoc(rs.getString("c_nrodoc"));
    re.setC_tipofono1(rs.getString("c_tipofono1"));
    re.setC_prefijo1(rs.getString("c_prefijo1"));
    re.setC_fono1(rs.getString("c_fono1"));
    re.setC_extension1(rs.getString("c_extension1"));
    re.setC_tipofono2(rs.getString("c_tipofono2"));
    re.setC_prefijo2(rs.getString("c_prefijo2"));
    re.setC_fono2(rs.getString("c_fono2"));
    re.setC_extension2(rs.getString("c_extension2"));
    re.setC_tipofono3(rs.getString("c_tipofono3"));
    re.setC_prefijo3(rs.getString("c_prefijo3"));
    re.setC_fono3(rs.getString("c_fono3"));
    re.setC_extension3(rs.getString("c_extension3"));
    re.setC_tipofono4(rs.getString("c_tipofono4"));
    re.setC_prefijo4(rs.getString("c_prefijo4"));
    re.setC_fono4(rs.getString("c_fono4"));
    re.setC_extension4(rs.getString("c_extension4"));
    re.setC_tipofono5(rs.getString("c_tipofono5"));
    re.setC_prefijo5(rs.getString("c_prefijo5"));
    re.setC_fono5(rs.getString("c_fono5"));
    re.setC_extension5(rs.getString("c_extension5"));
    re.setC_email(rs.getString("c_email"));
    re.setC_provision(rs.getString("c_provision"));
    re.setC_tarrastre(rs.getString("c_tarrastre"));
    re.setN_impprov(rs.getString("n_impprov"));
    re.setN_deutotobli(rs.getString("n_deutotobli"));
    re.setN_deutotclie(rs.getString("n_deutotclie"));
    re.setC_dessubpro(rs.getString("c_dessubpro"));
    re.setC_nombof(rs.getString("c_nombof"));
    re.setC_clientevip(rs.getString("c_clientevip"));
    re.setC_sobreendeu(rs.getString("c_sobreendeu"));
    re.setC_provmayor(rs.getString("c_provmayor"));
    re.setC_scoriesp(rs.getString("c_scoriesp"));
    re.setC_inclin(rs.getString("c_inclin"));
    re.setC_msueldo1(rs.getString("c_msueldo1"));
    re.setC_bajaph(rs.getString("c_bajaph"));
    re.setN_idxges(rs.getString("n_idxges"));
    re.setF_fecimp(rs.getString("f_fecimp"));
    re.setF_fecing_rspta(rs.getString("f_fecing_rspta"));
    re.setC_desrspta(rs.getString("c_desrspta"));
    re.setC_desrspta_sub(rs.getString("c_desrspta_sub"));
    re.setId_codtcon(rs.getString("id_codtcon"));
    re.setC_destcon(rs.getString("c_destcon"));
    re.setId_codtres(rs.getString("id_codtres"));
    re.setC_destres(rs.getString("c_destres"));
    re.setId_codtres_sub(rs.getString("id_codtres_sub"));
    re.setC_destres_sub(rs.getString("c_destres_sub"));
    re.setF_fecresp(rs.getString("f_fecresp"));
    re.setF_fecrevi(rs.getString("f_fecrevi"));
    re.setF_fecprog(rs.getString("f_fecprog"));
    re.setC_obsges(rs.getString("c_obsges"));
    re.setC_nomges(rs.getString("c_nomges"));
    lista.add(re);
    }return lista;
    }
    
    public ArrayList Reporte_gestion(String c_tipo,String f_fecini ,String f_fecfin,String id_codper,
    String id_codtges,String id_codtcon,String id_codtres,String b_flgult_ges,    
    String c_nrodoc,String c_nombre) throws Exception{
    Conexion co=new Conexion();    
    String cadena="";

    if(c_tipo.equals("1")){
    cadena= " SELECT * FROM USP_QRY_REPORTE_GESTION_FPROCESO('"+ f_fecini + "','" +
    f_fecfin + "','" + id_codper + "','" + id_codtges + "','" + id_codtcon + "','" +
    id_codtres + "','" + b_flgult_ges + "','" + c_nrodoc + "','" + c_nombre + "')";
    }else{
    cadena= " SELECT * FROM USP_QRY_REPORTE_GESTION_FASIGNADO('"+ f_fecini + "','" +
    f_fecfin + "','" + id_codper + "','" + id_codtges + "','" + id_codtcon + "','" +
    id_codtres + "','" + b_flgult_ges + "','" + c_nrodoc + "','" + c_nombre + "')";
    }    
    ArrayList lista=new ArrayList();
    ResultSet rs=co.listar(cadena);
    Reportes re=new Reportes();

    while(rs.next()){
    re=new Reportes();
    re.setC_agencia(rs.getString("c_agencia"));
    re.setF_fproceso(rs.getString("f_fproceso"));
    re.setC_agencia(rs.getString("c_agencia"));
    re.setC_gestor(rs.getString("c_gestor"));
    re.setC_territorio(rs.getString("c_territorio"));
    re.setC_oficina(rs.getString("c_oficina"));
    re.setC_subprod(rs.getString("c_subprod"));
    re.setC_nomsubpro(rs.getString("c_nomsubpro"));
    re.setC_contrato(rs.getString("c_contrato"));
    re.setC_codcent(rs.getString("c_codcent"));
    re.setC_tpersona(rs.getString("c_tpersona"));
    re.setC_nombre(rs.getString("c_nombre"));
    re.setC_divisa(rs.getString("c_divisa"));
    re.setN_saldohoy(rs.getString("n_saldohoy"));
    re.setC_direccion(rs.getString("c_direccion"));
    re.setC_telefono(rs.getString("c_telefono"));
    re.setC_codpostal(rs.getString("c_codpostal"));
    re.setC_codestado(rs.getString("c_codestado"));
    re.setC_codprov(rs.getString("c_codprov"));
    re.setC_coddist(rs.getString("c_coddist"));
    re.setF_fincumpli(rs.getString("f_fincumpli"));
    re.setN_diasvenc(rs.getString("n_diasvenc"));
    re.setC_ubigeo(rs.getString("c_ubigeo"));
    re.setC_dpto(rs.getString("c_dpto"));
    re.setC_distprov(rs.getString("c_distprov"));
    re.setC_tramodia(rs.getString("c_tramodia"));
    re.setC_tipodoc(rs.getString("c_tipodoc"));
    re.setC_nrodoc(rs.getString("c_nrodoc"));
    re.setC_tipofono1(rs.getString("c_tipofono1"));
    re.setC_prefijo1(rs.getString("c_prefijo1"));
    re.setC_fono1(rs.getString("c_fono1"));
    re.setC_extension1(rs.getString("c_extension1"));
    re.setC_tipofono2(rs.getString("c_tipofono2"));
    re.setC_prefijo2(rs.getString("c_prefijo2"));
    re.setC_fono2(rs.getString("c_fono2"));
    re.setC_extension2(rs.getString("c_extension2"));
    re.setC_tipofono3(rs.getString("c_tipofono3"));
    re.setC_prefijo3(rs.getString("c_prefijo3"));
    re.setC_fono3(rs.getString("c_fono3"));
    re.setC_extension3(rs.getString("c_extension3"));
    re.setC_tipofono4(rs.getString("c_tipofono4"));
    re.setC_prefijo4(rs.getString("c_prefijo4"));
    re.setC_fono4(rs.getString("c_fono4"));
    re.setC_extension4(rs.getString("c_extension4"));
    re.setC_tipofono5(rs.getString("c_tipofono5"));
    re.setC_prefijo5(rs.getString("c_prefijo5"));
    re.setC_fono5(rs.getString("c_fono5"));
    re.setC_extension5(rs.getString("c_extension5"));
    re.setC_email(rs.getString("c_email"));
    re.setC_provision(rs.getString("c_provision"));
    re.setC_tarrastre(rs.getString("c_tarrastre"));
    re.setN_impprov(rs.getString("n_impprov"));
    re.setN_deutotobli(rs.getString("n_deutotobli"));
    re.setN_deutotclie(rs.getString("n_deutotclie"));
    re.setC_dessubpro(rs.getString("c_dessubpro"));
    re.setC_nombof(rs.getString("c_nombof"));
    re.setC_clientevip(rs.getString("c_clientevip"));
    re.setC_sobreendeu(rs.getString("c_sobreendeu"));
    re.setC_provmayor(rs.getString("c_provmayor"));
    re.setC_scoriesp(rs.getString("c_scoriesp"));
    re.setC_inclin(rs.getString("c_inclin"));
    re.setC_msueldo1(rs.getString("c_msueldo1"));
    re.setC_bajaph(rs.getString("c_bajaph"));
    re.setF_fecasig(rs.getString("f_fecasig"));
    re.setF_fecmod(rs.getString("f_fecmod"));
    re.setN_idxges(rs.getString("n_idxges"));
    re.setId_codtges(rs.getString("id_codtges"));
    re.setC_destges(rs.getString("c_destges"));
    re.setId_codtcon(rs.getString("id_codtcon"));
    re.setC_destcon(rs.getString("c_destcon"));
    re.setId_codtres(rs.getString("id_codtres"));
    re.setC_destres(rs.getString("c_destres"));
    re.setC_destres_sub(rs.getString("c_destres_sub"));
    re.setF_fecresp(rs.getString("f_fecresp"));
    re.setF_fecrevi(rs.getString("f_fecrevi"));
    re.setF_fecprog(rs.getString("f_fecprog"));
    re.setC_obsges(rs.getString("c_obsges"));
    re.setC_nomusu(rs.getString("c_nomusu"));
    re.setN_impprom(rs.getString("n_impprom"));
    lista.add(re);
    }return lista;
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
     * @return the c_territorio
     */
    public String getC_territorio() {
        return c_territorio;
    }

    /**
     * @param c_territorio the c_territorio to set
     */
    public void setC_territorio(String c_territorio) {
        this.c_territorio = c_territorio;
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
     * @return the n_saldohoy
     */
    public String getN_saldohoy() {
        return n_saldohoy;
    }

    /**
     * @param n_saldohoy the n_saldohoy to set
     */
    public void setN_saldohoy(String n_saldohoy) {
        this.n_saldohoy = n_saldohoy;
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
     * @return the n_diasvenc
     */
    public String getN_diasvenc() {
        return n_diasvenc;
    }

    /**
     * @param n_diasvenc the n_diasvenc to set
     */
    public void setN_diasvenc(String n_diasvenc) {
        this.n_diasvenc = n_diasvenc;
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
     * @return the n_impprov
     */
    public String getN_impprov() {
        return n_impprov;
    }

    /**
     * @param n_impprov the n_impprov to set
     */
    public void setN_impprov(String n_impprov) {
        this.n_impprov = n_impprov;
    }

    /**
     * @return the n_deutotobli
     */
    public String getN_deutotobli() {
        return n_deutotobli;
    }

    /**
     * @param n_deutotobli the n_deutotobli to set
     */
    public void setN_deutotobli(String n_deutotobli) {
        this.n_deutotobli = n_deutotobli;
    }

    /**
     * @return the n_deutotclie
     */
    public String getN_deutotclie() {
        return n_deutotclie;
    }

    /**
     * @param n_deutotclie the n_deutotclie to set
     */
    public void setN_deutotclie(String n_deutotclie) {
        this.n_deutotclie = n_deutotclie;
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
     * @return the f_fecmod
     */
    public String getF_fecmod() {
        return f_fecmod;
    }

    /**
     * @param f_fecmod the f_fecmod to set
     */
    public void setF_fecmod(String f_fecmod) {
        this.f_fecmod = f_fecmod;
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
     * @return the n_priorep
     */
    public String getN_priorep() {
        return n_priorep;
    }

    /**
     * @param n_priorep the n_priorep to set
     */
    public void setN_priorep(String n_priorep) {
        this.n_priorep = n_priorep;
    }

    /**
     * @return the f_fecresp
     */
    public String getF_fecresp() {
        return f_fecresp;
    }

    /**
     * @param f_fecresp the f_fecresp to set
     */
    public void setF_fecresp(String f_fecresp) {
        this.f_fecresp = f_fecresp;
    }

    /**
     * @return the f_fecrevi
     */
    public String getF_fecrevi() {
        return f_fecrevi;
    }

    /**
     * @param f_fecrevi the f_fecrevi to set
     */
    public void setF_fecrevi(String f_fecrevi) {
        this.f_fecrevi = f_fecrevi;
    }

    /**
     * @return the c_obsges
     */
    public String getC_obsges() {
        return c_obsges;
    }

    /**
     * @param c_obsges the c_obsges to set
     */
    public void setC_obsges(String c_obsges) {
        this.c_obsges = c_obsges;
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

    public String getC_anexo() {
        return c_anexo;
    }

    public void setC_anexo(String c_anexo) {
        this.c_anexo = c_anexo;
    }

    public String getC_direccion2() {
        return c_direccion2;
    }

    public void setC_direccion2(String c_direccion2) {
        this.c_direccion2 = c_direccion2;
    }

    public String getC_coddepa() {
        return c_coddepa;
    }

    public void setC_coddepa(String c_coddepa) {
        this.c_coddepa = c_coddepa;
    }

    public String getC_codprov2() {
        return c_codprov2;
    }

    public void setC_codprov2(String c_codprov2) {
        this.c_codprov2 = c_codprov2;
    }

    public String getC_coddist2() {
        return c_coddist2;
    }

    public void setC_coddist2(String c_coddist2) {
        this.c_coddist2 = c_coddist2;
    }

    public String getC_igual() {
        return c_igual;
    }

    public void setC_igual(String c_igual) {
        this.c_igual = c_igual;
    }

    public String getC_destcon_mgllm() {
        return c_destcon_mgllm;
    }

    public void setC_destcon_mgllm(String c_destcon_mgllm) {
        this.c_destcon_mgllm = c_destcon_mgllm;
    }

    public String getC_destres_mgllm() {
        return c_destres_mgllm;
    }

    public void setC_destres_mgllm(String c_destres_mgllm) {
        this.c_destres_mgllm = c_destres_mgllm;
    }

    public String getF_fecresp_mgllm() {
        return f_fecresp_mgllm;
    }

    public void setF_fecresp_mgllm(String f_fecresp_mgllm) {
        this.f_fecresp_mgllm = f_fecresp_mgllm;
    }

    public String getN_impprom_mgllm() {
        return n_impprom_mgllm;
    }

    public void setN_impprom_mgllm(String n_impprom_mgllm) {
        this.n_impprom_mgllm = n_impprom_mgllm;
    }

    public String getC_obsges_mgllm() {
        return c_obsges_mgllm;
    }

    public void setC_obsges_mgllm(String c_obsges_mgllm) {
        this.c_obsges_mgllm = c_obsges_mgllm;
    }

    public String getC_nomusu_mgllm() {
        return c_nomusu_mgllm;
    }

    public void setC_nomusu_mgllm(String c_nomusu_mgllm) {
        this.c_nomusu_mgllm = c_nomusu_mgllm;
    }

    public String getC_desresp_mt_mgllm() {
        return c_desresp_mt_mgllm;
    }

    public void setC_desresp_mt_mgllm(String c_desresp_mt_mgllm) {
        this.c_desresp_mt_mgllm = c_desresp_mt_mgllm;
    }

    public String getC_estcuen_mt_mgllm() {
        return c_estcuen_mt_mgllm;
    }

    public void setC_estcuen_mt_mgllm(String c_estcuen_mt_mgllm) {
        this.c_estcuen_mt_mgllm = c_estcuen_mt_mgllm;
    }

    public String getC_destcon_ugllm() {
        return c_destcon_ugllm;
    }

    public void setC_destcon_ugllm(String c_destcon_ugllm) {
        this.c_destcon_ugllm = c_destcon_ugllm;
    }

    public String getC_destres_ugllm() {
        return c_destres_ugllm;
    }

    public void setC_destres_ugllm(String c_destres_ugllm) {
        this.c_destres_ugllm = c_destres_ugllm;
    }

    public String getF_fecresp_ugllm() {
        return f_fecresp_ugllm;
    }

    public void setF_fecresp_ugllm(String f_fecresp_ugllm) {
        this.f_fecresp_ugllm = f_fecresp_ugllm;
    }

    public String getN_impprom_ugllm() {
        return n_impprom_ugllm;
    }

    public void setN_impprom_ugllm(String n_impprom_ugllm) {
        this.n_impprom_ugllm = n_impprom_ugllm;
    }

    public String getC_obsges_ugllm() {
        return c_obsges_ugllm;
    }

    public void setC_obsges_ugllm(String c_obsges_ugllm) {
        this.c_obsges_ugllm = c_obsges_ugllm;
    }

    public String getC_nomusu_ugllm() {
        return c_nomusu_ugllm;
    }

    public void setC_nomusu_ugllm(String c_nomusu_ugllm) {
        this.c_nomusu_ugllm = c_nomusu_ugllm;
    }

    public String getC_desresp_mt_ugllm() {
        return c_desresp_mt_ugllm;
    }

    public void setC_desresp_mt_ugllm(String c_desresp_mt_ugllm) {
        this.c_desresp_mt_ugllm = c_desresp_mt_ugllm;
    }

    public String getC_estcuen_mt_ugllm() {
        return c_estcuen_mt_ugllm;
    }

    public void setC_estcuen_mt_ugllm(String c_estcuen_mt_ugllm) {
        this.c_estcuen_mt_ugllm = c_estcuen_mt_ugllm;
    }

    public String getF_fecresp_mgcam() {
        return f_fecresp_mgcam;
    }

    public void setF_fecresp_mgcam(String f_fecresp_mgcam) {
        this.f_fecresp_mgcam = f_fecresp_mgcam;
    }

    public String getN_impprom_mgcam() {
        return n_impprom_mgcam;
    }

    public void setN_impprom_mgcam(String n_impprom_mgcam) {
        this.n_impprom_mgcam = n_impprom_mgcam;
    }

    public String getC_obsges_mgcam() {
        return c_obsges_mgcam;
    }

    public void setC_obsges_mgcam(String c_obsges_mgcam) {
        this.c_obsges_mgcam = c_obsges_mgcam;
    }

    public String getC_nomges_mgcam() {
        return c_nomges_mgcam;
    }

    public void setC_nomges_mgcam(String c_nomges_mgcam) {
        this.c_nomges_mgcam = c_nomges_mgcam;
    }

    public String getC_desresp_mt_mgcam() {
        return c_desresp_mt_mgcam;
    }

    public void setC_desresp_mt_mgcam(String c_desresp_mt_mgcam) {
        this.c_desresp_mt_mgcam = c_desresp_mt_mgcam;
    }

    public String getC_estcuen_mt_mgcam() {
        return c_estcuen_mt_mgcam;
    }

    public void setC_estcuen_mt_mgcam(String c_estcuen_mt_mgcam) {
        this.c_estcuen_mt_mgcam = c_estcuen_mt_mgcam;
    }

    public String getF_fecprog() {
        return f_fecprog;
    }

    public void setF_fecprog(String f_fecprog) {
        this.f_fecprog = f_fecprog;
    }

    public String getC_nomusu() {
        return c_nomusu;
    }

    public void setC_nomusu(String c_nomusu) {
        this.c_nomusu = c_nomusu;
    }

    public String getN_impprom() {
        return n_impprom;
    }

    public void setN_impprom(String n_impprom) {
        this.n_impprom = n_impprom;
    }

    public String getTc_codcent() {
        return tc_codcent;
    }

    public void setTc_codcent(String tc_codcent) {
        this.tc_codcent = tc_codcent;
    }

    public String getF_fecimp() {
        return f_fecimp;
    }

    public void setF_fecimp(String f_fecimp) {
        this.f_fecimp = f_fecimp;
    }

    public String getF_fecing_rspta() {
        return f_fecing_rspta;
    }

    public void setF_fecing_rspta(String f_fecing_rspta) {
        this.f_fecing_rspta = f_fecing_rspta;
    }

    public String getC_desrspta() {
        return c_desrspta;
    }

    public void setC_desrspta(String c_desrspta) {
        this.c_desrspta = c_desrspta;
    }

    public String getC_desrspta_sub() {
        return c_desrspta_sub;
    }

    public void setC_desrspta_sub(String c_desrspta_sub) {
        this.c_desrspta_sub = c_desrspta_sub;
    }

    public String getId_codtres_sub() {
        return id_codtres_sub;
    }

    public void setId_codtres_sub(String id_codtres_sub) {
        this.id_codtres_sub = id_codtres_sub;
    }

    public String getC_nomges() {
        return c_nomges;
    }

    public void setC_nomges(String c_nomges) {
        this.c_nomges = c_nomges;
    }

    public String getMax_diasvenc() {
        return max_diasvenc;
    }

    public void setMax_diasvenc(String max_diasvenc) {
        this.max_diasvenc = max_diasvenc;
    }

    public String getC_contrato_1() {
        return c_contrato_1;
    }

    public void setC_contrato_1(String c_contrato_1) {
        this.c_contrato_1 = c_contrato_1;
    }

    public String getC_dessubpro_1() {
        return c_dessubpro_1;
    }

    public void setC_dessubpro_1(String c_dessubpro_1) {
        this.c_dessubpro_1 = c_dessubpro_1;
    }

    public String getC_nomsubpro_1() {
        return c_nomsubpro_1;
    }

    public void setC_nomsubpro_1(String c_nomsubpro_1) {
        this.c_nomsubpro_1 = c_nomsubpro_1;
    }

    public String getC_divisa_1() {
        return c_divisa_1;
    }

    public void setC_divisa_1(String c_divisa_1) {
        this.c_divisa_1 = c_divisa_1;
    }

    public String getN_saldohoy_1() {
        return n_saldohoy_1;
    }

    public void setN_saldohoy_1(String n_saldohoy_1) {
        this.n_saldohoy_1 = n_saldohoy_1;
    }

    public String getN_diasvenc_1() {
        return n_diasvenc_1;
    }

    public void setN_diasvenc_1(String n_diasvenc_1) {
        this.n_diasvenc_1 = n_diasvenc_1;
    }

    public String getC_contrato_2() {
        return c_contrato_2;
    }

    public void setC_contrato_2(String c_contrato_2) {
        this.c_contrato_2 = c_contrato_2;
    }

    public String getC_dessubpro_2() {
        return c_dessubpro_2;
    }

    public void setC_dessubpro_2(String c_dessubpro_2) {
        this.c_dessubpro_2 = c_dessubpro_2;
    }

    public String getC_nomsubpro_2() {
        return c_nomsubpro_2;
    }

    public void setC_nomsubpro_2(String c_nomsubpro_2) {
        this.c_nomsubpro_2 = c_nomsubpro_2;
    }

    public String getC_divisa_2() {
        return c_divisa_2;
    }

    public void setC_divisa_2(String c_divisa_2) {
        this.c_divisa_2 = c_divisa_2;
    }

    public String getN_saldohoy_2() {
        return n_saldohoy_2;
    }

    public void setN_saldohoy_2(String n_saldohoy_2) {
        this.n_saldohoy_2 = n_saldohoy_2;
    }

    public String getN_diasvenc_2() {
        return n_diasvenc_2;
    }

    public void setN_diasvenc_2(String n_diasvenc_2) {
        this.n_diasvenc_2 = n_diasvenc_2;
    }

    public String getC_contrato_3() {
        return c_contrato_3;
    }

    public void setC_contrato_3(String c_contrato_3) {
        this.c_contrato_3 = c_contrato_3;
    }

    public String getC_dessubpro_3() {
        return c_dessubpro_3;
    }

    public void setC_dessubpro_3(String c_dessubpro_3) {
        this.c_dessubpro_3 = c_dessubpro_3;
    }

    public String getC_nomsubpro_3() {
        return c_nomsubpro_3;
    }

    public void setC_nomsubpro_3(String c_nomsubpro_3) {
        this.c_nomsubpro_3 = c_nomsubpro_3;
    }

    public String getC_divisa_3() {
        return c_divisa_3;
    }

    public void setC_divisa_3(String c_divisa_3) {
        this.c_divisa_3 = c_divisa_3;
    }

    public String getN_saldohoy_3() {
        return n_saldohoy_3;
    }

    public void setN_saldohoy_3(String n_saldohoy_3) {
        this.n_saldohoy_3 = n_saldohoy_3;
    }

    public String getN_diasvenc_3() {
        return n_diasvenc_3;
    }

    public void setN_diasvenc_3(String n_diasvenc_3) {
        this.n_diasvenc_3 = n_diasvenc_3;
    }

    public String getC_contrato_4() {
        return c_contrato_4;
    }

    public void setC_contrato_4(String c_contrato_4) {
        this.c_contrato_4 = c_contrato_4;
    }

    public String getC_dessubpro_4() {
        return c_dessubpro_4;
    }

    public void setC_dessubpro_4(String c_dessubpro_4) {
        this.c_dessubpro_4 = c_dessubpro_4;
    }

    public String getC_nomsubpro_4() {
        return c_nomsubpro_4;
    }

    public void setC_nomsubpro_4(String c_nomsubpro_4) {
        this.c_nomsubpro_4 = c_nomsubpro_4;
    }

    public String getC_divisa_4() {
        return c_divisa_4;
    }

    public void setC_divisa_4(String c_divisa_4) {
        this.c_divisa_4 = c_divisa_4;
    }

    public String getN_saldohoy_4() {
        return n_saldohoy_4;
    }

    public void setN_saldohoy_4(String n_saldohoy_4) {
        this.n_saldohoy_4 = n_saldohoy_4;
    }

    public String getN_diasvenc_4() {
        return n_diasvenc_4;
    }

    public void setN_diasvenc_4(String n_diasvenc_4) {
        this.n_diasvenc_4 = n_diasvenc_4;
    }

    public String getC_contrato_5() {
        return c_contrato_5;
    }

    public void setC_contrato_5(String c_contrato_5) {
        this.c_contrato_5 = c_contrato_5;
    }

    public String getC_dessubpro_5() {
        return c_dessubpro_5;
    }

    public void setC_dessubpro_5(String c_dessubpro_5) {
        this.c_dessubpro_5 = c_dessubpro_5;
    }

    public String getC_nomsubpro_5() {
        return c_nomsubpro_5;
    }

    public void setC_nomsubpro_5(String c_nomsubpro_5) {
        this.c_nomsubpro_5 = c_nomsubpro_5;
    }

    public String getC_divisa_5() {
        return c_divisa_5;
    }

    public void setC_divisa_5(String c_divisa_5) {
        this.c_divisa_5 = c_divisa_5;
    }

    public String getN_saldohoy_5() {
        return n_saldohoy_5;
    }

    public void setN_saldohoy_5(String n_saldohoy_5) {
        this.n_saldohoy_5 = n_saldohoy_5;
    }

    public String getN_diasvenc_5() {
        return n_diasvenc_5;
    }

    public void setN_diasvenc_5(String n_diasvenc_5) {
        this.n_diasvenc_5 = n_diasvenc_5;
    }

    public String getC_contrato_6() {
        return c_contrato_6;
    }

    public void setC_contrato_6(String c_contrato_6) {
        this.c_contrato_6 = c_contrato_6;
    }

    public String getC_dessubpro_6() {
        return c_dessubpro_6;
    }

    public void setC_dessubpro_6(String c_dessubpro_6) {
        this.c_dessubpro_6 = c_dessubpro_6;
    }

    public String getC_nomsubpro_6() {
        return c_nomsubpro_6;
    }

    public void setC_nomsubpro_6(String c_nomsubpro_6) {
        this.c_nomsubpro_6 = c_nomsubpro_6;
    }

    public String getC_divisa_6() {
        return c_divisa_6;
    }

    public void setC_divisa_6(String c_divisa_6) {
        this.c_divisa_6 = c_divisa_6;
    }

    public String getN_saldohoy_6() {
        return n_saldohoy_6;
    }

    public void setN_saldohoy_6(String n_saldohoy_6) {
        this.n_saldohoy_6 = n_saldohoy_6;
    }

    public String getN_diasvenc_6() {
        return n_diasvenc_6;
    }

    public void setN_diasvenc_6(String n_diasvenc_6) {
        this.n_diasvenc_6 = n_diasvenc_6;
    }

    /**
     * @return the direccion_encontrada
     */
    public String getDireccion_encontrada() {
        return direccion_encontrada;
    }

    /**
     * @param direccion_encontrada the direccion_encontrada to set
     */
    public void setDireccion_encontrada(String direccion_encontrada) {
        this.direccion_encontrada = direccion_encontrada;
    }

    /**
     * @return the distrito_encontrado
     */
    public String getDistrito_encontrado() {
        return distrito_encontrado;
    }

    /**
     * @param distrito_encontrado the distrito_encontrado to set
     */
    public void setDistrito_encontrado(String distrito_encontrado) {
        this.distrito_encontrado = distrito_encontrado;
    }

    /**
     * @return the f_impresion1
     */
    public String getF_impresion1() {
        return f_impresion1;
    }

    /**
     * @param f_impresion1 the f_impresion1 to set
     */
    public void setF_impresion1(String f_impresion1) {
        this.f_impresion1 = f_impresion1;
    }

    /**
     * @return the id_codtres1
     */
    public String getId_codtres1() {
        return id_codtres1;
    }

    /**
     * @param id_codtres1 the id_codtres1 to set
     */
    public void setId_codtres1(String id_codtres1) {
        this.id_codtres1 = id_codtres1;
    }

    /**
     * @return the id_codusu1
     */
    public String getId_codusu1() {
        return id_codusu1;
    }

    /**
     * @param id_codusu1 the id_codusu1 to set
     */
    public void setId_codusu1(String id_codusu1) {
        this.id_codusu1 = id_codusu1;
    }

    /**
     * @return the f_impresion2
     */
    public String getF_impresion2() {
        return f_impresion2;
    }

    /**
     * @param f_impresion2 the f_impresion2 to set
     */
    public void setF_impresion2(String f_impresion2) {
        this.f_impresion2 = f_impresion2;
    }

    /**
     * @return the id_codtres2
     */
    public String getId_codtres2() {
        return id_codtres2;
    }

    /**
     * @param id_codtres2 the id_codtres2 to set
     */
    public void setId_codtres2(String id_codtres2) {
        this.id_codtres2 = id_codtres2;
    }

    /**
     * @return the id_codusu2
     */
    public String getId_codusu2() {
        return id_codusu2;
    }

    /**
     * @param id_codusu2 the id_codusu2 to set
     */
    public void setId_codusu2(String id_codusu2) {
        this.id_codusu2 = id_codusu2;
    }

    /**
     * @return the f_impresion3
     */
    public String getF_impresion3() {
        return f_impresion3;
    }

    /**
     * @param f_impresion3 the f_impresion3 to set
     */
    public void setF_impresion3(String f_impresion3) {
        this.f_impresion3 = f_impresion3;
    }

    /**
     * @return the id_codtres3
     */
    public String getId_codtres3() {
        return id_codtres3;
    }

    /**
     * @param id_codtres3 the id_codtres3 to set
     */
    public void setId_codtres3(String id_codtres3) {
        this.id_codtres3 = id_codtres3;
    }

    /**
     * @return the id_codusu3
     */
    public String getId_codusu3() {
        return id_codusu3;
    }

    /**
     * @param id_codusu3 the id_codusu3 to set
     */
    public void setId_codusu3(String id_codusu3) {
        this.id_codusu3 = id_codusu3;
    }

    /**
     * @return the f_impresion4
     */
    public String getF_impresion4() {
        return f_impresion4;
    }

    /**
     * @param f_impresion4 the f_impresion4 to set
     */
    public void setF_impresion4(String f_impresion4) {
        this.f_impresion4 = f_impresion4;
    }

    /**
     * @return the id_codtres4
     */
    public String getId_codtres4() {
        return id_codtres4;
    }

    /**
     * @param id_codtres4 the id_codtres4 to set
     */
    public void setId_codtres4(String id_codtres4) {
        this.id_codtres4 = id_codtres4;
    }

    /**
     * @return the id_codusu4
     */
    public String getId_codusu4() {
        return id_codusu4;
    }

    /**
     * @param id_codusu4 the id_codusu4 to set
     */
    public void setId_codusu4(String id_codusu4) {
        this.id_codusu4 = id_codusu4;
    }

    /**
     * @return the f_impresion5
     */
    public String getF_impresion5() {
        return f_impresion5;
    }

    /**
     * @param f_impresion5 the f_impresion5 to set
     */
    public void setF_impresion5(String f_impresion5) {
        this.f_impresion5 = f_impresion5;
    }

    /**
     * @return the id_codtres5
     */
    public String getId_codtres5() {
        return id_codtres5;
    }

    /**
     * @param id_codtres5 the id_codtres5 to set
     */
    public void setId_codtres5(String id_codtres5) {
        this.id_codtres5 = id_codtres5;
    }

    /**
     * @return the id_codusu5
     */
    public String getId_codusu5() {
        return id_codusu5;
    }

    /**
     * @param id_codusu5 the id_codusu5 to set
     */
    public void setId_codusu5(String id_codusu5) {
        this.id_codusu5 = id_codusu5;
    }

    /**
     * @return the f_impresion6
     */
    public String getF_impresion6() {
        return f_impresion6;
    }

    /**
     * @param f_impresion6 the f_impresion6 to set
     */
    public void setF_impresion6(String f_impresion6) {
        this.f_impresion6 = f_impresion6;
    }

    /**
     * @return the id_codtres6
     */
    public String getId_codtres6() {
        return id_codtres6;
    }

    /**
     * @param id_codtres6 the id_codtres6 to set
     */
    public void setId_codtres6(String id_codtres6) {
        this.id_codtres6 = id_codtres6;
    }

    /**
     * @return the id_codusu6
     */
    public String getId_codusu6() {
        return id_codusu6;
    }

    /**
     * @param id_codusu6 the id_codusu6 to set
     */
    public void setId_codusu6(String id_codusu6) {
        this.id_codusu6 = id_codusu6;
    }

    /**
     * @return the f_fecimp_ult
     */
    public String getF_fecimp_ult() {
        return f_fecimp_ult;
    }

    /**
     * @param f_fecimp_ult the f_fecimp_ult to set
     */
    public void setF_fecimp_ult(String f_fecimp_ult) {
        this.f_fecimp_ult = f_fecimp_ult;
    }

    /**
     * @return the c_codrspta
     */
    public String getC_codrspta() {
        return c_codrspta;
    }

    /**
     * @param c_codrspta the c_codrspta to set
     */
    public void setC_codrspta(String c_codrspta) {
        this.c_codrspta = c_codrspta;
    }

    /**
     * @return the c_cuad_plano
     */
    public String getC_cuad_plano() {
        return c_cuad_plano;
    }

    /**
     * @param c_cuad_plano the c_cuad_plano to set
     */
    public void setC_cuad_plano(String c_cuad_plano) {
        this.c_cuad_plano = c_cuad_plano;
    }

    /**
     * @return the c_cuad_x
     */
    public String getC_cuad_x() {
        return c_cuad_x;
    }

    /**
     * @param c_cuad_x the c_cuad_x to set
     */
    public void setC_cuad_x(String c_cuad_x) {
        this.c_cuad_x = c_cuad_x;
    }

    /**
     * @return the c_cuad_y
     */
    public String getC_cuad_y() {
        return c_cuad_y;
    }

    /**
     * @param c_cuad_y the c_cuad_y to set
     */
    public void setC_cuad_y(String c_cuad_y) {
        this.c_cuad_y = c_cuad_y;
    }
    
}
