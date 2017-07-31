package skripsiarif;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;

/**
 *
 * @author Hernanda-snoop
 */
public class dbaccess {
    
    public static Vector dataTemp[];
    public static String sql;
    static Connection con;
    SQLFunction SF = new SQLFunction();
    public dbaccess()
    {
         con = SF.openConnection("127.0.0.1", "3306", "db_puskesmas", "root", ""); 
    }
    //con = SF.openConnection("202.138.226.2", "3306", "snoopco_application", "snoopco_hernanda", "bebas123");
    //con = SF.openConnection("192.168.2.88", "3306", "snoop", "root", "astasn00pasta");
    public static boolean AutoHapus(Connection con,String table,String where)throws SQLException
    {
        if(where!=null)
        {
            Statement stmt;
            sql = "Delete From "+table+" ";
            sql = sql +"Where "+ where ; 
      //      System.out.println(sql);
            try{
                stmt = con.createStatement();
                stmt.executeUpdate(sql);
               }catch(SQLException e){
                e.printStackTrace();
       //         System.out.println("Data Gagal Di Hapus !");
            }
            return true;
        }
       return false;
    }
    public static boolean AutoInsert(String [][]data,String table) throws SQLException
    {
        
        //SQLFunction SF = new SQLFunction();
        //con = SF.openConnection("202.138.226.2", "3306", "snoopco_application", "snoopco_hernanda", "bebas123");
        //con = SF.openConnection("192.168.2.88", "3306", "snoopco_application", "root", "astasn00pasta");
         //con = SF.openConnection("192.168.2.90", "3306", "nanda_db", "root", "astalapulsa");
        Statement stmt;
        ResultSet rs;
        int i;
        sql = "INSERT INTO "+table+"( ";
   
        for(i=0;i<data.length;i++)
        {
            sql = sql+"`"+data[i][0]+"`";
            if(i<data.length-1)
            {
                sql = sql+",";
            }
        }
        sql = sql+") VALUES( ";
         for(i=0;i<data.length;i++)
        {
            sql = sql+"'"+data[i][1]+"'";
            if(i<data.length-1)
            {
                sql = sql+",";
            }
        }
         sql=sql+" )";
        System.out.println(sql);
        try{
            stmt = con.createStatement();
            stmt.executeUpdate(sql);
           }catch(SQLException e){
           // javax.swing.JOptionPane.showMessageDialog(null, "Data Gagal Di Masukan !","Informasi",javax.swing.JOptionPane.INFORMATION_MESSAGE);
            e.printStackTrace();
       //     System.out.println("Data Gagal Di Masukan !");
        }
       return true;
       
    }
    
      public static boolean AutoUpdate(String [][]data,String table , String where) throws SQLException
    {
        //Client_control.con = SF.openConnection("202.138.226.2", "3306", "snoopco_application", "snoopco_hernanda", "bebas123");
       //con = SF.openConnection("192.168.2.88", "3306", "snoopco_application", "root", "astasn00pasta");
        Statement stmt;
        ResultSet rs;
        int i;
        sql = "UPDATE "+table+" SET ";

        for(i=0;i<data.length;i++)
        {
            if(data[i][0]==null)
            {
                break;
            }else
            {
                sql = sql+""+data[i][0]+" = '"+data[i][1]+"'";
                if(i<data.length-1&&data[i+1][0]!=null)
                {
                    sql = sql+",";
                }
            }

        }
        sql = sql +"Where "+ where ; 
        System.out.println(sql);
        try{
            stmt = con.createStatement();
            stmt.executeUpdate(sql);
           }catch(SQLException e){
        //       System.out.println("Data Gagal Di Masukan !");
          //  javax.swing.JOptionPane.showMessageDialog(null, "Data Gagal Di Masukan !","Informasi",javax.swing.JOptionPane.INFORMATION_MESSAGE);
            e.printStackTrace();
        }
       return true;
       
    }
    public static String SelectTable2(Connection con,String [] Field,String Table,String  Where,String join, String order ) throws SQLException
    {
      
        Statement stmt;
        ResultSet rs;
        String balik = null;
        int i;
        
        sql = "SELECT ";
   
        for(i=0;i<Field.length;i++)
        {
            if(Field[i]!=null)
            {
                sql = sql+Field[i];
                if(i<Field.length-1&&Field[i+1]!=null)
                {
                    sql = sql+",";
                }
            }
        }
        sql = sql+" FROM "+Table+" ";
        
        if(join!= null&& join != "")
        {
             sql = sql+" "+join;
        }
          
        if(Where!= null&&Where!= "")
        {
             sql = sql+" WHERE "+Where;
        }
        if(order!= null&&order!= "")
        {
             sql = sql+" Order by "+order;
        }
       
      //  System.out.println(sql);
        try{
             stmt = con.createStatement(ResultSet.CONCUR_READ_ONLY, ResultSet.TYPE_SCROLL_SENSITIVE);
             rs = stmt.executeQuery(sql);
             rs.last();
             rs.beforeFirst();
             rs.next();
             balik = String.valueOf(rs.getObject(1));
           }catch(SQLException e){
         //      System.out.println("Data Tidak Ditemukan !");
         }
       return balik;
    }
    
