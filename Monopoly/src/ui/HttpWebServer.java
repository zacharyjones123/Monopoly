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
import java.util.Date;

public class HttpWebServer implements Runnable{
	private ServerSocket s;
	private int port = 80;
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
			FileReader fr = new FileReader("resources\\main.htm");
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
				dos.writeUTF("HTTP/1.1 302 Found\r\nLocation: " +"/index\r\n");
				dos.close();
				continue;
				//return + socket close?
			}
			System.out.println("Came back son!");
			//find out if url matches , get proper file, replace elements, and send it out!
			//I am the thunder, the lightning, and the river
			if (clientRequest.getFileName().equals("index"))
			{
				System.out.println("it works");
			HttpResponse resp = new HttpResponse();
			resp.setStatus(200);
			String temp_url = main_url;
			temp_url = temp_url.replace("Sean", monopoly.players[0].getName());
			temp_url = temp_url.replace("Isaiah", monopoly.players[1].getName());
			temp_url = temp_url.replace("Zach", monopoly.players[2].getName());
			temp_url = temp_url.replace("Bailey", monopoly.players[3].getName());
			temp_url = temp_url.replace("$100", Integer.toString(monopoly.players[0].getMoney()));
			temp_url = temp_url.replace("$200", Integer.toString(monopoly.players[1].getMoney()));
			temp_url = temp_url.replace("$344", Integer.toString(monopoly.players[2].getMoney()));
			temp_url = temp_url.replace("$522", Integer.toString(monopoly.players[3].getMoney()));
			
			resp.setLength(temp_url.length());
			System.out.println("truh");
			//resp.date = new Date().toString(); 
			//gorogoghg
			System.out.println("\n\n"+resp+"\n\nCatter");
			//geghh
			dos.writeUTF(resp +temp_url);
			//end of strategy
			clientSocket.close();
			}
			else if (clientRequest.getFileName().equals(monopoly.players[0]) || clientRequest.getFileName().equals(monopoly.players[1]) || clientRequest.getFileName().equals(monopoly.players[2]) || clientRequest.getFileName().equals(monopoly.players[3]))
			{
				HttpResponse resp = new HttpResponse();
				resp.setStatus(200);
				//personal_url.replace
				resp.setLength(personal_url.length());
				System.out.println("truh");
				//resp.date = new Date().toString(); 
				//gorogoghg
				System.out.println("\n\n"+resp+"\n\nCatter");
				//geghh
				dos.writeUTF(resp + personal_url);
				//end of strategy
				clientSocket.close();
				
			}
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
