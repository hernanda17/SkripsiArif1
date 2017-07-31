/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package skripsiarif;

import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.UnknownHostException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.activation.DataSource;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import static skripsiarif.Server.portantrian;

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
    ArrayList <String[]> dataPasien;
    ArrayList <String[]> bigdataTindakan;
    ArrayList <String[]> bigdataantri;
   public static HashMap<String,String> config = new HashMap<String,String> (); 
    int portantrian;
    public frame_KotrolPasien() {
        try {
            initComponents();
            txtIdPasien.setVisible(false);
            jLabel5.setVisible(false);
            JmLogout.setVisible(false);
            Config();
            server();
            portantrian = Integer.parseInt(config.get("portantrian"));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(frame_KotrolPasien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(frame_KotrolPasien.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    Server m1;
    public void server()
    {
        m1=new Server(); 
        m1.config = this.config;
        m1.fa = this;
        Thread t1 =new Thread(m1); 
        t1.start();
    }
    
    
   public static void Config() throws FileNotFoundException, IOException 
     {
         BufferedReader br = new BufferedReader(new FileReader("config.ini"));
        try {
            String line = br.readLine();
            String [] split;
            do{
                split = line.split("=");
                config.put(split[0], split[1]);
                line = br.readLine();
            }
            while (line != null) ;
        } finally {
            br.close();
        }
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
        txtIdentitas = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txtKK = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
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
        fPembayaran = new javax.swing.JInternalFrame();
        jPanel6 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        txtCatatan = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        cmbTindakan = new javax.swing.JComboBox();
        lblDepositPembayaran = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lblNamaPembayaran = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtRfidPembayaran = new javax.swing.JTextField();
        txtPinPembayaran = new javax.swing.JPasswordField();
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
        jButton17 = new javax.swing.JButton();
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
        txtDetailTindakan = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jButton22 = new javax.swing.JButton();
        fPIN = new javax.swing.JInternalFrame();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel9 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        txtRFIDPin = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        lblNamaPin = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        lblAlamatPin = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jButton18 = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        lblKonfirmas = new javax.swing.JLabel();
        txtPin = new javax.swing.JPasswordField();
        txtKonfirmasiPin = new javax.swing.JPasswordField();
        jPanel11 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        txtRFIDLupPin = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        lblNamaPinKon = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        lblAlamatPinKon = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jButton20 = new javax.swing.JButton();
        jLabel38 = new javax.swing.JLabel();
        lblKonfirmasK = new javax.swing.JLabel();
        txtPinKon = new javax.swing.JPasswordField();
        txtKonfirmasiPinKon = new javax.swing.JPasswordField();
        lblIdentitas = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        lblNamaKK = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        fAdmin = new javax.swing.JInternalFrame();
        jPanel10 = new javax.swing.JPanel();
        txtNamaAdmin = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        txtUsernameAdmin = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        txtauthAdmin = new javax.swing.JPasswordField();
        cmbAdmin = new javax.swing.JComboBox();
        jLabel43 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuLogin = new javax.swing.JMenu();
        JmLogin = new javax.swing.JMenuItem();
        JmLogout = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

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
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE)
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

        jLabel25.setText("IdenTitas :");

        jLabel44.setText("Nama KK:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
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
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtIdentitas)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel44)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtKK)))
                .addContainerGap())
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
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(txtIdentitas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(txtKK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addGap(35, 35, 35)
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
        fLogin.setVisible(true);

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

        fLogin.setBounds(340, 160, 380, 200);
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
        txtRfidDeposit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtRfidDepositKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblidNamaPasienDeposit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblDeposit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblIdAdminDeposit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblIdPasienDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jButton7)
                                            .addComponent(txtDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(txtRfidDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 35, Short.MAX_VALUE))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtRfidDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout fDepositLayout = new javax.swing.GroupLayout(fDeposit.getContentPane());
        fDeposit.getContentPane().setLayout(fDepositLayout);
        fDepositLayout.setHorizontalGroup(
            fDepositLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        fDepositLayout.setVerticalGroup(
            fDepositLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fDepositLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(64, 64, 64))
        );

        fDeposit.setBounds(80, 40, 310, 340);
        jDesktopPane1.add(fDeposit, javax.swing.JLayeredPane.DEFAULT_LAYER);

        fPembayaran.setClosable(true);
        fPembayaran.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        fPembayaran.setIconifiable(true);
        fPembayaran.setResizable(true);
        fPembayaran.setTitle("Pembayaran");
        fPembayaran.setMinimumSize(new java.awt.Dimension(300, 400));
        fPembayaran.setVisible(false);

        jButton10.setText("Proses");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jLabel19.setText("Catatan : ");

        jLabel18.setText("Tindakan :");

        lblDepositPembayaran.setText("Deposit");

        jLabel17.setText("Deposit :");

        jLabel16.setText("Nama Pasien :");

        lblNamaPembayaran.setText("Nama");

        jButton9.setText("Cari");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jLabel23.setText("PIN :");

        jLabel15.setText("RFID : ");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel19)
                            .addComponent(jLabel18)
                            .addComponent(jLabel17)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblNamaPembayaran)
                            .addComponent(cmbTindakan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCatatan, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDepositPembayaran)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel23))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtPinPembayaran, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                            .addComponent(txtRfidPembayaran))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton9)))
                .addGap(118, 118, 118))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtRfidPembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jButton9)
                    .addComponent(txtPinPembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                .addContainerGap(69, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout fPembayaranLayout = new javax.swing.GroupLayout(fPembayaran.getContentPane());
        fPembayaran.getContentPane().setLayout(fPembayaranLayout);
        fPembayaranLayout.setHorizontalGroup(
            fPembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        fPembayaranLayout.setVerticalGroup(
            fPembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        fPembayaran.setBounds(100, 80, 370, 300);
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

        jButton17.setText("Ambil Antrian");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jButton12)
                        .addGap(65, 65, 65)
                        .addComponent(jButton11)
                        .addGap(72, 72, 72)
                        .addComponent(jButton13)
                        .addGap(62, 62, 62)
                        .addComponent(jButton14)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton11)
                    .addComponent(jButton13)
                    .addComponent(jButton12)
                    .addComponent(jButton14))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jButton17)
                        .addGap(0, 300, Short.MAX_VALUE))))
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

        jLabel26.setText("Detail Tindakan :");

        jButton22.setText("Hapus");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                .addComponent(jButton22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton15))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtBiayaTindakan, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDetailTindakan, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(txtDetailTindakan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton15)
                    .addComponent(jButton16)
                    .addComponent(jButton22))
                .addContainerGap(219, Short.MAX_VALUE))
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

        fPIN.setClosable(true);
        fPIN.setTitle("PIN");
        fPIN.setVisible(false);

        jLabel27.setText("ID RFID :");

        txtRFIDPin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtRFIDPinKeyPressed(evt);
            }
        });

        jLabel28.setText("NAMA : ");

        lblNamaPin.setText("nama");

        jLabel30.setText("ALAMAT :");

        lblAlamatPin.setText("alamat");

        jLabel32.setText("PIN Baru :");

        jLabel33.setText("Konfirmasi :");

        jButton18.setText("Simpan");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jLabel34.setText("Pin : ");

        lblKonfirmas.setText("Benar");

        txtKonfirmasiPin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtKonfirmasiPinKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addGap(18, 18, 18)
                        .addComponent(txtRFIDPin, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addGap(18, 18, 18)
                        .addComponent(lblNamaPin))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblAlamatPin))
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel9Layout.createSequentialGroup()
                            .addComponent(jLabel34)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblKonfirmas)
                            .addGap(55, 55, 55)
                            .addComponent(jButton18))
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel33)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtKonfirmasiPin))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel32)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPin, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(txtRFIDPin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(lblNamaPin))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(lblAlamatPin))
                .addGap(28, 28, 28)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(txtPin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(txtKonfirmasiPin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton18)
                    .addComponent(jLabel34)
                    .addComponent(lblKonfirmas))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("PIN Baru", jPanel9);

        jLabel29.setText("ID RFID :");

        txtRFIDLupPin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtRFIDLupPinKeyPressed(evt);
            }
        });

        jLabel31.setText("NAMA : ");

        lblNamaPinKon.setText("nama");

        jLabel35.setText("ALAMAT :");

        lblAlamatPinKon.setText("alamat");

        jLabel36.setText("PIN Baru :");

        jLabel37.setText("Konfirmasi :");

        jButton20.setText("Simpan");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jLabel38.setText("Pin : ");

        lblKonfirmasK.setText("Benar");

        txtKonfirmasiPinKon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtKonfirmasiPinKonKeyReleased(evt);
            }
        });

        lblIdentitas.setText("identitas");

        jLabel39.setText("IDentitas :");

        lblNamaKK.setText("nama KK");

        jLabel45.setText("NAMA KK  :");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel29)
                        .addGap(18, 18, 18)
                        .addComponent(txtRFIDLupPin, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel11Layout.createSequentialGroup()
                            .addComponent(jLabel38)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblKonfirmasK)
                            .addGap(55, 55, 55)
                            .addComponent(jButton20))
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel37)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtKonfirmasiPinKon))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel36)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPinKon, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel45)
                            .addComponent(jLabel31))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNamaPinKon)
                            .addComponent(lblNamaKK)))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel35)
                            .addComponent(jLabel39))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIdentitas)
                            .addComponent(lblAlamatPinKon))))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(txtRFIDLupPin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45)
                    .addComponent(lblNamaKK))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(lblNamaPinKon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(lblAlamatPinKon))
                .addGap(10, 10, 10)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(lblIdentitas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(txtPinKon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(txtKonfirmasiPinKon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton20)
                    .addComponent(jLabel38)
                    .addComponent(lblKonfirmasK))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Lupa Pin", jPanel11);

        javax.swing.GroupLayout fPINLayout = new javax.swing.GroupLayout(fPIN.getContentPane());
        fPIN.getContentPane().setLayout(fPINLayout);
        fPINLayout.setHorizontalGroup(
            fPINLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        fPINLayout.setVerticalGroup(
            fPINLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        fPIN.setBounds(420, 60, 240, 370);
        jDesktopPane1.add(fPIN, javax.swing.JLayeredPane.DEFAULT_LAYER);

        fAdmin.setClosable(true);
        fAdmin.setIconifiable(true);
        fAdmin.setMaximizable(true);
        fAdmin.setTitle("Daftar Admin");
        fAdmin.setVisible(false);

        jLabel40.setText("Nama Admin :");

        jLabel41.setText("Username :");

        jLabel42.setText("Auth :");

        cmbAdmin.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "POLI GIGI", "POLI ANAK", "POLI UMUM", "POLI IBU" }));

        jLabel43.setText("Auth :");

        jButton3.setText("DAFTAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton3)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel40)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNamaAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel41)
                            .addComponent(jLabel42)
                            .addComponent(jLabel43))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbAdmin, 0, 122, Short.MAX_VALUE)
                            .addComponent(txtUsernameAdmin)
                            .addComponent(txtauthAdmin))))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNamaAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsernameAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(txtauthAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel43))
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout fAdminLayout = new javax.swing.GroupLayout(fAdmin.getContentPane());
        fAdmin.getContentPane().setLayout(fAdminLayout);
        fAdminLayout.setHorizontalGroup(
            fAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        fAdminLayout.setVerticalGroup(
            fAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        fAdmin.setBounds(10, 40, 290, 240);
        jDesktopPane1.add(fAdmin, javax.swing.JLayeredPane.DEFAULT_LAYER);

        menuLogin.setText("Pasien");

        JmLogin.setText("LOGIN");
        JmLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JmLoginActionPerformed(evt);
            }
        });
        menuLogin.add(JmLogin);

        JmLogout.setText("LOGOUT");
        JmLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JmLogoutActionPerformed(evt);
            }
        });
        menuLogin.add(JmLogout);

        jMenuItem1.setText("Data Pasien");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuLogin.add(jMenuItem1);

        jMenuItem3.setText("Deposit");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        menuLogin.add(jMenuItem3);

        jMenuItem4.setText("Pembayaran");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        menuLogin.add(jMenuItem4);

        jMenuItem10.setText("PIN");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        menuLogin.add(jMenuItem10);

        jMenuBar1.add(menuLogin);

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

        jMenuItem2.setText("Daftar Admin");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

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
             datasource = new DefaultTableModel(new String[]{"id_pasien","id_rfid","nama_pasien","alamat_pasien","identitas_pasien","nama_kk"},0);
            fPasien.setVisible(rootPaneCheckingEnabled);
            dbaccess db = new dbaccess();
            String [] field = {"`id_pasien`","`id_rfid`","`nama_pasien`","`alamat_pasien`","`identitas_pasien`","`nama_kk`"};
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
            bigdataPembayaran = db.SelectTable(field, "tblpasien", where, null, null);
        } catch (SQLException ex) {
            Logger.getLogger(frame_KotrolPasien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void refreshTabelPembayaran(String ID)
    {
        try {
            dbaccess db = new dbaccess();
            String [] field = {"`id_pasien`","`nama_pasien`","`deposit`"};
            String where = "id_rfid = '"+ID+"' and pin = "+txtPinPembayaran.getText();
            bigdataPembayaran = db.SelectTable(field, "tblpasien", where, null, null);
        } catch (SQLException ex) {
            Logger.getLogger(frame_KotrolPasien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void getDataRFID(String ID)
    {
        try {
            dbaccess db = new dbaccess();
            String [] field = {"`id_pasien`","`nama_pasien`","`Alamat_pasien`","`identitas_pasien`","`nama_kk`"};
            String where = "id_rfid = '"+ID+"'";
            dataPasien = db.SelectTable(field, "tblpasien", where, null, null);
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
            datasource = new DefaultTableModel(new String[]{"id_tindakan","nama_tindakan","harga_tindakan","catatan"},0);
            dbaccess db = new dbaccess();
            String [] field = {"id_tindakan","nama_tindakan","harga_tindakan"};
            String status = "status = 0";
            bigdataTindakan = db.SelectTable(field, "tbltindakan", status, null, null);
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
            String where ="username = '"+ username +"' and  password_admin = '"+auth+"' and status = 0";
            ArrayList <String[]> bigdata = db.SelectTable(field, "tbladmin",where, null, null);
            if(bigdata.size()>0)
            {
                JmLogin.setVisible(false);
                idAdmin = bigdata.get(0)[2];
                namaAdmin = bigdata.get(0)[1];
                usernameAdmin = bigdata.get(0)[0];
                isloggin =true;
                JOptionPane.showMessageDialog(this, "Selamat datang "+namaAdmin);
                fLogin.setVisible(false);
                JmLogout.setVisible(true);
                txtUsername.setText("");
                txtAuth.setText("");
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Username atau Password Salah ");
            }
        } catch (SQLException ex) {
            Logger.getLogger(frame_KotrolPasien.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void JmLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JmLoginActionPerformed
        fLogin.setVisible(true);
    }//GEN-LAST:event_JmLoginActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            Date tgl = new Date();
            dbaccess db = new dbaccess();
            String idrfid = txtIdRfid.getText();
            String namaPasien = txtNamaPasien.getText();
            String alamatPasien = txtAlamatPasien.getText();
            String identitasPasien = txtIdentitas.getText();
            String namakk = txtKK.getText();
           SimpleDateFormat fmt = new java.text.SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
            String [][] data = {{"timestamp",fmt.format(tgl)},
                {"id_RFID",""+idrfid}, 
                {"nama_pasien",""+namaPasien},
                {"alamat_pasien",""+alamatPasien},
                {"nama_kk",""+namakk},
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
            String nama_kk = txtKK.getText();
            String identitasPasien = "";
            String [][] data = {
                    {"id_RFID",""+idrfid}, 
                    {"nama_pasien",""+namaPasien},
                    {"alamat_pasien",""+alamatPasien},
                    {"nama_kk",""+nama_kk},
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

    private void txtRfidDepositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRfidDepositActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRfidDepositActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        if(isloggin)
        {
            tindakan();
            fPembayaran.setVisible(true);
            for(int i = 0 ; i < bigdataTindakan.size();i++)
                cmbTindakan.addItem(bigdataTindakan.get(i)[1]);
        }else
        {
          JOptionPane.showMessageDialog(this,"Silahkan Login Terlebih Dahulu !");
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        refreshTabelPembayaran(txtRfidPembayaran.getText());
        if(bigdataPembayaran.size() > 0)
            autorefreshPembayaran();
        else
            JOptionPane.showMessageDialog(this, "Pin yang anda masukan Salah ! silahkan ulangi");
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
            String idSekarang = m1.antrianpoli1.get(m1.poli1)[0];
            if(lanjut < m1.antrianpoli1.size())
             id = m1.antrianpoli1.get(lanjut)[0];
            else
             id = "kosong";
            String kirim = "0|"+idSekarang+"|"+id;
            m1.send(kirim,m1.config.get("ipantrian"),portantrian);
            m1.poli1 = m1.poli1+1;
            refreshTabelPoli1();
            dbaccess db = new dbaccess();
            String [][] data = {{"status","1"}};
            String where = "id_pasien = ' "+idSekarang+"'";
            db.AutoUpdate(data, "tblantri", where);
        } catch (UnknownHostException ex) {
            Logger.getLogger(frame_KotrolPasien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(frame_KotrolPasien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(frame_KotrolPasien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton12ActionPerformed
  
    void refreshTabelPoli1()
    {
        datasource = new DefaultTableModel(new String[]{"Antrian"},0);
        for(int i = m1.poli1; i < m1.antrianpoli1.size();i++)
            datasource.addRow(new String[]{m1.antrianpoli1.get(i)[0]});
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
            m1.send(kirim,m1.config.get("ipantrian"),portantrian);
            m1.poli2 = m1.poli2+1;
            refreshTabelPoli2();
            dbaccess db = new dbaccess();
            String [][] data = {{"status","1"}};
            String where = "id_pasien = ' "+idSekarang+"'";
            db.AutoUpdate(data, "tblantri", where);
        } catch (UnknownHostException ex) {
            Logger.getLogger(frame_KotrolPasien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(frame_KotrolPasien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
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
            m1.send(kirim,m1.config.get("ipantrian"),portantrian);
            m1.poli3 = m1.poli3+1;
            refreshTabelPoli3();
            dbaccess db = new dbaccess();
            String [][] data = {{"status","1"}};
            String where = "id_pasien = ' "+idSekarang+"'";
            db.AutoUpdate(data, "tblantri", where);
        } catch (UnknownHostException ex) {
            Logger.getLogger(frame_KotrolPasien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(frame_KotrolPasien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
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
            m1.send(kirim,m1.config.get("ipantrian"),portantrian);
            m1.poli4 = m1.poli4+1;
            refreshTabelPoli4();
            dbaccess db = new dbaccess();
            String [][] data = {{"status","1"}};
            String where = "id_pasien = ' "+idSekarang+"'";
            db.AutoUpdate(data, "tblantri", where);
        } catch (UnknownHostException ex) {
            Logger.getLogger(frame_KotrolPasien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(frame_KotrolPasien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(frame_KotrolPasien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        try {
            dbaccess db = new dbaccess();
             String [][] data = {{"nama_tindakan",txtNamaTindakan.getText()},
                      {"harga_tindakan",""+txtBiayaTindakan.getText()},
                      {"catatan",""+txtDetailTindakan.getText()}
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
        datasource = new DefaultTableModel(new String[]{"id tindakan","Nama Tindakan","Harga Tindakan","Detail Tindakan"},0);
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
                         {"harga_tindakan",""+txtBiayaTindakan.getText()}, 
                         {"catatan",""+txtDetailTindakan.getText()}
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
boolean sudah = false;
    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
      
        if(!sudah)
        {
            try {
            dbaccess db = new dbaccess();
            SimpleDateFormat fmt = new java.text.SimpleDateFormat("yyyy/MM/dd");
            Date date = new Date();
            String dat = fmt.format(date)+" 00:00:00";
            String [] field = {"`idantri`","`id_pasien`","`timestamp`","`status`","`poli`"};
            String where = "timestamp > "+"'"+dat+"' and status = 0";
            bigdataantri = db.SelectTable(field, "tblantri", where, null, null);
            for(int i = 0 ;i < bigdataantri.size();i++)
            {
                String [] ambil = bigdataantri.get(i);
                if(ambil[4].equalsIgnoreCase("0"))
                {
                    String [] asd = new String[1]; 
                    asd[0]=ambil[1];
                    m1.antrianpoli1.add(asd);
                }
                else if(ambil[4].equalsIgnoreCase("1"))
                {
                    m1.antrianpoli2.add(ambil[1]);
                }else if(ambil[4].equalsIgnoreCase("2"))
                {
                    m1.antrianpoli3.add(ambil[1]);
                }else if(ambil[4].equalsIgnoreCase("3"))
                {
                    m1.antrianpoli4.add(ambil[1]);
                }
                   
            }
            
            refreshTabelPoli1();
            refreshTabelPoli2();
            refreshTabelPoli3();
            refreshTabelPoli4();
            sudah = true;
        } catch (SQLException ex) {
            Logger.getLogger(frame_KotrolPasien.class.getName()).log(Level.SEVERE, null, ex);
        }
        }else
        {
            JOptionPane.showMessageDialog(this, "Sudah mengambil Antrian");
        }
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        if(isloggin)
            fPIN.setVisible(true);
        else
            JOptionPane.showMessageDialog(this,"Silahkan Login Terlebih Dahulu");
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void txtKonfirmasiPinKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKonfirmasiPinKeyReleased
        if(txtPin.getText().equalsIgnoreCase(txtKonfirmasiPin.getText()))
        {
            lblKonfirmas.setText("Benar");
        }else
        {
            lblKonfirmas.setText("Salah");
        }
    }//GEN-LAST:event_txtKonfirmasiPinKeyReleased

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        try {
            dbaccess db = new dbaccess(); 
            String [][] data = {
                        {"pin",""+txtPin.getText()}
                    };
                String where = "id_pasien = ' "+dataPasien.get(0)[0]+"'";
                 if(db.AutoUpdate(data, "tblpasien", where))
                 {
                     JOptionPane.showMessageDialog(this, "Data Pin Berhasil Disimpan !");
                 }else
                 {
                     JOptionPane.showMessageDialog(this, "Data Pin Gagal Disimpan !");
                 }
        } catch (SQLException ex) {
            Logger.getLogger(frame_KotrolPasien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
       try {
            dbaccess db = new dbaccess(); 
            String [][] data = {
                        {"pin",""+txtPinKon.getText()}
                    };
                String where = "id_pasien = ' "+dataPasien.get(0)[0]+"'";
                 if(db.AutoUpdate(data, "tblpasien", where))
                 {
                     JOptionPane.showMessageDialog(this, "Data Pin Berhasil Disimpan !");
                 }else
                 {
                     JOptionPane.showMessageDialog(this, "Data Pin Gagal Disimpan !");
                 }
        } catch (SQLException ex) {
            Logger.getLogger(frame_KotrolPasien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton20ActionPerformed

    private void txtKonfirmasiPinKonKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKonfirmasiPinKonKeyReleased
        if(txtKonfirmasiPinKon.getText().equalsIgnoreCase(txtPinKon.getText()))
        {
            lblKonfirmasK.setText("Benar");
        }else
        {
            lblKonfirmasK.setText("Salah");
            
        }
    }//GEN-LAST:event_txtKonfirmasiPinKonKeyReleased

    private void JmLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JmLogoutActionPerformed
        fPasien.setVisible(false);
        fAntrian.setVisible(false);
        fDeposit.setVisible(false);
        fKonfig.setVisible(false);
        fLogin.setVisible(true);
        fPIN.setVisible(false);
        fPembayaran.setVisible(false);
        isloggin = false;
    }//GEN-LAST:event_JmLogoutActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        try {
            dbaccess db = new dbaccess();
            String [][] data = {
                        {"status","1"}};
            String id = txtIdTindakan.getText();
                    
            String where = "id_tindakan = ' "+id+"'";
             if(db.AutoUpdate(data, "tbltindakan", where))
            {
                JOptionPane.showMessageDialog(this, "Data berhasil di hapus !");
                refreshTindakan();
            }
        } catch (SQLException ex) {
            Logger.getLogger(frame_KotrolPasien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        fAdmin.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void txtRFIDPinKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRFIDPinKeyPressed
       if (evt.getKeyCode()==KeyEvent.VK_ENTER){
            getDataRFID(txtRFIDPin.getText());
            lblNamaPin.setText(dataPasien.get(0)[1]);
            lblAlamatPin.setText(dataPasien.get(0)[2]);
        }
    }//GEN-LAST:event_txtRFIDPinKeyPressed

    private void txtRFIDLupPinKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRFIDLupPinKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){
            getDataRFID(txtRFIDLupPin.getText());
            lblNamaPinKon.setText(dataPasien.get(0)[1]);
            lblAlamatPinKon.setText(dataPasien.get(0)[2]);
            lblIdentitas.setText(dataPasien.get(0)[3]);
            lblNamaKK.setText(dataPasien.get(0)[4]);
        }
    }//GEN-LAST:event_txtRFIDLupPinKeyPressed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            int status = cmbAdmin.getSelectedIndex() + 1; 
            dbaccess db = new dbaccess();
            String [][] data = {{"username",txtUsernameAdmin.getText()},
                    {"password_admin",""+txtauthAdmin.getText()}, 
                    {"nama_admin",""+txtNamaAdmin.getText()},
                    {"status",""+status}
                };
                if(db.AutoInsert(data, "tbladmin"))
                {
                    JOptionPane.showMessageDialog(this, "Admin Berhasil Disimpan !");
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "Admin Gagal Disimpan !");
                }
        } catch (SQLException ex) {
            Logger.getLogger(frame_KotrolPasien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtRfidDepositKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRfidDepositKeyPressed
         if (evt.getKeyCode()==KeyEvent.VK_ENTER){
            refreshTabelDeposit(txtRfidDeposit.getText());
            if(bigdataDeposit.size()>0)
            autorefreshDeposit();
            else
            JOptionPane.showMessageDialog(this, "Pin yang anda masukan salah !, silahkan ulangi");
         }
    }//GEN-LAST:event_txtRfidDepositKeyPressed

    
    public void autorefresh()
    {
        txtIdRfid.setText(bigdata.get(selected_pasien)[1]);
        txtNamaPasien.setText(bigdata.get(selected_pasien)[2]);
        txtAlamatPasien.setText(bigdata.get(selected_pasien)[3]);
        txtIdentitas.setText(bigdata.get(selected_pasien)[4]);
        txtKK.setText(bigdata.get(selected_pasien)[5]);
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
    private javax.swing.JMenuItem JmLogin;
    private javax.swing.JMenuItem JmLogout;
    private javax.swing.JComboBox cmbAdmin;
    private javax.swing.JComboBox cmbTindakan;
    private javax.swing.JInternalFrame fAdmin;
    private javax.swing.JInternalFrame fAntrian;
    private javax.swing.JInternalFrame fDeposit;
    private javax.swing.JInternalFrame fKonfig;
    private javax.swing.JInternalFrame fLogin;
    private javax.swing.JInternalFrame fPIN;
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
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
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
    private javax.swing.JLabel jLabel23;
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
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
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
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblAlamatPin;
    private javax.swing.JLabel lblAlamatPinKon;
    private javax.swing.JLabel lblDeposit;
    private javax.swing.JLabel lblDepositPembayaran;
    private javax.swing.JLabel lblIdAdminDeposit;
    private javax.swing.JLabel lblIdPasienDeposit;
    private javax.swing.JLabel lblIdentitas;
    private javax.swing.JLabel lblKonfirmas;
    private javax.swing.JLabel lblKonfirmasK;
    private javax.swing.JLabel lblNamaKK;
    private javax.swing.JLabel lblNamaPembayaran;
    private javax.swing.JLabel lblNamaPin;
    private javax.swing.JLabel lblNamaPinKon;
    private javax.swing.JLabel lblidNamaPasienDeposit;
    private javax.swing.JMenu menuLogin;
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
    private javax.swing.JTextField txtDetailTindakan;
    private javax.swing.JTextField txtIdPasien;
    private javax.swing.JTextField txtIdRfid;
    private javax.swing.JTextField txtIdTindakan;
    private javax.swing.JTextField txtIdentitas;
    private javax.swing.JTextField txtKK;
    private javax.swing.JPasswordField txtKonfirmasiPin;
    private javax.swing.JPasswordField txtKonfirmasiPinKon;
    private javax.swing.JTextField txtNamaAdmin;
    private javax.swing.JTextField txtNamaPasien;
    private javax.swing.JTextField txtNamaTindakan;
    private javax.swing.JPasswordField txtPin;
    private javax.swing.JPasswordField txtPinKon;
    private javax.swing.JPasswordField txtPinPembayaran;
    private javax.swing.JTextField txtRFIDLupPin;
    private javax.swing.JTextField txtRFIDPin;
    private javax.swing.JTextField txtRfidDeposit;
    private javax.swing.JTextField txtRfidPembayaran;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JTextField txtUsernameAdmin;
    private javax.swing.JPasswordField txtauthAdmin;
    private javax.swing.JTextField txtpencarian;
    // End of variables declaration//GEN-END:variables
}
