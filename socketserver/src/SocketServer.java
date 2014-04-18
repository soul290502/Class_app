

	public class SocketServer implements java.lang.Runnable { 
		  private int port; 
		  private java.net.ServerSocket ss; 

		  public SocketServer(int port) throws java.io.IOException { 
		    this.port = port; 
		    // 建立一個ServerSocket 
		    this.ss = new java.net.ServerSocket(port); 
		  } 

		  public void run() { 
		    java.net.Socket sk = null; 
		    while (true)// 永遠執行 
		    { 
		      // 等待連入 
		      System.out.println("waiting..."); 
		      try { 
		        // 取得連線Socket 
		        sk = this.ss.accept(); 
		        // 取得Client連線Address 
		        System.out.println(sk.getLocalAddress()); 
		        sk.close(); 
		      } catch (java.io.IOException e) { 
		        e.printStackTrace(); 
		      } 

		    } 
		  } 

		  public static void main(String args[]) throws java.io.IOException { 
		    // runable要new一個Thread,再把runnable置入 
		    java.lang.Thread thread = new java.lang.Thread(new SocketServer(81)); 
		    thread.start(); 
		  } 
		}

