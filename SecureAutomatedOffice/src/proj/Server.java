package proj;   
import java.io.*;  
    import java.net.*;  
import java.sql.*;
    public class Server 
{    
        public static int tt=0;
      
  
        
         
        
        
        
        
        
public String MD5(String md5) {
   try {
        java.security.MessageDigest md = java.security.MessageDigest.getInstance("MD5");
        byte[] array = md.digest(md5.getBytes());
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < array.length; ++i) {
          sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100).substring(1,3));
       }
        
        return sb.toString();
    } catch (java.security.NoSuchAlgorithmException e) {
    }
    return null;
}









 public static void main(String[] args) throws Exception
{  
    
    System.out.println("welcome to main of server");
     String  un="",pw="", ts="",check="";
String key="",key1="";
      
while(true)
{
        
    try
{  
    ServerSocket ss=new ServerSocket(6666);  
    Socket s=ss.accept();
//establishes connection   
    DataInputStream dis=new DataInputStream(s.getInputStream());  
     
   
    un=(String)dis.readUTF();   
    System.out.println("username= "+un);
    pw=(String)dis.readUTF();  
    
    Class.forName("com.mysql.jdbc.Driver"); 
 // MySQL database connection
       Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","password"); 
    
       com.mysql.jdbc.PreparedStatement pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement("Select * from logint where un=? and pw=?");
       pst.setString(1,un); 
 
      pst.setString(2,pw);
       
       ResultSet rs = pst.executeQuery();                 
       
       if(rs.next())   
       {
            
      check="true";
      
       }
       else
           check="false";  
    
    
    
    
    
 
    System.out.println("password= "+pw);
    
    ts=(String)dis.readUTF();   
    System.out.println("timestamp= "+ts);
    ss.close();  
    //}catch(Exception e){System.out.println(e);}  

key=un+" "+pw+" "+ts;

Server a=new Server();
key1=a.MD5(key);
//try{  
    System.out.println("Serever response");
   // Socket s1=new Socket("localhost",6667);   
    DataOutputStream d1=new DataOutputStream(s.getOutputStream());
d1.writeUTF(check);
d1.writeUTF(key1);
d1.writeUTF(ts);
d1.flush();
d1.close();
s.close();
}catch(Exception e){}

try{     
System.out.println(" SUCCESS!\n");
Connection conn = null;
   Statement stmt = null;
   conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","password");
 System.out.print("\nInserting records into table...");
        stmt = conn.createStatement();

 String sql = "INSERT INTO mins " +
            "VALUES ('"+key+"','"+ts+"')";
        stmt.executeUpdate(sql);

        System.out.println(" SUCCESS!\n");


}catch(SQLException se) {
        se.printStackTrace();
}

   }
    }

  
}
      