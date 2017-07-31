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
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
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
   public ArrayList <String[]> antrianpoli1 = new ArrayList<>();
   public ArrayList <String> antrianpoli2= new ArrayList<>();
   public ArrayList <String> antrianpoli3= new ArrayList<>();
   public ArrayList <String> antrianpoli4= new ArrayList<>();
   public static int portantrian;
   public static HashMap<String,String> config = new HashMap<String,String> (); 
   
   int portpembayaran;
   int portobat;
    public void run(){  
        try {
            portpembayaran = Integer.parseInt(config.get("portpembayaran"));
            portantrian = Integer.parseInt(config.get("portantrian"));
            portobat = Integer.parseInt(config.get("portobat"));
            int port = Integer.parseInt(config.get("portpanel"));
            ServerSocket serverSocket = new ServerSocket(port);
            while (true)
                {
                    Socket clientSocket = serverSocket.accept(); 
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                    String command = bufferedReader.readLine();
                    System.out.println(command);
                    pesan(command);
                    //id|poli
                }
        } catch (IOException ex) {
             System.out.println("error + "+ex.toString());
        }
    }
    
    DefaultTableModel datasource;
    public void pesan(String data) throws IOException
    {
        System.out.println(data);
        datasource = new DefaultTableModel(new String[]{"Antrian"},0);
        String [] pecah = data.split("[|]");
        dbaccess db = new dbaccess();
        if(pecah[1].equalsIgnoreCase("0"))
        {
            System.out.println("masuk antrian ke 1 "+ pecah[0]);
            
            String [] dl = new String [3];
            dl[0]= pecah[2];
            dl[1]= pecah[0];
            dl[2]= pecah[3];
            antrianpoli1.add(dl);
            for(int i = 0 ;i < antrianpoli1.size();i++)
                datasource.addRow(new String[]{String.valueOf(pecah[0])});
            String dapat = String.valueOf(antrianpoli1.size());
            fa.tblPoli1.setModel(datasource);
            try {
                int ports= Integer.parseInt(config.get("portdaftarantrian"));
                send("1|"+dapat,config.get("ipdaftarantrian"),ports); 
                Date tgl = new Date();
                SimpleDateFormat fmt = new java.text.SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
                String [][] dataHistory = {{"poli","0"},{"id_pasien",""+pecah[2]},{"timestamp",""+fmt.format(tgl)},{"status","0"}};
                db.AutoInsert(dataHistory,"tblantri");
            } catch (UnknownHostException ex) {
                Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(pecah[1].equalsIgnoreCase("1"))
        {
            antrianpoli2.add(pecah[2]);
            for(int i = 0 ;i < antrianpoli2.size();i++)
                datasource.addRow(new String[]{String.valueOf(antrianpoli2.get(i))});
            String dapat = String.valueOf(antrianpoli2.size());
            fa.tblPoli2.setModel(datasource);
            try {
                int ports= Integer.parseInt(config.get("portdaftarantrian"));
                send("1|"+dapat,config.get("ipdaftarantrian"),ports);
                Date tgl = new Date();
                SimpleDateFormat fmt = new java.text.SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
                String [][] dataHistory = {{"poli","1"},{"id_pasien",""+pecah[2]},{"timestamp",""+fmt.format(tgl)},{"status","0"}};
                db.AutoInsert(dataHistory,"tblantri");
            } catch (UnknownHostException ex) {
                Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(pecah[1].equalsIgnoreCase("2"))
        {
            antrianpoli3.add(pecah[2]);
            for(int i = 0 ;i < antrianpoli3.size();i++)
                datasource.addRow(new String[]{String.valueOf(antrianpoli3.get(i))});
            String dapat = String.valueOf(antrianpoli3.size());
            fa.tblPoli3.setModel(datasource);
            try {
                int ports= Integer.parseInt(config.get("portdaftarantrian"));
                send("1|"+dapat,config.get("ipdaftarantrian"),ports);
                Date tgl = new Date();
                SimpleDateFormat fmt = new java.text.SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
                String [][] dataHistory = {{"poli","2"},{"id_pasien",""+pecah[2]},{"timestamp",""+fmt.format(tgl)},{"status","0"}};
                db.AutoInsert(dataHistory,"tblantri");
            } catch (UnknownHostException ex) {
                Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(pecah[1].equalsIgnoreCase("3"))
        {
            
            antrianpoli4.add(pecah[2]);
            for(int i = 0 ;i < antrianpoli4.size();i++)
                datasource.addRow(new String[]{String.valueOf(antrianpoli4.get(i))});
            String dapat = String.valueOf(antrianpoli4.size());
            fa.tblPoli4.setModel(datasource);
            try {
                int ports= Integer.parseInt(config.get("portdaftarantrian"));
                send("1|"+dapat,config.get("ipdaftarantrian"),ports);
                Date tgl = new Date();
                SimpleDateFormat fmt = new java.text.SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
                String [][] dataHistory = {{"poli","3"},{"id_pasien",""+pecah[2]},{"timestamp",""+fmt.format(tgl)},{"status","0"}};
                db.AutoInsert(dataHistory,"tblantri");
            } catch (UnknownHostException ex) {
                Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if(pecah[1].equalsIgnoreCase("4"))
        {
            try {
                // cek Login
                // format username|no|auth
                String username = pecah[0];
                String auth = pecah[2];
                String [] field = {"`username`","`nama_admin`","`id_admin`","`status`"};
                String where ="username = '"+ username +"' and  password_admin = '"+auth+"'";
                ArrayList <String[]> bigdata = db.SelectTable(field, "tbladmin",where, null, null);
                if(bigdata.size()>0)
                {
                    String idAdmin = bigdata.get(0)[2];
                    String namaAdmin = bigdata.get(0)[1];
                    String usernameAdmin = bigdata.get(0)[0];
                    String status = bigdata.get(0)[3];
                    String dapat = idAdmin+"|"+namaAdmin+"|"+usernameAdmin+"|"+status;
                    int ports= Integer.parseInt(config.get("portpembayaran"));
                    send("0|0|"+dapat,config.get("ippembayaran"),ports);
                }else
                {
                    
                    send("0|"+"1|Tidak Ditemukan",config.get("ippembayaran"),portpembayaran);
                }
            } catch (SQLException ex) {
                Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnknownHostException ex) {
                Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if(pecah[1].equalsIgnoreCase("5"))
        {
            // Pembayaran
            // format idadmin|no|idmember|catatan|tindakan
            Pembayaran(pecah[2], pecah[0],pecah[3], pecah[4]);
        }else if(pecah[1].equalsIgnoreCase("6"))
        {
            // Deposit
            // format idadmin|no|idmember|banyakDeposit 
            Deposit(pecah[2], pecah[0], pecah[3]);
        }else if(pecah[1].equalsIgnoreCase("7"))
        {
            // ambil data member
            String [] dapat = cekDataPasien(pecah[0],pecah[2]);
            try {
                if(dapat.length > 0)
                    send("3"+"|"+dapat[0]+"|"+dapat[1]+"|"+dapat[2]+"|"+dapat[3]+"|"+dapat[4],config.get("ippembayaran"),portpembayaran);
            } catch (UnknownHostException ex) {
                Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if(pecah[1].equalsIgnoreCase("8"))
        {
            try {
                tindakan();
                    send(tin,config.get("ippembayaran"),portpembayaran);
            } catch (UnknownHostException ex) {
                Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        else if(pecah[1].equalsIgnoreCase("9"))
        {
            String [] dapat = cekDataPasien(pecah[0]);
            try {
                
                int ports= Integer.parseInt(config.get("portdaftarantrian"));
                if(dapat.length > 0)
                    send("0"+"|"+dapat[0]+"|"+dapat[1]+"|"+dapat[2]+"|"+dapat[3]+"|"+dapat[4],config.get("ipdaftarantrian"),ports);
                else 
                    send("0"+"|"+"data tidak ditemukan",config.get("ipdaftarantrian"),ports);
            } catch (UnknownHostException ex) {
                Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if(pecah[1].equalsIgnoreCase("10"))
        {
            try {
                if(pecah[0].equalsIgnoreCase("1"))
                {
                    int lanjut = poli1+1;
                    String [] id = antrianpoli1.get(lanjut);
                    String [] idSekarang = antrianpoli1.get(poli1);
                    
                    String kirim = "0|"+idSekarang[0]+"|"+id[0];
                    send(kirim,config.get("ipantrian"),portantrian);
                    poli1 = poli1+1;
                    fa.refreshTabelPoli1();
                    String [][] data1 = {{"status","1"}};
                    String where = "id_pasien = ' "+idSekarang[0]+"'";
                    db.AutoUpdate(data1, "tblantri", where);
                }else if(pecah[0].equalsIgnoreCase("2"))
                {
                    int lanjut = poli2+1;
                    String id;
                    String idSekarang = antrianpoli2.get(poli2);
                    if(lanjut < antrianpoli2.size())
                     id = antrianpoli2.get(lanjut);
                    else
                     id = "kosong";
                    String kirim = "0|"+idSekarang+"|"+id;
                    send(kirim,config.get("ipantrian"),portantrian);
                    poli2 = poli2+1;
                    fa.refreshTabelPoli1();
                    String [][] data1 = {{"status","1"}};
                    String where = "id_pasien = ' "+idSekarang+"'";
                    db.AutoUpdate(data1, "tblantri", where);
                }else if(pecah[0].equalsIgnoreCase("3"))
                {
                    int lanjut = poli3+1;
                    String id;
                    String idSekarang = antrianpoli3.get(poli3);
                    if(lanjut < antrianpoli3.size())
                     id = antrianpoli3.get(lanjut);
                    else
                     id = "kosong";
                    String kirim = "0|"+idSekarang+"|"+id;
                    send(kirim,config.get("ipantrian"),portantrian);
                    poli3 = poli3+1;
                    fa.refreshTabelPoli1();
                    String [][] data1 = {{"status","1"}};
                    String where = "id_pasien = ' "+idSekarang+"'";
                    db.AutoUpdate(data1, "tblantri", where);
                }else if(pecah[0].equalsIgnoreCase("4"))
                {
                    int lanjut = poli4+1;
                    String id;
                    String idSekarang = antrianpoli4.get(poli4);
                    if(lanjut < antrianpoli4.size())
                     id = antrianpoli4.get(lanjut);
                    else
                     id = "kosong";
                    String kirim = "0|"+idSekarang+"|"+id;
                    send(kirim,config.get("ipantrian"),portantrian);
                    poli4 = poli4+1;
                    fa.refreshTabelPoli1();
                    String [][] data1 = {{"status","1"}};
                    String where = "id_pasien = ' "+idSekarang+"'";
                    db.AutoUpdate(data1, "tblantri", where);
                }
            } catch (UnknownHostException ex) {
                Logger.getLogger(frame_KotrolPasien.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(frame_KotrolPasien.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(frame_KotrolPasien.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }else if(pecah[1].equalsIgnoreCase("11"))
        {
            String dapat = "";
            try{
            if(pecah[0].equalsIgnoreCase("1"))
            {
                
                for(int i = 0; i < antrianpoli1.size();i++)
                {
                    if(i== 0)
                        dapat = antrianpoli1.get(i)[0];
                    else
                        dapat = dapat+","+antrianpoli1.get(i);
                }
            }else if(pecah[0].equalsIgnoreCase("2"))
            {
                
                for(int i = 0; i < antrianpoli2.size();i++)
                {
                    if(i== 0)
                        dapat = antrianpoli2.get(i);
                    else
                        dapat = dapat+","+antrianpoli2.get(i);
                }
            }else if(pecah[0].equalsIgnoreCase("3"))
            {
                
                for(int i = 0; i < antrianpoli3.size();i++)
                {
                    if(i== 0)
                        dapat = antrianpoli3.get(i);
                    else
                        dapat = dapat+","+antrianpoli3.get(i);
                }
            }else if(pecah[0].equalsIgnoreCase("1"))
            {
                
                for(int i = 0; i < antrianpoli4.size();i++)
                {
                    if(i== 0)
                        dapat = antrianpoli4.get(i);
                    else
                        dapat = dapat+","+antrianpoli4.get(i);
                }
            }
            String kirim = "6|"+dapat;
            send(kirim,config.get("ippembayaran"),portpembayaran);
        }catch (UnknownHostException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        else if(pecah[1].equalsIgnoreCase("12"))
        {
            // nama|stat|stok|satuan
            String nama = pecah[0];
            String stok = pecah[2];
            String satuan = pecah[3];
            Date tgl = new Date();
            SimpleDateFormat fmt = new java.text.SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
            String [][] dataHistory = {{"namaObat",nama},{"stok",stok},{"update",""+fmt.format(tgl)},{"satuan",satuan}};
            String kirim = "0";
            send(kirim,config.get("ipobat"),portobat);
            try {
                db.AutoInsert(dataHistory,"tblobat");
            } catch (SQLException ex) {
                Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if(pecah[1].equalsIgnoreCase("13"))
        {
            // nama|stat|stok|satuan|id
            String nama = pecah[0];
            String stok = pecah[2];
            String satuan = pecah[3];
            String id = pecah[4];
            String where = "idobat = '"+id+"'";
            Date tgl = new Date();
            SimpleDateFormat fmt = new java.text.SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
            String [][] dataHistory = {{"namaObat",nama},{"stok",stok},{"`update`",""+fmt.format(tgl)},{"satuan",satuan}};
            String kirim = "0";
            send(kirim,config.get("ipobat"),portobat);
            try {
                db.AutoUpdate(dataHistory,"tblobat",where);
            } catch (SQLException ex) {
                Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if(pecah[1].equalsIgnoreCase("14"))
        {
            // id|stat|
            String id = pecah[0];
            String where = "idobat = '"+id+"'";
            String [][] dataHistory = {{"status","1"}};
            String kirim = "0";
            send(kirim,config.get("ipobat"),portobat);
            try {
                db.AutoUpdate(dataHistory,"tblobat",where);
            } catch (SQLException ex) {
                Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if(pecah[1].equalsIgnoreCase("15"))
        {
            // 12|stat|
            String [] field = {"`idobat`","`namaobat`","`stok`","`satuan`","`update`"};
            String where ="status = '0'";
            try {
                ArrayList <String[]> bigdata = db.SelectTable(field, "tblobat",where, null, null);
                String dapat = "";
                if(bigdata.size()>0)
                {
                    for(int i= 0; i<bigdata.size();i++){
                        String idobat = bigdata.get(i)[0];
                        String nama_obat = bigdata.get(i)[1];
                        String stok = bigdata.get(i)[2];
                        String satuan = bigdata.get(i)[3];
                        String update = bigdata.get(i)[4];
                        dapat= dapat + idobat+","+nama_obat+","+stok+","+satuan+","+update;
                        dapat=dapat+"|";
                        
                    }
                }
                send("1|"+dapat,config.get("ipobat"),Integer.parseInt(config.get("portobat")));
            } catch (SQLException ex) {
                Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if(pecah[1].equalsIgnoreCase("16"))
        {
            String [] dapat = cekDataPasien(pecah[0]);
            try {
                if(dapat.length > 0)
                    send("7"+"|"+dapat[0]+"|"+dapat[1]+"|"+dapat[2]+"|"+dapat[3]+"|"+dapat[4]+"|"+dapat[5],config.get("ippembayaran"),portpembayaran);
            } catch (UnknownHostException ex) {
                Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if(pecah[1].equalsIgnoreCase("17"))
        {
        try {
            //id|stat|pin
            String [][] datapin = {
                        {"pin",""+pecah[2]}
                    };
                String where = "id_pasien = ' "+pecah[0]+"'";
                 if(db.AutoUpdate(datapin, "tblpasien", where))
                 {
                     send("8"+"| Sukses",config.get("ippembayaran"),portpembayaran);
                 }else
                 {
                     send("8"+"| Gagal",config.get("ippembayaran"),portpembayaran);
                 }
        } catch (SQLException ex) {
            Logger.getLogger(frame_KotrolPasien.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }
    
    public String [] cekDataPasien(String Id)
   {
        try {
            String [] field = {"id_pasien","Nama_pasien","Alamat_pasien","identitas_pasien","deposit","nama_kk"};
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
    public String [] cekDataPasien(String Id,String pin)
   {
        try {
            String [] field = {"id_pasien","Nama_pasien","Alamat_pasien","identitas_pasien","deposit"};
            dbaccess db = new dbaccess();
            String where = "id_RFID = '"+ Id+"' AND pin ='"+pin+"' ";
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
    
    public void send(String send,String ip,int port) throws UnknownHostException, IOException
    {
        System.out.println("kirim : "+send + " port :"+ port);
        Socket s1 = new Socket(ip,port);
        PrintWriter writer = new PrintWriter(s1.getOutputStream());
        System.out.println("yg di kirim: "+send);
        writer.print(send);
        writer.flush();
        writer.close();
        s1.close();
        System.out.println("flushed");
    }
    
    ArrayList <String[]> bigdata;
     public void refreshTabel()
    {
        try {
            datasource = new DefaultTableModel(new String[]{"id_pasien","id_rfid","nama_pasien","alamat_pasien","identitas_pasien"},0);
            dbaccess db = new dbaccess();
            String [] field = {"`id_pasien`","`id_rfid`","`nama_pasien`","`alamat_pasien`","`identitas_pasien`"};
            bigdata = db.SelectTable(field, "tblpasien", null, null, null);
            for(int i =0; i < bigdata.size();i++)
            {
                datasource.addRow(bigdata.get(i));
            }
        } catch (SQLException ex) {
            Logger.getLogger(frame_KotrolPasien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     public void Pembayaran(String idpasien,String idAdmin, String catatan,String Tindakan)
     {
          try {
            // cari data pasien
            dbaccess db = new dbaccess();
            String [] field = {"`deposit`"};
            String where ="id_pasien = '"+ idpasien +"'";
            ArrayList <String[]> dataDeposit = db.SelectTable(field, "tblpasien",where, null, null);
            int depositAwal = Integer.parseInt(dataDeposit.get(0)[0]);
            //cari tindakan
            String [] field1 = {"`harga_tindakan`"};
            where ="id_tindakan = '"+ Tindakan +"'";
            ArrayList <String[]> datatindakan = db.SelectTable(field1, "tbltindakan",where, null, null);
            int depositKurang =Integer.parseInt(datatindakan.get(0)[0]);
            int tambahDeposit = depositAwal- depositKurang;
            
            String [][] data = {{"deposit",""+tambahDeposit}};
            String where2 = "id_pasien = '"+idpasien+"'";
            if(tambahDeposit>0)
            {
            if(db.AutoUpdate(data, "tblpasien", where2))
            {
             String [][] dataHistory = {{"id_tindakan",""+Tindakan},{"id_pasien",""+idpasien},{"id_Admin",""+idAdmin},{"catatan",""+catatan}};
                if(db.AutoInsert(dataHistory,"tblpembayaran"))
                {
                    //Pembayaran berhasil SEND
                   // format status|deposit|hargaTindakan|
                    String balasan = "5|0|"+tambahDeposit+"|"+depositKurang;
                    send(balasan,config.get("ippembayaran"),portpembayaran);
                }
                }else
                {
                    String balasan = "5|1|"+"Gagal Menyimpan Data";
                    send(balasan,config.get("ippembayaran"),portpembayaran);
                }
            }else
                {
                    String balasan = "5|1|"+"Saldo tidak mencukupi";
                    send(balasan,config.get("ippembayaran"),portpembayaran);
                }
        } catch (SQLException ex) {
            Logger.getLogger(frame_KotrolPasien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnknownHostException ex) {
           Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
       } catch (IOException ex) {
           Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
       }
     }
     
     public void Deposit(String idpasien,String idAdmin,String deposit)
     {
          try {
              
            dbaccess db = new dbaccess();
            String [] field = {"`deposit`"};
            String where ="id_pasien = '"+ idpasien +"'";
            ArrayList <String[]> dataDeposit = db.SelectTable(field, "tblpasien",where, null, null);
            int depositAwal = Integer.parseInt(dataDeposit.get(0)[0]);
            int depositTambah = Integer.parseInt(deposit);
            int tambahDeposit = depositAwal+ depositTambah;
            String [][] data = {{"deposit",""+tambahDeposit}};
            String where1 = "id_pasien = '"+idpasien+"'";
             if(db.AutoUpdate(data, "tblpasien", where1))
            {
                String [][] dataHistory = {{"deposit",""+tambahDeposit},{"id_pasien",""+idpasien},{"idAdmin",""+idAdmin}};
                if(db.AutoInsert(dataHistory,"tbldeposit"))
                { 
                    // Deposit
                    // format status|depositAwal|TambahDeposit|JumlahDeposit
                    String balasan = "4|"+depositAwal+"|"+depositTambah+"|"+tambahDeposit;
                    send(balasan,config.get("ippembayaran"),portpembayaran);
                }
                }else
                {
                    String balasan = "4|"+depositAwal+"|"+depositTambah;
                    send(balasan,config.get("ippembayaran"),portpembayaran);
                }
        } catch (SQLException ex) {
            Logger.getLogger(frame_KotrolPasien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnknownHostException ex) {
           Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
       } catch (IOException ex) {
           Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
       }
     }
     String tin;
     public void tindakan()
        {
            tin = "";
          try {
            dbaccess db = new dbaccess();
            String [] field = {"id_tindakan","nama_tindakan","harga_tindakan"};
            ArrayList <String[]> tindak = db.SelectTable(field, "tbltindakan", null, null, null);
            for(int i = 0 ; i<tindak.size();i++)
            {
                 if (i == 0)
                 {
                     tin = "2|"+tindak.get(i)[0]+","+tindak.get(i)[1]+","+tindak.get(i)[2];
                 }
                 else
                 {
                     tin = tin+"|"+tindak.get(i)[0]+","+tindak.get(i)[1]+","+tindak.get(i)[2];
                 }
            }
        } catch (SQLException ex) {
            Logger.getLogger(frame_KotrolPasien.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
}
