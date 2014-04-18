import java.io.*; 
import java.net.*;
class server {    
	public static void main(String argv[]) throws Exception       
	{          
		String clientSentence;
		String capitalizedSentence;
		ServerSocket welcomeSocket = new ServerSocket(65533); 
		while(true)          
		{             
			Socket connectionSocket = welcomeSocket.accept();
			BufferedReader inFromClient =       new BufferedReader(new InputStreamReader(connectionSocket.getInputStream())); 
			DataOutputStream outToClient = new DataOutputStream(connectionSocket.getOutputStream()); 
			clientSentence = inFromClient.readLine();             
			System.out.println("Received: " + clientSentence);
			capitalizedSentence = clientSentence.toUpperCase() + '\n';
			outToClient.writeBytes(capitalizedSentence); 
			}       
		} 
	}// - See more at: http://systembash.com/content/a-simple-java-tcp-server-and-tcp-client/#sthash.PvXrustS.dpuf

//import java.io.BufferedReader;
//import java.io.DataOutputStream;
//import java.io.InputStreamReader;
//import java.net.ServerSocket;
//import java.net.Socket;
//
//
//public class server {
//	public static void main (String argv[])throws Exception
//	{
//		String clientStentence,capitalizedSentence,check;
//		ServerSocket welcomeSocket=new ServerSocket(50022);//前一次6400
//		while(true){
//			Socket connectionSocket=welcomeSocket.accept();
//			BufferedReader inFromClient=new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
//			DataOutputStream outToClient=new DataOutputStream(connectionSocket.getOutputStream());
//			System.out.println("server    listen ~~");
//			clientStentence=inFromClient.readLine();
//			System.out.println("server    listen 3~~");
////			check="eclipse";
//			System.out.println(clientStentence);
//			capitalizedSentence=clientStentence.toUpperCase()+'\n';
////			capitalizedSentence+=check;
//			outToClient.writeBytes(capitalizedSentence);
////			outToClient.writeBytes(check);
//		}
//		
//	}
//}
