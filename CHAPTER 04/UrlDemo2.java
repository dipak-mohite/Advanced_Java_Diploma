import java.net.*;

class URLDemo2
{
	public static void main(String[] args)
	{
		try{
		URL u = new URL("https://msbte.org.in/file/ConsentOfAffi2911_30112021.pdf");
		System.out.println("Protocol = "+u.getProtocol());
		System.out.println("Host Name = "+u.getHost());
		System.out.println("Port Number = "+u.getPort());
		System.out.println("Protocol = "+u.getFile());
		System.out.println("Protocol = "+u.getProtocol());
		System.out.println("Complete URL = "+u.toExternalForm());
		} catch(Exception e){}
	}
}