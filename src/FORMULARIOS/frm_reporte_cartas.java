
package FORMULARIOS;

import BEANS.Gestion;
import BEANS.Periodo;
import BEANS.Reportes;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import jxl.Workbook;
import jxl.format.Colour;
import jxl.format.UnderlineStyle;
import jxl.write.Label;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;


public class frm_reporte_cartas extends javax.swing.JDialog {

    void cargar(){
    try{

      cbo_estcart.removeAllItems();
      cbo_periodo.removeAllItems();
      cbo_tipcon.removeAllItems();

    Periodo per=new Periodo();
    ArrayList lista=new ArrayList();
    lista=per.listado_periodos();

    for(int i=0;i<lista.size();i++){
    per=(Periodo)lista.get(i);
    cbo_periodo.addItem(per.getId_codper() + " - " + per.getC_desper());
    }

    cbo_tipcon.addItem("01 - Contacto Directo");
    cbo_tipcon.addItem("02 - Contacto Indirecto");
    cbo_tipcon.addItem("03 - No Contacto");
    cbo_tipcon.addItem("Todos");
    cbo_tipcon.setSelectedItem("Todos");

    cbo_estcart.addItem("UBI - Ubicados");
    cbo_estcart.addItem("INU - Inubicados");
    cbo_estcart.addItem("Todos");
    cbo_estcart.setSelectedItem("Todos");
        
        
    }catch(Exception e){
    JOptionPane.showMessageDialog(null, e.getMessage());
    }    
    }


    public frm_reporte_cartas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        ((javax.swing.JSpinner.DateEditor)dtp_fecini.getEditor()).getTextField().setEditable(false);
        ((javax.swing.JSpinner.DateEditor)dtp_fecfin.getEditor()).getTextField().setEditable(false);
        this.cargar();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cbo_periodo = new javax.swing.JComboBox();
        txt_nomcont = new javax.swing.JTextField();
        cbo_tipcon = new javax.swing.JComboBox();
        dtp_fecini = new javax.swing.JSpinner();
        dtp_fecfin = new javax.swing.JSpinner();
        cbo_estcart = new javax.swing.JComboBox();
        cbos_estcart = new javax.swing.JComboBox();
        txt_numdoc = new javax.swing.JTextField();
        cbo_tipres = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jProgressBar1 = new javax.swing.JProgressBar();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        lbl_nroreg = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Reporte Cartas Impresas");
        getContentPane().setLayout(null);

