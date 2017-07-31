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
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hernanda
 */
public class ServerObat implements Runnable{
    
   public static HashMap<String,String> config = new HashMap<String,String> (); 
   
   public ArrayList<String[]> bigdata = new ArrayList<>();
  DefaultTableModel datasource;
   public frameObat fa;
   public int port;
     public void run(){  
        try {
            System.out.println("jalan");
            Config();
            int ports = Integer.parseInt(config.get("portobat"));
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
     
    public void pesan(String data)
    {
        String [] dapat = data.split("[|]");
        if(dapat[0].equalsIgnoreCase("0"))
        {
            JOptionPane.showMessageDialog(fa, "Data berhasil di ubah");
        } 
        else if(dapat[0].equalsIgnoreCase("1"))
        {
            //terima
            // stat|nama|stok|satuan
            datasource = new DefaultTableModel(new String[]{"idobat","namaobat","stok","satuan","`update`"},0);
            System.out.println(dapat.length);
            for(int j = 1 ; j<dapat.length;j++)
            {
                String [] da = dapat[j].split(",");
                bigdata.add(da);
                datasource.addRow(da);
            }
            
            fa.tblObat.setModel(datasource);
            
        }else if(dapat[0].equalsIgnoreCase("2"))
        {
            //Hapus
            // stat|id
            
        }else if(dapat[0].equalsIgnoreCase("3"))
        {
            //ambil data
            //stat|id,nama,stok,satuan,update
        }
    }
}
