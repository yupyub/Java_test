import java.net.*;
class AddressTest
{ public static void main(String args[])
  throws UnknownHostException
  { InetAddress Address = InetAddress.getLocalHost();
    System.out.println("Local Host Name : " + Address.getHostName());
    System.out.println("Local Host IP Address : " + Address.getHostAddress());
    Address = InetAddress.getByName("sogang.ac.kr");
    System.out.println("sogang.ac.kr's computer name and IP Address : " + Address);
    InetAddress sw[] = InetAddress.getAllByName("www.ibm.com");
    for (int i = 0; i < sw.length; i++)
      System.out.println(sw[i]);
  }
}
