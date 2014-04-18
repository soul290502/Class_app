import java.io.*;
import java.net.*; 
class client {  
	public static void main(String argv[]) throws Exception 
	{   
		String sentence;
		String modifiedSentence; 
		BufferedReader inFromUser = new BufferedReader( new InputStreamReader(System.in)); 
		Socket clientSocket = new Socket("joey-hsu", 65530);   DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
		BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
		sentence = inFromUser.readLine();   outToServer.writeBytes(sentence + '\n');
		modifiedSentence = inFromServer.readLine(); 
		System.out.println("FROM SERVER: " + modifiedSentence);  
		clientSocket.close();

		} 
	
}// - See more at: http://systembash.com/content/a-simple-java-tcp-server-and-tcp-client/#sthash.PvXrustS.dpuf


//import java.io.*;  
//class client{  
//public static void main(String args[])throws Exception{  
//  
// InputStreamReader r=new InputStreamReader(System.in);  
// BufferedReader br=new BufferedReader(r);  
//  
// String name="";  
// System.out.println("Enter data: ");
//  while(r.equals("stop")){  
//   System.out.println("Enter data: ");  
//   name=br.readLine();  
//   System.out.println("data is: "+name);  
//  }  
//  
// br.close();  
// r.close();  
// }  
//}  


//import java.io.BufferedReader;
//import java.io.DataOutputStream;
//import java.io.InputStreamReader;
//import java.net.*;
//
//
//public class client {
//	public static void main(String argv[])throws Exception
//	{
//		String sentence,modifiedsentence;
//		BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));
//		Socket clientSocket = new Socket("joey-hsu",50022);//192.168.1.102
//		DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
//		BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
//		System.out.println("listening~~");
//		sentence=inFromUser.readLine();
//		outToServer.writeBytes(sentence+'\n');
//		modifiedsentence=inFromServer.readLine();	
//		System.out.println("Form server : "+modifiedsentence.concat(" server") );
//		clientSocket.close();
//		System.out.println("close");
//		
//		
		
//		BufferedReader buf = new BufferedReader(
//                new InputStreamReader(System.in)); 
//System.out.print("請輸入一列文字: ");
//		for(int a=0;a<10;a++){
//			 
//					String text = buf.readLine(); 
//System.out.println("您輸入的文字: " + text); 
//		}
		
//		
//	}
//}
