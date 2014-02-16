

package FORMULARIOS;

import BEANS.Periodo;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class frm_periodo_man extends javax.swing.JDialog {

     String Accion="";

     void mostrar(){
     try{
       int fila=jTable1.getSelectedRow();
       txtid_codper.setText(this.jTable1.getValueAt(fila, 0) + "");
       txtc_desper.setText(this.jTable1.getValueAt(fila, 1) + "");

       String estado=this.jTable1.getValueAt(fila, 2) + "";
       if(estado.equals("ACT")){
       cbo_codest.setSelectedItem("ACT - ACTIVO");
       }else{
       cbo_codest.setSelectedItem("INA - INACTIVO");
       }
     }catch(Exception e){
     JOptionPane.showMessageDialog(null, e.getMessage());
     }
     }



     void cargar(){
     try{
     Periodo per=new Periodo();
     ArrayList lista=new ArrayList();
     lista=per.periodos();

     DefaultTableModel m=(DefaultTableModel)jTable1.getModel();
     m.setRowCount(lista.size());

     for(int i=0;i<lista.size();i++){
     per=(Periodo)lista.get(i);
     m.setValueAt(per.getId_codper(), i, 0);
     m.setValueAt(per.getC_desper(), i, 1);
     m.setValueAt(per.getC_codest(), i, 2);
     }this.jTable1.setModel(m);
     }catch(Exception e){
     JOptionPane.showMessageDialog(null, e.getMessage());
     }
     }

    public frm_periodo_man(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        cbo_codest.removeAllItems();
        cbo_codest.addItem("ACT - ACTIVO");
        cbo_codest.addItem("INA - INACTIVO");

        txtid_codper.setEnabled(false);
        txtc_desper.setEnabled(false);
        cbo_codest.setEnabled(false);
        this.cargar();
        btn_grabar.setEnabled(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jToolBar1 = new javax.swing.JToolBar();
        btn_nuevo = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        btn_grabar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtid_codper = new javax.swing.JTextField();
        cbo_codest = new javax.swing.JComboBox();
        txtc_desper = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Mantenimiento Periodos");
        getContentPane().setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Codigo", "Descripcion", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 120, 380, 200);

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        btn_nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nuevo.JPG"))); // NOI18N
        btn_nuevo.setFocusable(false);
        btn_nuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_nuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevoActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_nuevo);

        btn_modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificar.JPG"))); // NOI18N
        btn_modificar.setFocusable(false);
        btn_modificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_modificar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_modificar);

        btn_grabar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/grabar.JPG"))); // NOI18N
        btn_grabar.setFocusable(false);
        btn_grabar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_grabar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_grabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_grabarActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_grabar);

        btn_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/traspaso.JPG"))); // NOI18N
        btn_cancelar.setFocusable(false);
        btn_cancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_cancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_cancelar);

        getContentPane().add(jToolBar1);
        jToolBar1.setBounds(0, 0, 400, 30);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 14));
        jLabel1.setText("Codigo :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 58, 55, 17);

        jLabel2.setFont(new java.awt.Font("Ubuntu", 0, 14));
        jLabel2.setText("Estado :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 88, 55, 17);

        jLabel3.setFont(new java.awt.Font("Ubuntu", 0, 14));
        jLabel3.setText("Descripcion :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(160, 58, 80, 17);
        getContentPane().add(txtid_codper);
        txtid_codper.setBounds(70, 55, 75, 22);

        cbo_codest.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cbo_codest);
        cbo_codest.setBounds(70, 85, 110, 22);
        getContentPane().add(txtc_desper);
        txtc_desper.setBounds(248, 55, 145, 22);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevoActionPerformed
        txtid_codper.setEnabled(true);
        txtc_desper.setEnabled(true);
        txtid_codper.setText("");
        txtc_desper.setText("");
        cbo_codest.setSelectedIndex(0);
        txtid_codper.setEditable(true);
        txtc_desper.setEditable(true);
        cbo_codest.setEnabled(true);

        btn_grabar.setEnabled(true);
        btn_cancelar.setEnabled(true);
        Accion = "new";
    }//GEN-LAST:event_btn_nuevoActionPerformed

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        try{
        txtid_codper.setEnabled(false);
        btn_grabar.setEnabled(true);
        btn_cancelar.setEnabled(true);

        txtc_desper.setEditable(true);
        cbo_codest.setEnabled(true);
        this.mostrar();
        Accion = "Mod";    
        }catch(Exception ioE){
        JOptionPane.showMessageDialog(null, ioE);
        }
      
    }//GEN-LAST:event_btn_modificarActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        try{
        Accion="";
        this.mostrar();
        txtid_codper.setEditable(false);
        txtc_desper.setEditable(false);
        cbo_codest.setEnabled(false);
        btn_grabar.setEnabled(false);
        btn_cancelar.setEnabled(false);
        }catch(Exception ioE){
        JOptionPane.showMessageDialog(null, ioE);
        }
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
       if(Accion.equals("new")){
       return;
       }else{
       int fila=jTable1.getSelectedRow();
       txtid_codper.setText(this.jTable1.getValueAt(fila, 0) + "");
       txtc_desper.setText(this.jTable1.getValueAt(fila, 1) + "");

       String estado=this.jTable1.getValueAt(fila, 2) + "";
       if(estado.equals("ACT")){
       cbo_codest.setSelectedItem("ACT - ACTIVO");
       }else{
       cbo_codest.setSelectedItem("INA - INACTIVO");
       }
       }

    }//GEN-LAST:event_jTable1MouseClicked

    private void btn_grabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_grabarActionPerformed
    try{
      Periodo per=new Periodo();
        if (Accion.equals("New")){
            if(txtid_codper.getText().trim().isEmpty()){
              JOptionPane.showMessageDialog(null,"Ventana Error","Ingrese Codigo Periodo", JOptionPane.ERROR_MESSAGE);
              return;
          }
         }
        if(txtc_desper.getText().trim().isEmpty()){
           JOptionPane.showMessageDialog(null,"Ventana Error", "Ingrese Descripción de Periodo", JOptionPane.ERROR_MESSAGE);
           return;
        }

        String estado=(cbo_codest.getSelectedItem() + "").substring(0, 3);
        
        per.Grabar_periodo(txtid_codper.getText(), txtc_desper.getText(), estado, Accion);       
        this.cargar();
        btn_cancelar.setSelected(true);
        btn_grabar.setEnabled(false);
        btn_cancelar.setEnabled(false);    
    }catch(Exception e){
    JOptionPane.showMessageDialog(null, e.getMessage());    
    }

    }//GEN-LAST:event_btn_grabarActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frm_periodo_man dialog = new frm_periodo_man(new javax.swing.JFrame(), true);
                dialog.setSize(410, 390);
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_grabar;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JButton btn_nuevo;
    private javax.swing.JComboBox cbo_codest;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTextField txtc_desper;
    private javax.swing.JTextField txtid_codper;
    // End of variables declaration//GEN-END:variables

}
