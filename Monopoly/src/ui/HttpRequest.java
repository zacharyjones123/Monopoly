package ui;

public class HttpRequest {
	String path_File_name;
	String request_type; 
	String field_content;
	String field_connection;
	String field_userAgent;
	//don't need to implement host
	public HttpRequest(){
		
	}
	public HttpRequest(String request)throws IllegalArgumentException{
		//parses through request
		String fields[] = request.split("\n");
		System.out.println("This is what was splitted");
		System.out.println(fields[0]);
		System.out.println(fields[1]);
		System.out.println(fields[2]);
		System.out.println(fields[3]);
		System.out.println(fields[4]);
		System.out.println("And.... done splitted");
		int _urlStart = fields[0].indexOf("/") + 1;
		path_File_name = fields[0].substring(_urlStart, fields[0].indexOf(" ", _urlStart));
		//if(path_File_name.isEmpty())
			//path_File_name = "index.htm"; //default path 
		System.out.println("This is file: " + path_File_name);
		for(int i = 1; i < fields.length; i++){
			if(fields[i].contains("User-Agent:")){
				field_userAgent = fields[i].substring(fields[i].indexOf(":")+1).trim();
			}
			else if(fields[i].contains("Connection:")){
				field_connection = fields[i].substring(fields[i].indexOf(":")+1).trim();
			}
		}
		System.out.println("my user agent: " + field_userAgent);
		System.out.println("My connection: " + field_connection);
		//if done, keep in fields
	}
	public String getFileName(){
		return path_File_name;
	}
	
	public String get_request(){ //returns type of request.. GET/POST/
		return request_type;
	}
	
	public String getRequestedURL() {
		return "Error";
	}
}
