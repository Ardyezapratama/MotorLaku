/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.codez.projectdash;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ezz
 */
public class DashAdmin extends javax.swing.JFrame {

    /**
     * Creates new form DashAdmin
     */
    // Untuk Menampilkan data motor pada tabel detile motor
    public void loadDetileMot(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Id Motor");
        model.addColumn("Jenis Motor");
        model.addColumn("Tipe");
        model.addColumn("Warna");
        model.addColumn("Harga");
        model.addColumn("Jumlah Unit");
        
        //connect ke database, tb_motor
        try {
            String sql = "SELECT * FROM tb_motor";
            java.sql.Connection con = (Connection)ConnectionDB.configDB();
            java.sql.Statement stm = con.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            while(res.next()){
                model.addRow(new Object[]{res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6)});
            }
            jTableMot.setModel(model);
            
        } catch (Exception e) {
        }
    }
    // menampilkan data customer pada tabel detile customer
    public void loadDetileCus(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Id Customer");
        model.addColumn("Nama");
        model.addColumn("TTL");
        model.addColumn("Jenis Kelamin");
        model.addColumn("Alamat");
        model.addColumn("Pekerjaan");
        model.addColumn("No Hp");
        
        //connect ke database, tb_customer
        try {
            String sql = "SELECT * FROM tb_cust";
            java.sql.Connection con = (Connection)ConnectionDB.configDB();
            java.sql.Statement stm = con.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            while(res.next()){
                model.addRow(new Object[]{res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6), res.getString(7)});
            }
            jTableCus.setModel(model);
   
        } catch (Exception e) {
        }
    }
    
    
    public static void loadDetileTrans(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Id Transaksi");
        model.addColumn("Id Motor");
        model.addColumn("Id Customer");
        model.addColumn("Jenis Motor");
        model.addColumn("Tipe");
        model.addColumn("Unit Tersedia");
        model.addColumn("Nama");
        model.addColumn("Alamat");
        model.addColumn("No Hp");
        model.addColumn("Total Harga");
        model.addColumn("Status");
        
        try {
            String sql = "SELECT * FROM tb_transaksi";
            java.sql.Connection con = (Connection)ConnectionDB.configDB();
            java.sql.Statement stm = con.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            
            while(res.next()){
                model.addRow(new Object[]{res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6), res.getString(7), res.getString(8), res.getString(9), res.getString(10), res.getString(11)});
            }
            jTableTrans.setModel(model);
            
        } catch (Exception e) {
        }
    }
    
    
    public void updateJumlahUnitMot(){
        try {
            String sql = "UPDATE tb_motor SET Jumlah_Unit = '" + jLabelUpdateUnit.getText() + "' WHERE ID_Motor = '" + jLabelIdMot.getText() + "'";
            java.sql.Connection con = (Connection)ConnectionDB.configDB();
            java.sql.PreparedStatement pst = con.prepareStatement(sql);
            pst.execute();
            loadDetileMot();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Data Gagal Diupdate " + e.getMessage());
        }
        
    }
    
    public void setDataDash(java.awt.event.MouseEvent evt){
        jTfIdCus.enable(false);
        int line = jTableCus.rowAtPoint(evt.getPoint());
        String idCus = jTableCus.getValueAt(line, 0).toString();
        jTfIdCus.setText(idCus);    
    }
    
    
    
    public DashAdmin() {
        initComponents();
        loadDetileMot();
        loadDetileCus();
        loadDetileTrans();
        
        jLabelStatusAf.setVisible(false);
        jLabelStatusBef.setVisible(false);
        jLabelIdTrans.setVisible(false);
        jLabelIdMot.setVisible(false);
        jLabelStokUniit.setVisible(false);
        jLabelUpdateUnit.setVisible(false);
        
        
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jPanelNav = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanelBtnLogout = new javax.swing.JPanel();
        btnLogout = new javax.swing.JLabel();
        jPanelCustomer = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanelMotor = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanelTransaksi = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jPanelHomePage = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnExit = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanelMotPage = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        btnExit1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMot = new javax.swing.JTable();
        jPanelBtnTambah = new javax.swing.JPanel();
        jLabelTambahMot = new javax.swing.JLabel();
        jPanelBtnClearMot = new javax.swing.JPanel();
        jLabelClearMot = new javax.swing.JLabel();
        jPanelBtnHapus = new javax.swing.JPanel();
        jLabelHapusMot = new javax.swing.JLabel();
        jPanelBtnEdit = new javax.swing.JPanel();
        jLabelEditMot = new javax.swing.JLabel();
        jTfIdMot = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTfJenisMot = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTfWarnaMot = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jCbTipeTrans = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        jTfHarga = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jTfJumlah = new javax.swing.JTextField();
        jPanelCusPage = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        btnExit2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableCus = new javax.swing.JTable();
        jPanelBtnTambahCus = new javax.swing.JPanel();
        jLabelTambahCus = new javax.swing.JLabel();
        jPanelBtnEditCus = new javax.swing.JPanel();
        jLabelEditCus = new javax.swing.JLabel();
        jPanelBtnHapusCus = new javax.swing.JPanel();
        jLabelHapusCus = new javax.swing.JLabel();
        jPanelBtnClearCus = new javax.swing.JPanel();
        jLabelClearCus = new javax.swing.JLabel();
        jLableCus = new javax.swing.JLabel();
        jTfIdCus = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTfNamaCus = new javax.swing.JTextField();
        jTfTtlCus = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jTfAlamatCus = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jTfPekerjaan = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jTfNoHp = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jCbJenisKelaminn = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        jPanelTransPage = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        btnExit3 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableTrans = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jBtnSelesai = new javax.swing.JButton();
        jLabelStatusAf = new javax.swing.JLabel();
        jLabelIdTrans = new javax.swing.JLabel();
        jLabelIdMot = new javax.swing.JLabel();
        jLabelStatusBef = new javax.swing.JLabel();
        jLabelStokUniit = new javax.swing.JLabel();
        jLabelUpdateUnit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelNav.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\eza\\semester 5\\2. Pemrograman Visual\\UAS\\Icon\\motorcycle_fdo31a1dxco4_32.png")); // NOI18N
        jLabel1.setText("MotorLaku");

        btnLogout.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(102, 102, 102));
        btnLogout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnLogout.setIcon(new javax.swing.ImageIcon("D:\\eza\\semester 5\\2. Pemrograman Visual\\UAS\\Icon\\LogoutGrey.png")); // NOI18N
        btnLogout.setText("Log Out");
        btnLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogoutMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelBtnLogoutLayout = new javax.swing.GroupLayout(jPanelBtnLogout);
        jPanelBtnLogout.setLayout(jPanelBtnLogoutLayout);
        jPanelBtnLogoutLayout.setHorizontalGroup(
            jPanelBtnLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnLogout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
        );
        jPanelBtnLogoutLayout.setVerticalGroup(
            jPanelBtnLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        jPanelCustomer.setBackground(new java.awt.Color(153, 153, 153));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon("D:\\eza\\semester 5\\2. Pemrograman Visual\\UAS\\Icon\\customer.png")); // NOI18N
        jLabel4.setText("Data Customer");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelCustomerLayout = new javax.swing.GroupLayout(jPanelCustomer);
        jPanelCustomer.setLayout(jPanelCustomerLayout);
        jPanelCustomerLayout.setHorizontalGroup(
            jPanelCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCustomerLayout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelCustomerLayout.setVerticalGroup(
            jPanelCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanelMotor.setBackground(new java.awt.Color(153, 153, 153));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon("D:\\eza\\semester 5\\2. Pemrograman Visual\\UAS\\Icon\\Data.png")); // NOI18N
        jLabel3.setText(" Data Motor");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelMotorLayout = new javax.swing.GroupLayout(jPanelMotor);
        jPanelMotor.setLayout(jPanelMotorLayout);
        jPanelMotorLayout.setHorizontalGroup(
            jPanelMotorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMotorLayout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelMotorLayout.setVerticalGroup(
            jPanelMotorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanelTransaksi.setBackground(new java.awt.Color(153, 153, 153));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setIcon(new javax.swing.ImageIcon("D:\\eza\\semester 5\\2. Pemrograman Visual\\UAS\\Icon\\transaksi.png")); // NOI18N
        jLabel24.setText("Input Transaksi");
        jLabel24.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelTransaksiLayout = new javax.swing.GroupLayout(jPanelTransaksi);
        jPanelTransaksi.setLayout(jPanelTransaksiLayout);
        jPanelTransaksiLayout.setHorizontalGroup(
            jPanelTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTransaksiLayout.createSequentialGroup()
                .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelTransaksiLayout.setVerticalGroup(
            jPanelTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelNavLayout = new javax.swing.GroupLayout(jPanelNav);
        jPanelNav.setLayout(jPanelNavLayout);
        jPanelNavLayout.setHorizontalGroup(
            jPanelNavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelMotor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelNavLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanelTransaksi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelNavLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelBtnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelNavLayout.setVerticalGroup(
            jPanelNavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelNavLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(117, 117, 117)
                .addComponent(jPanelMotor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jPanelCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jPanelTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(205, 205, 205)
                .addComponent(jPanelBtnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        bg.add(jPanelNav, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -3, 190, 670));

        jPanelHomePage.setBackground(new java.awt.Color(255, 255, 255));
        jPanelHomePage.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        btnExit.setIcon(new javax.swing.ImageIcon("D:\\eza\\semester 5\\2. Pemrograman Visual\\UAS\\Icon\\closeBtn.png")); // NOI18N
        btnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(807, Short.MAX_VALUE)
                .addComponent(btnExit)
                .addGap(211, 211, 211))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnExit)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanelHomePage.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 60));

        jLabel2.setFont(new java.awt.Font("Shrikhand", 1, 29)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Riding by Your Styles");
        jPanelHomePage.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, 350, 50));

        jLabel5.setIcon(new javax.swing.ImageIcon("D:\\eza\\semester 5\\2. Pemrograman Visual\\UAS\\Icon\\bg.jpg")); // NOI18N
        jPanelHomePage.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 860, 610));

        bg.add(jPanelHomePage, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 860, 670));

        jPanelMotPage.setBackground(new java.awt.Color(255, 255, 255));
        jPanelMotPage.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(153, 153, 153));

        btnExit1.setIcon(new javax.swing.ImageIcon("D:\\eza\\semester 5\\2. Pemrograman Visual\\UAS\\Icon\\closeBtn.png")); // NOI18N
        btnExit1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExit1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExit1MouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("DATA MOTOR");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(358, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(287, 287, 287)
                .addComponent(btnExit1)
                .addGap(211, 211, 211))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(btnExit1))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanelMotPage.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 60));

        jTableMot.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Motor", "Tipe", "Jenis Motor", "Warna", "Harga / Hari", "Jumlah Unit"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableMot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMotMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableMot);

        jPanelMotPage.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 88, 650, 570));

        jPanelBtnTambah.setBackground(new java.awt.Color(102, 102, 255));

        jLabelTambahMot.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelTambahMot.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTambahMot.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTambahMot.setText("Tambah Data");
        jLabelTambahMot.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelTambahMot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelTambahMotMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelBtnTambahLayout = new javax.swing.GroupLayout(jPanelBtnTambah);
        jPanelBtnTambah.setLayout(jPanelBtnTambahLayout);
        jPanelBtnTambahLayout.setHorizontalGroup(
            jPanelBtnTambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelTambahMot, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );
        jPanelBtnTambahLayout.setVerticalGroup(
            jPanelBtnTambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelTambahMot, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanelMotPage.add(jPanelBtnTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, -1, -1));

        jPanelBtnClearMot.setBackground(new java.awt.Color(51, 255, 51));

        jLabelClearMot.setBackground(new java.awt.Color(255, 51, 51));
        jLabelClearMot.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelClearMot.setForeground(new java.awt.Color(255, 255, 255));
        jLabelClearMot.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelClearMot.setText("Clear");
        jLabelClearMot.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelClearMot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelClearMotMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelBtnClearMotLayout = new javax.swing.GroupLayout(jPanelBtnClearMot);
        jPanelBtnClearMot.setLayout(jPanelBtnClearMotLayout);
        jPanelBtnClearMotLayout.setHorizontalGroup(
            jPanelBtnClearMotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
            .addGroup(jPanelBtnClearMotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabelClearMot, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
        );
        jPanelBtnClearMotLayout.setVerticalGroup(
            jPanelBtnClearMotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
            .addGroup(jPanelBtnClearMotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabelClearMot, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
        );

        jPanelMotPage.add(jPanelBtnClearMot, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 520, -1, -1));

        jPanelBtnHapus.setBackground(new java.awt.Color(255, 51, 51));

        jLabelHapusMot.setBackground(new java.awt.Color(255, 51, 51));
        jLabelHapusMot.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelHapusMot.setForeground(new java.awt.Color(255, 255, 255));
        jLabelHapusMot.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelHapusMot.setText("Hapus");
        jLabelHapusMot.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelHapusMot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelHapusMotMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelBtnHapusLayout = new javax.swing.GroupLayout(jPanelBtnHapus);
        jPanelBtnHapus.setLayout(jPanelBtnHapusLayout);
        jPanelBtnHapusLayout.setHorizontalGroup(
            jPanelBtnHapusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelHapusMot, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );
        jPanelBtnHapusLayout.setVerticalGroup(
            jPanelBtnHapusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelHapusMot, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanelMotPage.add(jPanelBtnHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, -1, -1));

        jPanelBtnEdit.setBackground(new java.awt.Color(153, 153, 255));
        jPanelBtnEdit.setPreferredSize(new java.awt.Dimension(80, 30));

        jLabelEditMot.setBackground(new java.awt.Color(255, 255, 255));
        jLabelEditMot.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelEditMot.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEditMot.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEditMot.setText("Edit");
        jLabelEditMot.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelEditMot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelEditMotMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelBtnEditLayout = new javax.swing.GroupLayout(jPanelBtnEdit);
        jPanelBtnEdit.setLayout(jPanelBtnEditLayout);
        jPanelBtnEditLayout.setHorizontalGroup(
            jPanelBtnEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelEditMot, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );
        jPanelBtnEditLayout.setVerticalGroup(
            jPanelBtnEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelEditMot, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanelMotPage.add(jPanelBtnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 480, 90, -1));
        jPanelMotPage.add(jTfIdMot, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 190, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel11.setText("Id Motor");
        jPanelMotPage.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));
        jPanelMotPage.add(jTfJenisMot, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 190, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel7.setText("Jenis Motor");
        jPanelMotPage.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));
        jPanelMotPage.add(jTfWarnaMot, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 190, 30));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel13.setText("Warna");
        jPanelMotPage.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        jCbTipeTrans.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bebek", "Matic", "Sport" }));
        jPanelMotPage.add(jCbTipeTrans, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 190, 30));

        jLabel17.setText("Tipe");
        jPanelMotPage.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));
        jPanelMotPage.add(jTfHarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 190, 30));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel18.setText("Harga / Hari");
        jPanelMotPage.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        jLabel34.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel34.setText("Jumlah Unit");
        jPanelMotPage.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, -1, -1));
        jPanelMotPage.add(jTfJumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 190, 30));

        bg.add(jPanelMotPage, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 860, 670));

        jPanelCusPage.setBackground(new java.awt.Color(255, 255, 255));
        jPanelCusPage.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(153, 153, 153));

        btnExit2.setIcon(new javax.swing.ImageIcon("D:\\eza\\semester 5\\2. Pemrograman Visual\\UAS\\Icon\\closeBtn.png")); // NOI18N
        btnExit2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExit2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExit2MouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("DATA CUSTOMER");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(327, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(277, 277, 277)
                .addComponent(btnExit2)
                .addGap(211, 211, 211))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(btnExit2))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanelCusPage.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 60));

        jTableCus.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Customer", "Nama", "TTL", "Jenis Kelamin", "Alamat", "Pekerjaan", "No Hp"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableCus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableCusMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTableCus);

        jPanelCusPage.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 88, 650, 570));

        jPanelBtnTambahCus.setBackground(new java.awt.Color(102, 102, 255));

        jLabelTambahCus.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelTambahCus.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTambahCus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTambahCus.setText("Tambah Data");
        jLabelTambahCus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelTambahCus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelTambahCusMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelBtnTambahCusLayout = new javax.swing.GroupLayout(jPanelBtnTambahCus);
        jPanelBtnTambahCus.setLayout(jPanelBtnTambahCusLayout);
        jPanelBtnTambahCusLayout.setHorizontalGroup(
            jPanelBtnTambahCusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelTambahCus, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );
        jPanelBtnTambahCusLayout.setVerticalGroup(
            jPanelBtnTambahCusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelTambahCus, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanelCusPage.add(jPanelBtnTambahCus, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, -1, -1));

        jPanelBtnEditCus.setBackground(new java.awt.Color(153, 153, 255));
        jPanelBtnEditCus.setPreferredSize(new java.awt.Dimension(80, 30));

        jLabelEditCus.setBackground(new java.awt.Color(255, 255, 255));
        jLabelEditCus.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelEditCus.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEditCus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEditCus.setText("Edit");
        jLabelEditCus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelEditCus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelEditCusMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelBtnEditCusLayout = new javax.swing.GroupLayout(jPanelBtnEditCus);
        jPanelBtnEditCus.setLayout(jPanelBtnEditCusLayout);
        jPanelBtnEditCusLayout.setHorizontalGroup(
            jPanelBtnEditCusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelEditCus, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );
        jPanelBtnEditCusLayout.setVerticalGroup(
            jPanelBtnEditCusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelEditCus, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanelCusPage.add(jPanelBtnEditCus, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 530, 90, -1));

        jPanelBtnHapusCus.setBackground(new java.awt.Color(255, 51, 51));

        jLabelHapusCus.setBackground(new java.awt.Color(255, 51, 51));
        jLabelHapusCus.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelHapusCus.setForeground(new java.awt.Color(255, 255, 255));
        jLabelHapusCus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelHapusCus.setText("Hapus");
        jLabelHapusCus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelHapusCus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelHapusCusMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelBtnHapusCusLayout = new javax.swing.GroupLayout(jPanelBtnHapusCus);
        jPanelBtnHapusCus.setLayout(jPanelBtnHapusCusLayout);
        jPanelBtnHapusCusLayout.setHorizontalGroup(
            jPanelBtnHapusCusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelHapusCus, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );
        jPanelBtnHapusCusLayout.setVerticalGroup(
            jPanelBtnHapusCusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelHapusCus, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanelCusPage.add(jPanelBtnHapusCus, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 570, -1, -1));

        jPanelBtnClearCus.setBackground(new java.awt.Color(51, 255, 51));

        jLabelClearCus.setBackground(new java.awt.Color(255, 51, 51));
        jLabelClearCus.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelClearCus.setForeground(new java.awt.Color(255, 255, 255));
        jLabelClearCus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelClearCus.setText("Clear");
        jLabelClearCus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelClearCus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelClearCusMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelBtnClearCusLayout = new javax.swing.GroupLayout(jPanelBtnClearCus);
        jPanelBtnClearCus.setLayout(jPanelBtnClearCusLayout);
        jPanelBtnClearCusLayout.setHorizontalGroup(
            jPanelBtnClearCusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
            .addGroup(jPanelBtnClearCusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabelClearCus, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
        );
        jPanelBtnClearCusLayout.setVerticalGroup(
            jPanelBtnClearCusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
            .addGroup(jPanelBtnClearCusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabelClearCus, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
        );

        jPanelCusPage.add(jPanelBtnClearCus, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 570, -1, 30));

        jLableCus.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLableCus.setText("Id Customer");
        jPanelCusPage.add(jLableCus, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));
        jPanelCusPage.add(jTfIdCus, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 190, 30));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel15.setText("Nama");
        jPanelCusPage.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jTfNamaCus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTfNamaCusActionPerformed(evt);
            }
        });
        jPanelCusPage.add(jTfNamaCus, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 190, 30));
        jPanelCusPage.add(jTfTtlCus, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 190, 30));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel16.setText("Alamat");
        jPanelCusPage.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));

        jTfAlamatCus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTfAlamatCusActionPerformed(evt);
            }
        });
        jPanelCusPage.add(jTfAlamatCus, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 190, 30));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel22.setText("No Hp");
        jPanelCusPage.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, -1, -1));

        jTfPekerjaan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTfPekerjaanActionPerformed(evt);
            }
        });
        jPanelCusPage.add(jTfPekerjaan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 190, 30));

        jLabel38.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel38.setText("Pekerjaan");
        jPanelCusPage.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, -1, -1));
        jPanelCusPage.add(jTfNoHp, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 190, 30));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel23.setText("Jenis Kelamin");
        jPanelCusPage.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        jCbJenisKelaminn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laki - Laki", "Perempuan" }));
        jPanelCusPage.add(jCbJenisKelaminn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 190, 30));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel19.setText("Tempat, Tanggal Lahir");
        jPanelCusPage.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        bg.add(jPanelCusPage, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 860, 670));

        jPanelTransPage.setBackground(new java.awt.Color(255, 255, 255));
        jPanelTransPage.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(153, 153, 153));

        btnExit3.setIcon(new javax.swing.ImageIcon("D:\\eza\\semester 5\\2. Pemrograman Visual\\UAS\\Icon\\closeBtn.png")); // NOI18N
        btnExit3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExit3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExit3MouseClicked(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("DATA TRANSAKSI");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(324, Short.MAX_VALUE)
                .addComponent(jLabel25)
                .addGap(277, 277, 277)
                .addComponent(btnExit3)
                .addGap(211, 211, 211))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25)
                    .addComponent(btnExit3))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanelTransPage.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 60));

        jTableTrans.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Transaksi", "Id Motor", "Id Customer", "Jenis Motor", "Tiipe", "Unit Tersedia", "Nama", "Alamat", "No Hp", "Total Harga", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableTrans.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableTransMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTableTrans);

        jPanelTransPage.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 88, 850, 510));

        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jButton3.setText("Tambah Transaksi");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jPanelTransPage.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 620, -1, 30));

        jBtnSelesai.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jBtnSelesai.setText("Selesai");
        jBtnSelesai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnSelesaiMouseClicked(evt);
            }
        });
        jPanelTransPage.add(jBtnSelesai, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 620, -1, 30));

        jLabelStatusAf.setText("Selesai");
        jPanelTransPage.add(jLabelStatusAf, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 620, 40, 20));
        jPanelTransPage.add(jLabelIdTrans, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 630, 10, -1));
        jPanelTransPage.add(jLabelIdMot, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 630, 10, -1));
        jPanelTransPage.add(jLabelStatusBef, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 630, 30, 20));
        jPanelTransPage.add(jLabelStokUniit, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 630, 20, -1));
        jPanelTransPage.add(jLabelUpdateUnit, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 630, 20, -1));

        bg.add(jPanelTransPage, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 860, 670));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMouseClicked
        LoginAdmin logAdmin = new LoginAdmin();
        logAdmin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogoutMouseClicked

    private void btnExit2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExit2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnExit2MouseClicked

    private void btnExit1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExit1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnExit1MouseClicked

    private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnExitMouseClicked

    private void jTfNamaCusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTfNamaCusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTfNamaCusActionPerformed

    private void jTfAlamatCusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTfAlamatCusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTfAlamatCusActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        jPanelHomePage.setVisible(false);
        jPanelMotPage.setVisible(true);
        jPanelCusPage.setVisible(false);
        jPanelTransPage.setVisible(false);
        loadDetileMot();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        jPanelHomePage.setVisible(false);
        jPanelMotPage.setVisible(false);
        jPanelCusPage.setVisible(true);
        jPanelTransPage.setVisible(false);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void btnExit3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExit3MouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnExit3MouseClicked

    private void jLabel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseClicked
        jPanelHomePage.setVisible(false);
        jPanelMotPage.setVisible(false);
        jPanelCusPage.setVisible(false);
        jPanelTransPage.setVisible(true);
        
    }//GEN-LAST:event_jLabel24MouseClicked

    private void jLabelTambahMotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTambahMotMouseClicked
        try {
            String sql = "INSERT INTO tb_motor VALUES ('" + jTfIdMot.getText() + "', '" + jTfJenisMot.getText() + "', '" + jCbTipeTrans.getSelectedItem() + "', '" + jTfWarnaMot.getText() + "', '" + jTfHarga.getText() + "', '" + jTfJumlah.getText() + "')";
            java.sql.Connection con = (Connection)ConnectionDB.configDB();
            java.sql.PreparedStatement pst = con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data Motor Berhasil Diinput");
            loadDetileMot();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jLabelTambahMotMouseClicked

    private void jLabelEditMotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelEditMotMouseClicked
        try {
            String sql = "UPDATE tb_motor SET Jenis_Motor = '" + jTfJenisMot.getText() + "', Tipe = '" + jCbTipeTrans.getSelectedItem() + "', Warna = '" + jTfWarnaMot.getText() + "', Harga = '" + jTfHarga.getText() + "', Jumlah_Unit = '" + jTfJumlah.getText() + "' WHERE ID_Motor = '" + jTfIdMot.getText() + "'";
            java.sql.Connection con = (Connection)ConnectionDB.configDB();
            java.sql.PreparedStatement pst = con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data Motor Berhasil Diedit");
            loadDetileMot();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Data Motor Gagal Diupdate" + e.getMessage());
        }
    }//GEN-LAST:event_jLabelEditMotMouseClicked

    private void jTableMotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMotMouseClicked
        jTfIdMot.enable(false);
        int line = jTableMot.rowAtPoint(evt.getPoint());
        String idMot = jTableMot.getValueAt(line, 0).toString();
        jTfIdMot.setText(idMot);
        
        String jenisMot = jTableMot.getValueAt(line, 1).toString();
        jTfJenisMot.setText(jenisMot);
        
        String tipeMot = jTableMot.getValueAt(line, 2).toString();
        if(tipeMot.equals("Bebek")){
            jCbTipeTrans.setSelectedIndex(0);
            
        }else if(tipeMot.equals("Matic")){
            jCbTipeTrans.setSelectedIndex(1);
            
        }else if(tipeMot.equals("Sport")){
            jCbTipeTrans.setSelectedIndex(2);
        }
        
        String warnaMot = jTableMot.getValueAt(line, 3).toString();
        jTfWarnaMot.setText(warnaMot);
               
        String harga = jTableMot.getValueAt(line, 4).toString();
        jTfHarga.setText(harga);
        
        String jumlahMot = jTableMot.getValueAt(line, 5).toString();
        jTfJumlah.setText(jumlahMot);
    }//GEN-LAST:event_jTableMotMouseClicked

    private void jLabelHapusMotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelHapusMotMouseClicked
        try {
            String sql = "DELETE FROM tb_motor WHERE ID_Motor = '" + jTfIdMot.getText() + "'";
            java.sql.Connection con = (Connection)ConnectionDB.configDB();
            java.sql.PreparedStatement pst = con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
            loadDetileMot();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Data Gagal Dihapus " + e.getMessage());
        }
    }//GEN-LAST:event_jLabelHapusMotMouseClicked

    private void jLabelClearMotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelClearMotMouseClicked
        jTfIdMot.enable(true);
        jTfIdMot.setText("");
        jTfJenisMot.setText("");
        jCbTipeTrans.setSelectedIndex(0);
        jTfWarnaMot.setText("");
        jTfHarga.setText("");
        jTfJumlah.setText("");
    }//GEN-LAST:event_jLabelClearMotMouseClicked

    private void jLabelClearCusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelClearCusMouseClicked
        jTfIdCus.enable(true);
        jTfIdCus.setText("");
        jTfNamaCus.setText("");
        jTfTtlCus.setText("");
        jCbJenisKelaminn.setSelectedIndex(0);
        jTfAlamatCus.setText("");
        jTfPekerjaan.setText("");
        jTfNoHp.setText("");
    }//GEN-LAST:event_jLabelClearCusMouseClicked

    private void jTableCusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableCusMouseClicked
        jTfIdCus.enable(false);
        int line = jTableCus.rowAtPoint(evt.getPoint());
        
        String idCus = jTableCus.getValueAt(line, 0).toString();
        jTfIdCus.setText(idCus);
        
        String namaCus = jTableCus.getValueAt(line, 1).toString();
        jTfNamaCus.setText(namaCus);
        
        String ttl = jTableCus.getValueAt(line, 2).toString();
        jTfTtlCus.setText(ttl);
        
        String jenisKelamin = jTableCus.getValueAt(line, 3).toString();
        if(jenisKelamin.equals("Laki - Laki")){
            jCbJenisKelaminn.setSelectedIndex(0);
            
        }else if(jenisKelamin.equals("Perempuan")){
            jCbJenisKelaminn.setSelectedIndex(1);
        }
        
        String alamatCus = jTableCus.getValueAt(line, 4).toString();
        jTfAlamatCus.setText(alamatCus);
        
        String pekerjaanCus = jTableCus.getValueAt(line, 5).toString();
        
        String noHp = jTableCus.getValueAt(line, 6).toString();
        jTfNoHp.setText(noHp);
        
        
        
        
    }//GEN-LAST:event_jTableCusMouseClicked

    private void jLabelTambahCusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTambahCusMouseClicked
         try {
            String sql = "INSERT INTO tb_cust VALUES( '" + jTfIdCus.getText() + "', '" + jTfNamaCus.getText() + "', '" + jTfTtlCus.getText() + "', '" + jCbJenisKelaminn.getSelectedItem() + "', '"+ jTfAlamatCus.getText() + "', '" + jTfPekerjaan.getText() + "', '" + jTfNoHp.getText() + "')";
            java.sql.Connection con = (Connection)ConnectionDB.configDB();
            java.sql.PreparedStatement pst = con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data Custemer Berhasil Diinput");
            loadDetileCus();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Data Gagal Diinput" + e.getMessage());
        }
 
    }//GEN-LAST:event_jLabelTambahCusMouseClicked

    private void jLabelEditCusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelEditCusMouseClicked
        try {
            String sql = "UPDATE tb_cust SET Nama = '" + jTfNamaCus.getText() + "', TTL = '" + jTfTtlCus.getText() + "', Jenis_Kelamin = '" + jCbJenisKelaminn.getSelectedItem() + "', Alamat = '" + jTfAlamatCus.getText() + "', Pekerjaan = '" + jTfPekerjaan.getText() + "', No_Hp = '" + jTfNoHp.getText() + "' WHERE ID_Customer = '" + jTfIdCus.getText() + "'";
            java.sql.Connection con = (Connection)ConnectionDB.configDB();
            java.sql.PreparedStatement pst = con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data Customer Berhasil Diupdate");
            loadDetileCus();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Data Gagal Diupdate" + e.getMessage());
        }
    }//GEN-LAST:event_jLabelEditCusMouseClicked

    private void jLabelHapusCusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelHapusCusMouseClicked
        try {
            String sql = "DELETE FROM tb_cust WHERE ID_Customer = '" + jTfIdCus.getText() + "'";
            java.sql.Connection con = (Connection)ConnectionDB.configDB();
            java.sql.PreparedStatement pst = con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
            loadDetileCus();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Data Gagal Dihapus " + e.getMessage());
        }
    }//GEN-LAST:event_jLabelHapusCusMouseClicked

    private void jTfPekerjaanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTfPekerjaanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTfPekerjaanActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        Transaksi newTrans = new Transaksi();
        newTrans.setVisible(true);
    }//GEN-LAST:event_jButton3MouseClicked

    private void jBtnSelesaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnSelesaiMouseClicked
        if(jLabelStatusBef.getText().equals("Selesai")){
            JOptionPane.showMessageDialog(this, "Transaksi Sudah Selesai");
        }else{
            try {
            String sql = "UPDATE tb_transaksi SET Status = '" + jLabelStatusAf.getText() + "' WHERE ID_Transaksi = '" + jLabelIdTrans.getText() + "'";
            java.sql.Connection con = (Connection)ConnectionDB.configDB();
            java.sql.PreparedStatement pst = con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Status dan Jumlah Unit Motor Berhasil Diupdate");
            updateJumlahUnitMot();
            loadDetileTrans();
            loadDetileMot();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Gagal Update" + e.getMessage());
        }
        }
        loadDetileTrans();
        loadDetileMot();
        updateJumlahUnitMot();
        
        
    }//GEN-LAST:event_jBtnSelesaiMouseClicked

    private void jTableTransMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTransMouseClicked
        loadDetileTrans();
        loadDetileMot();
        int line = jTableTrans.rowAtPoint(evt.getPoint());
        String idTrans = jTableTrans.getValueAt(line, 0).toString();
        jLabelIdTrans.setText(idTrans);
        String idMot = jTableTrans.getValueAt(line, 1).toString();
        jLabelIdMot.setText(idMot);
        String status = jTableTrans.getValueAt(line, 10).toString();
        jLabelStatusBef.setText(status);
        String updatStok = jTableTrans.getValueAt(line,5).toString();
        jLabelStokUniit.setText(updatStok);
        
        
        int jumUnit, updateUnit;
        jumUnit = Integer.parseInt(jLabelStokUniit.getText());
        updateUnit = jumUnit + 1;
        
        jLabelUpdateUnit.setText(String.valueOf(updateUnit));
        jBtnSelesai.enable(true);
        
       
        
        
        
    }//GEN-LAST:event_jTableTransMouseClicked

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
            java.util.logging.Logger.getLogger(DashAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JLabel btnExit;
    private javax.swing.JLabel btnExit1;
    private javax.swing.JLabel btnExit2;
    private javax.swing.JLabel btnExit3;
    private javax.swing.JLabel btnLogout;
    private javax.swing.JButton jBtnSelesai;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jCbJenisKelaminn;
    private javax.swing.JComboBox<String> jCbTipeTrans;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    public static javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    public static javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelClearCus;
    private javax.swing.JLabel jLabelClearMot;
    private javax.swing.JLabel jLabelEditCus;
    private javax.swing.JLabel jLabelEditMot;
    private javax.swing.JLabel jLabelHapusCus;
    private javax.swing.JLabel jLabelHapusMot;
    private javax.swing.JLabel jLabelIdMot;
    private javax.swing.JLabel jLabelIdTrans;
    private javax.swing.JLabel jLabelStatusAf;
    private javax.swing.JLabel jLabelStatusBef;
    private javax.swing.JLabel jLabelStokUniit;
    private javax.swing.JLabel jLabelTambahCus;
    private javax.swing.JLabel jLabelTambahMot;
    private javax.swing.JLabel jLabelUpdateUnit;
    private javax.swing.JLabel jLableCus;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanelBtnClearCus;
    private javax.swing.JPanel jPanelBtnClearMot;
    private javax.swing.JPanel jPanelBtnEdit;
    private javax.swing.JPanel jPanelBtnEditCus;
    private javax.swing.JPanel jPanelBtnHapus;
    private javax.swing.JPanel jPanelBtnHapusCus;
    private javax.swing.JPanel jPanelBtnLogout;
    private javax.swing.JPanel jPanelBtnTambah;
    private javax.swing.JPanel jPanelBtnTambahCus;
    public static javax.swing.JPanel jPanelCusPage;
    private javax.swing.JPanel jPanelCustomer;
    public static javax.swing.JPanel jPanelHomePage;
    public static javax.swing.JPanel jPanelMotPage;
    private javax.swing.JPanel jPanelMotor;
    private javax.swing.JPanel jPanelNav;
    public static javax.swing.JPanel jPanelTransPage;
    private javax.swing.JPanel jPanelTransaksi;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTableCus;
    private javax.swing.JTable jTableMot;
    public static javax.swing.JTable jTableTrans;
    private javax.swing.JTextField jTfAlamatCus;
    private javax.swing.JTextField jTfHarga;
    private javax.swing.JTextField jTfIdCus;
    private javax.swing.JTextField jTfIdMot;
    private javax.swing.JTextField jTfJenisMot;
    private javax.swing.JTextField jTfJumlah;
    private javax.swing.JTextField jTfNamaCus;
    private javax.swing.JTextField jTfNoHp;
    private javax.swing.JTextField jTfPekerjaan;
    private javax.swing.JTextField jTfTtlCus;
    private javax.swing.JTextField jTfWarnaMot;
    // End of variables declaration//GEN-END:variables
}
