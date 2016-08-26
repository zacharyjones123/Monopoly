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

public class HttpWebServer{
	private ServerSocket s;
	private int port = 0;
	private HttpRequest clientRequest;
	
	public HttpWebServer(){
		
	}
	public HttpWebServer(int port) throws IOException{
		System.out.println("Beginning server now!");
		this.port = port;
		s = new ServerSocket(port);
		ServeForever();
	}
	public static void main(String[] args) throws Exception { //expected to be given port number
		//new HttpWebServer(Integer.parseInt(args[0]));
		new HttpWebServer(Integer.parseInt("8080"));
	}
	
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
			try{
				FileReader fr = new FileReader(clientRequest.getFileName());
				BufferedReader br = new BufferedReader(fr);
				System.out.println("Found the file!");
				String html_String = "";
				while(true){
					String temp = br.readLine();
					if(temp == null)
						break;
					else
						html_String += temp;
				}
				br.close();
				HttpResponse resp = new HttpResponse();
				resp.setStatus(200);
				resp.setLength(html_String.getBytes().length); //does whatever
				handleRequest();
				System.out.println(resp + html_String);
				dos.writeUTF(resp.toString() + html_String);
				if(resp.connection.equalsIgnoreCase("Keep-alive")){
					System.out.println(dis.readLine());	
				}
			}
			catch(FileNotFoundException fne){
				System.out.println("Did not find file!");
				//return status code 404 not found
				HttpResponse resp = new HttpResponse();
				resp.setStatus(404);
				String notFoundMessage = "<!DOCTYPE HTML PUBLIC \"-//IETF//DTD HTML 2.0//EN\"><html><head><title>404 Not Found</title></head><body><h1>Not Found</h1><p>The requested URL "+clientRequest.getRequestedURL()+".html was not found on this server.</p></body></html>";
				resp.setLength(notFoundMessage.getBytes().length);
				System.out.println("red");
				handleRequest();
				System.out.println("Pop:" + resp);
				dos.writeUTF(resp.toString() + notFoundMessage);
			}
			
			clientSocket.close();
			}
			catch(Exception e){;}
		}
	}
	
	public void handleRequest(){
		return;
	}
	
	public void setPort(){}


}
