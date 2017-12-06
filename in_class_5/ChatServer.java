import java.io.*;
import java.net.*;
import java.util.*;

class Chatter{
	private Socket clientSocket;
	private BufferedReader br;
	private PrintWriter pw;
	private ChatRoom chatRoom;
	private String chatterID;

	Chatter (ChatRoom chatRoom, Socket clientSocket, String chatterID) {
		System.out.println ("Chatter gets created : " + chatterID);

	try
	{
		this.chatRoom = chatRoom;
		this.clientSocket = clientSocket;
		this.chatterID = chatterID;
		br = new BufferedReader (new InputStreamReader 					(clientSocket.getInputStream()));
		pw= new PrintWriter(new BufferedWriter(new 						OutputStreamWriter(clientSocket.getOutputStream())));
		(new readSocketThread()).start();
		} catch (Exception e) { System.out.println(e.toString()); }
	}
	public void sendMessage(String message) {
		pw.println(message);
		pw.flush();
	}

class readSocketThread extends Thread {
		String inputString = null;
		public void run() {
			try {
				while (true) {
					inputString = br.readLine();
					chatRoom.chatEveryChatter(inputString);
				}
			} catch ( Exception e ) { System.out.println(e.toString()); }
		}
	}
}
class ChatRoom {
	private String roomName;
	private Vector joinChatters = new Vector();
	private Chatter roomMaker;

	ChatRoom(String roomName) {
		System.out.println("room is ready. : " + roomName);
		this.roomName = roomName;
		this.roomMaker = null;
	}
	public synchronized void joinChatter( Chatter chatter ) {
		joinChatters.add(chatter);
	}
	public synchronized String getName() {
		return roomName;
	}
	public synchronized void chatEveryChatter(String message ) {
		for ( int i = 0 ; i < joinChatters.size() ; i++) {
			((Chatter)joinChatters.get(i)).sendMessage(message);
		}}
	public int size() {
			return joinChatters.size() ;
	}
}
class ChatRoomManager {
	private Vector chatRooms = new Vector();

	ChatRoomManager() {
		System.out.println("ChatRoomManager Starting. ");
		chatRooms.add(new ChatRoom("waiting room"));
		}

	public void makeRoom(String roomName) {	}

	public void deleteRoom(String roomName) {	}

	public void enterRoom(String roomName, Socket clientSocket) {
		Chatter chatter = null;
		ChatRoom tempRoom = null;
		boolean exitFor = false;
		for ( int i = 0; exitFor == false && i < chatRooms.size(); i++ ) {
			tempRoom = (ChatRoom)chatRooms.get(i);
			if (tempRoom.getName().equals(roomName)) {
				chatter = new Chatter(tempRoom, clientSocket, 					String.valueOf(tempRoom.size() + 1));
				tempRoom.joinChatter(chatter);
				exitFor = true;
			}
		}
	}
	public void exitRoom(Chatter chatter) { }
}
class ChatManager {
	private int serverPort;
	private ServerSocket serverSocket;
	private ChatRoomManager chatRoomManager;
	ChatManager(int serverPort ) {
		System.out.println("Chatting Manager Starting");
		try {
			this.serverPort = serverPort;
			chatRoomManager = new ChatRoomManager();
			serverSocket = new ServerSocket(serverPort);

			new listenerThread().start();
		} catch (Exception e) {
			System.out.println(e.toString()); }
	}
class listenerThread extends Thread {
		private boolean stopListener = false;
		Socket clientSocket = null;
		public void run() {
			try {   while ( !stopListener ) {
				System.out.println("Waiting Client.");
				clientSocket = serverSocket.accept();
				chatRoomManager.enterRoom("waiting room",clientSocket);
				System.out.println("Connection Established form : " + 				clientSocket.getInetAddress().getHostAddress());
				}
			} catch (Exception e ) { System.out.println(e.toString()); }
		}
	}
}
public class ChatServer {

	public static void main(String [] args) {
		if (args.length < 1 ) {
			System.out.println("Usage : Java ChatServer port:#");
			return;
		}

		System.out.println("Chatt;ng Server Starting. ");
		ChatManager cm = new ChatManager(Integer.parseInt(args[0]));
	}
}
