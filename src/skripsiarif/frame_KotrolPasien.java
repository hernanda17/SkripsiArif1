/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package skripsiarif;

import java.io.IOException;
import java.net.UnknownHostException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.activation.DataSource;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hernanda
 */
public class frame_KotrolPasien extends javax.swing.JFrame {

    
    DefaultTableModel datasource;
    String idAdmin;
    String namaAdmin;
    String usernameAdmin;
    boolean isloggin = false;
    ArrayList <String[]> bigdata;
    ArrayList <String[]> bigdataDeposit;
    ArrayList <String[]> bigdataPembayaran;
    ArrayList <String[]> bigdataTindakan;
    public frame_KotrolPasien() {
        initComponents();
        server();
    }
    Server m1;
    public void server()
    {
        m1=new Server();  
        m1.fa = this;
        Thread t1 =new Thread(m1); 
        t1.start();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        fPasien = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPasien = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAlamatPasien = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        txtIdRfid = new javax.swing.JTextField();
        txtIdPasien = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNamaPasien = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtpencarian = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        fLogin = new javax.swing.JInternalFrame();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtAuth = new javax.swing.JPasswordField();
        fDeposit = new javax.swing.JInternalFrame();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblIdPasienDeposit = new javax.swing.JLabel();
        lblidNamaPasienDeposit = new javax.swing.JLabel();
        lblIdAdminDeposit = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtDeposit = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        lblDeposit = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        txtRfidDeposit = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        fPembayaran = new javax.swing.JInternalFrame();
        jPanel6 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtRfidPembayaran = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        lblNamaPembayaran = new javax.swing.JLabel();
        lblDepositPembayaran = new javax.swing.JLabel();
        cmbTindakan = new javax.swing.JComboBox();
        jButton10 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        txtCatatan = new javax.swing.JTextField();
        fAntrian = new javax.swing.JInternalFrame();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblPoli1 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblPoli2 = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblPoli3 = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblPoli4 = new javax.swing.JTable();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        fKonfig = new javax.swing.JInternalFrame();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblTindak = new javax.swing.JTable();
        jLabel20 = new javax.swing.JLabel();
        txtIdTindakan = new javax.swing.JTextField();
        txtNamaTindakan = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtBiayaTindakan = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();

        jMenuItem5.setText("jMenuItem5");

        jMenuItem6.setText("jMenuItem6");

        jMenuItem8.setText("jMenuItem8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kontrol Puskesmas Bojong Koneng");

        fPasien.setClosable(true);
        fPasien.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        fPasien.setIconifiable(true);
        fPasien.setMaximizable(true);
        fPasien.setTitle("Data Pasien");
        fPasien.setVisible(false);

        tblPasien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblPasien.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblPasien.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblPasien.setDropMode(javax.swing.DropMode.ON);
        tblPasien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPasienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPasien);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Data"));

        jLabel1.setText("Nama :");

        jLabel2.setText("Alamat :");

        txtAlamatPasien.setColumns(20);
        txtAlamatPasien.setRows(5);
        jScrollPane2.setViewportView(txtAlamatPasien);

        jLabel3.setText("ID RFID :");

