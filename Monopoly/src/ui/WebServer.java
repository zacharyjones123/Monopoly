
package ui;

/**
 * This class is for the GameHub Web Server
 * 
 * @author Isaiah Smoak
 * @author Zachary Jones
 * @version 1.0
 */

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class WebServer implements Runnable {
	/* The socket used for the server */
	private ServerSocket websocket; 
	/* The string of HTML */
	private String html_String = ""; 
	/* The first response */
	private String http_response_part1 = "HTTP/1.1 200 OK\r\nConnection: close\r\nContent-Length: ";
	/* The second response */
	private String http_response_part2 = "\r\n\r\n";
	/* The name of the website */
	//public final static String WEBSITE_NAME = "gamehub.html";
	
	/**
	 * The constructor of the GameHubWebServer
	 * 
	 * @throws IOException
	 */
	public WebServer() throws IOException {
		//FileReader fr = new FileReader(WEBSITE_NAME);
		//BufferedReader br = new BufferedReader(fr);
		
		//while(true){
			//String temp = br.readLine();
			//if(temp == null)
				//break;
			//else
				//html_String += temp;
		//}
		
		//System.out.println(html_String);
		//br.close();
		websocket = new ServerSocket(80);
		new Thread(this).start();	
		}

	/**
	 * This method runs the Gamehub website
	 * server
	 */
	@Override
	public void run() {
		while(true){
		try {
			Socket s = websocket.accept();
			String http_response_part1 = "HTTP/1.1 200 OK\r\nConnection: close\r\nContent-Length: ";
			/* The second response */
			String http_response_part2 = "\r\n\r\n";
			String html_String = "<html xmlns=\"http://www.w3.org/1999/xhtml\"> <head> <title>Calculator </title></head></html>";
			DataInputStream dis = new DataInputStream(s.getInputStream());
			DataOutputStream dos = new DataOutputStream(s.getOutputStream());
			dos.writeUTF(http_response_part1+html_String.length()+http_response_part2+html_String);
			dos.writeUTF(html_String);
			dos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		}
	}
	public static void main(String[] args) throws IOException{
		new WebServer();
	}
}
