
package FORMULARIOS;

import BEANS.Cartera;
import BEANS.Contacto;
import BEANS.Contratos;
import BEANS.Gestion;
import BEANS.Globales;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frm_llamada_ges extends javax.swing.JDialog {  

    public String c_codcent=Globales.getC_codcent();
    public String f_fproceso=Globales.getF_fproceso();
    public String id_codtges=Globales.getId_codtges();
    public String idxges=Globales.getIdxges();
    public String id_codusu=Globales.getId_codusu2();
    public String id_codtcon,id_codtres,c_destres, id_subres, estdes="";
    int idx=0;
    public int filas;
    public String f_fecasig;
    public DefaultTableModel m=new DefaultTableModel();

    void cargar(){
    try{
    lbl_mensaje.setVisible(false);
    cboc_tipo.removeAllItems();

    cboc_tipo.addItem("C - CELULAR");
    cboc_tipo.addItem("D - DIRECTO");
    cboc_tipo.addItem("O - OFICINA");


    ArrayList lista=new ArrayList();
    Contacto co=new Contacto();
    lista=co.registro_contacto(c_codcent);
    co=(Contacto)lista.get(0);

    txtc_tipodoc.setText(co.getC_tipodoc());
    txtc_nrodoc.setText(co.getC_nrodoc());
    txtc_tpersona.setText(co.getC_tpersona());
    txtc_nombre.setText(co.getC_nombre());
    txtc_direccion.setText(co.getC_direccion());
    txtc_dpto.setText(co.getC_dpto());
    txtc_telefono.setText(co.getC_telefono());
    txtc_distprov.setText(co.getC_distprov());
    txtc_ubigeo.setText(co.getC_ubigeo());
    txtc_email.setText(co.getC_email());


    jTable1.setValueAt(co.getC_tipofono1(), 0, 0);
    jTable1.setValueAt(co.getC_prefijo1(), 0,1);
    jTable1.setValueAt(co.getC_fono1(), 0,2);
    jTable1.setValueAt(co.getC_extension1(), 0,3);
    jTable1.setValueAt(co.getC_tipofono2(), 1, 0);
    jTable1.setValueAt(co.getC_prefijo2(), 1,1);
    jTable1.setValueAt(co.getC_fono2(), 1,2);
    jTable1.setValueAt(co.getC_extension2(), 1,3);
    jTable1.setValueAt(co.getC_tipofono3(), 2, 0);
    jTable1.setValueAt(co.getC_prefijo3(), 2,1);
    jTable1.setValueAt(co.getC_fono3(), 2,2);
    jTable1.setValueAt(co.getC_extension3(), 2,3);
    jTable1.setValueAt(co.getC_tipofono4(), 3, 0);
    jTable1.setValueAt(co.getC_prefijo4(), 3,1);
    jTable1.setValueAt(co.getC_fono4(), 3,2);
    jTable1.setValueAt(co.getC_extension4(), 3,3);
    jTable1.setValueAt(co.getC_tipofono5(), 4, 0);
    jTable1.setValueAt(co.getC_prefijo5(), 4,1);
    jTable1.setValueAt(co.getC_fono5(), 4,2);
    jTable1.setValueAt(co.getC_extension5(), 4,3);

    lista.clear();
    lista=co.contacto_telefono(c_codcent);
    DefaultTableModel ta=(DefaultTableModel)jTable2.getModel();
    ta.setRowCount(lista.size());
    for(int i=0;i<lista.size();i++){
    co=(Contacto)lista.get(i);

    ta.setValueAt(co.getC_codcent(),i,0);
    ta.setValueAt(co.getId_idxreg(),i,1);
    ta.setValueAt(co.getF_fecing(),i,2);
    ta.setValueAt(co.getC_tipo(),i,3);
    ta.setValueAt(co.getC_prefijo(),i,4);
    ta.setValueAt(co.getC_numero(),i,5);
    ta.setValueAt(co.getC_anexo(),i,6);
    }this.jTable2.setModel(ta);

    lista.clear();
    lista=co.contacto_direccion(c_codcent);
    DefaultTableModel tbl=(DefaultTableModel)jTable3.getModel();
    tbl.setRowCount(lista.size());
    for(int i=0;i<lista.size();i++){
    co=(Contacto)lista.get(i);
    tbl.setValueAt(co.getC_codcent(),i,0);
    tbl.setValueAt(co.getId_idxreg(),i,1);
    tbl.setValueAt(co.getF_fecing(),i,2);
    tbl.setValueAt(co.getC_coddepa(),i,3);
    tbl.setValueAt(co.getC_codprov(),i,4);
    tbl.setValueAt(co.getC_coddist(),i,5);
    tbl.setValueAt(co.getC_direccion(),i,6);
    tbl.setValueAt(co.getC_desdist(),i,7);
    tbl.setValueAt(co.getC_flgimp(),i,8);

    }this.jTable3.setModel(tbl);

    this.consulta_teleges();

    }catch(Exception ioE){
    JOptionPane.showMessageDialog(null, ioE);
    }
    }

    void grabacion_adicicional(){
    try{
       
    Contacto co=new Contacto();
    if(jTable2.getRowCount()>0){
    co.elimina_telefono(c_codcent);

    for(int i=0;i<jTable2.getRowCount();i++){
    String codcent,f_fecing,c_tipo,
    c_prefijo, c_numero, c_anexo;
    codcent="'" + jTable2.getValueAt(i, 0) + "'";
  
    if(jTable2.getValueAt(i, 2)==null){
    f_fecing=null;
    }else{
    f_fecing="'" + jTable2.getValueAt(i, 2) + "'";
    }
    
    if(jTable2.getValueAt(i, 3)==null){
    c_tipo=null;
    }else{
    c_tipo="'" + jTable2.getValueAt(i, 3) + "'";
    }

    if(jTable2.getValueAt(i, 4)==null){
    c_prefijo=null;
    }else{
    c_prefijo="'" + jTable2.getValueAt(i, 4) + "'";
    }

    if(jTable2.getValueAt(i, 5)==null){
    c_numero=null;
    }else{
    c_numero="'" + jTable2.getValueAt(i, 5) + "'";
    }

    if(jTable2.getValueAt(i, 6)==null){
    c_anexo=null;
    }else{
    c_anexo="'" + jTable2.getValueAt(i, 6) + "'";
    }  
    co.inserta_contacto_telefono(codcent, f_fecing, c_tipo, c_prefijo, c_numero, c_anexo);
        
    }
    }

    if(jTable3.getRowCount()>0){
    co.elimina_direccion(c_codcent);
    for(int i=0;i<jTable3.getRowCount();i++){
    String codcent,f_fecing,c_coddepa,c_codprov,
    c_coddist, c_direccion, c_flgimp;

    codcent="'" + jTable3.getValueAt(i, 0) + "'";

    if(jTable3.getValueAt(i, 2)==null){
    f_fecing=null;
    }else{
    f_fecing="'" + jTable3.getValueAt(i, 2) + "'";
    }

    if(jTable3.getValueAt(i, 3)==null){
    c_coddepa=null;
    }else{
    c_coddepa="'" + jTable3.getValueAt(i, 3) + "'";
    }

    if(jTable3.getValueAt(i, 4)==null){
    c_codprov=null;
    }else{
    c_codprov="'" + jTable3.getValueAt(i, 4) + "'";
    }
    
    if(jTable3.getValueAt(i, 5)==null){
    c_coddist=null;
    }else{
    c_coddist="'" + jTable3.getValueAt(i, 5) + "'";
    }

    if(jTable3.getValueAt(i, 6)==null){
    c_direccion=null;
    }else{
    c_direccion="'" + jTable3.getValueAt(i, 6) + "'";
    }

    if(jTable3.getValueAt(i, 8)==null){
    c_flgimp=null;
    }else{
    c_flgimp="'" + jTable3.getValueAt(i, 8) + "'";
    }
    co.inserta_contacto_direccion(codcent, f_fecing, c_coddepa, c_codprov, c_coddist, c_direccion, c_flgimp);
    }
    }
    }catch(Exception ioE){
    JOptionPane.showMessageDialog(null, ioE);
    }
    }
    

    void consulta_teleges(){
    try{

    Contacto co=new Contacto();
       //-----------llenando Tabla telefonica
    ResultSet dtSQL_tel=co.Consulta_bdteleges(txtc_nrodoc.getText(), "tel");
    ResultSetMetaData rmdt=dtSQL_tel.getMetaData();

    DefaultTableModel t1=(DefaultTableModel)jTable4.getModel();
    int columnas=rmdt.getColumnCount();
//
     int num=0;
       while(dtSQL_tel.next()){

           Object fila[]={"","","","","","","","","","","","","","","","","",""};
           t1.addRow(fila);
           for(int col=1;col<=columnas;col++){
           t1.setValueAt(dtSQL_tel.getString(col), num, col-1);
           }jTable4.setModel(t1);
           num++;
       }


      //-----------llenando Tabla bonus
     ResultSet dtSQL_bon=co.Consulta_bdteleges(txtc_nrodoc.getText(), "bon");
     ResultSetMetaData rmdt2=dtSQL_bon.getMetaData();
     DefaultTableModel t2=(DefaultTableModel)jTable6.getModel();
     int columnas2=rmdt2.getColumnCount();

       num=0;
       while(dtSQL_bon.next()){

           Object fila[]={"","","","","","","","","","","","","","","","","","","","",
           "","","","","","","","","","","","",""};
           t2.addRow(fila);
           for(int col=1;col<=columnas2;col++){
           t2.setValueAt(dtSQL_bon.getString(col), num, col-1);
           }jTable6.setModel(t2);
           num++;
       }


//    //-----------llenando Tabla cmr
     ResultSet dtSQL_cmr=co.Consulta_bdteleges(txtc_nrodoc.getText(), "cmr");
     ResultSetMetaData rmdt3=dtSQL_cmr.getMetaData();
    DefaultTableModel t3=(DefaultTableModel)jTable5.getModel();

     int columnas3=rmdt3.getColumnCount();

      num=0;
       while(dtSQL_cmr.next()){

           Object fila[]={"","","","","","","","",""};

           t3.addRow(fila);
           for(int col=1;col<=columnas3;col++){
           t3.setValueAt(dtSQL_cmr.getString(col), num, col-1);
           }jTable5.setModel(t3);
           num++;
       }
//

//    //-----------llenando Tabla Essalud
    num=0;

    ResultSet dtSQL_ess=co.Consulta_bdteleges(txtc_nrodoc.getText(), "ess");
    ResultSetMetaData rmdt4=dtSQL_ess.getMetaData();
    int columnas4=rmdt4.getColumnCount();

    DefaultTableModel t4=(DefaultTableModel)jTable7.getModel();

       while(dtSQL_ess.next()){

           Object fila[]={"","","","","","","","","","","","","","","","","","","","",
           "","","","","","","","","","",""};
           t4.addRow(fila);
           for(int col=1;col<=columnas4;col++){
           t4.setValueAt(dtSQL_ess.getString(col), num, col-1);
           }jTable7.setModel(t4);
           num++;
       }
    }catch(Exception e){
    JOptionPane.showMessageDialog(null, e.getMessage());
    }
    }

    void lista_contrato(){
    try{

    SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
    SimpleDateFormat sdf2=new SimpleDateFormat("dd/MM/yyyy");
    Contratos con=new Contratos();
    ArrayList lista=new ArrayList();
    lista=con.registro_contrato(c_codcent,f_fproceso,id_codtges,idxges,id_codusu);
    filas=lista.size();
    con=(Contratos)lista.get(idx);

    lbl_contador.setText((idx + 1) + " Cuenta de " + filas );

    f_fecasig=con.getF_fecasig().substring(0, 10) + "00:00:00.000";
    txtc_contrato.setText(con.getC_contrato());
    txtc_gestor.setText(con.getC_gestor());
    txtc_territorio.setText(con.getC_territorio());
    txtc_tramodia.setText(con.getC_tramodia());
    txtc_subprod.setText(con.getC_subprod());
    txtc_nomsubpro.setText(con.getC_nomsubpro());
    txtc_dessubpro.setText(con.getC_dessubpro());
    txtc_oficina.setText(con.getC_oficina());
    txtc_nombof.setText(con.getC_nombof());
    txtc_divisa.setText(con.getC_divisa());
    txtn_saldohoy.setText(con.getN_saldohoy());
    txtf_fincumpli.setText(String.valueOf(con.getF_fincumpli()).substring(0, 10));
    txtn_diasvenc.setText(con.getN_diasvenc());
    txtc_provision.setText(con.getC_provision());
    txtc_tarrastre.setText(con.getC_tarrastre());
    txtn_impprov.setText(con.getN_impprov());
    txtn_deutotobli.setText(con.getN_deutotobli());
    txtn_deutotclie.setText(con.getN_deutotclie());
//    con.getF_fecasig_ult();
    txtc_destcon_ult.setText(con.getC_destcon_ult());
    txtc_destres_ult.setText(con.getC_destres_ult());
    txtf_fecresp_ult.setText(con.getF_fecresp_ult());
//    con.getF_fecprog_ult();
      id_codtcon=con.getId_codtcon();
      id_codtres=con.getId_codtres();
      c_destres=con.getC_destres();
//    con.getId_codtres_sub();
      txtc_obsges.setText(con.getC_obsges());
      if(id_codtres.equals("101")){
      txt_importe.setText(con.getN_impprom());
      }else{
      txt_importe.setText("");
      }

      if(con.getF_fecresp()!=null || String.valueOf(con.getF_fecresp()).trim().length()>4){
      String dia_res,mes_res,año_res;

      dia_res=con.getF_fecresp().substring(8, 10);
      mes_res=con.getF_fecresp().substring(5, 7);
      año_res=con.getF_fecresp().substring(0, 4);

      Date fecres =sdf2.parse(dia_res + "/" + mes_res + "/" + año_res);
      dtpf_fecresp.setValue(fecres);

      }

       if(con.getF_fecrevi()!=null || String.valueOf(con.getF_fecrevi()).trim().length()>4){
       String dia_revi,mes_revi,año_revi;

       dia_revi=con.getF_fecrevi().substring(8, 10);
       mes_revi=con.getF_fecrevi().substring(5, 7);
       año_revi=con.getF_fecrevi().substring(0, 4);

       Date fecrevi =sdf2.parse(dia_revi + "/" + mes_revi + "/" + año_revi);
       dtpf_fecrevi.setValue(fecrevi);
      }


       if(txtc_territorio.getText().equals("CANALES 01") && id_codtcon.equals("01") ||
       id_codtcon.equals("02")){
       cbo_estado_gest.setEnabled(true);
       cbo_tipres_sub.setEnabled(true);
       }else{
       cbo_estado_gest.setEnabled(false);
       cbo_tipres_sub.setEnabled(false);
       }

      id_subres=con.getC_codresp_mt();

      if(con.getC_codresp_mt()!=null){
      cbo_tipres_sub.setSelectedIndex(Integer.parseInt(String.valueOf(con.getC_codresp_mt()).substring(1, 3)) - 31);
      }

      if(con.getC_estcuen_mt()!=null){       
         estdes=con.getC_estcuen_mt();
         cbo_estado_gest.setSelectedItem(con.getC_estcuen_mt());
       }
      

    this.valida_Fecha(con.getId_codtres());

    }catch(Exception ioE){

    }
    }

   void agregar(){
     SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
     SimpleDateFormat sdf2=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
     Date fechaActual = new Date();
     String Fecha=sdf2.format(fechaActual) + ".000";     
     String f_fecprog;
     String f_fecresp="";
     String f_fecrevi="";
     String tipres=String.valueOf(cbo_tipres.getSelectedItem()).substring(0, 3);

     if(chkf_fecprog.isSelected()){
     f_fecprog=dtp_fecprog.getValue() + "";
     }else{
     f_fecprog=null;
     }

     if(tipres.equals("101")||tipres.equals("201")){
     f_fecresp = sdf.format(dtpf_fecresp.getValue());
     f_fecrevi = sdf.format(dtpf_fecrevi.getValue());
     }else{
     f_fecresp=null;
     f_fecrevi=null;
     }

     m.setValueAt(c_codcent, idx, 0);
     m.setValueAt(txtc_contrato.getText(), idx, 1);
     m.setValueAt(f_fproceso, idx, 2);
     m.setValueAt(f_fecasig, idx, 3);
     m.setValueAt(Fecha, idx, 4);
     m.setValueAt(idxges, idx, 5);
     m.setValueAt(id_codtges, idx,6);
     m.setValueAt(String.valueOf(cbo_tipcon.getSelectedItem()).substring(0, 2), idx,7);
     m.setValueAt(String.valueOf(cbo_tipres.getSelectedItem()), idx,8);

     if(txtc_territorio.getText().equals("CANALES 01") &&
      cbo_tipcon.getSelectedIndex() != 2){
      cbo_estado_gest.setEnabled(true);
      m.setValueAt(cbo_tipres_sub.getSelectedItem(), idx, 9);
     }else{
      cbo_estado_gest.setEnabled(false);
      m.setValueAt(null, idx, 9);
     }

     m.setValueAt(f_fecresp, idx, 10);
     m.setValueAt(f_fecrevi, idx, 11);
     m.setValueAt(f_fecprog, idx, 12);
     m.setValueAt(txtc_obsges.getText().replace("\n", ""), idx, 13);
     m.setValueAt(txtc_gestor.getText(), idx, 14);
     m.setValueAt(txt_importe.getText(), idx, 15);

     if(txtc_territorio.getText().equals("CANALES 01") &&
     cbo_tipcon.getSelectedIndex() != 2){
      m.setValueAt(cbo_estado_gest.getSelectedItem(), idx, 16);
     }else{
      m.setValueAt(null, idx, 16);
     }

     this.jTable8.setModel(m);

     }

     void valida_Fecha(String id_codtres){
        dtpf_fecresp.setEnabled(false);
        dtpf_fecrevi.setEnabled(false);

        if (id_codtres.equals("101") || id_codtres.equals("201")){
            dtpf_fecresp.setEnabled(true);
            dtpf_fecrevi.setEnabled(true);
        }
     }



    public frm_llamada_ges(java.awt.Frame parent, boolean modal) throws Exception {
        super(parent, modal);
        initComponents();
        jPanel11.setVisible(false);
        cbo_tipres_sub.removeAllItems();

           ArrayList lista2=new ArrayList();
           Gestion ges=new Gestion();
           lista2=ges.datos_tiposubrespuesta();
           for(int i=0;i<lista2.size();i++){
           ges=(Gestion)lista2.get(i);
           cbo_tipres_sub.addItem(ges.getC_codresp_mt() + " - " + ges.getC_desresp_mt());
           }

        cbo_estado_gest.removeAllItems();
        cbo_estado_gest.addItem("Refinanciar");
        cbo_estado_gest.addItem("Entregar auto");
        cbo_estado_gest.addItem("Mora - No ubicados");
        cbo_estado_gest.addItem("Mora - No quieren pagar > 60");
        cbo_estado_gest.addItem("En gestion(hace abonos)");


        this.cargar();
        this.setTitle("Contacto : " + txtc_nombre.getText());
        ((javax.swing.JSpinner.DateEditor)dtpf_fecresp.getEditor()).getTextField().setEditable(false);
        ((javax.swing.JSpinner.DateEditor)dtpf_fecrevi.getEditor()).getTextField().setEditable(false);
        ((javax.swing.JSpinner.DateEditor)dtp_fecprog.getEditor()).getTextField().setEditable(false);
        this.lista_contrato();

        cboc_coddepa.removeAllItems();

        dtpf_fecresp.setEnabled(false);
        dtpf_fecrevi.setEnabled(false);

        cbo_tipcon.removeAllItems();
        cbo_tipcon.addItem("01 - Contacto Directo");
        cbo_tipcon.addItem("02 - Contacto Indirecto");
        cbo_tipcon.addItem("03 - No Contacto");

        if(id_codtcon.isEmpty()){
        cbo_tipcon.setSelectedItem("03 - No Contacto");
        }else{
        cbo_tipcon.setSelectedIndex(Integer.valueOf(id_codtcon)- 1);
        }

        m.setColumnCount(0);
        m.addColumn("c_codcent");
        m.addColumn("c_contrato");
        m.addColumn("f_fproceso");
        m.addColumn("f_fecasig");
        m.addColumn("f_fecmod");
        m.addColumn("n_idxges");
        m.addColumn("id_codtges");
        m.addColumn("id_codtcon");
        m.addColumn("id_codtres");
        m.addColumn("id_codtres_sub");
        m.addColumn("f_fecresp");
        m.addColumn("f_fecrevi");
        m.addColumn("f_fecprog");
        m.addColumn("c_obsges");
        m.addColumn("id_codusu");
        m.addColumn("importe");
        m.addColumn("estado");
        m.setNumRows(filas);

        dtp_fecprog.setEnabled(false);

        Cartera car=new Cartera();
        ArrayList lista=new ArrayList();
        lista=car.datos_departamento();
        cboc_coddepa.addItem("00 - [Seleccionar]");
        for(int i=0;i<lista.size();i++){
        car=(Cartera)lista.get(i);
        cboc_coddepa.addItem(car.getC_coddepa() + " - " + car.getC_desdepa());
        }cboc_coddepa.setSelectedIndex(0);

        lista.clear();
        txt_numubi.setText(ges.numero_ubicado(c_codcent));

    }


    void actualizar(){
    try{

    SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
    if(jTable8.getValueAt(idx, 7)==null){
    cbo_tipcon.setSelectedIndex(Integer.valueOf(id_codtcon) - 1);    
    }else{
    id_codtcon=String.valueOf(jTable8.getValueAt(idx, 7));
    cbo_tipcon.setSelectedIndex(Integer.valueOf(id_codtcon) - 1);    
    }    
    

    if(jTable8.getValueAt(idx, 8)==null){
    if(id_codtres.equals("SG00")){
    cbo_tipres.setSelectedIndex(13);
    }else{
    cbo_tipres.setSelectedIndex(Integer.valueOf(id_codtres.substring(1, 3) + "")- 1);    
    }
    }else{
    cbo_tipres.setSelectedItem(jTable8.getValueAt(idx, 8));
    }

    if(jTable8.getValueAt(idx, 9)!=null){
      cbo_tipres_sub.setEnabled(true);
      cbo_tipres_sub.setSelectedItem(jTable8.getValueAt(idx, 9));
    }else if(txtc_territorio.getText().equals("CANALES 01") &&
      cbo_tipcon.getSelectedIndex() != 2){
      cbo_tipres_sub.setEnabled(true);
      if(id_subres.length()<4){      
      cbo_tipres_sub.setSelectedIndex(Integer.parseInt(id_subres.substring(1, 3)) - 31);
      }else{
      cbo_tipres_sub.setSelectedIndex(0);
      }
    }else{
     cbo_tipres_sub.setSelectedIndex(0);
     cbo_tipres_sub.setEnabled(false);
    }



     if(jTable8.getValueAt(idx, 10)!=null){
     Date f_fecresp=sdf.parse(jTable8.getValueAt(idx, 10) + "");
     dtpf_fecresp.setValue(f_fecresp);
     }

     if(jTable8.getValueAt(idx, 11)!=null){
     Date f_fecrevi=sdf.parse(jTable8.getValueAt(idx, 11) + "");
     dtpf_fecrevi.setValue(f_fecrevi);
     }     
    
    if(jTable8.getValueAt(idx, 13)==null){
    txtc_obsges.setText(txtc_obsges.getText() + "");
    }else{
    txtc_obsges.setText(jTable8.getValueAt(idx, 13) + "");
    }
    
    
    if(jTable8.getValueAt(idx, 15)==null){
    txt_importe.setText(txt_importe.getText() + "");
    }else{
     txt_importe.setText(jTable8.getValueAt(idx, 15) + "");
    }


    if(jTable8.getValueAt(idx, 16)!=null){
     cbo_estado_gest.setEnabled(true);
     cbo_estado_gest.setSelectedItem(jTable8.getValueAt(idx, 16));
    }else if(txtc_territorio.getText().equals("CANALES 01") &&
     cbo_tipcon.getSelectedIndex() != 2){
     cbo_estado_gest.setEnabled(true);

      if(estdes.length()>4){
       cbo_estado_gest.setSelectedItem(estdes);
      }else{
       cbo_estado_gest.setSelectedIndex(0);
      }
    }else{
     cbo_estado_gest.setSelectedIndex(0);
     cbo_tipres_sub.setEnabled(false);
    }


    }catch(Exception e){
    JOptionPane.showMessageDialog(null, e.getMessage());
    }
   }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtc_tipodoc = new javax.swing.JTextField();
        txtc_direccion = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtc_dpto = new javax.swing.JTextField();
        txtc_tpersona = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtc_distprov = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtc_nombre = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        txtc_telefono = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        txtc_ubigeo = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        txtc_email = new javax.swing.JTextField();
        lbl_mensaje = new javax.swing.JLabel();
        txtc_nrodoc = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        dtp_fecprog = new javax.swing.JSpinner();
        chkf_fecprog = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        cboc_tipo = new javax.swing.JComboBox();
        txtc_prefijo = new javax.swing.JTextField();
        txtc_numero = new javax.swing.JTextField();
        txtc_anexo = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        btn_agregar_tel = new javax.swing.JButton();
        btn_cancelar_tel = new javax.swing.JButton();
        btn_quitar_tel = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        cboc_coddepa = new javax.swing.JComboBox();
        cboc_coddist = new javax.swing.JComboBox();
        txtc_direccion_con = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        cboc_codprov = new javax.swing.JComboBox();
        jButton7 = new javax.swing.JButton();
        btn_agregar_dir = new javax.swing.JButton();
        btn_cancelar_dir = new javax.swing.JButton();
        btn_quitar_dir = new javax.swing.JButton();
        chkc_flgimp = new javax.swing.JCheckBox();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable7 = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jToolBar2 = new javax.swing.JToolBar();
        btn_anterior = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        lbl_contador = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        txtc_destcon_ult = new javax.swing.JFormattedTextField();
        jLabel34 = new javax.swing.JLabel();
        txtc_destres_ult = new javax.swing.JTextField();
        txtf_fecresp_ult = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtc_contrato = new javax.swing.JTextField();
        txtc_subprod = new javax.swing.JTextField();
        txtc_divisa = new javax.swing.JTextField();
        txtn_impprov = new javax.swing.JTextField();
        txtc_nomsubpro = new javax.swing.JTextField();
        txtn_saldohoy = new javax.swing.JTextField();
        cbo_tipcon = new javax.swing.JComboBox();
        dtpf_fecresp = new javax.swing.JSpinner();
        dtpf_fecrevi = new javax.swing.JSpinner();
        cbo_tipres_sub = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtc_obsges = new javax.swing.JTextPane();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtc_gestor = new javax.swing.JTextField();
        txtc_dessubpro = new javax.swing.JTextField();
        txtc_oficina = new javax.swing.JTextField();
        txtc_nombof = new javax.swing.JTextField();
        txtc_territorio = new javax.swing.JTextField();
        txtf_fincumpli = new javax.swing.JTextField();
        txtn_deutotobli = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtn_diasvenc = new javax.swing.JTextField();
        txtn_deutotclie = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtc_tramodia = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        txtc_provision = new javax.swing.JTextField();
        txtc_tarrastre = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        cbo_tipres = new javax.swing.JComboBox();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTable8 = new javax.swing.JTable();
        txt_importe = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        cbo_estado_gest = new javax.swing.JComboBox();
        jLabel33 = new javax.swing.JLabel();
        txt_numubi = new javax.swing.JTextField();
        jToolBar1 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        btn_refinancia = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jLabel9.setFont(new java.awt.Font("Ubuntu", 0, 14));
        jLabel9.setText("Tipo y Nº Documento :");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(10, 10, 142, 17);

        txtc_tipodoc.setEditable(false);
        jPanel1.add(txtc_tipodoc);
        txtc_tipodoc.setBounds(160, 8, 30, 22);

        txtc_direccion.setEditable(false);
        jPanel1.add(txtc_direccion);
        txtc_direccion.setBounds(135, 32, 260, 22);

        jLabel10.setFont(new java.awt.Font("Ubuntu", 0, 14));
        jLabel10.setText("Dirección Domicilio :");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(10, 36, 128, 17);

        jLabel11.setFont(new java.awt.Font("Ubuntu", 0, 14));
        jLabel11.setText("Departamento :");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(10, 60, 105, 17);

        txtc_dpto.setEditable(false);
        jPanel1.add(txtc_dpto);
        txtc_dpto.setBounds(135, 56, 100, 22);

        txtc_tpersona.setEditable(false);
        jPanel1.add(txtc_tpersona);
        txtc_tpersona.setBounds(365, 8, 40, 22);

        jLabel12.setFont(new java.awt.Font("Ubuntu", 0, 14));
        jLabel12.setText("Tip. Persona:");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(277, 10, 80, 17);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Tipo", "Prefijo", "Teléfono", "Extencion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 90, 430, 70);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 14));
        jLabel1.setText("Distrito Provincia :");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(242, 59, 116, 17);

        txtc_distprov.setEditable(false);
        jPanel1.add(txtc_distprov);
        txtc_distprov.setBounds(360, 56, 200, 22);

        jLabel2.setFont(new java.awt.Font("Ubuntu", 0, 14));
        jLabel2.setText("Apellidos y Nombres :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(420, 10, 138, 17);

        txtc_nombre.setEditable(false);
        jPanel1.add(txtc_nombre);
        txtc_nombre.setBounds(562, 8, 240, 22);

        jLabel30.setFont(new java.awt.Font("Ubuntu", 0, 14));
        jLabel30.setText("Telefono :");
        jPanel1.add(jLabel30);
        jLabel30.setBounds(405, 33, 68, 17);

        txtc_telefono.setEditable(false);
        jPanel1.add(txtc_telefono);
        txtc_telefono.setBounds(470, 32, 90, 22);

        jLabel31.setFont(new java.awt.Font("Ubuntu", 0, 14));
        jLabel31.setText("Ubigeo :");
        jPanel1.add(jLabel31);
        jLabel31.setBounds(572, 59, 55, 17);

        txtc_ubigeo.setEditable(false);
        jPanel1.add(txtc_ubigeo);
        txtc_ubigeo.setBounds(630, 56, 110, 22);

        jLabel32.setFont(new java.awt.Font("Ubuntu", 0, 14));
        jLabel32.setText("Correo Electronico :");
        jPanel1.add(jLabel32);
        jLabel32.setBounds(10, 170, 130, 17);

        txtc_email.setEditable(false);
        jPanel1.add(txtc_email);
        txtc_email.setBounds(140, 167, 240, 22);

        lbl_mensaje.setFont(new java.awt.Font("Tahoma", 1, 12));
        lbl_mensaje.setForeground(new java.awt.Color(0, 153, 0));
        lbl_mensaje.setText("CONTACTO REFINANCIACION");
        jPanel1.add(lbl_mensaje);
        lbl_mensaje.setBounds(720, 168, 180, 15);

        txtc_nrodoc.setEditable(false);
        jPanel1.add(txtc_nrodoc);
        txtc_nrodoc.setBounds(192, 8, 73, 22);

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Fecha Programada", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), java.awt.Color.red)); // NOI18N
        jPanel11.setLayout(null);

        jLabel27.setFont(new java.awt.Font("Ubuntu", 0, 14));
        jLabel27.setText("Fecha :");
        jPanel11.add(jLabel27);
        jLabel27.setBounds(20, 22, 45, 17);

        dtp_fecprog.setFont(new java.awt.Font("Ubuntu", 0, 14));
        dtp_fecprog.setModel(new javax.swing.SpinnerDateModel());
        dtp_fecprog.setEditor(new javax.swing.JSpinner.DateEditor(dtp_fecprog, "dd/MM/yyyy hh:mm"));
        jPanel11.add(dtp_fecprog);
        dtp_fecprog.setBounds(70, 20, 170, 22);

        chkf_fecprog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkf_fecprogActionPerformed(evt);
            }
        });
        jPanel11.add(chkf_fecprog);
        chkf_fecprog.setBounds(195, -3, 30, 23);

        jPanel1.add(jPanel11);
        jPanel11.setBounds(460, 100, 260, 55);

        jTabbedPane1.addTab("Informacion Contacto", jPanel1);

        jPanel2.setLayout(null);

        jLabel35.setFont(new java.awt.Font("Ubuntu", 0, 14));
        jLabel35.setText("Tipo :");
        jPanel2.add(jLabel35);
        jLabel35.setBounds(10, 13, 36, 17);

        jLabel36.setFont(new java.awt.Font("Ubuntu", 0, 14));
        jLabel36.setText("Prefijo :");
        jPanel2.add(jLabel36);
        jLabel36.setBounds(160, 13, 50, 17);

        jLabel37.setFont(new java.awt.Font("Ubuntu", 0, 14));
        jLabel37.setText("Numero :");
        jPanel2.add(jLabel37);
        jLabel37.setBounds(275, 13, 60, 17);

        jLabel38.setFont(new java.awt.Font("Ubuntu", 0, 14));
        jLabel38.setText("Anexo :");
        jPanel2.add(jLabel38);
        jLabel38.setBounds(415, 13, 50, 17);

        cboc_tipo.setFont(new java.awt.Font("Ubuntu", 0, 14));
        cboc_tipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboc_tipo.setEnabled(false);
        cboc_tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboc_tipoActionPerformed(evt);
            }
        });
        jPanel2.add(cboc_tipo);
        cboc_tipo.setBounds(50, 10, 100, 22);

        txtc_prefijo.setFont(new java.awt.Font("Ubuntu", 0, 14));
        txtc_prefijo.setEnabled(false);
        jPanel2.add(txtc_prefijo);
        txtc_prefijo.setBounds(215, 10, 50, 22);

        txtc_numero.setFont(new java.awt.Font("Ubuntu", 0, 14));
        txtc_numero.setEnabled(false);
        jPanel2.add(txtc_numero);
        txtc_numero.setBounds(340, 10, 65, 22);

        txtc_anexo.setFont(new java.awt.Font("Ubuntu", 0, 14));
        txtc_anexo.setEnabled(false);
        jPanel2.add(txtc_anexo);
        txtc_anexo.setBounds(470, 10, 40, 22);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "c_codcent", "id_idxreg", "f_fecing", "Tipo", "Prefijo", "Numero", "Anexo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane3.setViewportView(jTable2);

        jPanel2.add(jScrollPane3);
        jScrollPane3.setBounds(10, 40, 480, 110);

        jButton3.setText("Nuevo");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);
        jButton3.setBounds(510, 40, 85, 30);

        btn_agregar_tel.setText("Agregar");
        btn_agregar_tel.setEnabled(false);
        btn_agregar_tel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregar_telActionPerformed(evt);
            }
        });
        jPanel2.add(btn_agregar_tel);
        btn_agregar_tel.setBounds(510, 68, 85, 30);

        btn_cancelar_tel.setText("Cancelar");
        btn_cancelar_tel.setEnabled(false);
        btn_cancelar_tel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelar_telActionPerformed(evt);
            }
        });
        jPanel2.add(btn_cancelar_tel);
        btn_cancelar_tel.setBounds(510, 96, 85, 30);

        btn_quitar_tel.setText("Quitar");
        btn_quitar_tel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_quitar_telActionPerformed(evt);
            }
        });
        jPanel2.add(btn_quitar_tel);
        btn_quitar_tel.setBounds(510, 125, 85, 30);

        jTabbedPane1.addTab("Telefonos Contacto", jPanel2);

        jPanel3.setLayout(null);

        jLabel39.setFont(new java.awt.Font("Ubuntu", 0, 14));
        jLabel39.setText("Departamento :");
        jPanel3.add(jLabel39);
        jLabel39.setBounds(10, 15, 105, 17);

        jLabel40.setFont(new java.awt.Font("Ubuntu", 0, 14));
        jLabel40.setText("Distrito :");
        jPanel3.add(jLabel40);
        jLabel40.setBounds(10, 40, 60, 17);

        jLabel41.setFont(new java.awt.Font("Ubuntu", 0, 14));
        jLabel41.setText("Direccion :");
        jPanel3.add(jLabel41);
        jLabel41.setBounds(10, 68, 70, 17);

        jLabel42.setFont(new java.awt.Font("Ubuntu", 0, 14));
        jLabel42.setText("Provincia :");
        jPanel3.add(jLabel42);
        jLabel42.setBounds(285, 15, 70, 17);

        cboc_coddepa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboc_coddepa.setEnabled(false);
        cboc_coddepa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboc_coddepaActionPerformed(evt);
            }
        });
        jPanel3.add(cboc_coddepa);
        cboc_coddepa.setBounds(120, 12, 150, 22);

        cboc_coddist.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboc_coddist.setEnabled(false);
        cboc_coddist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboc_coddistActionPerformed(evt);
            }
        });
        jPanel3.add(cboc_coddist);
        cboc_coddist.setBounds(100, 38, 220, 22);

        txtc_direccion_con.setEnabled(false);
        jPanel3.add(txtc_direccion_con);
        txtc_direccion_con.setBounds(100, 64, 310, 22);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "c_codcent", "id_idxreg", "f_fecing", "c_coddepa", "c_codprov", "c_coddist", "c_direccion", "Distrito", "Flag Impresión"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable3.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable3.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(jTable3);

        jPanel3.add(jScrollPane4);
        jScrollPane4.setBounds(10, 92, 530, 70);

        cboc_codprov.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboc_codprov.setEnabled(false);
        cboc_codprov.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboc_codprovActionPerformed(evt);
            }
        });
        jPanel3.add(cboc_codprov);
        cboc_codprov.setBounds(360, 12, 200, 22);

        jButton7.setText("Nuevo");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton7);
        jButton7.setBounds(560, 50, 85, 30);

        btn_agregar_dir.setText("Agregar");
        btn_agregar_dir.setEnabled(false);
        btn_agregar_dir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregar_dirActionPerformed(evt);
            }
        });
        jPanel3.add(btn_agregar_dir);
        btn_agregar_dir.setBounds(560, 78, 85, 30);

        btn_cancelar_dir.setText("Cancelar");
        btn_cancelar_dir.setEnabled(false);
        btn_cancelar_dir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelar_dirActionPerformed(evt);
            }
        });
        jPanel3.add(btn_cancelar_dir);
        btn_cancelar_dir.setBounds(560, 106, 85, 30);

        btn_quitar_dir.setText("Quitar");
        btn_quitar_dir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_quitar_dirActionPerformed(evt);
            }
        });
        jPanel3.add(btn_quitar_dir);
        btn_quitar_dir.setBounds(560, 135, 85, 30);

        chkc_flgimp.setText("Flag Impresion");
        jPanel3.add(chkc_flgimp);
        chkc_flgimp.setBounds(420, 65, 130, 24);

        jTabbedPane1.addTab("Direccion Contacto", jPanel3);

        jPanel7.setLayout(null);

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "telefono", "tipo", "apell_paterno", "apell_materno", "nombre_abonado", "tipo_direc", "direccion", "cod_postal", "ubigeo_1", "distrito", "provincia", "departamento", "num_telef", "lima_prov", "num_docu", "num_docu2", "num_docu3", "tip_base"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable4.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable4.getTableHeader().setReorderingAllowed(false);
        jScrollPane5.setViewportView(jTable4);
        jTable4.getColumnModel().getColumn(0).setPreferredWidth(100);
        jTable4.getColumnModel().getColumn(1).setPreferredWidth(120);
        jTable4.getColumnModel().getColumn(2).setPreferredWidth(100);
        jTable4.getColumnModel().getColumn(3).setPreferredWidth(100);
        jTable4.getColumnModel().getColumn(4).setPreferredWidth(120);
        jTable4.getColumnModel().getColumn(5).setPreferredWidth(90);
        jTable4.getColumnModel().getColumn(6).setPreferredWidth(300);
        jTable4.getColumnModel().getColumn(7).setPreferredWidth(90);
        jTable4.getColumnModel().getColumn(8).setPreferredWidth(90);
        jTable4.getColumnModel().getColumn(9).setPreferredWidth(130);
        jTable4.getColumnModel().getColumn(10).setPreferredWidth(100);
        jTable4.getColumnModel().getColumn(11).setPreferredWidth(100);
        jTable4.getColumnModel().getColumn(12).setPreferredWidth(100);
        jTable4.getColumnModel().getColumn(13).setPreferredWidth(90);
        jTable4.getColumnModel().getColumn(14).setPreferredWidth(100);
        jTable4.getColumnModel().getColumn(15).setPreferredWidth(100);
        jTable4.getColumnModel().getColumn(16).setPreferredWidth(100);

        jPanel7.add(jScrollPane5);
        jScrollPane5.setBounds(7, 7, 892, 170);

        jTabbedPane1.addTab("Consulta Telefonica", jPanel7);

        jPanel8.setLayout(null);

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODSBS", "TIPDOC", "DNI", "NBRDEUDOR", "CMR", "DIRECCION", "DISTRITO", "TELEFONO1", "TELEFONO2"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable5.getTableHeader().setReorderingAllowed(false);
        jScrollPane6.setViewportView(jTable5);
        jTable5.getColumnModel().getColumn(0).setPreferredWidth(120);
        jTable5.getColumnModel().getColumn(1).setPreferredWidth(70);
        jTable5.getColumnModel().getColumn(2).setPreferredWidth(100);
        jTable5.getColumnModel().getColumn(3).setPreferredWidth(200);
        jTable5.getColumnModel().getColumn(4).setPreferredWidth(85);
        jTable5.getColumnModel().getColumn(5).setPreferredWidth(300);
        jTable5.getColumnModel().getColumn(6).setPreferredWidth(100);
        jTable5.getColumnModel().getColumn(7).setPreferredWidth(100);
        jTable5.getColumnModel().getColumn(8).setPreferredWidth(100);

        jPanel8.add(jScrollPane6);
        jScrollPane6.setBounds(7, 7, 892, 170);

        jTabbedPane1.addTab("CMR", jPanel8);

        jPanel9.setLayout(null);

        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TARJETA", "DOCUMENTO", "NOMBRES", "APELLIDOS", "DIRECCION", "DISTRITO", "TELE1", "TELE2", "TELE3", "SEXO", "NACIMIENTO", "CIVIL", "TRABAJO", "DEPENDIENT", "AUTOS", "MONEDA", "SEP", "OCT", "NOV", "CODTIENDA", "DIRTIENDA", "RUC", "BCP", "INTERBANK", "SCOTIABANK", "BBVA", "CITIBANK", "BIF", "NUEVO_MUND", "RIPLEY", "SUDAMERICA", "MIBANCO", "CMR"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable6.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable6.getTableHeader().setReorderingAllowed(false);
        jScrollPane7.setViewportView(jTable6);
        jTable6.getColumnModel().getColumn(0).setPreferredWidth(160);
        jTable6.getColumnModel().getColumn(1).setPreferredWidth(130);
        jTable6.getColumnModel().getColumn(2).setPreferredWidth(140);
        jTable6.getColumnModel().getColumn(3).setPreferredWidth(180);
        jTable6.getColumnModel().getColumn(4).setPreferredWidth(300);
        jTable6.getColumnModel().getColumn(5).setPreferredWidth(100);
        jTable6.getColumnModel().getColumn(6).setPreferredWidth(100);
        jTable6.getColumnModel().getColumn(7).setPreferredWidth(100);
        jTable6.getColumnModel().getColumn(8).setPreferredWidth(100);
        jTable6.getColumnModel().getColumn(9).setPreferredWidth(90);
        jTable6.getColumnModel().getColumn(10).setPreferredWidth(87);
        jTable6.getColumnModel().getColumn(11).setPreferredWidth(80);
        jTable6.getColumnModel().getColumn(12).setPreferredWidth(80);
        jTable6.getColumnModel().getColumn(13).setPreferredWidth(80);
        jTable6.getColumnModel().getColumn(14).setPreferredWidth(80);
        jTable6.getColumnModel().getColumn(15).setPreferredWidth(80);
        jTable6.getColumnModel().getColumn(16).setPreferredWidth(80);
        jTable6.getColumnModel().getColumn(17).setPreferredWidth(80);
        jTable6.getColumnModel().getColumn(18).setPreferredWidth(80);
        jTable6.getColumnModel().getColumn(19).setPreferredWidth(8);
        jTable6.getColumnModel().getColumn(20).setPreferredWidth(150);
        jTable6.getColumnModel().getColumn(21).setPreferredWidth(140);
        jTable6.getColumnModel().getColumn(22).setPreferredWidth(80);
        jTable6.getColumnModel().getColumn(23).setPreferredWidth(80);
        jTable6.getColumnModel().getColumn(24).setPreferredWidth(80);
        jTable6.getColumnModel().getColumn(25).setPreferredWidth(80);
        jTable6.getColumnModel().getColumn(26).setPreferredWidth(80);
        jTable6.getColumnModel().getColumn(27).setPreferredWidth(80);
        jTable6.getColumnModel().getColumn(28).setPreferredWidth(80);
        jTable6.getColumnModel().getColumn(29).setPreferredWidth(80);
        jTable6.getColumnModel().getColumn(30).setPreferredWidth(80);
        jTable6.getColumnModel().getColumn(31).setPreferredWidth(80);
        jTable6.getColumnModel().getColumn(32).setPreferredWidth(80);

        jPanel9.add(jScrollPane7);
        jScrollPane7.setBounds(7, 7, 892, 170);

        jTabbedPane1.addTab("Bonus", jPanel9);

        jPanel10.setLayout(null);

        jTable7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "edad", "fech_nac", "sex", "COD", "PAT", "MAT", "NOMB", "BRUT", "Vigencia", "PERPAG", "Expr1010", "TDOCC", "NUMDOCC", "RUCC", "Raz_SocialX", "DireccionX", "UbigEmpX", "ZonigeoX", "Prov_Distrito_Empresa", "Tel_1X", "Tel_2X", "FaxX", "FechInicioActivX", "TrabPlanilla", "RankTop2007", "DOMICIL1", "DOMICIL2", "UBIQUEOO", "Prov_Distrito_Domicil", "UBIG", "TT"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable7.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable7.getTableHeader().setReorderingAllowed(false);
        jScrollPane8.setViewportView(jTable7);
        jTable7.getColumnModel().getColumn(0).setPreferredWidth(80);
        jTable7.getColumnModel().getColumn(1).setPreferredWidth(90);
        jTable7.getColumnModel().getColumn(2).setPreferredWidth(80);
        jTable7.getColumnModel().getColumn(3).setPreferredWidth(150);
        jTable7.getColumnModel().getColumn(4).setPreferredWidth(100);
        jTable7.getColumnModel().getColumn(5).setPreferredWidth(100);
        jTable7.getColumnModel().getColumn(6).setPreferredWidth(130);
        jTable7.getColumnModel().getColumn(7).setPreferredWidth(100);
        jTable7.getColumnModel().getColumn(8).setPreferredWidth(100);
        jTable7.getColumnModel().getColumn(12).setPreferredWidth(100);
        jTable7.getColumnModel().getColumn(13).setPreferredWidth(140);
        jTable7.getColumnModel().getColumn(14).setPreferredWidth(160);
        jTable7.getColumnModel().getColumn(15).setPreferredWidth(250);
        jTable7.getColumnModel().getColumn(25).setPreferredWidth(120);
        jTable7.getColumnModel().getColumn(28).setPreferredWidth(100);

        jPanel10.add(jScrollPane8);
        jScrollPane8.setBounds(7, 7, 892, 170);

        jTabbedPane1.addTab("Essalud", jPanel10);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(5, 55, 940, 220);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Gestion Contrato", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), java.awt.Color.blue)); // NOI18N
        jPanel5.setLayout(null);

        jToolBar2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jToolBar2.setFloatable(false);
        jToolBar2.setRollover(true);

        btn_anterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Anterior1.JPG"))); // NOI18N
        btn_anterior.setText("Anterior");
        btn_anterior.setFocusable(false);
        btn_anterior.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_anterior.setMaximumSize(new java.awt.Dimension(85, 21));
        btn_anterior.setMinimumSize(new java.awt.Dimension(65, 21));
        btn_anterior.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_anterior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_anteriorMouseClicked(evt);
            }
        });
        btn_anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_anteriorActionPerformed(evt);
            }
        });
        jToolBar2.add(btn_anterior);

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Siguiente1.JPG"))); // NOI18N
        jButton11.setText("Siguiente");
        jButton11.setFocusable(false);
        jButton11.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton11.setMaximumSize(new java.awt.Dimension(85, 21));
        jButton11.setMinimumSize(new java.awt.Dimension(71, 21));
        jButton11.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jToolBar2.add(jButton11);

        lbl_contador.setForeground(new java.awt.Color(0, 51, 204));
        lbl_contador.setText(" 1 Cuenta de 2  ");
        jToolBar2.add(lbl_contador);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/historial.jpg"))); // NOI18N
        jButton2.setText("Historial");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jToolBar2.add(jButton2);

        jPanel6.setLayout(null);

        jLabel28.setText("Gestion Anterior :");
        jPanel6.add(jLabel28);
        jLabel28.setBounds(18, 6, 100, 18);

        txtc_destcon_ult.setEditable(false);
        jPanel6.add(txtc_destcon_ult);
        txtc_destcon_ult.setBounds(123, 3, 110, 28);

        jLabel34.setText("Respuesta Ant.:");
        jPanel6.add(jLabel34);
        jLabel34.setBounds(440, 6, 90, 18);

        txtc_destres_ult.setEditable(false);
        jPanel6.add(txtc_destres_ult);
        txtc_destres_ult.setBounds(240, 3, 190, 28);

        txtf_fecresp_ult.setEditable(false);
        jPanel6.add(txtf_fecresp_ult);
        txtf_fecresp_ult.setBounds(535, 3, 90, 28);

        jToolBar2.add(jPanel6);

        jPanel5.add(jToolBar2);
        jToolBar2.setBounds(5, 20, 928, 30);

        jLabel3.setFont(new java.awt.Font("Ubuntu", 0, 14));
        jLabel3.setText("Nº Contrato :");
        jPanel5.add(jLabel3);
        jLabel3.setBounds(12, 63, 95, 17);

        jLabel4.setFont(new java.awt.Font("Ubuntu", 0, 14));
        jLabel4.setText("Sub Producto :");
        jPanel5.add(jLabel4);
        jLabel4.setBounds(12, 88, 95, 17);

        jLabel5.setFont(new java.awt.Font("Ubuntu", 0, 14));
        jLabel5.setForeground(new java.awt.Color(204, 0, 0));
        jLabel5.setText("Saldo Actual :");
        jPanel5.add(jLabel5);
        jLabel5.setBounds(12, 112, 100, 17);

        jLabel6.setFont(new java.awt.Font("Ubuntu", 0, 14));
        jLabel6.setForeground(new java.awt.Color(204, 0, 0));
        jLabel6.setText("Imp. Provision :");
        jPanel5.add(jLabel6);
        jLabel6.setBounds(12, 137, 105, 17);

        jLabel7.setFont(new java.awt.Font("Ubuntu", 0, 14));
        jLabel7.setForeground(new java.awt.Color(0, 51, 204));
        jLabel7.setText("Tip. Contacto :");
        jPanel5.add(jLabel7);
        jLabel7.setBounds(10, 160, 95, 17);

        jLabel8.setFont(new java.awt.Font("Ubuntu", 0, 14));
        jLabel8.setForeground(new java.awt.Color(0, 51, 204));
        jLabel8.setText("Fecha Promesa :");
        jPanel5.add(jLabel8);
        jLabel8.setBounds(10, 188, 105, 17);

        jLabel13.setFont(new java.awt.Font("Ubuntu", 0, 14));
        jLabel13.setForeground(new java.awt.Color(0, 51, 204));
        jLabel13.setText("Det. No Desea :");
        jPanel5.add(jLabel13);
        jLabel13.setBounds(10, 212, 98, 17);

        txtc_contrato.setEditable(false);
        txtc_contrato.setFont(new java.awt.Font("Ubuntu", 0, 14));
        jPanel5.add(txtc_contrato);
        txtc_contrato.setBounds(110, 60, 120, 22);

        txtc_subprod.setEditable(false);
        txtc_subprod.setFont(new java.awt.Font("Ubuntu", 0, 14));
        jPanel5.add(txtc_subprod);
        txtc_subprod.setBounds(110, 85, 45, 22);

        txtc_divisa.setEditable(false);
        txtc_divisa.setFont(new java.awt.Font("Ubuntu", 0, 14));
        jPanel5.add(txtc_divisa);
        txtc_divisa.setBounds(110, 110, 40, 22);

        txtn_impprov.setEditable(false);
        txtn_impprov.setFont(new java.awt.Font("Ubuntu", 0, 14));
        jPanel5.add(txtn_impprov);
        txtn_impprov.setBounds(110, 135, 90, 22);

        txtc_nomsubpro.setEditable(false);
        txtc_nomsubpro.setFont(new java.awt.Font("Ubuntu", 0, 14));
        jPanel5.add(txtc_nomsubpro);
        txtc_nomsubpro.setBounds(157, 85, 80, 22);

        txtn_saldohoy.setEditable(false);
        txtn_saldohoy.setFont(new java.awt.Font("Ubuntu", 0, 14));
        jPanel5.add(txtn_saldohoy);
        txtn_saldohoy.setBounds(152, 110, 80, 22);

        cbo_tipcon.setFont(new java.awt.Font("Ubuntu", 0, 14));
        cbo_tipcon.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbo_tipcon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_tipconActionPerformed(evt);
            }
        });
        jPanel5.add(cbo_tipcon);
        cbo_tipcon.setBounds(110, 160, 165, 22);

        dtpf_fecresp.setFont(new java.awt.Font("Ubuntu", 0, 14));
        dtpf_fecresp.setModel(new javax.swing.SpinnerDateModel());
        dtpf_fecresp.setEditor(new javax.swing.JSpinner.DateEditor(dtpf_fecresp, "dd/MM/yyyy"));
        jPanel5.add(dtpf_fecresp);
        dtpf_fecresp.setBounds(118, 185, 90, 22);

        dtpf_fecrevi.setFont(new java.awt.Font("Ubuntu", 0, 14));
        dtpf_fecrevi.setModel(new javax.swing.SpinnerDateModel());
        dtpf_fecrevi.setEditor(new javax.swing.JSpinner.DateEditor(dtpf_fecrevi, "dd/MM/yyyy"));
        jPanel5.add(dtpf_fecrevi);
        dtpf_fecrevi.setBounds(342, 185, 90, 22);

        cbo_tipres_sub.setFont(new java.awt.Font("Ubuntu", 0, 14));
        cbo_tipres_sub.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbo_tipres_sub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_tipres_subActionPerformed(evt);
            }
        });
        jPanel5.add(cbo_tipres_sub);
        cbo_tipres_sub.setBounds(118, 210, 430, 22);

        jLabel14.setFont(new java.awt.Font("Ubuntu", 0, 14));
        jLabel14.setForeground(new java.awt.Color(0, 51, 204));
        jLabel14.setText("Fecha de Revision :");
        jPanel5.add(jLabel14);
        jLabel14.setBounds(217, 188, 120, 17);

        jLabel15.setFont(new java.awt.Font("Ubuntu", 0, 14));
        jLabel15.setForeground(new java.awt.Color(0, 51, 204));
        jLabel15.setText("Observacion :");
        jPanel5.add(jLabel15);
        jLabel15.setBounds(10, 242, 85, 17);

        txtc_obsges.setMaximumSize(new java.awt.Dimension(1, 100));
        txtc_obsges.setMinimumSize(new java.awt.Dimension(1, 100));
        txtc_obsges.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtc_obsgesKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtc_obsgesKeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(txtc_obsges);

        jPanel5.add(jScrollPane2);
        jScrollPane2.setBounds(110, 240, 430, 80);

        jLabel16.setFont(new java.awt.Font("Ubuntu", 0, 14));
        jLabel16.setText("Gestor:");
        jPanel5.add(jLabel16);
        jLabel16.setBounds(240, 63, 50, 17);

        jLabel17.setFont(new java.awt.Font("Ubuntu", 0, 14));
        jLabel17.setText("Territorio :");
        jPanel5.add(jLabel17);
        jLabel17.setBounds(430, 63, 65, 17);

        jLabel18.setFont(new java.awt.Font("Ubuntu", 0, 14));
        jLabel18.setText("Oficina :");
        jPanel5.add(jLabel18);
        jLabel18.setBounds(435, 88, 55, 17);

        jLabel19.setFont(new java.awt.Font("Ubuntu", 0, 14));
        jLabel19.setForeground(new java.awt.Color(204, 0, 0));
        jLabel19.setText("Fecha Fin Cumpli.:");
        jPanel5.add(jLabel19);
        jLabel19.setBounds(240, 112, 120, 17);

        jLabel20.setFont(new java.awt.Font("Ubuntu", 0, 14));
        jLabel20.setForeground(new java.awt.Color(204, 0, 0));
        jLabel20.setText("Deu. Total Obligatorio:");
        jPanel5.add(jLabel20);
        jLabel20.setBounds(208, 137, 145, 17);

        txtc_gestor.setEditable(false);
        txtc_gestor.setFont(new java.awt.Font("Ubuntu", 0, 14));
        jPanel5.add(txtc_gestor);
        txtc_gestor.setBounds(290, 60, 130, 22);

        txtc_dessubpro.setEditable(false);
        txtc_dessubpro.setFont(new java.awt.Font("Ubuntu", 0, 14));
        jPanel5.add(txtc_dessubpro);
        txtc_dessubpro.setBounds(239, 85, 190, 22);

        txtc_oficina.setEditable(false);
        txtc_oficina.setFont(new java.awt.Font("Ubuntu", 0, 14));
        jPanel5.add(txtc_oficina);
        txtc_oficina.setBounds(490, 85, 48, 22);

        txtc_nombof.setEditable(false);
        txtc_nombof.setFont(new java.awt.Font("Ubuntu", 0, 14));
        jPanel5.add(txtc_nombof);
        txtc_nombof.setBounds(540, 85, 180, 22);

        txtc_territorio.setEditable(false);
        txtc_territorio.setFont(new java.awt.Font("Ubuntu", 0, 14));
        jPanel5.add(txtc_territorio);
        txtc_territorio.setBounds(500, 60, 190, 22);

        txtf_fincumpli.setEditable(false);
        txtf_fincumpli.setFont(new java.awt.Font("Ubuntu", 0, 14));
        jPanel5.add(txtf_fincumpli);
        txtf_fincumpli.setBounds(360, 110, 80, 22);

        txtn_deutotobli.setEditable(false);
        txtn_deutotobli.setFont(new java.awt.Font("Ubuntu", 0, 14));
        jPanel5.add(txtn_deutotobli);
        txtn_deutotobli.setBounds(360, 135, 80, 22);

        jLabel21.setFont(new java.awt.Font("Ubuntu", 0, 14));
        jLabel21.setForeground(new java.awt.Color(204, 0, 0));
        jLabel21.setText("Dias Venci. :");
        jPanel5.add(jLabel21);
        jLabel21.setBounds(450, 112, 75, 17);

        jLabel22.setFont(new java.awt.Font("Ubuntu", 0, 14));
        jLabel22.setForeground(new java.awt.Color(204, 0, 0));
        jLabel22.setText("Deuda Cliente :");
        jPanel5.add(jLabel22);
        jLabel22.setBounds(455, 137, 100, 17);

        txtn_diasvenc.setEditable(false);
        txtn_diasvenc.setFont(new java.awt.Font("Ubuntu", 0, 14));
        jPanel5.add(txtn_diasvenc);
        txtn_diasvenc.setBounds(528, 110, 60, 22);

        txtn_deutotclie.setEditable(false);
        txtn_deutotclie.setFont(new java.awt.Font("Ubuntu", 0, 14));
        jPanel5.add(txtn_deutotclie);
        txtn_deutotclie.setBounds(560, 135, 70, 22);

        jLabel23.setFont(new java.awt.Font("Ubuntu", 0, 14));
        jLabel23.setText("Tramo Dia :");
        jPanel5.add(jLabel23);
        jLabel23.setBounds(700, 63, 70, 17);

        txtc_tramodia.setEditable(false);
        txtc_tramodia.setFont(new java.awt.Font("Ubuntu", 0, 14));
        jPanel5.add(txtc_tramodia);
        txtc_tramodia.setBounds(775, 60, 90, 22);

        jLabel24.setFont(new java.awt.Font("Ubuntu", 0, 14));
        jLabel24.setText("Provision :");
        jPanel5.add(jLabel24);
        jLabel24.setBounds(595, 112, 65, 17);

        jLabel25.setFont(new java.awt.Font("Ubuntu", 0, 14));
        jLabel25.setText("Tipo Arrastre :");
        jPanel5.add(jLabel25);
        jLabel25.setBounds(742, 112, 90, 17);

        txtc_provision.setEditable(false);
        txtc_provision.setFont(new java.awt.Font("Ubuntu", 0, 14));
        jPanel5.add(txtc_provision);
        txtc_provision.setBounds(663, 110, 72, 22);

        txtc_tarrastre.setEditable(false);
        txtc_tarrastre.setFont(new java.awt.Font("Ubuntu", 0, 14));
        jPanel5.add(txtc_tarrastre);
        txtc_tarrastre.setBounds(835, 110, 85, 22);

        jLabel26.setFont(new java.awt.Font("Ubuntu", 0, 14));
        jLabel26.setForeground(new java.awt.Color(0, 51, 204));
        jLabel26.setText("Respuesta :");
        jPanel5.add(jLabel26);
        jLabel26.setBounds(283, 163, 75, 17);

        cbo_tipres.setFont(new java.awt.Font("Ubuntu", 0, 14));
        cbo_tipres.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbo_tipres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_tipresActionPerformed(evt);
            }
        });
        jPanel5.add(cbo_tipres);
        cbo_tipres.setBounds(360, 160, 530, 22);

        jTable8.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9", "Title 10", "Title 11", "Title 12", "Title 13", "Title 14", "Title 15", "Title 16", "Título 17"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable8.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable8.setEnabled(false);
        jTable8.getTableHeader().setReorderingAllowed(false);
        jScrollPane9.setViewportView(jTable8);
        jTable8.getColumnModel().getColumn(0).setResizable(false);
        jTable8.getColumnModel().getColumn(1).setResizable(false);
        jTable8.getColumnModel().getColumn(2).setResizable(false);
        jTable8.getColumnModel().getColumn(3).setResizable(false);
        jTable8.getColumnModel().getColumn(4).setResizable(false);
        jTable8.getColumnModel().getColumn(5).setResizable(false);
        jTable8.getColumnModel().getColumn(6).setResizable(false);
        jTable8.getColumnModel().getColumn(7).setResizable(false);
        jTable8.getColumnModel().getColumn(8).setResizable(false);
        jTable8.getColumnModel().getColumn(9).setResizable(false);
        jTable8.getColumnModel().getColumn(10).setResizable(false);
        jTable8.getColumnModel().getColumn(11).setResizable(false);
        jTable8.getColumnModel().getColumn(12).setResizable(false);
        jTable8.getColumnModel().getColumn(13).setResizable(false);
        jTable8.getColumnModel().getColumn(14).setResizable(false);
        jTable8.getColumnModel().getColumn(15).setResizable(false);

        jPanel5.add(jScrollPane9);
        jScrollPane9.setBounds(550, 280, 380, 60);

        txt_importe.setFont(new java.awt.Font("Ubuntu", 0, 14));
        txt_importe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_importeActionPerformed(evt);
            }
        });
        txt_importe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_importeKeyTyped(evt);
            }
        });
        jPanel5.add(txt_importe);
        txt_importe.setBounds(505, 185, 70, 22);

        jLabel44.setFont(new java.awt.Font("Ubuntu", 0, 14));
        jLabel44.setText("Importe :");
        jPanel5.add(jLabel44);
        jLabel44.setBounds(440, 188, 60, 17);

        jLabel29.setFont(new java.awt.Font("Ubuntu", 0, 14));
        jLabel29.setText("Estado de Gestion :");
        jPanel5.add(jLabel29);
        jLabel29.setBounds(588, 188, 126, 17);

        cbo_estado_gest.setFont(new java.awt.Font("Ubuntu", 0, 14));
        cbo_estado_gest.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbo_estado_gest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_estado_gestActionPerformed(evt);
            }
        });
        jPanel5.add(cbo_estado_gest);
        cbo_estado_gest.setBounds(720, 186, 187, 22);

        jLabel33.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jLabel33.setText("N° Ubicado :");
        jPanel5.add(jLabel33);
        jLabel33.setBounds(560, 213, 82, 17);
        jPanel5.add(txt_numubi);
        txt_numubi.setBounds(645, 212, 100, 22);

        getContentPane().add(jPanel5);
        jPanel5.setBounds(5, 280, 940, 350);

        jToolBar1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/grabar.JPG"))); // NOI18N
        jButton1.setText("Grabar");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);

        btn_refinancia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/refinancia.JPG"))); // NOI18N
        btn_refinancia.setText("Refina..");
        btn_refinancia.setFocusable(false);
        btn_refinancia.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_refinancia.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_refinancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refinanciaActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_refinancia);

        getContentPane().add(jToolBar1);
        jToolBar1.setBounds(0, 0, 952, 50);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    try{   
    this.agregar();    
    int cont=0;
    for(int i=0;i<jTable8.getRowCount();i++){
    if(jTable8.getValueAt(i,8)==null || jTable8.getValueAt(i,8).equals("SG00 - Sin Gestion")){
    cont=cont + 1;
    }
    }

    if(cont>0){
    JOptionPane.showMessageDialog(null, "Faltan Registros por Gestionar");
    return;
    }

    SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm");
    Gestion ges=new Gestion();
    for(int i=0;i<jTable8.getRowCount();i++){
    String codcent,c_contrato,fproceso,fecasig,
    f_fecmod,codtges,codtcon,codtres,
    id_codtres_sub,f_fecresp,f_fecrevi,f_fecprog,c_obsges,estado_ges,numubi="";
    String importe;
    int n_idxges;

    codcent= "'" + m.getValueAt(i,0) + "'";
    c_contrato="'" + m.getValueAt(i,1) + "'";
    fproceso= "'" +  m.getValueAt(i,2).toString().substring(0, 10) + " 00:00:00.000'";
    fecasig= "'" + m.getValueAt(i,3).toString().substring(0, 10) + " 00:00:00.000'";
    f_fecmod= "'" + m.getValueAt(i,4).toString() + "'";
    n_idxges = Integer.parseInt(m.getValueAt(i,5) + "");
    codtges= "'" + m.getValueAt(i,6) + "'";
    codtcon= "'" + m.getValueAt(i,7) + "'";
    codtres= "'" + String.valueOf(m.getValueAt(i,8)).substring(0, 3) + "'";

     if(m.getValueAt(i,9)==null){
       id_codtres_sub=null;
     }else{
       id_codtres_sub= "'" + String.valueOf(m.getValueAt(i,9)).substring(0, 3) + "'";
     }
 
    if(jTable8.getValueAt(i, 10)==null){
    f_fecresp=null;
    }else{
     String dia_res,mes_res,año_res;
     dia_res=String.valueOf(jTable8.getValueAt(i, 10)).substring(0, 2);
     mes_res=String.valueOf(jTable8.getValueAt(i, 10)).substring(3, 5);
     año_res=String.valueOf(jTable8.getValueAt(i, 10)).substring(6, 10);
     f_fecresp="'" + año_res + "-" + mes_res + "-" + dia_res + " 00:00:00.000'";
    }

    if(jTable8.getValueAt(i, 11)==null){
    f_fecrevi=null;
    }else{
    String dia_revi,mes_revi,año_revi;
    dia_revi=String.valueOf(jTable8.getValueAt(i, 11)).substring(0, 2);
    mes_revi=String.valueOf(jTable8.getValueAt(i, 11)).substring(3, 5);
    año_revi=String.valueOf(jTable8.getValueAt(i, 11)).substring(6, 10);
    f_fecrevi="'" + año_revi + "-" + mes_revi + "-" + dia_revi + " 00:00:00.000'";
    } 

    if(chkf_fecprog.isSelected()){
    f_fecprog="'" + sdf.format(dtp_fecprog.getValue()) + ":00.000'";
    }else{
    f_fecprog=null;
    }

    if(m.getValueAt(i,13).equals("") || m.getValueAt(i,13)==null){
    c_obsges=null;
    }else{
    c_obsges="'" + m.getValueAt(i,13) + "'";
    }

    if(m.getValueAt(i,15).equals("") || m.getValueAt(i,15)==null){
    importe=null;
    }else{
    importe="'" + m.getValueAt(i,15) + "'";
    }

    if(m.getValueAt(i,16)==null){
     estado_ges=null;
    }else{
     estado_ges= "'" + String.valueOf(m.getValueAt(i, 16)) + "'";
    }

    if(txt_numubi.getText().trim().length()==0){
     numubi=null;
    }else{
     numubi="'" + txt_numubi.getText() + "'";
    }

    ges.graba_gestion_contrato(codcent,c_contrato,fproceso,fecasig,
    f_fecmod,n_idxges,codtges,codtcon,codtres,null,f_fecresp,f_fecrevi,f_fecprog,
    c_obsges,id_codusu,importe,id_codtres_sub,estado_ges, numubi);

    this.grabacion_adicicional();
   
    }frm_cartera_Ges frm=(frm_cartera_Ges)frm_cartera_Ges.formulario;
    frm.listado();
    this.hide();
    }catch(Exception ioE){
    JOptionPane.showMessageDialog(null, ioE);
    }
      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_anteriorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_anteriorMouseClicked

}//GEN-LAST:event_btn_anteriorMouseClicked

    private void btn_anteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_anteriorActionPerformed
             
        if(idx>0){
        this.agregar();
        idx=idx-1;
        this.lista_contrato();
        this.actualizar();
        }
       
}//GEN-LAST:event_btn_anteriorActionPerformed

    private void cbo_tipconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_tipconActionPerformed
    try{

        cbo_tipres.removeAllItems();
        Gestion ges=new Gestion();
        ArrayList lista=new ArrayList();
        String tipcon="";

        tipcon=String.valueOf(cbo_tipcon.getSelectedItem()).substring(0, 2);
        lista=ges.Respuesta_llam(tipcon);

        for(int i=0;i<lista.size();i++){
        ges=(Gestion)lista.get(i);
        cbo_tipres.addItem(ges.getId_codtres() + " - " + ges.getC_destres());
        }

        if(id_codtres.isEmpty() || id_codtres.equals("SG00")){
        cbo_tipres.setSelectedItem("SG00 - Sin Gestion");
        }else{
        cbo_tipres.setSelectedItem(id_codtres + " - " + c_destres);
        }

         if(txtc_territorio.getText().equals("CANALES 01") && (cbo_tipcon.getSelectedIndex()==0 ||
             cbo_tipcon.getSelectedIndex()==1)){
             cbo_tipres_sub.setEnabled(true);
             cbo_estado_gest.setEnabled(true);
            }else{
             cbo_tipres_sub.setEnabled(false);
             cbo_estado_gest.setEnabled(false);
            }
        
        }catch(Exception ioE){
        JOptionPane.showMessageDialog(null, ioE);
        }
    }//GEN-LAST:event_cbo_tipconActionPerformed

    private void cbo_tipresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_tipresActionPerformed
       try{

       if(cbo_tipres.getSelectedItem()!=null){
       String Respuesta=String.valueOf(cbo_tipres.getSelectedItem()).substring(0, 3);
       if(Integer.parseInt(Respuesta)==101 || Integer.parseInt(Respuesta)==201){
       txt_importe.setEnabled(true);
       }else{
       txt_importe.setText("");
       txt_importe.setEnabled(false);
       }
       }

       Gestion ges=new Gestion();
       ArrayList lista=new ArrayList();
       lista=ges.datos_tiposubrespuesta(String.valueOf(cbo_tipcon.getSelectedItem()).substring(0, 2),
       String.valueOf(cbo_tipres.getSelectedItem()).substring(0, 3));
       this.valida_Fecha(String.valueOf(cbo_tipres.getSelectedItem()).substring(0, 3));
       }catch(Exception e){
       //JOptionPane.showMessageDialog(null, e.getMessage());
       }
    }//GEN-LAST:event_cbo_tipresActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed

        if(idx<filas-1){
           this.agregar();
           idx=idx+1;
           this.lista_contrato();
           this.actualizar();
         }
        
        
}//GEN-LAST:event_jButton11ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        cboc_tipo.setSelectedIndex(0);
        txtc_prefijo.setText("");
        txtc_numero.setText("");
        txtc_anexo.setText("");

        cboc_tipo.setEnabled(true);
        txtc_prefijo.setEnabled(true);
        txtc_numero.setEnabled(true);
        txtc_anexo.setEnabled(true);
        btn_cancelar_tel.setEnabled(true);
        btn_quitar_tel.setEnabled(false);
        btn_agregar_tel.setEnabled(true);

    }//GEN-LAST:event_jButton3ActionPerformed

    private void btn_quitar_telActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_quitar_telActionPerformed
         int res=JOptionPane.showConfirmDialog(null, "Seguro de Eliminar Telefono","Informacion",JOptionPane.YES_NO_OPTION);
         if(res==1){
         return;
         }else{
         int fila=jTable2.getSelectedRow();
         DefaultTableModel modelo = (DefaultTableModel)jTable2.getModel();
         modelo.removeRow(fila);   
         }
         
    }//GEN-LAST:event_btn_quitar_telActionPerformed

    private void btn_cancelar_telActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelar_telActionPerformed
        cboc_tipo.setSelectedIndex(0);
        txtc_prefijo.setText("");
        txtc_numero.setText("");
        txtc_anexo.setText("");

        cboc_tipo.setEnabled(false);
        txtc_prefijo.setEnabled(false);
        txtc_numero.setEnabled(false);
        txtc_anexo.setEnabled(false);
        btn_cancelar_tel.setEnabled(false);
        btn_quitar_tel.setEnabled(true);
        btn_agregar_tel.setEnabled(false);
    }//GEN-LAST:event_btn_cancelar_telActionPerformed

    private void btn_agregar_telActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregar_telActionPerformed
      try{

       if(txtc_numero.getText().trim().length()==0){
       JOptionPane.showMessageDialog(null, "Ingrese Telefono Contacto");
       return;
       }
       
       Object nuevo[]={"","","","","",""};
       int fila=jTable2.getRowCount();
       SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
       DefaultTableModel tbl=(DefaultTableModel)jTable2.getModel();
       tbl.addRow(nuevo);
       Date hoy=new Date();
       tbl.setValueAt(c_codcent, fila, 0);
       tbl.setValueAt("0", fila, 1);
       tbl.setValueAt(sdf.format(hoy), fila, 2);
       tbl.setValueAt(String.valueOf(cboc_tipo.getSelectedItem()).substring(0, 1), fila, 3);

       if(txtc_prefijo.getText().trim().length()==0){
       tbl.setValueAt(null, fila, 4);    
       }else{
       tbl.setValueAt(txtc_prefijo.getText(), fila, 4);
       }
      
       tbl.setValueAt(txtc_numero.getText(), fila, 5);
      
       if(txtc_anexo.getText().trim().length()==0){
       tbl.setValueAt(null, fila, 6);
       }else{
       tbl.setValueAt(txtc_anexo.getText(), fila, 6);
       }
       
       this.jTable2.setModel(tbl);      
       btn_cancelar_telActionPerformed(evt);
      }catch(Exception ioE){
      JOptionPane.showMessageDialog(null, ioE);
      }
    }//GEN-LAST:event_btn_agregar_telActionPerformed

    private void btn_refinanciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refinanciaActionPerformed
        try{
        Contratos co=new Contratos();
        ArrayList lista=new ArrayList();
        lista=co.registro_contrato(c_codcent, f_fproceso, id_codtges, idxges, id_codusu);
        for(int i=0;i<lista.size();i++){
        co=(Contratos)lista.get(i);
        String contrato=co.getC_contrato();
        if(co.validaexistecontratoref(contrato)>0){
        JOptionPane.showMessageDialog(null,"1 o mas Contratos ya cuentan con Refinanciacion", "Informacion", JOptionPane.INFORMATION_MESSAGE);
        return;
        }
        }
        
        }catch(Exception ioE){
        JOptionPane.showMessageDialog(null, ioE);    
        }
    }//GEN-LAST:event_btn_refinanciaActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        cboc_coddepa.setSelectedIndex(0);
        cboc_codprov.setSelectedIndex(0);
        cboc_coddist.setSelectedIndex(0);
        txtc_direccion_con.setText("");
        chkc_flgimp.setSelected(false);

        cboc_coddepa.setEnabled(true);
        cboc_codprov.setEnabled(true);
        cboc_coddist.setEnabled(true);
        txtc_direccion_con.setEnabled(true);
        chkc_flgimp.setEnabled(true);

        btn_cancelar_dir.setEnabled(true);
        btn_quitar_dir.setEnabled(false);
        btn_agregar_dir.setEnabled(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void btn_cancelar_dirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelar_dirActionPerformed
        cboc_coddepa.setSelectedIndex(0);
        cboc_codprov.setSelectedIndex(0);
        cboc_coddist.setSelectedIndex(0);
        txtc_direccion_con.setText("");
        chkc_flgimp.setSelected(false);

        cboc_coddepa.setEnabled(false);
        cboc_codprov.setEnabled(false);
        cboc_coddist.setEnabled(false);
        txtc_direccion_con.setEditable(true);
        chkc_flgimp.setEnabled(false);

        btn_cancelar_dir.setEnabled(false);
        btn_quitar_dir.setEnabled(true);
        btn_agregar_dir.setEnabled(false);
    }//GEN-LAST:event_btn_cancelar_dirActionPerformed

    private void btn_quitar_dirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_quitar_dirActionPerformed
         int res=JOptionPane.showConfirmDialog(null, "Seguro de Eliminar Registro","Informacion",JOptionPane.YES_NO_OPTION);
         if(res==1){
         return;
         }else{
         int fila=jTable3.getSelectedRow();
         DefaultTableModel modelo = (DefaultTableModel)jTable3.getModel();
         modelo.removeRow(fila);
         }
    }//GEN-LAST:event_btn_quitar_dirActionPerformed

    private void btn_agregar_dirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregar_dirActionPerformed
      try{
       if(txtc_direccion_con.getText().trim().length()==0){
       JOptionPane.showMessageDialog(null, "Ingrese Direccion Contacto");
       return;
       }

       Object nuevo[]={"","","","","",""};
       int fila=jTable3.getRowCount();
       int indice=String.valueOf(cboc_coddist.getSelectedItem()).length();
       SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
       DefaultTableModel tbl=(DefaultTableModel)jTable3.getModel();
       tbl.addRow(nuevo);
       Date hoy=new Date();
       tbl.setValueAt(c_codcent, fila, 0);
       tbl.setValueAt("0", fila, 1);
       tbl.setValueAt(sdf.format(hoy), fila, 2);
       tbl.setValueAt(String.valueOf(cboc_coddepa.getSelectedItem()).substring(0, 2), fila, 3);
       tbl.setValueAt(String.valueOf(cboc_codprov.getSelectedItem()).substring(0, 2), fila, 4);
       tbl.setValueAt(String.valueOf(cboc_coddist.getSelectedItem()).substring(0, 3), fila, 5);
       
       tbl.setValueAt(txtc_direccion_con.getText(), fila, 6);
     
       tbl.setValueAt(String.valueOf(cboc_coddist.getSelectedItem()).substring(6,indice), fila, 7);
       if(chkc_flgimp.isSelected()){
       tbl.setValueAt("1", fila, 8);
       }else{
       tbl.setValueAt("0", fila, 8);
       }
       this.jTable3.setModel(tbl); 
       btn_cancelar_dirActionPerformed(evt);
      }catch(Exception e){

      }

    }//GEN-LAST:event_btn_agregar_dirActionPerformed

    private void cboc_coddepaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboc_coddepaActionPerformed
        try{
        cboc_codprov.removeAllItems();
        Cartera car=new Cartera();
        ArrayList lista=new ArrayList();
        cboc_codprov.addItem("00 - [Seleccionar]");
        lista=car.datos_provincia(String.valueOf(cboc_coddepa.getSelectedItem()).substring(0, 2));

        for(int i=0;i<lista.size();i++){
        car=(Cartera)lista.get(i);
        cboc_codprov.addItem(car.getC_codprov() + " - " + car.getC_desprov());
        }cboc_codprov.setSelectedIndex(0);
        }catch(Exception ioE){
        JOptionPane.showMessageDialog(null, ioE);
        }
    }//GEN-LAST:event_cboc_coddepaActionPerformed

    private void cboc_codprovActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboc_codprovActionPerformed
        try{
        cboc_coddist.removeAllItems();
        Cartera car=new Cartera();
        ArrayList lista=new ArrayList();
        cboc_coddist.addItem("00 - [Seleccionar]");
        lista=car.datos_distrito(String.valueOf(cboc_coddepa.getSelectedItem()).substring(0, 2),String.valueOf(cboc_codprov.getSelectedItem()).substring(0, 2));
        for(int i=0;i<lista.size();i++){
        car=(Cartera)lista.get(i);
        cboc_coddist.addItem(car.getC_coddist() + " - " + car.getC_desdist());
        }cboc_coddist.setSelectedIndex(0);
        }catch(Exception ioE){
        JOptionPane.showMessageDialog(null, ioE);
        }
    }//GEN-LAST:event_cboc_codprovActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       try{
        Globales glo=new Globales();
        Contacto co=new Contacto();   
        ArrayList lista=new ArrayList();
        lista=co.contacto_gestion_historia(glo.getC_codcent(), glo.getF_fproceso(), glo.getId_codper());
        if(lista.size()>0){
        frm_contacto_his frm=new frm_contacto_his(new javax.swing.JFrame(),true);
        frm.setSize(690, 410);
        frm.setVisible(true);                
        }else{
        JOptionPane.showMessageDialog(null,"El Contacto no Cuenta con Historial", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        }      
       }catch(Exception ioE){
       JOptionPane.showMessageDialog(null, ioE);    
       }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void chkf_fecprogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkf_fecprogActionPerformed
       if(chkf_fecprog.isSelected()){
       dtp_fecprog.setEnabled(true);
       }else{
       dtp_fecprog.setEnabled(false);
       }
    }//GEN-LAST:event_chkf_fecprogActionPerformed

    private void txt_importeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_importeActionPerformed
       
    }//GEN-LAST:event_txt_importeActionPerformed

    private void cbo_tipres_subActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_tipres_subActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbo_tipres_subActionPerformed

    private void txt_importeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_importeKeyTyped
     int k=(int)evt.getKeyChar();
     if (k >= 97 && k <= 122 || k>=65 && k<=90){
     evt.setKeyChar((char)KeyEvent.VK_CLEAR);
     }
    }//GEN-LAST:event_txt_importeKeyTyped

    private void txtc_obsgesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtc_obsgesKeyTyped
        if(txtc_obsges.getText().length()==100){
            evt.consume();
        }
}//GEN-LAST:event_txtc_obsgesKeyTyped

    private void txtc_obsgesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtc_obsgesKeyPressed
     if(evt.getKeyCode()==(char)KeyEvent.VK_ENTER){
        evt.consume();
     }
    }//GEN-LAST:event_txtc_obsgesKeyPressed

    private void cbo_estado_gestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_estado_gestActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbo_estado_gestActionPerformed

    private void cboc_tipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboc_tipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboc_tipoActionPerformed

    private void cboc_coddistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboc_coddistActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboc_coddistActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                frm_llamada_ges dialog = new frm_llamada_ges(new javax.swing.JFrame(), true);
