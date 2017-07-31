/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package skripsiarif;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hernanda
 */
public class ServerDaftarPembayaran implements Runnable{

   public frameDaftarPembayaran fa;
   public static HashMap<String,String> config = new HashMap<String,String> (); 
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
    public void run(){  
        try {
            System.out.println("jalan");
            Config();
            int ports = Integer.parseInt(config.get("portpembayaran"));
            ServerSocket serverSocket = new ServerSocket(ports);
            while (true)
                {
                    Socket clientSocket = serverSocket.accept(); 
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                    String command = bufferedReader.readLine();
                    
                    System.out.println(command);
                    pesan(command);
                }
        } catch (IOException ex) {
             System.out.println("error");
        }
    }
    
    public String status(String id)
    {
        if(id.equalsIgnoreCase("1"))
        {
            return "Poli Ibu";
        }else if(id.equalsIgnoreCase("2"))
        {
            return "POLI ANAK";
        }else if(id.equalsIgnoreCase("3"))
        {
            return "POLI UMUM";
        }else if(id.equalsIgnoreCase("4"))
        {
            return "POLI GIGI";
        }else if(id.equalsIgnoreCase("0"))
        {
            return "Super Admin";
        }
        return null;
    }
    public void pesan(String data)
    {
        String [] dapat = data.split("[|]");
        if(dapat[0].equalsIgnoreCase("0"))
        {
           //Login
            if(dapat[1].equalsIgnoreCase("0"))
            {
                fa.namaAdmin = dapat[3];
                fa.idAdmin = dapat[2];
                fa.status = Integer.parseInt(dapat[5]);
                fa.lblStatus.setText(status(dapat[5]));
                fa.LoginAsDeposit();
            }else
            {
                JOptionPane.showMessageDialog(fa,"Username atau Password Salah !");
            }
                
            
        }
        else if(dapat[0].equalsIgnoreCase("1"))
        {
            JOptionPane.showMessageDialog(fa,"Anda Nomor Antrian ke -"+ dapat[1]);
        }
        else if(dapat[0].equalsIgnoreCase("2"))
        {
            //tindakan
            fa.cmbTindakan.removeAllItems();
            for(int i = 1 ; i < dapat.length;i++)
                fa.cmbTindakan.addItem(dapat[i]);
        }
        else if(dapat[0].equalsIgnoreCase("3"))
        {
            fa.lblNamaPembayaran.setText(dapat[2]);
            fa.lblDepositPembayaran.setText(dapat[5]);
            fa.idPasien =dapat[1];
            fa.namaPasien = dapat[2];
            fa.depositPasien = Integer.parseInt(dapat[5]);
        }
        else if(dapat[0].equalsIgnoreCase("4"))
        {
            String pesan = "Deposit "+fa.namaPasien+ "Sebesar "+dapat[2]+" Berhasil. Saldo : "+dapat[3];
            JOptionPane.showMessageDialog(fa, pesan);
        }else if(dapat[0].equalsIgnoreCase("5"))
        {
            // format no|status|deposit|hargaTindakan|
            if(dapat[1].equalsIgnoreCase("0"))
            {
                String pesan = "Pembayaran "+fa.namaPasien+ "Sebesar "+dapat[3]+" Berhasil. Saldo : "+dapat[2];
                JOptionPane.showMessageDialog(fa, pesan);
        
            }else
            {
                String pesan = "Pembayaran "+fa.namaPasien+ "Sebesar Gagal Karena : "+dapat[1];
                JOptionPane.showMessageDialog(fa, pesan);
            }
        }else if(dapat[0].equalsIgnoreCase("6"))
        {
          DefaultTableModel datasource = new DefaultTableModel(new String[]{"ID PASIEN"},0);
            // format no|status|deposit|hargaTindakan|
            String [] pec = dapat[1].split(",");
            if(pec.length>0){
                for(int i = 0 ; i<pec.length;i++)
                {
                    datasource.addRow(new String[]{String.valueOf(pec[i])});
                }
            }
            
            fa.tblAntri.setModel(datasource);
        }else if(dapat[0].equalsIgnoreCase("7"))
        {
            String namakk = dapat[6];
            String nama = dapat[2];
            String alamat = dapat[3];
            String noIdentitas = dapat[4];
            fa.id = dapat[1];
            fa.lblNamaKK.setText(namakk);
            fa.lblNamaPinKon.setText(nama);
            fa.lblAlamatPinKon.setText(alamat);
            fa.lblIdentitas.setText(noIdentitas);
        }else if(dapat[0].equalsIgnoreCase("8"))
        {
            JOptionPane.showMessageDialog(fa, "Data Pin Berhasil Di ubah!");
        }
    }
    public void send(String send) throws UnknownHostException, IOException
    {
        int port = Integer.parseInt(config.get("portpanel"));
        String ip = config.get("ippanel");
        Socket s1 = new Socket(ip,port);
        PrintWriter writer = new PrintWriter(s1.getOutputStream());
        System.out.println("yg di kirim: "+send);
        writer.print(send);
        writer.flush();
        writer.close();
        s1.close();
        System.out.println("flushed");
    }
  
}
