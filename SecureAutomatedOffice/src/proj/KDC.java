import java.sql.*;
import java.util.*;   
 import java.io.*;  
    import java.net.*;  
    public class KDC
{  
    public static void main(String[] args)
{  
    
 String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
String DB_URL = "jdbc:mysql://localhost:3306/login";

// Database credentials
String USER = "root";
String PASS = "password";
String  key="",ts="",checkk="";
    
while(true)
{
    System.out.println("Wekcome to KDC");
try
{  
    Socket s5=new Socket("localhost",6667);
  //  ServerSocket ss5=new ServerSocket(6667);  
   // Socket s5=ss5.accept();
    System.out.println("listening kdc");
//establishes connection   
    DataInputStream dis=new DataInputStream(s5.getInputStream());  
    key=(String)dis.readUTF();   
 ts=(String)dis.readUTF();   
 System.out.println(key);
 System.out.println(ts);
 String hr=ts.substring(11,2);
 String min=ts.substring(14,2);
 int hr1=Integer.parseInt(hr);
 int min1=Integer.parseInt(min);
 
 System.out.println(hr1);
 System.out.println(min1);
 
 int dhr=0,dmin=0;
 int fhr=hr1-dhr;
 if(fhr>0)
 {
 int cmin=60-dmin;
 int fmin=cmin+min1;
 
 if(fmin<=10)
 {
 
 
 
 }
 
 
 }
 else{
 
 int fmin=min1-dmin;
 if(fmin<=10)
 {
 
 
 
 }
 
 
 
 
 
 }
    //Socket s1=new Socket("localhost",8898);
    DataOutputStream d1=new DataOutputStream(s5.getOutputStream());
 System.out.println("key= "+key);
    System.out.println("key= "+ts);

    Class.forName("com.mysql.jdbc.Driver"); 
 // MySQL database connection
       Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","password"); 
    
       com.mysql.jdbc.PreparedStatement pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement("Select * from mins where key=?");
       pst.setString(1,key); 
 
      //pst.setString(2,ts);
       
       ResultSet rs = pst.executeQuery();                 
        String tsv="";
        while (rs.next()) {
             tsv = rs.getString("ts");
            
        }
       System.out.println(tsv);
       
       
       if(rs.next())   
       {
            
      checkk="true";
      
       }
       else
           checkk="false";  
   
    d1.writeUTF(checkk);
    
    
    s5.close();  
    }catch(Exception e){System.out.println(e);}  


    

}
    }  
    }  