import java.util.Scanner;

public class Laco1 {
	
	public static void main(String[] args) {
		
		System.out.println("==========Números de 0 a 100==========");
		for(int contador=0;contador<=100;contador++) {
			System.out.println("Linha "+contador);
		}
		
		System.out.println("==========Pares==========");
		for(int contador=0;contador<=100;contador+=2) {
			System.out.println("Linha "+contador);
		}
		
		System.out.println("==========Impares==========");
		for(int contador=1;contador<=99;contador+=2) {
			System.out.println("Linha "+contador);
		}
	}

}
