package javaapplication1;

import com.jcraft.jsch.*;

public class valid{
    int valid(String host,String user,int port,String passwd){
    try{
      JSch jsch=new JSch();
      Session session=jsch.getSession(user, host, port);
      session.setPassword(passwd);
      java.util.Properties config = new java.util.Properties();
      config.put("StrictHostKeyChecking", "no");
      session.setConfig(config);
      session.connect();
    }
    catch(Exception e){
      System.out.println(e);
      return 0;
    }
      return 1;
  }
}