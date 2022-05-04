import java.sql.*;
import java.io.*;  
    import java.net.*;  
    public class Server1 
{  
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
    public static void main(String[] args)
{  

String un1="abc";
String pw1="123";
String  un="",pw="", ts="";
String key="",key1="";
    try
{  
    ServerSocket ss=new ServerSocket(6666);  
    Socket s=ss.accept();
//establishes connection   
    DataInputStream dis=new DataInputStream(s.getInputStream());  
    un=(String)dis.readUTF();   
    System.out.println("username= "+un);
    pw=(String)dis.readUTF();   
    System.out.println("password= "+pw);
    ts=(String)dis.readUTF();   
    System.out.println("timestamp= "+ts);
    ss.close();  
    }catch(IOException e){System.out.println(e);}  

if((un == null ? un1 == null : un.equals(un1)) && (pw == null ? pw1 == null : pw.equals(pw1)))
{   System.out.println("match"); }
else
{   System.out.println("error"); }

key=un+" "+pw+" "+ts;

Server1 a=new Server1();
key1=a.MD5(key);
try{  
    Socket s1=new Socket("localhost",6666);
//establishes connection   
    DataOutputStream d1=new DataOutputStream(s1.getOutputStream());

d1.writeUTF(key1);
d1.writeUTF(ts);
d1.flush();
d1.close();
s1.close();
}catch(Exception e){}

 try{           
       Class.forName("com.mysql.jdbc.Driver"); 
 // MySQL database connection
       Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","12345678"); 
   
       
// create a sql date object so we can use it in our INSERT statement 

// the mysql insert statement 
String query = " insert into Mins (key,time)" + " values (?, ?)"; 
// create the mysql insert preparedstatement 
PreparedStatement preparedStmt = conn.prepareStatement(query);
 preparedStmt.setString (1, key1); 
preparedStmt.setString (2, ts); 
preparedStmt.execute(); 
conn.close(); } catch (Exception e) { System.err.println("Got an exception!"); 
System.err.println(e.getMessage());
 }

    }  
    }  