/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package skripsiarif;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;
import java.net.UnknownHostException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hernanda
 */
public class Server implements Runnable{

   public frame_KotrolPasien fa;
   public int poli1=0;
   public int poli2=0;
   public int poli3=0;
   public int poli4=0;
   public ArrayList <String> antrianpoli1 = new ArrayList<>();
   public ArrayList <String> antrianpoli2= new ArrayList<>();
   public ArrayList <String> antrianpoli3= new ArrayList<>();
   public ArrayList <String> antrianpoli4= new ArrayList<>();
    public void run(){  
        try {
            ServerSocket serverSocket = new ServerSocket(2202);
            while (true)
                {
                    Socket clientSocket = serverSocket.accept(); 
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                    String command = bufferedReader.readLine();
                    pesan(command);
                    System.out.println(command);
                    //id|poli
                }
        } catch (IOException ex) {
             System.out.println("error");
        }
    }
    
    DefaultTableModel datasource;
    public void pesan(String data)
    {
        datasource = new DefaultTableModel(new String[]{"Antrian"},0);
        String [] pecah = data.split("[|]");
        if(pecah[1].equalsIgnoreCase("0"))
        {
            antrianpoli1.add(pecah[0]);
            for(int i = 0 ;i < antrianpoli1.size();i++)
                datasource.addRow(new String[]{String.valueOf(antrianpoli1.get(i))});
            String dapat = String.valueOf(antrianpoli1.size());
            fa.tblPoli1.setModel(datasource);
            try {
                send("1|"+dapat,2204);
            } catch (UnknownHostException ex) {
                Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(pecah[1].equalsIgnoreCase("1"))
        {
            antrianpoli2.add(pecah[0]);
            for(int i = 0 ;i < antrianpoli2.size();i++)
                datasource.addRow(new String[]{String.valueOf(antrianpoli2.get(i))});
            String dapat = String.valueOf(antrianpoli2.size());
            fa.tblPoli2.setModel(datasource);
            try {
                send("1|"+dapat,2204);
            } catch (UnknownHostException ex) {
                Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(pecah[1].equalsIgnoreCase("2"))
        {
            antrianpoli3.add(pecah[0]);
            for(int i = 0 ;i < antrianpoli3.size();i++)
                datasource.addRow(new String[]{String.valueOf(antrianpoli3.get(i))});
            String dapat = String.valueOf(antrianpoli3.size());
            fa.tblPoli3.setModel(datasource);
            try {
                send("1|"+dapat,2204);
            } catch (UnknownHostException ex) {
                Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(pecah[1].equalsIgnoreCase("3"))
        {
            antrianpoli4.add(pecah[0]);
            for(int i = 0 ;i < antrianpoli4.size();i++)
                datasource.addRow(new String[]{String.valueOf(antrianpoli4.get(i))});
            String dapat = String.valueOf(antrianpoli4.size());
            fa.tblPoli4.setModel(datasource);
            try {
                send("1|"+dapat,2204);
            } catch (UnknownHostException ex) {
                Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else
        {
            String [] dapat = cekDataPasien(pecah[0]);
            try {
                if(dapat.length > 0)
                    send("0"+"|"+dapat[0]+"|"+dapat[1]+"|"+dapat[2]+"|"+dapat[3],2204);
                else 
                    send("0"+"|"+"data tidak ditemukan",2204);
            } catch (UnknownHostException ex) {
                Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public String [] cekDataPasien(String Id)
   {
        try {
            String [] field = {"id_pasien","Nama_pasien","Alamat_pasien","identitas_pasien"};
            dbaccess db = new dbaccess();
            String where = "id_RFID = '"+ Id+"'";
            ArrayList <String[]> data = db.SelectTable( field, "tblpasien", where, "", "");
            if(data.size()> 0)
                return data.get(0);
            else 
                return null;
        } catch (SQLException ex) {
            Logger.getLogger(frame_daftarAntrian.class.getName()).log(Level.SEVERE, null, ex);
        } finally
        {
          //  SF.closeConnection();
        }
        return null;
       
   }
    public void send(String send,int port) throws UnknownHostException, IOException
    {
        System.out.println("kirim : "+send + " port :"+ port);
        String ip = "127.0.0.1";
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
