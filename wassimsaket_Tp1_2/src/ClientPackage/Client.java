package ClientPackage;

import java.io.*;
import java.net.*;
import java.util.*;

public class Client {

	public static void main(String[] args) {
		try {
			Socket s = new Socket("localhost",1234);
			System.out.println("je suis un client connecté");
			
			Scanner sc = new Scanner(System.in);
			InputStream is = s.getInputStream();
			OutputStream os = s.getOutputStream();
			
			System.out.println("donner un nombre: ");
			int rep = sc.nextInt();
			os.write(rep);
			
			int res = is.read();
			System.out.println(rep+" X 5 = "+res);
			
			s.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
