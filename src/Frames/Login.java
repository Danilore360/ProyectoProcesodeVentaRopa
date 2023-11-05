/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frames;

import Class.Login1;
import Class.login;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author mikeblackhat
 */
public class Login extends javax.swing.JFrame {
    login login=new login();
    Login1 login1= new Login1();
    
    int xMouse, yMouse;
    /**
     * Creates new form Logo
     */
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public void Validar(){
        String correo = txt_correo.getText();
        String pass = String.valueOf(txt_pass.getPassword());
        if(!"".equals(correo) ||!"".equals(pass) ){
            login login=new login();
            Login1 login1= new Login1();
            
            login=login1.log(correo, pass);
            if(login.getCorreo()!=null && login.getPass()!=null){
                Menu menu= new Menu();
                menu.setVisible(true);
                dispose();
            }else{
                JOptionPane.showMessageDialog(null, "El correo o la contraseña es incorrecta");
            }
        }
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
        logo_img = new javax.swing.JLabel();
        mensaje_bienvenida = new javax.swing.JLabel();
        lbl_user = new javax.swing.JLabel();
        lbl_pass = new javax.swing.JLabel();
        txt_correo = new javax.swing.JTextField();
        txt_pass = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        lbl_salir_bg = new javax.swing.JPanel();
        ingresarlbl = new javax.swing.JLabel();
        Exitpanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        salirlbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setFont(new java.awt.Font("72", 0, 13)); // NOI18N
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel1MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logod.png"))); // NOI18N
        jPanel1.add(logo_img, new org.netbeans.lib.awtextra.AbsoluteConstraints(414, 144, -1, -1));

        mensaje_bienvenida.setFont(new java.awt.Font("72", 0, 36)); // NOI18N
        mensaje_bienvenida.setForeground(new java.awt.Color(51, 153, 0));
        mensaje_bienvenida.setText("WELCOME !!");
        jPanel1.add(mensaje_bienvenida, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, -1, -1));

        lbl_user.setFont(new java.awt.Font("72", 1, 18)); // NOI18N
        lbl_user.setForeground(new java.awt.Color(51, 153, 0));
        lbl_user.setText("USUARIO:");
        jPanel1.add(lbl_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        lbl_pass.setFont(new java.awt.Font("72", 1, 18)); // NOI18N
        lbl_pass.setForeground(new java.awt.Color(51, 153, 0));
        lbl_pass.setText("CONTRASEÑA:");
        jPanel1.add(lbl_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        txt_correo.setFont(new java.awt.Font("72", 0, 13)); // NOI18N
        txt_correo.setForeground(new java.awt.Color(204, 204, 204));
        txt_correo.setText("Ingrese nombre de su Usuario");
        txt_correo.setBorder(null);
        txt_correo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_correoMousePressed(evt);
            }
        });
        txt_correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_correoActionPerformed(evt);
            }
        });
        jPanel1.add(txt_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 402, 31));

        txt_pass.setFont(new java.awt.Font("72", 0, 13)); // NOI18N
        txt_pass.setForeground(new java.awt.Color(204, 204, 204));
        txt_pass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_passMousePressed(evt);
            }
        });
        txt_pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_passActionPerformed(evt);
            }
        });
        jPanel1.add(txt_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 276, 402, 30));

        jLabel5.setFont(new java.awt.Font("72", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 153, 0));
        jLabel5.setText("CHAMELEON STORE.PE");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        lbl_salir_bg.setBackground(new java.awt.Color(51, 153, 0));

        ingresarlbl.setFont(new java.awt.Font("72", 1, 13)); // NOI18N
        ingresarlbl.setForeground(new java.awt.Color(255, 255, 255));
        ingresarlbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ingresarlbl.setText("INICIAR");
        ingresarlbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ingresarlbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ingresarlblMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout lbl_salir_bgLayout = new javax.swing.GroupLayout(lbl_salir_bg);
        lbl_salir_bg.setLayout(lbl_salir_bgLayout);
        lbl_salir_bgLayout.setHorizontalGroup(
            lbl_salir_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ingresarlbl, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
        );
        lbl_salir_bgLayout.setVerticalGroup(
            lbl_salir_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ingresarlbl, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );

        jPanel1.add(lbl_salir_bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, -1, -1));

        Exitpanel.setBackground(new java.awt.Color(51, 153, 0));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("X");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout ExitpanelLayout = new javax.swing.GroupLayout(Exitpanel);
        Exitpanel.setLayout(ExitpanelLayout);
        ExitpanelLayout.setHorizontalGroup(
            ExitpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
        );
        ExitpanelLayout.setVerticalGroup(
            ExitpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(Exitpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(609, 0, -1, -1));

        jLabel8.setFont(new java.awt.Font("72", 0, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 153, 0));
        jLabel8.setText("INICIAR SESION");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jPanel2.setBackground(new java.awt.Color(51, 153, 0));

        salirlbl.setFont(new java.awt.Font("72", 1, 13)); // NOI18N
        salirlbl.setForeground(new java.awt.Color(255, 255, 255));
        salirlbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        salirlbl.setText("SALIR");
        salirlbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salirlbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salirlblMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(salirlbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(salirlbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, 90, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_correoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_correoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_correoActionPerformed

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();       // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x- xMouse, y - yMouse);        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
               // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jPanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseEntered
        
    }//GEN-LAST:event_jPanel1MouseEntered

    private void txt_correoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_correoMousePressed
        if (txt_correo.getText().equals("Ingrese nombre de su Usuario")){
            txt_correo.setText("");
            txt_correo.setForeground(Color.gray);
        }
        /*if (String.valueOf(txt_pass.getPassword()).isEmpty()){
            txt_pass.setText("");
            txt_pass.setForeground(Color.gray);
        }*/

    }//GEN-LAST:event_txt_correoMousePressed

    private void txt_passMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_passMousePressed
        
        if (txt_correo.getText().isEmpty()){
            txt_correo.setText("Ingrese nombre de su Usuario");
            txt_correo.setForeground(Color.gray);
        }
        
       
                // TODO add your handling code here:
    }//GEN-LAST:event_txt_passMousePressed

    private void txt_passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_passActionPerformed

    private void ingresarlblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresarlblMouseClicked
        Validar();     // TODO add your handling code here:
    }//GEN-LAST:event_ingresarlblMouseClicked

    private void salirlblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirlblMouseClicked
        System.exit(0);                 // TODO add your handling code here:
    }//GEN-LAST:event_salirlblMouseClicked
        
        
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Exitpanel;
    private javax.swing.JLabel ingresarlbl;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_pass;
    private javax.swing.JPanel lbl_salir_bg;
    private javax.swing.JLabel lbl_user;
    private javax.swing.JLabel logo_img;
    private javax.swing.JLabel mensaje_bienvenida;
    private javax.swing.JLabel salirlbl;
    private javax.swing.JTextField txt_correo;
    private javax.swing.JPasswordField txt_pass;
    // End of variables declaration//GEN-END:variables
}
