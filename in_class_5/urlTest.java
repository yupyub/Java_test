import java.net.*;
class urlTest
{ public static void main(String args[]) throws MalformedURLException
  {
	URL location = new URL("http://sogang.ac.kr");
    System.out.println("protocol : " + location.getProtocol());
    System.out.println("port : " + location.getPort());
    System.out.println("host : " + location.getHost());
    System.out.println("file : " + location.getFile());
    System.out.println("URL " + location.toExternalForm());
  }
}
