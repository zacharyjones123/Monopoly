package ui;


public class HttpResponse {
	String status;
	String connection = "close";
	String length;
	String date;
	String server;
	String content_type = "text/html";
	String last_modified;
	
	final String newLine = "\r\n";
	public HttpResponse() {
		;
	}
	
	public void setStatus(int code){
		if(code == 404)
			status = "404 Not Found";
		if(code == 200)
			status = "200 OK";
			
	}
	public void setConnection(){
		//default is close
	}
	public void setLength(int length){
		this.length = String.valueOf(length);
	}
	public void setServer(){}
	public void allowDate(boolean dec){}
	public void setLastModified(){}
	public void setContentType(){}
	public String toString(){
		System.out.println("big daddy kane");
		if(status == null)
			throw new IllegalArgumentException("No status code is set!");
		String response = "HTTP/1.1 " +status + newLine ;
		if(date != null)
			response += "Date: " + date + newLine;
		if(server != null)
			response += "Server: " + server + newLine;
		if(last_modified != null)
			response += "Last-Modified: " + last_modified + newLine;
		if(length == null)
			throw new IllegalArgumentException("No length is given!");
		else
			response += "Content-Length: " + length + newLine;
		if(content_type != null)
			response += "Content-Type: " + content_type + newLine;
		if(connection != null)
			response += "Connection: " + connection + newLine;
		response += newLine;
		System.out.print("Marker");
		return response;
	}

}
