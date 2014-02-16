
package FORMULARIOS;

import BEANS.Reportes;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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


public class frm_reporte_avance extends javax.swing.JDialog {

    /** Creates new form frm_reporte_avance */
    public frm_reporte_avance(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        Date actual=new Date();
        dtp_fecini.setDate(actual);
        dtp_fecfin.setDate(actual);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        lbl_nroreg = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        dtp_fecini = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        dtp_fecfin = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
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
        jToolBar1.setBounds(0, 0, 900, 50);

        jTable1.setBackground(new java.awt.Color(255, 255, 204));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codcent", "Contrato", "Fproceso", "Nombre", "Producto", "Territorio", "Divisa", "Saldo Hoy", "Dias_venc", "T.Contacto", "T.Respuesta", "Observacion", "F.Modificacion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(80);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(140);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(90);
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(250);
        jTable1.getColumnModel().getColumn(4).setPreferredWidth(150);
        jTable1.getColumnModel().getColumn(5).setPreferredWidth(120);
        jTable1.getColumnModel().getColumn(6).setPreferredWidth(90);
        jTable1.getColumnModel().getColumn(7).setPreferredWidth(80);
        jTable1.getColumnModel().getColumn(8).setPreferredWidth(70);
        jTable1.getColumnModel().getColumn(9).setPreferredWidth(70);
        jTable1.getColumnModel().getColumn(10).setPreferredWidth(70);
        jTable1.getColumnModel().getColumn(11).setPreferredWidth(350);
        jTable1.getColumnModel().getColumn(12).setPreferredWidth(110);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(8, 130, 880, 380);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(null);

        jLabel9.setFont(new java.awt.Font("Ubuntu", 0, 14));
        jLabel9.setText("Nº Registros :");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(15, 7, 85, 16);

        lbl_nroreg.setEditable(false);
        lbl_nroreg.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        lbl_nroreg.setText("0");
        jPanel2.add(lbl_nroreg);
        lbl_nroreg.setBounds(105, 5, 60, 22);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 520, 900, 30);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Criterios de Busqueda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), java.awt.Color.blue)); // NOI18N
        jPanel1.setLayout(null);

        jLabel1.setText("Fecha Proceso :");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 30, 120, 18);
        jPanel1.add(dtp_fecini);
        dtp_fecini.setBounds(128, 29, 122, 22);

        jLabel2.setText("Hasta:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(270, 30, 50, 18);
        jPanel1.add(dtp_fecfin);
        dtp_fecfin.setBounds(320, 29, 122, 22);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(7, 57, 880, 65);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try{
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");

            String fecha1, fecha2;
            fecha1=sdf.format(dtp_fecini.getDate()) + " 00:00:00.000";
            fecha2=sdf.format(dtp_fecfin.getDate()) + " 00:00:00.000";
                      
            Reportes re=new Reportes();
            ArrayList lista=new ArrayList();
            lista=re.reporte_avance_gestion(fecha1, fecha2);

            DefaultTableModel m=(DefaultTableModel)jTable1.getModel();
            m.setNumRows(lista.size());

            for(int i=0;i<lista.size();i++){
              re=(Reportes)lista.get(i);
              m.setValueAt(re.getC_codcent(), i, 0);
              m.setValueAt(re.getC_contrato(), i, 1);
              m.setValueAt(re.getF_fproceso(), i, 2);
              m.setValueAt(re.getC_nombre(), i, 3);
              m.setValueAt(re.getC_nomsubpro(), i, 4);
              m.setValueAt(re.getC_territorio(), i, 5);
              m.setValueAt(re.getC_divisa(), i, 6);
              m.setValueAt(re.getN_saldohoy(), i, 7);
              m.setValueAt(re.getN_diasvenc(), i, 8);
              m.setValueAt(re.getId_codtcon(), i, 9);
              m.setValueAt(re.getId_codtres(), i, 10);
              m.setValueAt(re.getC_obsges(), i, 11);
              m.setValueAt(re.getF_fecmod(), i, 12);
                    
            }this.jTable1.setModel(m);
            lbl_nroreg.setText(lista.size() + "");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
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
            
                s.addCell(new Label(0, 0, String.valueOf("c_codcent"),headersformat));
                s.addCell(new Label(1, 0, String.valueOf("c_contrato"),headersformat));
                s.addCell(new Label(2, 0, String.valueOf("f_fproceso"),headersformat));
                s.addCell(new Label(3, 0, String.valueOf("c_nombre"),headersformat));
                s.addCell(new Label(4, 0, String.valueOf("c_nomsubpro"),headersformat));
                s.addCell(new Label(5, 0, String.valueOf("c_territorio"),headersformat));
                s.addCell(new Label(6, 0, String.valueOf("c_divisa"),headersformat));
                s.addCell(new Label(7, 0, String.valueOf("n_saldohoy"),headersformat));
                s.addCell(new Label(8, 0, String.valueOf("n_diasvenc"),headersformat));
                s.addCell(new Label(9, 0, String.valueOf("id_codtcon"),headersformat));
                s.addCell(new Label(10, 0, String.valueOf("id_codtres"),headersformat));
                s.addCell(new Label(11, 0, String.valueOf("c_obsges"),headersformat));
                s.addCell(new Label(12, 0, String.valueOf("f_fecmod"),headersformat));

                for(int i=0;i<jTable1.getRowCount();i++){
                    for(int j=0;j<jTable1.getColumnCount();j++){
                        Object objeto=jTable1.getValueAt(i,j);
                        if(objeto!=null){
                            if(j==8){
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

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frm_reporte_avance dialog = new frm_reporte_avance(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser dtp_fecfin;
    private com.toedter.calendar.JDateChooser dtp_fecini;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTextField lbl_nroreg;
    // End of variables declaration//GEN-END:variables

}
