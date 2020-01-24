package net.jacobb.encrypti0;

import java.util.Scanner;
import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;

public class Decryption {
	
	private final static String hashed = "ha$h420";
	
	private static Scanner deInput;
	
	static void DecryptionScript() {
		
		deInput = new Scanner(System.in);
		
		String deInputS;
		
		System.out.print("Co mam odszyfrować?: ");
		deInputS = deInput.nextLine();
		
		StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
		encryptor.setPassword(hashed);

		String decrypted = encryptor.decrypt(deInputS);
		
		System.out.println("Odszyfrowana wiadomość to: " + decrypted);
		
	}

}