     public static Vector [] SelectTable3(String [] Field,String Table,String  Where,String join, String order ) throws SQLException
    {
      
        Statement stmt;
        ResultSet rs;
        int i;
        
        sql = "SELECT ";
   
        for(i=0;i<Field.length;i++)
        {
            if(Field[i]!=null)
            {
                sql = sql+Field[i];
                if(i<Field.length-1&&Field[i+1]!=null)
                {
                    sql = sql+",";
                }
            }
        }
        sql = sql+" FROM "+Table+" ";
        
        if(join!= null&& join != "")
        {
             sql = sql+" "+join;
        }
          
        if(Where!= null&&Where!= "")
        {
             sql = sql+" WHERE "+Where;
        }
        if(order!= null&&order!= "")
        {
             sql = sql+" Order by "+order;
        }
       
        System.out.println(sql);
        try{
             stmt = con.createStatement(ResultSet.CONCUR_READ_ONLY, ResultSet.TYPE_SCROLL_SENSITIVE);
             rs = stmt.executeQuery(sql);
             ResultSetMetaData rsmd = rs.getMetaData();
             int cols = rsmd.getColumnCount();
             rs.last();
             int rows = rs.getRow();
             dataTemp = new Vector[rows];
             rs.beforeFirst();
             i = 0;
              while (rs.next())
                  {
                      dataTemp[i] = new Vector();
                     for (int z=1;z<=cols;z++) {
                          dataTemp[i].addElement(String.valueOf(rs.getObject(z)));
                     }
                      i++;
                  }
           }catch(SQLException e){
              // System.out.println("Data Tidak Ditemukan !");
           // javax.swing.JOptionPane.showMessageDialog(null, "Data Tidak Ditemukan !","Informasi",javax.swing.JOptionPane.INFORMATION_MESSAGE);
            return dataTemp;
        }
       return dataTemp;
    }
      public static ArrayList <String[]> SelectTable(String [] Field,String Table,String  Where,String join, String order ) throws SQLException
    {
        ArrayList <String[]> result = new ArrayList<String[]>();
        Statement stmt;
        ResultSet rs;
        int i;
        
        sql = "SELECT ";
   
        for(i=0;i<Field.length;i++)
        {
            if(Field[i]!=null)
            {
                sql = sql+Field[i];
                if(i<Field.length-1&&Field[i+1]!=null)
                {
                    sql = sql+",";
                }
            }
        }
        sql = sql+" FROM "+Table+" ";
        
        if(join!= null&& join != "")
        {
             sql = sql+" "+join;
        }
          
        if(Where!= null&&Where!= "")
        {
             sql = sql+" WHERE "+Where;
        }
        if(order!= null&&order!= "")
        {
             sql = sql+" Order by "+order;
        }
       
        System.out.println(sql);
        try{
             stmt = con.createStatement(ResultSet.CONCUR_READ_ONLY, ResultSet.TYPE_SCROLL_SENSITIVE);
             rs = stmt.executeQuery(sql);
             ResultSetMetaData rsmd = rs.getMetaData();
             int cols = rsmd.getColumnCount();
             
             rs.last();
             int rows = rs.getRow();
             rs.beforeFirst();
             i = 0;
              while (rs.next())
                  {
//                      dataTemp[i] = new Vector();
//                     for (int z=1;z<=cols;z++) {
//                          dataTemp[i].addElement(String.valueOf(rs.getObject(z)));
//                     }
//                      i++;
                       String[] row = new String[cols];
                        for (int d=0; d <cols ;d++)
                        {
                           row[d] = rs.getString(d + 1);
                        }
                        result.add(row);
                  }
           }catch(SQLException e){
       //        System.out.println("Data Tidak Ditemukan !");
           // javax.swing.JOptionPane.showMessageDialog(null, "Data Tidak Ditemukan !","Informasi",javax.swing.JOptionPane.INFORMATION_MESSAGE);
            return result;
        }
       return result;
    }
 
    public static Vector[] Select(ArrayList x)
    {
        
        return dataTemp;
    }
}
