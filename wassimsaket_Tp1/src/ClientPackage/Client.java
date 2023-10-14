package ClientPackage;

import java.io.*;
import java.net.*;
import java.util.*;

public class Client {

	public static void main(String[] args) {
		try {
			System.out.println("je suis un client pas encore connecté");
			Socket s = new Socket("localhost",1234);
			System.out.println("je suis un client connecté");
			
			s.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
