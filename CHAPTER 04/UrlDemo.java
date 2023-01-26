import java.net.*;
class UrlDemo
{
	public static void main(String args[])
	{
		try{
		
		InetAddress Ad = InetAddress.getLocalHost();
		System.out.println("\nMy System's Address = "+Ad);
		Ad = InetAddress.getByName("www.msbte.org.in");
		System.out.println("MSBTE Website Address = "+Ad);	
		
		InetAddress address[] = InetAddress.getByName("www.google.com");
		for(int i=0;i<=address.length;i++)
		{
			System.out.println("\n\n"+address[i]);
		}
		
		} 
		catch(UnknownHostException e) {
			System.out.println(e);
		}
	}
}