        jToolBar1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mostrar.JPG"))); // NOI18N
        jButton1.setText("Mostrar");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/excel.JPG"))); // NOI18N
        jButton2.setText("Exportar");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton2);

        getContentPane().add(jToolBar1);
        jToolBar1.setBounds(0, 0, 960, 50);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Criterios de Busqueda"));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 14));
        jLabel1.setText("Periodo :");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(15, 28, 58, 17);

        jLabel2.setFont(new java.awt.Font("Ubuntu", 0, 14));
        jLabel2.setText("Nombres :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(15, 55, 65, 17);

        jLabel3.setFont(new java.awt.Font("Ubuntu", 0, 14));
        jLabel3.setText("Contacto :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(15, 82, 70, 17);

        jLabel4.setFont(new java.awt.Font("Ubuntu", 0, 14));
        jLabel4.setText("Respuesta :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(245, 83, 75, 17);

        jLabel5.setFont(new java.awt.Font("Ubuntu", 0, 14));
        jLabel5.setText("Fecha Impresion :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(240, 28, 110, 17);

        jLabel6.setFont(new java.awt.Font("Ubuntu", 0, 14));
        jLabel6.setText("Hasta :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(462, 28, 45, 17);

        jLabel7.setFont(new java.awt.Font("Ubuntu", 0, 14));
        jLabel7.setText("Estado de Carta :");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(340, 55, 108, 17);

        jLabel8.setFont(new java.awt.Font("Ubuntu", 0, 14));
        jLabel8.setText("Sub. Estado Carta :");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(578, 55, 120, 17);

        jLabel9.setFont(new java.awt.Font("Ubuntu", 0, 14));
        jLabel9.setText("Nº Docu.:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(620, 28, 60, 17);

        cbo_periodo.setFont(new java.awt.Font("Arial", 1, 11));
        cbo_periodo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(cbo_periodo);
        cbo_periodo.setBounds(80, 25, 150, 22);
        jPanel1.add(txt_nomcont);
        txt_nomcont.setBounds(85, 52, 250, 22);

        cbo_tipcon.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbo_tipcon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_tipconActionPerformed(evt);
            }
        });
        jPanel1.add(cbo_tipcon);
        cbo_tipcon.setBounds(85, 80, 155, 22);

        dtp_fecini.setModel(new javax.swing.SpinnerDateModel());
        dtp_fecini.setEditor(new javax.swing.JSpinner.DateEditor(dtp_fecini, "dd/MM/yyyy"));
        jPanel1.add(dtp_fecini);
        dtp_fecini.setBounds(357, 25, 95, 22);

        dtp_fecfin.setModel(new javax.swing.SpinnerDateModel());
        dtp_fecfin.setEditor(new javax.swing.JSpinner.DateEditor(dtp_fecfin, "dd/MM/yyyy"));
        jPanel1.add(dtp_fecfin);
        dtp_fecfin.setBounds(515, 25, 95, 22);

        cbo_estcart.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbo_estcart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_estcartActionPerformed(evt);
            }
        });
        jPanel1.add(cbo_estcart);
        cbo_estcart.setBounds(450, 52, 120, 22);

        cbos_estcart.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(cbos_estcart);
        cbos_estcart.setBounds(700, 52, 238, 22);
        jPanel1.add(txt_numdoc);
        txt_numdoc.setBounds(685, 25, 100, 22);

        cbo_tipres.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(cbo_tipres);
        cbo_tipres.setBounds(322, 80, 608, 22);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(5, 55, 945, 115);

        jTable1.setBackground(new java.awt.Color(255, 255, 204));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "f_fproceso", "c_agencia", "c_gestor", "c_territorio", "c_oficina", "c_subprod", "c_nomsubpro", "c_contrato", "c_codcent", "c_tpersona", "c_nombre", "c_divisa", "n_saldohoy", "c_direccion", "c_telefono", "c_codpostal", "c_codestado", "c_codprov", "c_coddist", "f_fincumpli", "n_diasvenc", "c_ubigeo", "c_dpto", "c_distprov", "c_tramodia", "c_tipodoc", "c_nrodoc", "c_tipofono1", "c_prefijo1", "c_fono1", "c_extension1", "c_tipofono2", "c_prefijo2", "c_fono2", "c_extension2", "c_tipofono3", "c_prefijo3", "c_fono3", "c_extension3", "c_tipofono4", "c_prefijo4", "c_fono4", "c_extension4", "c_tipofono5", "c_prefijo5", "c_fono5", "c_extension5", "c_email", "c_provision", "c_tarrastre", "n_impprov", "n_deutotobli", "n_deutotclie", "c_dessubpro", "c_nombof", "c_clientevip", "c_sobreendeu", "c_provmayor", "c_scoriesp", "c_inclin", "c_msueldo1", "c_bajaph", "n_idxges", "f_fecimp", "f_fecing_rspta", "c_desrspta", "c_desrspta_sub", "id_codtcon", "c_destcon", "id_codtres", "c_destres", "id_codtres_sub", "c_destres_sub", "f_fecresp", "f_fecrevi", "f_fecprog", "c_obsges", "c_nomges"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(90);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(100);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(150);
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(150);
        jTable1.getColumnModel().getColumn(4).setPreferredWidth(80);
        jTable1.getColumnModel().getColumn(5).setPreferredWidth(80);
        jTable1.getColumnModel().getColumn(6).setPreferredWidth(120);
        jTable1.getColumnModel().getColumn(7).setPreferredWidth(180);
        jTable1.getColumnModel().getColumn(8).setPreferredWidth(120);
        jTable1.getColumnModel().getColumn(9).setPreferredWidth(85);
        jTable1.getColumnModel().getColumn(10).setPreferredWidth(250);
        jTable1.getColumnModel().getColumn(11).setPreferredWidth(75);
        jTable1.getColumnModel().getColumn(12).setPreferredWidth(80);
        jTable1.getColumnModel().getColumn(13).setPreferredWidth(350);
        jTable1.getColumnModel().getColumn(14).setPreferredWidth(100);
        jTable1.getColumnModel().getColumn(15).setPreferredWidth(85);
        jTable1.getColumnModel().getColumn(16).setPreferredWidth(85);
        jTable1.getColumnModel().getColumn(17).setPreferredWidth(100);
        jTable1.getColumnModel().getColumn(18).setPreferredWidth(100);
        jTable1.getColumnModel().getColumn(19).setPreferredWidth(90);
        jTable1.getColumnModel().getColumn(20).setPreferredWidth(80);
        jTable1.getColumnModel().getColumn(21).setPreferredWidth(80);
        jTable1.getColumnModel().getColumn(22).setPreferredWidth(130);
        jTable1.getColumnModel().getColumn(23).setPreferredWidth(100);
        jTable1.getColumnModel().getColumn(24).setPreferredWidth(120);
        jTable1.getColumnModel().getColumn(25).setPreferredWidth(80);
        jTable1.getColumnModel().getColumn(26).setPreferredWidth(100);
        jTable1.getColumnModel().getColumn(27).setPreferredWidth(80);
        jTable1.getColumnModel().getColumn(28).setPreferredWidth(80);
        jTable1.getColumnModel().getColumn(29).setPreferredWidth(100);
        jTable1.getColumnModel().getColumn(30).setPreferredWidth(80);
        jTable1.getColumnModel().getColumn(31).setPreferredWidth(80);
        jTable1.getColumnModel().getColumn(32).setPreferredWidth(80);
        jTable1.getColumnModel().getColumn(33).setPreferredWidth(100);
        jTable1.getColumnModel().getColumn(34).setPreferredWidth(80);
        jTable1.getColumnModel().getColumn(35).setPreferredWidth(80);
        jTable1.getColumnModel().getColumn(36).setPreferredWidth(80);
        jTable1.getColumnModel().getColumn(37).setPreferredWidth(100);
        jTable1.getColumnModel().getColumn(38).setPreferredWidth(80);
        jTable1.getColumnModel().getColumn(39).setPreferredWidth(80);
        jTable1.getColumnModel().getColumn(40).setPreferredWidth(80);
        jTable1.getColumnModel().getColumn(41).setPreferredWidth(100);
        jTable1.getColumnModel().getColumn(42).setPreferredWidth(80);
        jTable1.getColumnModel().getColumn(43).setPreferredWidth(80);
        jTable1.getColumnModel().getColumn(44).setPreferredWidth(80);
        jTable1.getColumnModel().getColumn(45).setPreferredWidth(100);
        jTable1.getColumnModel().getColumn(46).setPreferredWidth(80);
        jTable1.getColumnModel().getColumn(47).setPreferredWidth(200);
        jTable1.getColumnModel().getColumn(48).setPreferredWidth(100);
        jTable1.getColumnModel().getColumn(49).setPreferredWidth(100);
        jTable1.getColumnModel().getColumn(50).setPreferredWidth(90);
        jTable1.getColumnModel().getColumn(51).setPreferredWidth(90);
        jTable1.getColumnModel().getColumn(52).setPreferredWidth(90);
        jTable1.getColumnModel().getColumn(53).setPreferredWidth(180);
        jTable1.getColumnModel().getColumn(54).setPreferredWidth(160);
        jTable1.getColumnModel().getColumn(55).setPreferredWidth(120);
        jTable1.getColumnModel().getColumn(56).setPreferredWidth(100);
        jTable1.getColumnModel().getColumn(57).setPreferredWidth(100);
        jTable1.getColumnModel().getColumn(58).setPreferredWidth(100);
        jTable1.getColumnModel().getColumn(59).setPreferredWidth(100);
        jTable1.getColumnModel().getColumn(60).setPreferredWidth(100);
        jTable1.getColumnModel().getColumn(61).setPreferredWidth(100);
        jTable1.getColumnModel().getColumn(62).setPreferredWidth(80);
        jTable1.getColumnModel().getColumn(63).setPreferredWidth(90);
        jTable1.getColumnModel().getColumn(64).setPreferredWidth(90);
        jTable1.getColumnModel().getColumn(65).setPreferredWidth(180);
        jTable1.getColumnModel().getColumn(66).setPreferredWidth(200);
        jTable1.getColumnModel().getColumn(67).setPreferredWidth(80);
        jTable1.getColumnModel().getColumn(68).setPreferredWidth(120);
        jTable1.getColumnModel().getColumn(69).setPreferredWidth(80);
        jTable1.getColumnModel().getColumn(70).setPreferredWidth(150);
        jTable1.getColumnModel().getColumn(71).setPreferredWidth(80);
        jTable1.getColumnModel().getColumn(72).setPreferredWidth(220);
        jTable1.getColumnModel().getColumn(73).setPreferredWidth(90);
        jTable1.getColumnModel().getColumn(74).setPreferredWidth(90);
        jTable1.getColumnModel().getColumn(75).setPreferredWidth(90);
        jTable1.getColumnModel().getColumn(76).setPreferredWidth(350);
        jTable1.getColumnModel().getColumn(77).setPreferredWidth(140);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 210, 940, 360);

        jProgressBar1.setStringPainted(true);
        getContentPane().add(jProgressBar1);
        jProgressBar1.setBounds(10, 178, 940, 25);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(null);

        jLabel10.setFont(new java.awt.Font("Ubuntu", 0, 14));
        jLabel10.setText("Nº Registros :");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(15, 7, 92, 17);

        lbl_nroreg.setEditable(false);
        lbl_nroreg.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        lbl_nroreg.setText("0");
        jPanel2.add(lbl_nroreg);
        lbl_nroreg.setBounds(110, 5, 60, 22);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 587, 960, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    try{

      SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
      ArrayList lista=new ArrayList();
      Reportes re=new Reportes();

      String f_fecimp_ini=sdf.format(dtp_fecini.getValue());
      String f_fecimp_fin=sdf.format(dtp_fecfin.getValue());
      String id_codper=String.valueOf(cbo_periodo.getSelectedItem()).substring(0, 5);

      String id_codtcon="";

      if(cbo_tipcon.getSelectedItem()=="Todos"){
       id_codtcon="";
      }else{
       id_codtcon=String.valueOf(cbo_tipcon.getSelectedItem()).substring(0, 2);
      }


     String id_codrspta="";

     if(cbo_estcart.getSelectedItem()=="Todos"){
     id_codrspta="";
     }else{
     id_codrspta=String.valueOf(cbo_estcart.getSelectedItem()).substring(0,3);
     }

     String id_codrspta_sub="";

     if(cbos_estcart.getSelectedItem()=="Todos"){
     id_codrspta_sub="";
     }else{
     id_codrspta_sub=String.valueOf(cbos_estcart.getSelectedItem()).substring(0,3);
     }


      String id_codtres="";
      if(cbo_tipres.getSelectedItem()=="Todos"){
      id_codtres="";
      }else{
      id_codtres=String.valueOf(cbo_tipres.getSelectedItem()).substring(0, 2);
      }


      String c_nrodoc=txt_numdoc.getText();
      String c_nombre=txt_nomcont.getText();
         
      lista=re.reporte_impresion_cartas(f_fecimp_ini, f_fecimp_fin, c_nrodoc,
      c_nombre, id_codper, id_codrspta, id_codrspta_sub, id_codtcon,
      id_codtres);
     
      DefaultTableModel m=(DefaultTableModel)jTable1.getModel();

      m.setNumRows(lista.size());
      lbl_nroreg.setText(lista.size() + "");

      for(int i=0;i<lista.size();i++){
      re=(Reportes)lista.get(i);

      m.setValueAt(String.valueOf(re.getF_fproceso()).substring(8, 10) + "/" +
      String.valueOf(re.getF_fproceso()).substring(5, 7) + "/" + 
      String.valueOf(re.getF_fproceso()).substring(0, 4), i, 0);

      m.setValueAt(re.getC_agencia(), i, 1);
      m.setValueAt(re.getC_gestor(), i, 2);
      m.setValueAt(re.getC_territorio(), i, 3);
      m.setValueAt(re.getC_oficina(), i, 4);
      m.setValueAt(re.getC_subprod(), i, 5);
      m.setValueAt(re.getC_nomsubpro(), i, 6);
      m.setValueAt(re.getC_contrato(), i, 7);
      m.setValueAt(re.getC_codcent(), i, 8);
      m.setValueAt(re.getC_tpersona(), i, 9);
      m.setValueAt(re.getC_nombre(), i, 10);
      m.setValueAt(re.getC_divisa(), i, 11);
      m.setValueAt(re.getN_saldohoy(), i, 12);
      m.setValueAt(re.getC_direccion(), i, 13);
      m.setValueAt(re.getC_telefono(), i, 14);
      m.setValueAt(re.getC_codpostal(), i, 15);
      m.setValueAt(re.getC_codestado(), i, 16);
      m.setValueAt(re.getC_codprov(), i, 17);
      m.setValueAt(re.getC_coddist(), i, 18);

      if(re.getF_fincumpli()!=null){
       m.setValueAt(String.valueOf(re.getF_fincumpli()).substring(8, 10) + "/" +
       String.valueOf(re.getF_fincumpli()).substring(5, 7) + "/" +
       String.valueOf(re.getF_fincumpli()).substring(0, 4), i, 19);
      }else{
       m.setValueAt(re.getF_fincumpli(), i, 19);
      }

      m.setValueAt(re.getN_diasvenc(), i, 20);
      m.setValueAt(re.getC_ubigeo(), i, 21);
      m.setValueAt(re.getC_dpto(), i, 22);
      m.setValueAt(re.getC_distprov(), i, 23);
      m.setValueAt(re.getC_tramodia(), i, 24);
      m.setValueAt(re.getC_tipodoc(), i, 25);
      m.setValueAt(re.getC_nrodoc(), i, 26);
      m.setValueAt(re.getC_tipofono1(), i, 27);
      m.setValueAt(re.getC_prefijo1(), i, 28);
      m.setValueAt(re.getC_fono1(), i, 29);
      m.setValueAt(re.getC_extension1(), i, 30);
      m.setValueAt(re.getC_tipofono2(), i, 31);
      m.setValueAt(re.getC_prefijo2(), i, 32);
      m.setValueAt(re.getC_fono2(), i, 33);
      m.setValueAt(re.getC_extension2(), i, 34);
      m.setValueAt(re.getC_tipofono3(), i, 35);

      m.setValueAt(re.getC_prefijo3(), i, 36);
      m.setValueAt(re.getC_fono3(), i, 37);
      m.setValueAt(re.getC_extension3(), i, 38);
      m.setValueAt(re.getC_tipofono4(), i, 39);
      m.setValueAt(re.getC_prefijo4(), i, 40);
      m.setValueAt(re.getC_fono4(), i, 41);
      m.setValueAt(re.getC_extension4(), i, 42);
      m.setValueAt(re.getC_tipofono5(), i, 43);
      m.setValueAt(re.getC_prefijo5(), i, 44);
      m.setValueAt(re.getC_fono5(), i, 45);
      m.setValueAt(re.getC_extension5(), i, 46);
      m.setValueAt(re.getC_email(), i, 47);
      m.setValueAt(re.getC_provision(), i, 48);
      m.setValueAt(re.getC_tarrastre(), i, 49);
      m.setValueAt(re.getN_impprov(), i, 50);
      m.setValueAt(re.getN_deutotobli(), i, 51);
      m.setValueAt(re.getN_deutotclie(), i, 52);
      m.setValueAt(re.getC_dessubpro(), i, 53);
      m.setValueAt(re.getC_nombof(), i, 54);
      m.setValueAt(re.getC_clientevip(), i, 55);
      m.setValueAt(re.getC_sobreendeu(), i, 56);

      m.setValueAt(re.getC_provmayor(), i, 57);
      m.setValueAt(re.getC_scoriesp(), i, 58);
      m.setValueAt(re.getC_inclin(), i, 59);
      m.setValueAt(re.getC_msueldo1(), i, 60);
      m.setValueAt(re.getC_bajaph(), i, 61);
      m.setValueAt(re.getN_idxges(), i, 62);

      if(re.getF_fecimp()!=null){
       m.setValueAt(String.valueOf(re.getF_fecimp()).substring(8, 10) + "/" +
       String.valueOf(re.getF_fecimp()).substring(5, 7) + "/" +
       String.valueOf(re.getF_fecimp()).substring(0, 4), i, 63);
      }else{
       m.setValueAt(re.getF_fecimp(), i, 63);
      }

      if(re.getF_fecing_rspta()!=null){
       m.setValueAt(String.valueOf(re.getF_fecing_rspta()).substring(8, 10) + "/" +
       String.valueOf(re.getF_fecing_rspta()).substring(5, 7) + "/" +
       String.valueOf(re.getF_fecing_rspta()).substring(0, 4), i, 64);
      }else{
       m.setValueAt(re.getF_fecing_rspta(), i, 64);
      }

      m.setValueAt(re.getC_desrspta(), i, 65);
      m.setValueAt(re.getC_desrspta_sub(), i, 66);
      m.setValueAt(re.getId_codtcon(), i, 67);
      m.setValueAt(re.getC_destcon(), i, 68);
      m.setValueAt(re.getId_codtres(), i, 69);
      m.setValueAt(re.getC_destres(), i, 70);
      m.setValueAt(re.getId_codtres_sub(), i, 71);
      m.setValueAt(re.getC_destres_sub(), i, 72);

      if(re.getF_fecresp()!=null){
       m.setValueAt(String.valueOf(re.getF_fecresp()).substring(8, 10) + "/" +
       String.valueOf(re.getF_fecresp()).substring(5, 7) + "/" +
       String.valueOf(re.getF_fecresp()).substring(0, 4) , i, 73);
      }else{
       m.setValueAt(re.getF_fecresp(), i, 73);
      }

      if(re.getF_fecrevi()!=null){
       m.setValueAt(String.valueOf(re.getF_fecrevi()).substring(8, 10) + "/" +
       String.valueOf(re.getF_fecrevi()).substring(5, 7) + "/" +
       String.valueOf(re.getF_fecrevi()).substring(0, 4), i, 74);
      }else{
       m.setValueAt(re.getF_fecrevi(), i, 74);
      }

      if(re.getF_fecprog()!=null){
       m.setValueAt(String.valueOf(re.getF_fecprog()).substring(8, 10) + "/" +
       String.valueOf(re.getF_fecprog()).substring(5, 7) + "/" +
       String.valueOf(re.getF_fecprog()).substring(0, 4), i, 75);
      }else{
       m.setValueAt(re.getF_fecprog(), i, 75);
      }
      
      m.setValueAt(re.getC_obsges(), i, 76);
      m.setValueAt(re.getC_nomges(), i, 77);

      }this.jTable1.setModel(m);

     }catch(Exception ioE){
      JOptionPane.showMessageDialog(null, ioE);
     }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      try{
        JFileChooser caja=new JFileChooser();
        caja.showSaveDialog(null);
        File arch=caja.getSelectedFile();

        if(arch==null){
        return;
        }

        DataOutputStream out=new DataOutputStream(new FileOutputStream(arch + ".xls"));
        WritableWorkbook w = Workbook.createWorkbook(out);
        WritableSheet s = w.createSheet("reporte", 0);
        WritableFont headersfont=new WritableFont(WritableFont.ARIAL, 10, WritableFont.BOLD, false, UnderlineStyle.NO_UNDERLINE, Colour.WHITE);
        WritableCellFormat headersformat=new WritableCellFormat(headersfont);
        headersformat.setBackground(Colour.ORANGE);

        s.addCell(new Label(0, 0, String.valueOf("f_fproceso"),headersformat));
        s.addCell(new Label(1, 0, String.valueOf("c_agencia"),headersformat));
        s.addCell(new Label(2, 0, String.valueOf("c_gestor"),headersformat));
        s.addCell(new Label(3, 0, String.valueOf("c_territorio"),headersformat));
        s.addCell(new Label(4, 0, String.valueOf("c_oficina"),headersformat));
        s.addCell(new Label(5, 0, String.valueOf("c_subprod"),headersformat));
        s.addCell(new Label(6, 0, String.valueOf("c_nomsubpro"),headersformat));
        s.addCell(new Label(7, 0, String.valueOf("c_contrato"),headersformat));
        s.addCell(new Label(8, 0, String.valueOf("c_codcent"),headersformat));
        s.addCell(new Label(9, 0, String.valueOf("c_tpersona"),headersformat));
        s.addCell(new Label(10, 0, String.valueOf("c_nombre"),headersformat));
        s.addCell(new Label(11, 0, String.valueOf("c_divisa"),headersformat));
        s.addCell(new Label(12, 0, String.valueOf("n_saldohoy"),headersformat));
        s.addCell(new Label(13, 0, String.valueOf("c_direccion"),headersformat));
        s.addCell(new Label(14, 0, String.valueOf("c_telefono"),headersformat));
        s.addCell(new Label(15, 0, String.valueOf("c_codpostal"),headersformat));
        s.addCell(new Label(16, 0, String.valueOf("c_codestado"),headersformat));
        s.addCell(new Label(17, 0, String.valueOf("c_codprov"),headersformat));
        s.addCell(new Label(18, 0, String.valueOf("c_coddist"),headersformat));
        s.addCell(new Label(19, 0, String.valueOf("f_fincumpli"),headersformat));
        s.addCell(new Label(20, 0, String.valueOf("n_diasvenc"),headersformat));
        s.addCell(new Label(21, 0, String.valueOf("c_ubigeo"),headersformat));
        s.addCell(new Label(22, 0, String.valueOf("c_dpto"),headersformat));
        s.addCell(new Label(23, 0, String.valueOf("c_distprov"),headersformat));
        s.addCell(new Label(24, 0, String.valueOf("c_tramodia"),headersformat));
        s.addCell(new Label(25, 0, String.valueOf("c_tipodoc"),headersformat));
        s.addCell(new Label(26, 0, String.valueOf("c_nrodoc"),headersformat));
        s.addCell(new Label(27, 0, String.valueOf("c_tipofono1"),headersformat));
        s.addCell(new Label(28, 0, String.valueOf("c_prefijo1"),headersformat));
        s.addCell(new Label(29, 0, String.valueOf("c_fono1"),headersformat));
        s.addCell(new Label(30, 0, String.valueOf("c_extension1"),headersformat));
        s.addCell(new Label(31, 0, String.valueOf("c_tipofono2"),headersformat));
        s.addCell(new Label(32, 0, String.valueOf("c_prefijo2"),headersformat));
        s.addCell(new Label(33, 0, String.valueOf("c_fono2"),headersformat));
        s.addCell(new Label(34, 0, String.valueOf("c_extension2"),headersformat));
        s.addCell(new Label(35, 0, String.valueOf("c_tipofono3"),headersformat));
        s.addCell(new Label(36, 0, String.valueOf("c_prefijo3"),headersformat));
        s.addCell(new Label(37, 0, String.valueOf("c_fono3"),headersformat));
        s.addCell(new Label(38, 0, String.valueOf("c_extension3"),headersformat));
        s.addCell(new Label(39, 0, String.valueOf("c_tipofono4"),headersformat));
        s.addCell(new Label(40, 0, String.valueOf("c_prefijo4"),headersformat));
        s.addCell(new Label(41, 0, String.valueOf("c_fono4"),headersformat));
        s.addCell(new Label(42, 0, String.valueOf("c_extension4"),headersformat));
        s.addCell(new Label(43, 0, String.valueOf("c_tipofono5"),headersformat));
        s.addCell(new Label(44, 0, String.valueOf("c_prefijo5"),headersformat));
        s.addCell(new Label(45, 0, String.valueOf("c_fono5"),headersformat));
        s.addCell(new Label(46, 0, String.valueOf("c_extension5"),headersformat));
        s.addCell(new Label(47, 0, String.valueOf("c_email"),headersformat));
        s.addCell(new Label(48, 0, String.valueOf("c_provision"),headersformat));
        s.addCell(new Label(49, 0, String.valueOf("c_tarrastre"),headersformat));
        s.addCell(new Label(50, 0, String.valueOf("n_impprov"),headersformat));
        s.addCell(new Label(51, 0, String.valueOf("n_deutotobli"),headersformat));
        s.addCell(new Label(52, 0, String.valueOf("n_deutotclie"),headersformat));
        s.addCell(new Label(53, 0, String.valueOf("c_dessubpro"),headersformat));
        s.addCell(new Label(54, 0, String.valueOf("c_nombof"),headersformat));
        s.addCell(new Label(55, 0, String.valueOf("c_clientevip"),headersformat));
        s.addCell(new Label(56, 0, String.valueOf("c_sobreendeu"),headersformat));
        s.addCell(new Label(57, 0, String.valueOf("c_provmayor"),headersformat));
        s.addCell(new Label(58, 0, String.valueOf("c_scoriesp"),headersformat));
        s.addCell(new Label(59, 0, String.valueOf("c_inclin"),headersformat));
        s.addCell(new Label(60, 0, String.valueOf("c_msueldo1"),headersformat));
        s.addCell(new Label(61, 0, String.valueOf("c_bajaph"),headersformat));
        s.addCell(new Label(62, 0, String.valueOf("n_idxges"),headersformat));
        s.addCell(new Label(63, 0, String.valueOf("f_fecimp"),headersformat));
        s.addCell(new Label(64, 0, String.valueOf("'f_fecing_rspta'"),headersformat));
        s.addCell(new Label(65, 0, String.valueOf("'c_desrspta'"),headersformat));
        s.addCell(new Label(66, 0, String.valueOf("c_desrspta_sub"),headersformat));
        s.addCell(new Label(67, 0, String.valueOf("id_codtcon"),headersformat));
        s.addCell(new Label(68, 0, String.valueOf("c_destcon"),headersformat));
        s.addCell(new Label(69, 0, String.valueOf("id_codtres"),headersformat));
        s.addCell(new Label(70, 0, String.valueOf("c_destres"),headersformat));
        s.addCell(new Label(71, 0, String.valueOf("id_codtres_sub"),headersformat));
        s.addCell(new Label(72, 0, String.valueOf("c_destres_sub"),headersformat));
        s.addCell(new Label(73, 0, String.valueOf("f_fecresp"),headersformat));
        s.addCell(new Label(74, 0, String.valueOf("f_fecrevi"),headersformat));
        s.addCell(new Label(75, 0, String.valueOf("f_fecprog"),headersformat));
        s.addCell(new Label(76, 0, String.valueOf("c_obsges"),headersformat));
        s.addCell(new Label(77, 0, String.valueOf("c_nomges"),headersformat));

       
        for(int i=0;i<jTable1.getRowCount();i++){

            for(int j=0;j<jTable1.getColumnCount();j++){
               Object objeto=jTable1.getValueAt(i,j);
               if(objeto!=null){
                  if(j==20 || j==62){
                    s.addCell(new jxl.write.Number(j, i+1, Integer.parseInt(objeto + "")));
                  }else{
                    s.addCell(new Label(j, i+1, String.valueOf(objeto)));
                  }                 
               }else{
                 s.addCell(new Label(j, i+1, ""));
               }
            }
         }

          w.write();
          w.close();
          out.close();
        
          JOptionPane.showMessageDialog(null,"Reporte Terminado");
          
        }catch(Exception ioE){
        JOptionPane.showMessageDialog(null, ioE);
       }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void cbo_tipconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_tipconActionPerformed
        try{
        String id_codtcon="";
        if(cbo_tipcon.getSelectedItem()!="Todos"){
        id_codtcon=String.valueOf(cbo_tipcon.getSelectedItem()).substring(0, 2);
        }else{
        id_codtcon="";
        }

        cbo_tipres.removeAllItems();
        Gestion llm=new Gestion();
        ArrayList lista=new ArrayList();
        lista=llm.Respuesta_llam(id_codtcon);

        for(int i=0;i<lista.size();i++){
        llm=(Gestion)lista.get(i);
        cbo_tipres.addItem(llm.getId_codtres() + " - " + llm.getC_destres());
        }cbo_tipres.addItem("Todos");
        cbo_tipres.setSelectedItem("Todos");

        }catch(Exception ioE){
        JOptionPane.showMessageDialog(null, ioE);
        }
    }//GEN-LAST:event_cbo_tipconActionPerformed

    private void cbo_estcartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_estcartActionPerformed
       try{
       cbos_estcart.removeAllItems();
       String id_codrspta="";
       Gestion ges=new Gestion();

       if(cbo_estcart.getSelectedItem()=="Todos"){
       id_codrspta="";
       }else{
       id_codrspta=(cbo_estcart.getSelectedItem() + "").substring(0, 3);
       }

       ArrayList lista=new ArrayList();
       lista=ges.sub_respuesta_carta(id_codrspta);
       for(int i=0;i<lista.size();i++){
       ges=(Gestion)lista.get(i);
       cbos_estcart.addItem(ges.getId_codrspta_sub() + " - " + ges.getC_desrspta_sub());
       }cbos_estcart.addItem("Todos");
       cbos_estcart.setSelectedItem("Todos");
       }catch(Exception ioE){
       JOptionPane.showMessageDialog(null, ioE);
       }
    }//GEN-LAST:event_cbo_estcartActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frm_reporte_cartas dialog = new frm_reporte_cartas(new javax.swing.JFrame(), true);
//                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
//                    public void windowClosing(java.awt.event.WindowEvent e) {
//                        System.exit(0);
//                    }
//                });
                dialog.setSize(967,650);
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cbo_estcart;
    private javax.swing.JComboBox cbo_periodo;
    private javax.swing.JComboBox cbo_tipcon;
    private javax.swing.JComboBox cbo_tipres;
    private javax.swing.JComboBox cbos_estcart;
    private javax.swing.JSpinner dtp_fecfin;
    private javax.swing.JSpinner dtp_fecini;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTextField lbl_nroreg;
    private javax.swing.JTextField txt_nomcont;
    private javax.swing.JTextField txt_numdoc;
    // End of variables declaration//GEN-END:variables

}
