package fr.ficelleytb.main;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Pseudo: ");
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		String compte = sc.nextLine();	
		
		try {
			URL aaa;
			aaa = new URL("https://api.mojang.com/users/profiles/minecraft/" + compte + "?at=1594715820");
			URLConnection ccc = aaa.openConnection();
			System.out.println("Requête envoyée");
			System.out.println("Information:");
			System.out.println("URL: " + ccc.getURL());
			System.out.println("_______________________");
			
			try {
				
			if(ccc.getContentType().equalsIgnoreCase(null)) {
				System.out.println(" ");
			} else {
				System.out.println("Compte existant ! (" + compte + ")");
			}
			
			} catch (NullPointerException e) {
				System.out.println("Compte non existant ! (" + compte + ")");
			}
			
			
			
		} catch (IOException e) {
			System.out.println("Requête non envoyée");
			e.printStackTrace();
		}
	}

}

// Peux parfois bugger !
