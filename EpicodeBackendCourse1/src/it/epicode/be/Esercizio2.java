package it.epicode.be;

public class Esercizio2 {

	public static void main(String[] args) {
		String[] array = new String[] {"uno", "due", "tre", "quattro", "cinque"};
		
		System.out.println(moltiplica(10, 3));
		System.out.println(concatena(2, " di picche"));
		System.out.println(inseriscilnArray(array, "sei"));
	}
	
	static int moltiplica(int primo, int secondo) {
		return primo * secondo;
	}

	static String concatena(int numero, String testo) {
		return numero + testo;
	}
	
	static String inseriscilnArray(String[] array, String altro) {
		String[] nuovoArray = new String[6];
		nuovoArray[0] = array[0];
		nuovoArray[1] = array[1];
		nuovoArray[2] = altro;
		nuovoArray[3] = array[2];
		nuovoArray[4] = array[3];
		nuovoArray[5] = array[4];
		
		return java.util.Arrays.toString(nuovoArray);
	}
}