//                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
//                    public void windowClosing(java.awt.event.WindowEvent e) {
//                        System.exit(0);
//                    }
//                });
//                dialog.setSize(750, 670);
//                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregar_dir;
    private javax.swing.JButton btn_agregar_tel;
    private javax.swing.JButton btn_anterior;
    private javax.swing.JButton btn_cancelar_dir;
    private javax.swing.JButton btn_cancelar_tel;
    private javax.swing.JButton btn_quitar_dir;
    private javax.swing.JButton btn_quitar_tel;
    private javax.swing.JButton btn_refinancia;
    private javax.swing.JComboBox cbo_estado_gest;
    private javax.swing.JComboBox cbo_tipcon;
    private javax.swing.JComboBox cbo_tipres;
    private javax.swing.JComboBox cbo_tipres_sub;
    private javax.swing.JComboBox cboc_coddepa;
    private javax.swing.JComboBox cboc_coddist;
    private javax.swing.JComboBox cboc_codprov;
    private javax.swing.JComboBox cboc_tipo;
    private javax.swing.JCheckBox chkc_flgimp;
    private javax.swing.JCheckBox chkf_fecprog;
    private javax.swing.JSpinner dtp_fecprog;
    private javax.swing.JSpinner dtpf_fecresp;
    private javax.swing.JSpinner dtpf_fecrevi;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTable jTable7;
    private javax.swing.JTable jTable8;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JLabel lbl_contador;
    private javax.swing.JLabel lbl_mensaje;
    private javax.swing.JTextField txt_importe;
    private javax.swing.JTextField txt_numubi;
    private javax.swing.JTextField txtc_anexo;
    private javax.swing.JTextField txtc_contrato;
    private javax.swing.JTextField txtc_dessubpro;
    private javax.swing.JFormattedTextField txtc_destcon_ult;
    private javax.swing.JTextField txtc_destres_ult;
    private javax.swing.JTextField txtc_direccion;
    private javax.swing.JTextField txtc_direccion_con;
    private javax.swing.JTextField txtc_distprov;
    private javax.swing.JTextField txtc_divisa;
    private javax.swing.JTextField txtc_dpto;
    private javax.swing.JTextField txtc_email;
    private javax.swing.JTextField txtc_gestor;
    private javax.swing.JTextField txtc_nombof;
    private javax.swing.JTextField txtc_nombre;
    private javax.swing.JTextField txtc_nomsubpro;
    private javax.swing.JTextField txtc_nrodoc;
    private javax.swing.JTextField txtc_numero;
    private javax.swing.JTextPane txtc_obsges;
    private javax.swing.JTextField txtc_oficina;
    private javax.swing.JTextField txtc_prefijo;
    private javax.swing.JTextField txtc_provision;
    private javax.swing.JTextField txtc_subprod;
    private javax.swing.JTextField txtc_tarrastre;
    private javax.swing.JTextField txtc_telefono;
    private javax.swing.JTextField txtc_territorio;
    private javax.swing.JTextField txtc_tipodoc;
    private javax.swing.JTextField txtc_tpersona;
    private javax.swing.JTextField txtc_tramodia;
    private javax.swing.JTextField txtc_ubigeo;
    private javax.swing.JTextField txtf_fecresp_ult;
    private javax.swing.JTextField txtf_fincumpli;
    private javax.swing.JTextField txtn_deutotclie;
    private javax.swing.JTextField txtn_deutotobli;
    private javax.swing.JTextField txtn_diasvenc;
    private javax.swing.JTextField txtn_impprov;
    private javax.swing.JTextField txtn_saldohoy;
    // End of variables declaration//GEN-END:variables

}
