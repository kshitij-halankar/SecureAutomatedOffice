package proj;
import com.mysql.jdbc.PreparedStatement;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.net.*;
import java.io.*;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class Login extends javax.swing.JFrame
{

   
    public Login() {
        initComponents();
    }

   

  
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Pass = new javax.swing.JPasswordField();
        Submit = new javax.swing.JButton();
        UserName = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("User Name");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(310, 280, 104, 29);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Password");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(310, 320, 193, 22);

        Pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PassActionPerformed(evt);
            }
        });
        jPanel1.add(Pass);
        Pass.setBounds(520, 330, 173, 22);

        Submit.setBackground(new java.awt.Color(255, 51, 0));
        Submit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Submit.setForeground(new java.awt.Color(51, 51, 255));
        Submit.setText("Submit");
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });
        jPanel1.add(Submit);
        Submit.setBounds(320, 400, 162, 31);

        UserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserNameActionPerformed(evt);
            }
        });
        jPanel1.add(UserName);
        UserName.setBounds(520, 290, 173, 22);

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 255));
        jButton1.setText("Reset");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(530, 400, 149, 31);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proj/proj images/lock-256.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(370, -230, 1070, 750);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1063, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 749, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) 
{//GEN-FIRST:event_SubmitActionPerformed
String un="";
String ts;
String  key="";
 un=UserName.getText();
 char[] pw= Pass.getPassword();
String pw1 = String.copyValueOf(pw);

                                        
   if(UserName.getText().length()==0)  // Checking for empty field
      JOptionPane.showMessageDialog(null, "Empty fields detected ! Please fill up all fields");
   
else if(Pass.getPassword().length==0)  // Checking for empty field
      JOptionPane.showMessageDialog(null, "Empty fields detected ! Please fill up all fields");

   else{
       String user = UserName.getText();   // Collecting the input
     char[] pass = Pass.getPassword(); // Collecting the input
       String pwd = String.copyValueOf(pass); 
       

try
{
    System.out.println("hhhh"+un);
    System.out.println("hhhh"+pw1);
Socket s=new Socket("localhost",6666);

DataOutputStream d=new DataOutputStream(s.getOutputStream());
d.writeUTF(un);

d.writeUTF(pw1);
Timestamp ts1= new Timestamp(System.currentTimeMillis());
ts = new SimpleDateFormat("yyyy-mm-dd/HH:mm:ss.ms").format(ts1);
System.out.println(ts);
d.writeUTF(ts);
d.flush();

//d.close();
//s.close();
//}catch(Exception e){}














//try
//{  
   // ServerSocket ss=new ServerSocket(6667);  
   // Socket s1=ss.accept();
//establishes connection   
    DataInputStream dis=new DataInputStream(s.getInputStream());
    String check=dis.readUTF();
    if(check.equals("true"))
       {
           
           key=(String)dis.readUTF();   
    System.out.println("key= "+key);
        ts=(String)dis.readUTF();   
    System.out.println("TimeStamp= "+ts);
    Timestamp ts11= new Timestamp(System.currentTimeMillis());
ts = new SimpleDateFormat("yyyy-mm-dd/HH:mm:ss.ms").format(ts11);
    
  ServerSocket ss5=new ServerSocket(6667);  
    Socket s1=ss5.accept();
   // Socket s1=new Socket("localhost",6667);
 System.out.println("TimeStamp= client mmmmmmmmmm");
DataOutputStream d1=new DataOutputStream(s1.getOutputStream());
    d1.writeUTF(key);

d1.writeUTF(ts);
   d1.flush();

//d1.close();
//s1.close();
    
       // ServerSocket ssk=new ServerSocket(8898);  
    //Socket s1k=ssk.accept();  
     System.out.println("TimeStamp= client nnnnnnnnn");
     DataInputStream disk=new DataInputStream(s1.getInputStream());
    String checkk=disk.readUTF();
           
       
           
           if(checkk.equals("true"))
           {
           Main m=new Main();
m.setVisible(true);
dispose();

       }
         d1.close();
s1.close();  
       }
       else
       {
          JOptionPane.showMessageDialog(null, "Incorrect Login Credentials");
       varifier=0;
       }   
 d.close();
s.close();  

     
    }catch(Exception e){System.out.println(e);}  

// converting from array to string
     

       

  
   





    
 
    
}   
   
   
   
   
}//GEN-LAST:event_SubmitActionPerformed

    private void UserNameActionPerformed(java.awt.event.ActionEvent evt) 
{//GEN-FIRST:event_UserNameActionPerformed
        // TODO add your handling code here:
    }
//GEN-LAST:event_UserNameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) 
{//GEN-FIRST:event_jButton1ActionPerformed
UserName.setText("");
Pass.setText("");
        // TODO add your handling code here:
    }
//GEN-LAST:event_jButton1ActionPerformed

    private void PassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PassActionPerformed
       
 // TODO add your handling code here:
    }//GEN-LAST:event_PassActionPerformed

    /**
     * @param args the command line arguments
     */
    
public static void main(String args[]) {
 /*
String un="";
String ts;
String  key="";
//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
if(varifier==1)
{
try
{
Socket s=new Socket("localhost",6666);

DataOutputStream d=new DataOutputStream(s.getOutputStream());

un=UserName.getText();
d.writeUTF(un);
char[] pw= Pass.getPassword();
String pw1 = String.copyValueOf(pw);
d.writeUTF(pw1);
Timestamp ts1= new Timestamp(System.currentTimeMillis());
ts = new SimpleDateFormat("yyyy-mm-dd/HH:mm:ss.ms").format(ts1);
System.out.println(ts);
d.writeUTF(ts);
d.flush();
 System.out.println("testtttttt 4");
//d.close();
//s.close();
//}catch(Exception e){}

  //  try
//{  
    ServerSocket ss=new ServerSocket(6666);  
    Socket s1=ss.accept();
//establishes connection   
    DataInputStream dis=new DataInputStream(s1.getInputStream());  
    key=(String)dis.readUTF();   
    System.out.println("key= "+key);
        ts=(String)dis.readUTF();   
    System.out.println("TimeStamp= "+ts);

    ss.close();  
    }catch(Exception e){System.out.println(e);}  
 
    
}   
    
    
    
    */
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
          
      if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        
} catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });

    }
static int  varifier=0;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JPasswordField Pass;
    private static javax.swing.JButton Submit;
    public static javax.swing.JTextField UserName;
    private static javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
