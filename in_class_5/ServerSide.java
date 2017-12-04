import java.io.*;
import java.net.*;
class ServerSide
{ public static void main(String args[])
  { try
    { int port = Integer.parseInt(args[0]);
      ServerSocket ss = new ServerSocket(port);
      while(true)
      { Socket s = ss.accept();
        OutputStream os = s.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
        for (int i = 1; i <= 10; i++)
         dos.writeInt(i);
        s.close();
    }}
    catch(Exception e)
    { System.out.println("Exception: " + e);
  }
}
}
