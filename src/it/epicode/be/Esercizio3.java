package it.epicode.be;
import java.util.Scanner;

public class Esercizio3 {

	public static void main(String[] args) {
		String array[] = new String[3];
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Inserisci il primo valore:");
		array[0] = scan.nextLine();
		System.out.println("Inserisci il secondo valore:");
		array[1] = scan.nextLine();
		System.out.println("Inserisci il terzo valore:");
		array[2] = scan.nextLine();
		
		System.out.println(array[0] + ", " + array[1] + ", " + array[2]);
		System.out.println(array[2] + ", " + array[1] + ", " + array[0]);
		
		scan.close();
	}

}
