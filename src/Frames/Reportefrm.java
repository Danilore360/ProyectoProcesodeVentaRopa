/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frames;

import Class.Cliente;
import Class.Cliente1;
import Class.Configuracion;
import Class.Detalle;
import Class.Evento;
import Class.Producto;
import Class.Producto1;
import Class.Proveedor;
import Class.Proveedor1;
import Class.Venta;
import Class.Venta1;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/**
 *
 * @author mikeblackhat
 */
public class Reportefrm extends javax.swing.JFrame {
    
    Cliente cliente = new Cliente();
    Cliente1 cliente1 = new Cliente1();
    Proveedor proveedor = new Proveedor();
    Proveedor1 proveedor1 = new Proveedor1();
    Producto producto = new Producto();
    Producto1 producto1 = new Producto1();
    Venta venta = new Venta();
    Venta1 venta1 = new Venta1();
    Detalle detalle_venta = new Detalle();
    Configuracion configuracion=new Configuracion();
    Evento event = new Evento();
    DefaultTableModel clase = new DefaultTableModel();
    DefaultTableModel tmp = new DefaultTableModel();
    int item;
    double totalpagar = 0.00;
    /**
     * Creates new form Reporte
     */
    public Reportefrm() {
        initComponents();
        this.setLocationRelativeTo(null);
        txt_IDVenta5.setVisible(false);
        ListarVentas();
    }
    
    public void ListarVentas() {
        List<Venta> listarventa = venta1.ListarVentas();
        clase = (DefaultTableModel) table_Ventas5.getModel();
        Object[] ob = new Object[4];

        for (int i = 0; i < listarventa.size(); i++) {
            ob[0] = listarventa.get(i).getID();
            ob[1] = listarventa.get(i).getCliente();
            ob[2] = listarventa.get(i).getVendedor();
            ob[3] = listarventa.get(i).getTotal();
            clase.addRow(ob);
        }
        table_Ventas5.setModel(clase);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        table_Ventas5 = new javax.swing.JTable();
        txt_IDVenta5 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btn_GuardarProveedor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reportes_menu.png"))); // NOI18N
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 490, 110, 110));

        jLabel9.setFont(new java.awt.Font("72", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 153, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("REPORTES");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 280, 40));

        jPanel2.setBackground(new java.awt.Color(51, 153, 0));
        jPanel2.setMinimumSize(new java.awt.Dimension(40, 40));

        jLabel1.setBackground(new java.awt.Color(51, 153, 0));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("X");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 0, 40, 40));

        table_Ventas5.setFont(new java.awt.Font("72", 0, 12)); // NOI18N
        table_Ventas5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Cliente", "Vendedor", "Total"
            }
        ));
        table_Ventas5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_Ventas5MouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(table_Ventas5);

        jPanel1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 760, 330));

        txt_IDVenta5.setFont(new java.awt.Font("72", 0, 14)); // NOI18N
        txt_IDVenta5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_IDVenta5KeyTyped(evt);
            }
        });
        jPanel1.add(txt_IDVenta5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 200, 30));

        jLabel10.setFont(new java.awt.Font("72", 1, 10)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 153, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("EXPORTAR");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 80, 20));

        btn_GuardarProveedor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_GuardarProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pdf_icon.png"))); // NOI18N
        btn_GuardarProveedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_GuardarProveedor.setMaximumSize(new java.awt.Dimension(40, 16));
        btn_GuardarProveedor.setMinimumSize(new java.awt.Dimension(40, 16));
        btn_GuardarProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_GuardarProveedorMouseClicked(evt);
            }
        });
        jPanel1.add(btn_GuardarProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 60, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        Menu menu = new Menu ();
        menu.setVisible(true);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseClicked

    private void txt_IDVenta5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_IDVenta5KeyTyped
        // TODO add your handling code here:
        event.numberKeyPress(evt);
    }//GEN-LAST:event_txt_IDVenta5KeyTyped

    private void table_Ventas5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_Ventas5MouseClicked
        // TODO add your handling code here:
        int fila = table_Ventas5.rowAtPoint(evt.getPoint());
        txt_IDVenta5.setText(table_Ventas5.getValueAt(fila, 0).toString());
    }//GEN-LAST:event_table_Ventas5MouseClicked

    private void btn_GuardarProveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_GuardarProveedorMouseClicked
        // TODO add your handling code here:
        try {
            int id = Integer.parseInt(txt_IDVenta5.getText());
            File file = new File("src/PDF/venta"+id+".pdf");
            Desktop.getDesktop().open(file);
        } catch (IOException ex) {
            Logger.getLogger(Reportefrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_GuardarProveedorMouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
        try {
            int id = Integer.parseInt(txt_IDVenta5.getText());
            File file = new File("src/PDF/venta-"+id+".pdf");
            Desktop.getDesktop().open(file);
        } catch (IOException ex) {
            Logger.getLogger(Reportefrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel10MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Reportefrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reportefrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reportefrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reportefrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reportefrm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_GuardarProveedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable table_Ventas5;
    private javax.swing.JTextField txt_IDVenta5;
    // End of variables declaration//GEN-END:variables
}
