import java.util.Date;
import java.net.*;
import java.io.*;
class urlConnectionTest
{ public static void main(String args[]) throws Exception
  {
	int c;
    URL addr = new URL("http://www.sogang.ac.kr/wwwnew/index2.html");
    URLConnection addrConnection = addr.openConnection();
    System.out.println("Document Type : " + addrConnection.getContentType());
    System.out.println("Last Modified : " + 									new Date(addrConnection.getLastModified()));
    int len = addrConnection.getContentLength();
    System.out.println("Document Length : " + len + "byte");
    if (len > 0)
    { System.out.println(" =====  Contents ======= ");
      InputStream input = addrConnection.getInputStream();
      int i = len;
      while (((c = input.read()) != -1) && (--i > 0))
      { System.out.print((char) c); }
      input.close(); }
    else
    { System.out.println("No Contents"); }
  }
}
