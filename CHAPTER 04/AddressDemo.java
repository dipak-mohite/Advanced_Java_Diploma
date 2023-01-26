import java.net.*;
class AddressDemo
{
	public static void main(String args[])
	{
		try{
		InetAddress Ad = InetAddress.getLocalHost();
		System.out.println("\nMy System's Address = "+Ad);
		Ad = InetAddress.getByName("www.msbte.org.in");
		System.out.println("MSBTE Website Address = "+Ad);	
		System.out.println("is MulticastAddress = "+Ad.isMulticastAddress);	
		
		
		} 
		catch(UnknownHostException e) {
			System.out.println(e);
		}
	}
}

