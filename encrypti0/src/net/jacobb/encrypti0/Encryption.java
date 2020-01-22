package net.jacobb.encrypti0;

import java.util.Scanner;
import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;

public class Encryption {
	
	private static Scanner enInput;

	static void EncryptionScript() {
		
		enInput = new Scanner(System.in);
		
		String hashed = "ha$hed";
		String enInputS;
		
		System.out.println("Powiedz mi co zaha$hować: ");
		enInputS = enInput.nextLine();
		
		StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
		encryptor.setPassword(hashed);
		String encrypted= encryptor.encrypt(enInputS);
		System.out.println("Zaha$howana wiadomosć to teraz: " + encrypted);
	}
	
}
