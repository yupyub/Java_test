import java.io.*;
import java.net.*;
class ClientSide    //java ClientSide (IPnum) (Portnum)
{ public static void main(String args[])
  { try
    { String server = args[0];
      int port = Integer.parseInt(args[1]);
      Socket c = new Socket(server, port);
      InputStream is = c.getInputStream();
      DataInputStream dis = new DataInputStream(is);
      for (int i = 1; i <= 10; i++)
      { int j = dis.readInt();
        System.out.println("data from server " + j);
      }
      c.close();}
    catch(Exception e)
    { System.out.println("Exception: " + e);
 }
}
}
