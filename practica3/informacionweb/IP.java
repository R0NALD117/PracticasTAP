package practica3.informacionweb;

import java.net.InetAddress;

public class IP {

	public static void main(String[] args) {
		
		try {
		
			String host = "https://www.itescam.edu.mx/";
			
			String numIp = "8.8.8.8";
			
			System.out.printf("La dirección de %s es %s \n", host, InetAddress.getByName(host).getHostAddress());
			
			System.out.println();
			
			System.out.printf("El nombre del host para la IP %s es %s\n", numIp, InetAddress.getByName(numIp).getHostName());
			
			System.out.println();
			
			
		}
		catch(Exception e) {
			
		}
		
	}

}
