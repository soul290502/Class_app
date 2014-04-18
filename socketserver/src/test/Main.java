package test;

public class Main {

	public static void main(String args[])
	{
		if(args.length==0)
			System.out.println("�жǤJ�Ѽ�server��client");
		if(args.equals("server"))
			(new SocketServer()).start();
		else
			new SocketClient();
	}
}
