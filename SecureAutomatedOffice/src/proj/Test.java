/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proj;

import java.io.DataOutputStream;
import java.net.Socket;

/**
 *
 * @author Kushal
 */
public class Test {
    
    
    public static void main(String aegs[])
    {
    
    
  try
  {
    
    Socket s1=new Socket("localhost",7000);
  DataOutputStream d1=new DataOutputStream(s1.getOutputStream());
  d1.writeUTF("hello");
  
  
  
  }catch(Exception e){}
  }
}