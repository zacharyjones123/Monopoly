package ui;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class HttpWebServer implements Runnable{
	private ServerSocket s;
	private int port = 0;
	private HttpRequest clientRequest;
	private Monopoly monopoly;
	private String main_url; //main website html code
	private String personal_url; //personal player website html code
	private Player[] players;
	public HttpWebServer(){
		
	}
	public void setPlayerList(Player[] p){
		players = p;
	}
	public HttpWebServer(int port, Monopoly mon) throws IOException{
		this.monopoly = mon;
		System.out.println("Beginning server now!");
		try{
			FileReader fr = new FileReader("main.htm");
			BufferedReader br = new BufferedReader(fr);
			System.out.println("Found the file!");
			main_url = "";
			while(true){
				String temp = br.readLine();
				if(temp == null)
					break;
				else
					main_url += temp;
			}
			br.close();
			
			/*fr = new FileReader("player.htm");
			br = new BufferedReader(fr);
			System.out.println("Found the second file!");
			personal_url = "";
			while(true){
				String temp = br.readLine();
				if(temp == null)
					break;
				else
					personal_url += temp;
			}
			br.close();
			//now change some contents of file appropriately!
		*/	
		}
		catch(FileNotFoundException fne){
			System.out.println("Did not find file!");
			return;
		}

		this.port = port;
		s = new ServerSocket(port);
		new Thread(this).start();
	}
	//public static void main(String[] args) throws Exception { //expected to be given port number
		//new HttpWebServer(Integer.parseInt(args[0]));
		//new HttpWebServer(Integer.parseInt("8080"));
	//}
	
	public void ServeForever(){
		if(port == 0)
			throw new IllegalArgumentException("Failed to provide a port number!");
		while(true){
			try{
			Socket clientSocket = s.accept();
			System.out.println("Received connection:");
			DataOutputStream dos = new DataOutputStream(clientSocket.getOutputStream());
			DataInputStream dis = new DataInputStream(clientSocket.getInputStream());
			String recv = "";
			while(true){
					String temp = dis.readLine();
					System.out.println(temp);
					if(temp == null || temp.isEmpty())
						break;
					recv += temp + "\n";
			}
			System.out.println("This is request:");
			System.out.println(recv);
			clientRequest = new HttpRequest(recv);
			System.out.println("add:" + Inet4Address.getLocalHost().toString());
			if(clientRequest.getFileName().isEmpty()){
				System.out.println("*******Redirecting******");
				dos.writeUTF("HTTP/1.1 302 Found\r\nLocation: " +"/index.htm\r\n");
			}
			System.out.println("Came back son!");
			//find out if url matches , get proper file, replace elements, and send it out!
			//I am the thunder, the lightning, and the river
			dos.writeUTF(main_url);
			//end of strategy
			clientSocket.close();
			}
			catch(Exception e){;}
		}
	}
	
	public void handleRequest(){
		return;
	}
	
	public void setPort(){}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Web server beginning!");
		ServeForever();
	}


}
