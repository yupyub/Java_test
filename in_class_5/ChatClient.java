import java.io.*;
import java.net.*;

class ChatterManager {
	private String serverIP;
	private int serverPort;
	private Socket clientSocket;
	private BufferedReader br;
	private PrintWriter pw;
	private BufferedReader keyboard;

	ChatterManager(String serverIP, int serverPort) {
		try {this.serverIP = serverIP;
		this.serverPort = serverPort;
		clientSocket = new Socket(serverIP, serverPort);
		br = new BufferedReader( new InputStreamReader( clientSocket.getInputStream()));
		pw = new PrintWriter(new BufferedWriter( new 							OutputStreamWriter(clientSocket.getOutputStream())));
		keyboard = new BufferedReader(new InputStreamReader(System.in, "KSC5601"));
		(new readSocketThread()).start();
		(new writeSocketThread()).start();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	class readSocketThread extends Thread {
		public void run() {
			try { while(true) {  System.out.println(br.readLine());  }
			}catch (Exception e) { System.out.println(e.toString()); }
		}
	}
class writeSocketThread extends Thread {
		String inputString = null;
		public void run() {
			try{ 	while ( (inputString = keyboard.readLine()) != null) {
					pw.println(inputString);
					pw.flush(); }
			}  catch (Exception e ) {  System.out.println(e.toString()); }
		}
	}
}
public class ChatClient {
	public static void main (String [] args) {
		if (args.length < 2 ) {
			System.out.println("Usage : java ChatServer ip port#");
			return;
		}
		ChatterManager cm = new ChatterManager(args[0], Integer.parseInt(args[1]));
	}
}