        jLabel5.setText("ID :");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtIdPasien, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                            .addComponent(txtIdRfid, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                            .addComponent(txtNamaPasien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtIdPasien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtIdRfid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNamaPasien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Aksi"));

        jButton4.setText("Refresh");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton1.setText("Simpan");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Ubah");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Hapus");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel4.setText("Pencarian :");

        jButton5.setText("Cari");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtpencarian)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtpencarian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5))
        );

        javax.swing.GroupLayout fPasienLayout = new javax.swing.GroupLayout(fPasien.getContentPane());
        fPasien.getContentPane().setLayout(fPasienLayout);
        fPasienLayout.setHorizontalGroup(
            fPasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fPasienLayout.createSequentialGroup()
                .addGroup(fPasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        fPasienLayout.setVerticalGroup(
            fPasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(fPasienLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        fPasien.setBounds(100, 10, 810, 490);
        jDesktopPane1.add(fPasien, javax.swing.JLayeredPane.DEFAULT_LAYER);

        fLogin.setTitle("LOGIN");
        fLogin.setVisible(false);

        jLabel6.setText("Username :");

        jLabel7.setText("Password :");

        jButton6.setText("Login");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Login");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton6)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtUsername)
                                    .addComponent(txtAuth, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(jLabel8)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(37, 37, 37)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtAuth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout fLoginLayout = new javax.swing.GroupLayout(fLogin.getContentPane());
        fLogin.getContentPane().setLayout(fLoginLayout);
        fLoginLayout.setHorizontalGroup(
            fLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        fLoginLayout.setVerticalGroup(
            fLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        fLogin.setBounds(350, 120, 380, 200);
        jDesktopPane1.add(fLogin, javax.swing.JLayeredPane.DEFAULT_LAYER);

        fDeposit.setClosable(true);
        fDeposit.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        fDeposit.setIconifiable(true);
        fDeposit.setMaximizable(true);
        fDeposit.setTitle("Deposit");
        fDeposit.setVisible(false);

        jLabel9.setText("ID Pasien :");

        jLabel10.setText("Nama Pasien : ");

        lblIdPasienDeposit.setText("id");

        lblidNamaPasienDeposit.setText("nama");

        lblIdAdminDeposit.setText("admin");

        jLabel11.setText("ID Admin :");

        jLabel12.setText("Tambah Deposit :");

        jLabel13.setText("Deposit : ");

        lblDeposit.setText("Deposit");

        jButton7.setText("Proses Deposit");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel14.setText("ID RFID : ");

        txtRfidDeposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRfidDepositActionPerformed(evt);
            }
        });

        jButton8.setText("Cari");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9)
                    .addComponent(jLabel14))
                .addGap(21, 21, 21)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblidNamaPasienDeposit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDeposit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblIdAdminDeposit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtRfidDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblIdPasienDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton7)
                                    .addComponent(txtDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 405, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtRfidDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(lblIdPasienDeposit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(lblidNamaPasienDeposit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(lblDeposit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(lblIdAdminDeposit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton7)
                .addContainerGap(173, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout fDepositLayout = new javax.swing.GroupLayout(fDeposit.getContentPane());
        fDeposit.getContentPane().setLayout(fDepositLayout);
        fDepositLayout.setHorizontalGroup(
            fDepositLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        fDepositLayout.setVerticalGroup(
            fDepositLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        fDeposit.setBounds(190, 50, 680, 420);
        jDesktopPane1.add(fDeposit, javax.swing.JLayeredPane.DEFAULT_LAYER);

        fPembayaran.setClosable(true);
        fPembayaran.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        fPembayaran.setIconifiable(true);
        fPembayaran.setTitle("Pembayaran");
        fPembayaran.setVisible(false);

        jLabel15.setText("RFID : ");

        jLabel16.setText("Nama Pasien :");

        jLabel17.setText("Deposit :");

        jLabel18.setText("Tindakan :");

        jButton9.setText("Cari");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        lblNamaPembayaran.setText("Nama");

        lblDepositPembayaran.setText("Deposit");

        cmbTindakan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton10.setText("Proses");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jLabel19.setText("Catatan : ");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel19)
                    .addComponent(jLabel18)
                    .addComponent(jLabel17)
                    .addComponent(jLabel16)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(txtRfidPembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton9))
                    .addComponent(lblNamaPembayaran)
                    .addComponent(lblDepositPembayaran)
                    .addComponent(cmbTindakan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCatatan))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtRfidPembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(lblNamaPembayaran))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(lblDepositPembayaran))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(cmbTindakan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txtCatatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton10)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout fPembayaranLayout = new javax.swing.GroupLayout(fPembayaran.getContentPane());
        fPembayaran.getContentPane().setLayout(fPembayaranLayout);
        fPembayaranLayout.setHorizontalGroup(
            fPembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        fPembayaranLayout.setVerticalGroup(
            fPembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        fPembayaran.setBounds(190, 70, 400, 250);
        jDesktopPane1.add(fPembayaran, javax.swing.JLayeredPane.DEFAULT_LAYER);

        fAntrian.setClosable(true);
        fAntrian.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        fAntrian.setIconifiable(true);
        fAntrian.setMaximizable(true);
        fAntrian.setTitle("Lihat Antrian");
        fAntrian.setVisible(false);

        tblPoli1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Title 1"
            }
        ));
        jScrollPane3.setViewportView(tblPoli1);

        tblPoli2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Title 1"
            }
        ));
        jScrollPane4.setViewportView(tblPoli2);

        tblPoli3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Title 1"
            }
        ));
        jScrollPane5.setViewportView(tblPoli3);

        tblPoli4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Title 1"
            }
        ));
        jScrollPane6.setViewportView(tblPoli4);

        jButton11.setText("Lanjut Poli 2");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setText("Lanjut Poli 1");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setText("Lanjut Poli 3");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setText("Lanjut Poli 4");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jButton12)
                        .addGap(65, 65, 65)
                        .addComponent(jButton11)
                        .addGap(72, 72, 72)
                        .addComponent(jButton13)
                        .addGap(62, 62, 62)
                        .addComponent(jButton14)))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton11)
                    .addComponent(jButton13)
                    .addComponent(jButton12)
                    .addComponent(jButton14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout fAntrianLayout = new javax.swing.GroupLayout(fAntrian.getContentPane());
        fAntrian.getContentPane().setLayout(fAntrianLayout);
        fAntrianLayout.setHorizontalGroup(
            fAntrianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        fAntrianLayout.setVerticalGroup(
            fAntrianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        fAntrian.setBounds(160, 60, 730, 420);
        jDesktopPane1.add(fAntrian, javax.swing.JLayeredPane.DEFAULT_LAYER);

        fKonfig.setClosable(true);
        fKonfig.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        fKonfig.setIconifiable(true);
        fKonfig.setMaximizable(true);
        fKonfig.setTitle("Konfigurasi");
        fKonfig.setVisible(false);

        tblTindak.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        tblTindak.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTindakMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(tblTindak);

        jLabel20.setText("ID : ");

        jLabel21.setText("Nama Tindakan :");

        jLabel22.setText("Harga Tindakan :");

        jButton15.setText("Simpan");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setText("Ubah");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addComponent(jLabel20))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNamaTindakan)
                            .addComponent(txtIdTindakan)))
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel8Layout.createSequentialGroup()
                            .addComponent(jButton16)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton15))
                        .addGroup(jPanel8Layout.createSequentialGroup()
                            .addComponent(jLabel22)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtBiayaTindakan, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(2, 2, 2))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(txtIdTindakan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(txtNamaTindakan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(txtBiayaTindakan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton16)
                    .addComponent(jButton15))
                .addContainerGap(236, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout fKonfigLayout = new javax.swing.GroupLayout(fKonfig.getContentPane());
        fKonfig.getContentPane().setLayout(fKonfigLayout);
        fKonfigLayout.setHorizontalGroup(
            fKonfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        fKonfigLayout.setVerticalGroup(
            fKonfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        fKonfig.setBounds(180, 40, 690, 430);
        jDesktopPane1.add(fKonfig, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jMenu1.setText("Pasien");

        jMenuItem2.setText("LOGIN");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem1.setText("Data Pasien");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem3.setText("Deposit");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Pembayaran");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Antrian");

        jMenuItem7.setText("Lihat Antrian");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem7);

        jMenuBar1.add(jMenu3);

        jMenu2.setText("Konfigurasi");

        jMenuItem9.setText("Setting");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem9);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1094, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void refreshTabel()
    {
        try {
             datasource = new DefaultTableModel(new String[]{"id_pasien","id_rfid","nama_pasien","alamat_pasien","identitas_pasien"},0);
  
            fPasien.setVisible(rootPaneCheckingEnabled);
            dbaccess db = new dbaccess();
            String [] field = {"`id_pasien`","`id_rfid`","`nama_pasien`","`alamat_pasien`","`identitas_pasien`"};
            bigdata = db.SelectTable(field, "tblpasien", null, null, null);
            for(int i =0; i < bigdata.size();i++)
            {
                datasource.addRow(bigdata.get(i));
            }
            tblPasien.setModel(datasource);
        } catch (SQLException ex) {
            Logger.getLogger(frame_KotrolPasien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void refreshTabelDeposit(String ID)
    {
        try {
            dbaccess db = new dbaccess();
            String [] field = {"`id_pasien`","`nama_pasien`","`deposit`"};
            String where = "id_rfid = '"+ID+"'";
            bigdataDeposit = db.SelectTable(field, "tblpasien", where, null, null);
        } catch (SQLException ex) {
            Logger.getLogger(frame_KotrolPasien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    int selected_tindakan;
    int selected_pasien;
    int selected_deposit=0;
    
    
    public void selecttable_member()
    {
        tblPasien.getSelectionModel().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        ListSelectionModel rowSM = tblPasien.getSelectionModel();
        tblPasien.setRowSelectionAllowed(true);
        tblPasien.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        rowSM.addListSelectionListener(new ListSelectionListener() {

            public void valueChanged(ListSelectionEvent e) {
                //Ignore extra messages.
                if (e.getValueIsAdjusting()) return;

                ListSelectionModel lsm =(ListSelectionModel) e.getSource();

                if (lsm.isSelectionEmpty()) {
              //      System.out.println("No rows are selected.");
                } else {
                    selected_pasien = lsm.getMinSelectionIndex();
                    autorefresh();
                //    System.out.println("Selected : "+selected_pasien);
                }
            }
        });
    }
       
    public void selecttable_tindakan()
    {
        tblTindak.getSelectionModel().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        ListSelectionModel rowSM = tblTindak.getSelectionModel();
        tblTindak.setRowSelectionAllowed(true);
        tblTindak.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        rowSM.addListSelectionListener(new ListSelectionListener() {

            public void valueChanged(ListSelectionEvent e) {
                if (e.getValueIsAdjusting()) return;

                ListSelectionModel lsm =(ListSelectionModel) e.getSource();

                if (lsm.isSelectionEmpty()) {
              //      System.out.println("No rows are selected.");
                } else {
                    selected_tindakan = lsm.getMinSelectionIndex();
                    autorefreshTindakan();
                //    System.out.println("Selected : "+selected_pasien);
                }
            }
        });
    }
   public void tindakan()
        {
            try {
            datasource = new DefaultTableModel(new String[]{"id_tindakan","nama_tindakan","harga_tindakan"},0);
            dbaccess db = new dbaccess();
            String [] field = {"id_tindakan","nama_tindakan","harga_tindakan"};
            bigdataTindakan = db.SelectTable(field, "tbltindakan", null, null, null);
        } catch (SQLException ex) {
            Logger.getLogger(frame_KotrolPasien.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

        if(isloggin)
        {
            refreshTabel();
        }
        else
        {
            JOptionPane.showMessageDialog(this,"Silahkan Login Terlebih Dahulu !");
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try {
            String username = txtUsername.getText();
            String auth = txtAuth.getText();
            dbaccess db = new dbaccess();
            String [] field = {"`username`","`nama_admin`","`id_admin`"};
            String where ="username = '"+ username +"' and  password_admin = '"+auth+"'";
            ArrayList <String[]> bigdata = db.SelectTable(field, "tbladmin",where, null, null);
            if(bigdata.size()>0)
            {
                idAdmin = bigdata.get(0)[2];
                namaAdmin = bigdata.get(0)[1];
                usernameAdmin = bigdata.get(0)[0];
                isloggin =true;
                JOptionPane.showMessageDialog(this, "Selamat datang "+namaAdmin);
                fLogin.setVisible(false);
            }
        } catch (SQLException ex) {
            Logger.getLogger(frame_KotrolPasien.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        fLogin.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            Date tgl = new Date();
            dbaccess db = new dbaccess();
            String idrfid = txtIdRfid.getText();
            String namaPasien = txtNamaPasien.getText();
            String alamatPasien = txtAlamatPasien.getText();
            String identitasPasien = "";
           SimpleDateFormat fmt = new java.text.SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
            String [][] data = {{"timestamp",fmt.format(tgl)},
                {"id_RFID",""+idrfid}, 
                {"nama_pasien",""+namaPasien},
                {"alamat_pasien",""+alamatPasien},
                {"identitas_pasien",""+identitasPasien}
            };
            if(db.AutoInsert(data, "tblpasien"))
            {
                refreshTabel();
                JOptionPane.showMessageDialog(this, "Data Pasien Telah Berhasil Disimpan !");
            }else
            {
                JOptionPane.showMessageDialog(this, "Data Pasien Telah Gagal Disimpan !");
            }
        } catch (SQLException ex) {
            Logger.getLogger(frame_KotrolPasien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tblPasienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPasienMouseClicked
        selecttable_member();
    }//GEN-LAST:event_tblPasienMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            dbaccess db = new dbaccess();
            String id = bigdata.get(selected_pasien)[0];
            String idrfid = txtIdRfid.getText();
            String namaPasien = txtNamaPasien.getText();
            String alamatPasien = txtAlamatPasien.getText();
            String identitasPasien = "";
            String [][] data = {
                    {"id_RFID",""+idrfid}, 
                    {"nama_pasien",""+namaPasien},
                    {"alamat_pasien",""+alamatPasien},
                    {"identitas_pasien",""+identitasPasien}
                };
            String where = "id_pasien = ' "+id+"'";
             if(db.AutoUpdate(data, "tblpasien", where))
            {
                refreshTabel();
                JOptionPane.showMessageDialog(this, "Data Pasien Telah Berhasil Diubah !");
            }else
             {
                JOptionPane.showMessageDialog(this, "Data Pasien Telah Gagal Diubah !");
             }
        } catch (SQLException ex) {
            Logger.getLogger(frame_KotrolPasien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        refreshTabel();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
         try {
            datasource = new DefaultTableModel(new String[]{"id_pasien","id_rfid","nama_pasien","alamat_pasien","identitas_pasien"},0);
            fPasien.setVisible(rootPaneCheckingEnabled);
            dbaccess db = new dbaccess();
            String [] field = {"`id_pasien`","`id_rfid`","`nama_pasien`","`alamat_pasien`","`identitas_pasien`"};
            String where = "nama_pasien Like '"+"%"+txtpencarian.getText()+"%'";
            bigdata = db.SelectTable(field, "tblpasien", where, null, null);
            for(int i =0; i < bigdata.size();i++)
            {
                datasource.addRow(bigdata.get(i));
            }
            tblPasien.setModel(datasource);
        } catch (SQLException ex) {
            Logger.getLogger(frame_KotrolPasien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
      if(isloggin)
        {
            //refreshTabelDeposit();
           fDeposit.setVisible(true);
        }
      else
      {
          JOptionPane.showMessageDialog(this,"Silahkan Login Terlebih Dahulu !");
      }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        try {
            String idpasien = bigdataDeposit.get(selected_deposit)[0];
            int depositAwal = Integer.parseInt(bigdataDeposit.get(selected_deposit)[2]);
            int depositTambah = Integer.parseInt(txtDeposit.getText());
            int tambahDeposit = depositAwal+ depositTambah;
            dbaccess db = new dbaccess();
            String [][] data = {{"deposit",""+tambahDeposit}};
            String where = "id_pasien = '"+idpasien+"'";
             if(db.AutoUpdate(data, "tblpasien", where))
                {
                    String [][] dataHistory = {{"deposit",""+tambahDeposit},{"id_pasien",""+idpasien},{"idAdmin",""+idAdmin}};
                    if(db.AutoInsert(dataHistory,"tbldeposit"))
                    { 
                        JOptionPane.showMessageDialog(this, "Deposit Sebesar "+depositTambah+" Saldo "+bigdataDeposit.get(selected_deposit)[1]+" Sebesar "+tambahDeposit);
                    }
                }else
                 {
                    JOptionPane.showMessageDialog(this, "Data Deposit Telah Gagal Disimpan !");
                 }
        } catch (SQLException ex) {
            Logger.getLogger(frame_KotrolPasien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        refreshTabelDeposit(txtRfidDeposit.getText());
        autorefreshDeposit();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void txtRfidDepositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRfidDepositActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRfidDepositActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        if(isloggin)
        {
            fPembayaran.setVisible(true);
        }else
        {
          JOptionPane.showMessageDialog(this,"Silahkan Login Terlebih Dahulu !");
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        refreshTabelDeposit(txtRfidPembayaran.getText());
        autorefreshPembayaran();
        tindakan();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        try {
            String idpasien = bigdataPembayaran.get(selected_deposit)[0];
            int depositAwal = Integer.parseInt(bigdataPembayaran.get(selected_deposit)[2]);
            int tin = cmbTindakan.getSelectedIndex() +1;
            int depositKurang= Integer.parseInt(bigdataTindakan.get(cmbTindakan.getSelectedIndex())[2]);
            int tambahDeposit = depositAwal- depositKurang;
            dbaccess db = new dbaccess();
            String [][] data = {{"deposit",""+tambahDeposit}};
            String where = "id_pasien = '"+idpasien+"'";
            if(db.AutoUpdate(data, "tblpasien", where))
            {
             String [][] dataHistory = {{"id_tindakan",""+tin},{"id_pasien",""+idpasien},{"id_Admin",""+idAdmin},{"catatan",""+txtCatatan.getText()}};
                if(db.AutoInsert(dataHistory,"tblpembayaran"))
                { 
                    JOptionPane.showMessageDialog(this, "Deposit Sebesar "+depositKurang+" Dengan Tindakan  "+bigdataTindakan.get(cmbTindakan.getSelectedIndex())[1]+" Sebesar "+tambahDeposit);
                }
            }else
             {
                JOptionPane.showMessageDialog(this, "Data Deposit Telah Gagal Disimpan !");
             }
        } catch (SQLException ex) {
            Logger.getLogger(frame_KotrolPasien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
       fAntrian.setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        try {
            int lanjut = m1.poli1+1;
            String id;
            String idSekarang = m1.antrianpoli1.get(m1.poli1);
            if(lanjut < m1.antrianpoli1.size())
             id = m1.antrianpoli1.get(lanjut);
            else
             id = "kosong";
            String kirim = "0|"+idSekarang+"|"+id;
            m1.send(kirim,2203);
            m1.poli1 = m1.poli1+1;
            refreshTabelPoli1();
        } catch (UnknownHostException ex) {
            Logger.getLogger(frame_KotrolPasien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(frame_KotrolPasien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton12ActionPerformed
  
    void refreshTabelPoli1()
    {
        datasource = new DefaultTableModel(new String[]{"Antrian"},0);
        for(int i = m1.poli1; i < m1.antrianpoli1.size();i++)
            datasource.addRow(new String[]{m1.antrianpoli1.get(i)});
        tblPoli1.setModel(datasource);
    }
    
    void refreshTabelPoli2()
    {
        datasource = new DefaultTableModel(new String[]{"Antrian"},0);
        for(int i = m1.poli2; i < m1.antrianpoli2.size();i++)
            datasource.addRow(new String[]{m1.antrianpoli2.get(i)});
        tblPoli2.setModel(datasource);
    }
    
    void refreshTabelPoli3()
    {
        datasource = new DefaultTableModel(new String[]{"Antrian"},0);
        for(int i = m1.poli3; i < m1.antrianpoli3.size();i++)
            datasource.addRow(new String[]{m1.antrianpoli3.get(i)});
        tblPoli3.setModel(datasource);
    }
    
    void refreshTabelPoli4()
    {
        datasource = new DefaultTableModel(new String[]{"Antrian"},0);
        for(int i = m1.poli4; i < m1.antrianpoli4.size();i++)
            datasource.addRow(new String[]{m1.antrianpoli4.get(i)});
        tblPoli4.setModel(datasource);
    }
    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        try {
            int lanjut = m1.poli2+1;
            String id;
            String idSekarang = m1.antrianpoli2.get(m1.poli2);
            if(lanjut < m1.antrianpoli2.size())
             id = m1.antrianpoli2.get(lanjut);
            else
             id = "kosong";
            String kirim = "1|"+idSekarang+"|"+id;
            m1.send(kirim,2203);
            m1.poli2 = m1.poli2+1;
            refreshTabelPoli2();
        } catch (UnknownHostException ex) {
            Logger.getLogger(frame_KotrolPasien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(frame_KotrolPasien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        try {
            int lanjut = m1.poli3+1;
            String id;
            String idSekarang = m1.antrianpoli3.get(m1.poli3);
            if(lanjut < m1.antrianpoli3.size())
             id = m1.antrianpoli3.get(lanjut);
            else
             id = "kosong";
            String kirim = "2|"+idSekarang+"|"+id;
            m1.send(kirim,2203);
            m1.poli3 = m1.poli3+1;
            refreshTabelPoli3();
        } catch (UnknownHostException ex) {
            Logger.getLogger(frame_KotrolPasien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(frame_KotrolPasien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        try {
            int lanjut = m1.poli4+1;
            String id;
            String idSekarang = m1.antrianpoli4.get(m1.poli4);
            if(lanjut < m1.antrianpoli4.size())
             id = m1.antrianpoli4.get(lanjut);
            else
             id = "kosong";
            String kirim = "3|"+idSekarang+"|"+id;
            m1.send(kirim,2203);
            m1.poli4 = m1.poli4+1;
            refreshTabelPoli4();
        } catch (UnknownHostException ex) {
            Logger.getLogger(frame_KotrolPasien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(frame_KotrolPasien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        try {
            dbaccess db = new dbaccess();
             String [][] data = {{"nama_tindakan",txtNamaTindakan.getText()},
                      {"harga_tindakan",""+txtBiayaTindakan.getText()}
                  };
                  if(db.AutoInsert(data, "tbltindakan"))
                  {
                    refreshTindakan();
                      JOptionPane.showMessageDialog(this, "Data Tindakan Telah Berhasil Disimpan !");
                  }else
                  {
                  }
        } catch (SQLException ex) {
            Logger.getLogger(frame_KotrolPasien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        fKonfig.setVisible(true);
        refreshTindakan();
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    void refreshTindakan()
    {
        tindakan();
        datasource = new DefaultTableModel(new String[]{"id tindakan","Nama Tindakan","Harga Tindakan"},0);
        for(int i = 0 ; i < bigdataTindakan.size();i++)
        {
            datasource.addRow(bigdataTindakan.get(i));
        }
        tblTindak.setModel(datasource);
    }
    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        try {
            dbaccess db = new dbaccess();
            String [][] data = {
                         {"nama_tindakan",""+txtNamaTindakan.getText()}, 
                         {"harga_tindakan",""+txtBiayaTindakan.getText()}
                     };
             String id = txtIdTindakan.getText();
             String where = "id_tindakan = ' "+id+"'";
             if(db.AutoUpdate(data, "tbltindakan", where))
             {
                 refreshTindakan();
                 JOptionPane.showMessageDialog(this, "Data Tindakan Telah Berhasil Diubah !");
             }
        } catch (SQLException ex) {
            Logger.getLogger(frame_KotrolPasien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton16ActionPerformed

    private void tblTindakMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTindakMouseClicked
       selecttable_tindakan();
    }//GEN-LAST:event_tblTindakMouseClicked

    
    public void autorefresh()
    {
        txtIdPasien.setText(bigdata.get(selected_pasien)[0]);
        txtIdRfid.setText(bigdata.get(selected_pasien)[1]);
        txtNamaPasien.setText(bigdata.get(selected_pasien)[2]);
        txtAlamatPasien.setText(bigdata.get(selected_pasien)[3]);
    }
       public void autorefreshTindakan()
    {
        txtIdTindakan.setText(bigdataTindakan.get(selected_tindakan)[0]);
        txtNamaTindakan.setText(bigdataTindakan.get(selected_tindakan)[1]);
        txtBiayaTindakan.setText(bigdataTindakan.get(selected_tindakan)[2]);
    }
        public void autorefreshDeposit()
    {
        lblIdPasienDeposit.setText(bigdataDeposit.get(selected_deposit)[0]);
        lblidNamaPasienDeposit.setText(bigdataDeposit.get(selected_deposit)[1]);
        lblDeposit.setText(bigdataDeposit.get(selected_deposit)[2]);
        lblIdAdminDeposit.setText(namaAdmin);
    }
        public void autorefreshPembayaran()
    {
        lblNamaPembayaran.setText(bigdataPembayaran.get(selected_deposit)[1]);
        lblDepositPembayaran.setText(bigdataPembayaran.get(selected_deposit)[2]);
    }
        
    frame_KotrolPasien fa;
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
            java.util.logging.Logger.getLogger(frame_KotrolPasien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frame_KotrolPasien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frame_KotrolPasien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frame_KotrolPasien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frame_KotrolPasien().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbTindakan;
    private javax.swing.JInternalFrame fAntrian;
    private javax.swing.JInternalFrame fDeposit;
    private javax.swing.JInternalFrame fKonfig;
    private javax.swing.JInternalFrame fLogin;
    private javax.swing.JInternalFrame fPasien;
    private javax.swing.JInternalFrame fPembayaran;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JDesktopPane jDesktopPane1;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JLabel lblDeposit;
    private javax.swing.JLabel lblDepositPembayaran;
    private javax.swing.JLabel lblIdAdminDeposit;
    private javax.swing.JLabel lblIdPasienDeposit;
    private javax.swing.JLabel lblNamaPembayaran;
    private javax.swing.JLabel lblidNamaPasienDeposit;
    private javax.swing.JTable tblPasien;
    public javax.swing.JTable tblPoli1;
    public javax.swing.JTable tblPoli2;
    public javax.swing.JTable tblPoli3;
    public javax.swing.JTable tblPoli4;
    private javax.swing.JTable tblTindak;
    private javax.swing.JTextArea txtAlamatPasien;
    private javax.swing.JPasswordField txtAuth;
    private javax.swing.JTextField txtBiayaTindakan;
    private javax.swing.JTextField txtCatatan;
    private javax.swing.JTextField txtDeposit;
    private javax.swing.JTextField txtIdPasien;
    private javax.swing.JTextField txtIdRfid;
    private javax.swing.JTextField txtIdTindakan;
    private javax.swing.JTextField txtNamaPasien;
    private javax.swing.JTextField txtNamaTindakan;
    private javax.swing.JTextField txtRfidDeposit;
    private javax.swing.JTextField txtRfidPembayaran;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JTextField txtpencarian;
    // End of variables declaration//GEN-END:variables
}
