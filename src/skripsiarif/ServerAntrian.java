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
import static skripsiarif.Server.config;

/**
 *
 * @author Hernanda
 */
public class ServerAntrian implements Runnable{

   public frame_Antrian fa;
   public ArrayList <String> antrianpoli1;
   public ArrayList <String> antrianpoli2;
   public ArrayList <String> antrianpoli3;
   public ArrayList <String> antrianpoli4;
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
            Config();
            int port = Integer.parseInt(config.get("portantrian"));
            ServerSocket serverSocket = new ServerSocket(port);
            while (true)
                {
                    Socket clientSocket = serverSocket.accept(); 
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                    String command = bufferedReader.readLine();
                    pesan(command);
                    System.out.println(command);
                    //poli|ID|IDSELANJUTNYA
                }
        } catch (IOException ex) {
             System.out.println("error");
        }
    }
    public void pesan(String data)
    {
        String [] pecah = data.split("[|]");
        if(pecah[0].equalsIgnoreCase("0"))
        {
          fa.lblAntrian.setText(pecah[1]);
          fa.lblSelanjutnya.setText(pecah[2]);
        }
        else if(pecah[0].equalsIgnoreCase("1")){
          fa.lblAntrian1.setText(pecah[1]);
          fa.lblSelanjutnya1.setText(pecah[2]);
        }
        else if(pecah[0].equalsIgnoreCase("2")){
          fa.lblAntrian3.setText(pecah[1]);
          fa.lblSelanjutnya3.setText(pecah[2]);
        }
        else if(pecah[0].equalsIgnoreCase("3")){
          fa.lblAntrian2.setText(pecah[1]);
          fa.lblSelanjutnya2.setText(pecah[2]);
        }
    }
    
  
}
