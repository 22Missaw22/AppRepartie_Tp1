package ServerPackage;

import java.io.*;
import java.net.*;

public class Server {

	public static void main(String[] args) {
		try {
			ServerSocket ss = new ServerSocket(1234);
			System.out.println("je suis un serveur, j'attend un client");
			
			Socket s = ss.accept();
			System.out.println("un client est connecté");
			
			InputStream is = s.getInputStream();
			OutputStream os = s.getOutputStream();
			
			int res = is.read();
			res = res * 5;
			os.write(res);
			
			s.close();
			ss.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
