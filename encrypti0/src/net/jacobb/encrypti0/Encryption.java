package net.jacobb.encrypti0;

import java.util.Scanner;
import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;

public class Encryption {
	
	private final static String hashed = "ha$h420";
	
	private static Scanner enInput;

	static void EncryptionScript() {
		
		enInput = new Scanner(System.in);
		
		String enInputS;
		
		System.out.print("Powiedz mi co zaszyfrować: ");
		enInputS = enInput.nextLine();
		
		StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
		encryptor.setPassword(hashed);
		
		String encrypted= encryptor.encrypt(enInputS);
		
		System.out.println("Zaszyfrowana wiadomosć to teraz: " + encrypted);
		
	}
	
}
