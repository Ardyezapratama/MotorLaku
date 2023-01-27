/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.codez.projectdash;

import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author ezz
 */
public class LoginAdmin extends javax.swing.JFrame {

    /**
     * Creates new form LoginAdmin
     */
    public LoginAdmin() {
        initComponents();
        jTfPassword.setEchoChar((char)8226);
        jTfUsername.setBackground(new java.awt.Color(0,0,0,1));
        jTfPassword.setBackground(new java.awt.Color(0,0,0,1));
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTfUsername = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTfPassword = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        passHide = new javax.swing.JLabel();
        passShow = new javax.swing.JLabel();
        jBtnLogin = new javax.swing.JButton();
        btnExit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Log In Admin");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 65, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Username");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 171, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("_______________________________________");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, 31));

        jTfUsername.setFont(jTfUsername.getFont().deriveFont(jTfUsername.getFont().getSize()+3f));
        jTfUsername.setForeground(new java.awt.Color(255, 255, 255));
        jTfUsername.setBorder(null);
        jTfUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTfUsernameActionPerformed(evt);
            }
        });
        jPanel1.add(jTfUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 250, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("_______________________________________");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, -1, 31));

        jTfPassword.setFont(jTfPassword.getFont().deriveFont(jTfPassword.getFont().getSize()+3f));
        jTfPassword.setForeground(new java.awt.Color(255, 255, 255));
        jTfPassword.setBorder(null);
        jPanel1.add(jTfPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 250, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon("D:\\eza\\semester 5\\2. Pemrograman Visual\\UAS\\Icon\\userIcon.png")); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, -1, 30));

        passHide.setIcon(new javax.swing.ImageIcon("D:\\eza\\semester 5\\2. Pemrograman Visual\\UAS\\Icon\\passHidden.png")); // NOI18N
        passHide.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        passHide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passHideMouseClicked(evt);
            }
        });
        jPanel1.add(passHide, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, -1, -1));

        passShow.setIcon(new javax.swing.ImageIcon("D:\\eza\\semester 5\\2. Pemrograman Visual\\UAS\\Icon\\passShowing.png")); // NOI18N
        passShow.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        passShow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passShowMouseClicked(evt);
            }
        });
        jPanel1.add(passShow, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, -1, -1));

        jBtnLogin.setBackground(new java.awt.Color(255, 255, 255));
        jBtnLogin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jBtnLogin.setForeground(new java.awt.Color(102, 102, 102));
        jBtnLogin.setText("LOGIN");
        jBtnLogin.setBorder(null);
        jBtnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnLoginActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, 133, 35));

        btnExit.setIcon(new javax.swing.ImageIcon("D:\\eza\\semester 5\\2. Pemrograman Visual\\UAS\\Icon\\closeBtn.png")); // NOI18N
        btnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExitMouseClicked(evt);
            }
        });
        jPanel1.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 11, 30, 36));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTfUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTfUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTfUsernameActionPerformed

    private void passHideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passHideMouseClicked
        jTfPassword.setEchoChar((char)0);
        passHide.setVisible(false);
        passHide.setEnabled(false);
        passShow.setEnabled(true);
        passShow.setEnabled(true);
    }//GEN-LAST:event_passHideMouseClicked

    private void passShowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passShowMouseClicked
        jTfPassword.setEchoChar((char)8226);
        passHide.setVisible(true);
        passHide.setEnabled(true);
        passShow.setEnabled(false);
        passShow.setEnabled(false);
    }//GEN-LAST:event_passShowMouseClicked

    private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnExitMouseClicked

    private void jBtnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLoginActionPerformed
        try {
            String sql = "SELECT * FROM tb_admin WHERE username = '" + jTfUsername.getText() + "' AND password = '" + jTfPassword.getText() + "'";
            java.sql.Connection connect = (Connection) ConnectionDB.configDB();
            java.sql.PreparedStatement pst = connect.prepareStatement(sql);
            java.sql.ResultSet res = pst.executeQuery(sql);
            
            if (res.next()){
                if(jTfUsername.getText().equals(res.getString("username")) && jTfPassword.getText().equals(res.getString("password"))){
                    JOptionPane.showMessageDialog(null, "Login Berhasil");
                    DashAdmin newDash = new DashAdmin();
                    newDash.setVisible(true);
                    this.dispose();
                }else{
                    JOptionPane.showMessageDialog(null, "Usernam atau Password yang anda masukkan salah");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jBtnLoginActionPerformed

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
            java.util.logging.Logger.getLogger(LoginAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnExit;
    private javax.swing.JButton jBtnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jTfPassword;
    private javax.swing.JTextField jTfUsername;
    private javax.swing.JLabel passHide;
    private javax.swing.JLabel passShow;
    // End of variables declaration//GEN-END:variables
}
