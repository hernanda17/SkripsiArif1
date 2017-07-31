/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package skripsiarif;

import java.awt.event.ItemEvent;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ConnectException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static skripsiarif.Server.config;

/**
 *
 * @author Hernanda
 */
public class frame_daftarAntrian extends javax.swing.JFrame {

    public String nama;
    public String id;
    public String alamat;
   public static HashMap<String,String> config = new HashMap<String,String> (); 
    public frame_daftarAntrian() {
        initComponents();
        buttonGroup1.add(rIbu);
        buttonGroup1.add(rAnak);
        buttonGroup1.add(rGigi);
        buttonGroup1.add(rUmum);
        try {
            Config();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(frame_daftarAntrian.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(frame_daftarAntrian.class.getName()).log(Level.SEVERE, null, ex);
        }
        server();
    } 
    ServerDaftarAntrian m1;
    public void server()
    {
        m1=new ServerDaftarAntrian();  
        m1.fa = this;
        m1.port =  Integer.parseInt(config.get("portdaftarantrian"));
        Thread t1 =new Thread(m1); 
        t1.start();
    }public static void Config() throws FileNotFoundException, IOException 
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lblNama = new javax.swing.JLabel();
        lblAlamat = new javax.swing.JLabel();
        txtnomor = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        lblDeposit = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        rIbu = new javax.swing.JRadioButton();
        rAnak = new javax.swing.JRadioButton();
        rGigi = new javax.swing.JRadioButton();
        rUmum = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("PUSKESMAS BOJONG NANGKA");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel2.setText("Keterangan");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel3.setText("Nama Pasien : ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel4.setText("Alamat Pasien : ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel5.setText("Masuk Ke Poli : ");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jButton1.setText("MASUK ANTRIAN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblNama.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblNama.setText("NAMA");

        lblAlamat.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblAlamat.setText("ALAMAT");

        txtnomor.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtnomor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnomorKeyPressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel7.setText("Nomor Kartu : ");

        lblDeposit.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblDeposit.setText("DEPOSIT");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel8.setText("Deposit Pasien : ");

        rIbu.setText("POLI IBU ");

        rAnak.setText("POLI ANAK ");

        rGigi.setText("POLI GIGI");

        rUmum.setText("POLI UMUM ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAlamat)
                                    .addComponent(lblNama)
                                    .addComponent(txtnomor, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(rIbu)
                                            .addComponent(rUmum))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(rGigi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(rAnak, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE))
                                        .addGap(42, 42, 42))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(jButton1)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(22, 22, 22)
                                .addComponent(lblDeposit))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(jLabel6)))
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnomor, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(10, 10, 10)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNama)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblAlamat))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(lblDeposit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rIbu)
                        .addComponent(rAnak)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rUmum, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rGigi, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnomorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnomorKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){
          try {
              send(txtnomor.getText()+"|9");
          } catch (UnknownHostException ex) {
               JOptionPane.showMessageDialog(this, "Server Tidak Aktif");
          } catch (IOException ex) {
               JOptionPane.showMessageDialog(this, "Server Tidak Aktif");
          }
        }
    }//GEN-LAST:event_txtnomorKeyPressed

    private int poli()
    {
        if(rIbu.isSelected())
            return 0; 
        else if(rAnak.isSelected())
            return 1;
        else if(rUmum.isSelected())
            return 2;
        else if(rGigi.isSelected())
            return 3;
        return 0;
                    
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            String kirim= nama+"|"+poli()+"|"+id+"|"+alamat;
            send(kirim);
        } catch (UnknownHostException ex) {
            Logger.getLogger(frame_daftarAntrian.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(frame_daftarAntrian.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    
    Connection con;
    
   
   private static void send(String send) throws UnknownHostException, IOException
    {
        String ip =config.get("ippanel");
        String ports = config.get("portpanel");
        int port = Integer.parseInt(ports);
        Socket s1 = new Socket(ip,port);
        PrintWriter writer = new PrintWriter(s1.getOutputStream());
        System.out.println("yg di kirim: "+send);
        writer.print(send);
        writer.flush();
        writer.close();
        s1.close();
        System.out.println("flushed");
    }
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
            java.util.logging.Logger.getLogger(frame_daftarAntrian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frame_daftarAntrian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frame_daftarAntrian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frame_daftarAntrian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frame_daftarAntrian().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    public javax.swing.JLabel lblAlamat;
    public javax.swing.JLabel lblDeposit;
    public javax.swing.JLabel lblNama;
    private javax.swing.JRadioButton rAnak;
    private javax.swing.JRadioButton rGigi;
    private javax.swing.JRadioButton rIbu;
    private javax.swing.JRadioButton rUmum;
    private javax.swing.JTextField txtnomor;
    // End of variables declaration//GEN-END:variables
}
