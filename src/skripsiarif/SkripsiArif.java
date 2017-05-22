/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package skripsiarif;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hernanda
 */
public class SkripsiArif {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          frame_Antrian f = new frame_Antrian();
          f.setVisible(true);
          ServerSocket serverSocket;
          
        try {
            serverSocket = new ServerSocket(1000);
            while (true)
                {
                    Date tgl = new Date();
                    SimpleDateFormat tahun = new SimpleDateFormat("yyMMddhhmmss");
                    Socket clientSocket = serverSocket.accept(); 
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                    String command = bufferedReader.readLine();
                    String g = command;
                    System.out.println(g);
                    
                }
        } catch (IOException ex) {
           // Logger.getLogger(Get_data.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
