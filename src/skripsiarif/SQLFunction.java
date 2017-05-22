/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package skripsiarif;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author Volkswagen
 */
public class SQLFunction {
private Connection koneksi;

    public Connection openConnection(String host, String port, String dbname, String user, String pass){

        String url = "jdbc:mysql://"+host+":"+port+"/"+dbname+"?zeroDateTimeBehavior=convertToNull";
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            this.koneksi = DriverManager.getConnection(url,user,pass);
           // JOptionPane.showMessageDialog(null,"Connection is success","Congratulation",JOptionPane.INFORMATION_MESSAGE);

        }catch(ClassNotFoundException x)
        {
//           JOptionPane.showMessageDialog(null,"Driver Not Found",
//                   "Sorry,please try again",JOptionPane.ERROR_MESSAGE);
        }catch(SQLException y)
        {
//            JOptionPane.showMessageDialog(null,"Something wrong with your database",
//                    "Sorry,please try again",JOptionPane.ERROR_MESSAGE);
            y.printStackTrace();
        }

        return koneksi;
    }

    public void closeConnection(){

        try {
            koneksi.close();
//              JOptionPane.showMessageDialog(null,"Connection successfully closed",
//                      "Congratulation",JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null,"please try again",
//                    "Sorry please try again", JOptionPane.INFORMATION_MESSAGE);
        }

    }
     public void selectFunction(){





    }
     public String insertFunction(String tblname, String fields[], String values[]){

        String AllFields ;
        String AllValues ;

        AllFields = "(";
        AllValues = "(";

        int jmlField = fields.length-1;

        for (int i =0; i<=jmlField; i++)
        {
            AllFields = AllFields + fields[i];
            AllValues = AllValues + "'" + values[i] + "'";
            if(i<jmlField)
            {
                AllFields+= ",";
                AllValues+= ",";
            }
        }

        AllFields = AllFields + ")";
        AllValues = AllValues + ")";

        String query = "INSERT INTO "+ tblname +" " + AllFields + " values " + AllValues;
        return query;
    }
    public void updateFunction(){}

    public void deleteFunction(){}


    public void execute(String query, Connection con)
    {
        Statement stmt ;
        System.out.println(query);
         try{
                stmt = con.createStatement();
                int jml = stmt.executeUpdate(query);
         }catch(SQLException ex){
            ex.printStackTrace();
         }
    }

//    public Connection getConnection()
//    {
//        frmKoneksi fK =  new frmKoneksi();
//        return fK.getConnect();
//    }

}
        
