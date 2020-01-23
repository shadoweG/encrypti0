package net.jacobb.encrypti0;

import java.util.*;

public class Main {
	
	//jak działa szyfrowanie: https://stackoverflow.com/questions/29226813/simple-encryption-in-java-no-key-password
	
	private static Scanner choice;

	public static void main(String[] args) {
		
		choice = new Scanner(System.in);
		
		String input;
		String message = "Wybierz skrypt: \n A = Szyfrowanie \n B = Odszyfrowanie";
		String addon = " \n Exit = Wyjście z aplikacji";
		
		System.out.println(message);
		
		while (true) {
			
			input = choice.next().toUpperCase().trim();
			
			if (input.equals("A")) {
				Encryption.EncryptionScript();
			}
			if (input.equals("B")) {
				Decryption.DecryptionScript();
			}
			if (input.equals("EXIT")) {
				System.exit(0);
			}
			else {
				System.out.println(message + addon);
			}
		}
	}

}
