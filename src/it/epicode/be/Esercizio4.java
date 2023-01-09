package it.epicode.be;

public class Esercizio4 {

	public static void main(String[] args) {
		perimetroRettangolo(53.2, 30.8);
		pariDispari(4);
		areaTriangolo(2.2, 2.2, 3.3);
	}
	
	static void perimetroRettangolo(double lato1, double lato2) {
		double perimetro = (lato1 + lato2) * 2;
		System.out.println(perimetro);
	}
	
	static void pariDispari(int numero) {
		if(numero % 2 == 0) {
			System.out.println(0);
		} else {
			System.out.println(1);
		}
	}
	
	static void areaTriangolo(double lato1, double lato2, double lato3) {
		double perimetro = (lato1 + lato2 + lato3) / 2;
		double area = Math.sqrt(perimetro * (perimetro - lato1) * (perimetro - lato2) * (perimetro - lato3));
		System.out.println(area);
	}
	
}
