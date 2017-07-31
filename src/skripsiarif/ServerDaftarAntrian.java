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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Hernanda
 */
public class ServerDaftarAntrian implements Runnable{

   public frame_daftarAntrian fa;
   public int port;
    public void run(){  
        try {
            System.out.println("jalan");
            ServerSocket serverSocket = new ServerSocket(port);
            while (true)
                {
                    Socket clientSocket = serverSocket.accept(); 
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                    String command = bufferedReader.readLine();
                    pesan(command);
                    System.out.println(command);
                }
        } catch (IOException ex) {
             System.out.println("error");
        }
    }
    public void pesan(String data)
    {
        String [] dapat = data.split("[|]");
        if(dapat[0].equalsIgnoreCase("0"))
        {
            if(dapat.length > 2)
            {
                fa.id = dapat[1];
                fa.nama = dapat[2];
                fa.alamat = dapat[3];
                fa.lblNama.setText(dapat[2]);
                fa.lblAlamat.setText(dapat[3]);
                fa.lblDeposit.setText(dapat[5]);
            }else 
            {
                 JOptionPane.showMessageDialog(fa,"Data tidak ditemukan"+ dapat[1]);
            }
        }
        else if(dapat[0].equalsIgnoreCase("1"))
        {
            JOptionPane.showMessageDialog(fa,"Anda Nomor Antrian ke : "+ dapat[1]);
        }
    }
    
  
}
