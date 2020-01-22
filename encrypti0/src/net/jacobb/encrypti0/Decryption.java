package net.jacobb.encrypti0;

import java.util.Scanner;
import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;

public class Decryption extends Encryption {
	
	private static Scanner deInput;
	
	static void DecryptionScript() {
		
		deInput = new Scanner(System.in);
		
		String hashed = "ha$hed";
		String deInputS;
		
		System.out.println("Co mam odha$hować?: ");
		deInputS = deInput.nextLine();
		
		StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
		encryptor.setPassword(hashed);

		String decrypted = encryptor.decrypt(deInputS);
		System.out.println("Odha$howana wiadomość to: " + decrypted);
		
	}

}
