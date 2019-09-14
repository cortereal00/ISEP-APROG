package xxsd.aprog.pl06;

import java.util.Scanner;

/**
 * @author Gonçalo Corte Real <1180793@isep.ipp.pt>
 */
public class Ex5 {
	
	public static void main(String args[]) {
                
                Scanner scanner = new Scanner(System.in);
		System.out.println("Quantos pares de números pretende comparar?");
		
		int paresNumeros = scanner.nextInt();
		
		int maxPrimeiroNumero = 0, maxSegundoNumero = 0, maxAlgarismosComuns = 0;
		
		for (int i = 0; i < paresNumeros; i++) {
			System.out.println("Introduza um par de números, sucessivamente");
			
			int primeiroNumero = scanner.nextInt();
			int segundoNumero = scanner.nextInt();
			
			int algarismosComuns = algarismosComuns(primeiroNumero, segundoNumero);
			
			if (algarismosComuns >= maxAlgarismosComuns) {
				maxAlgarismosComuns = algarismosComuns;
				maxPrimeiroNumero = primeiroNumero;
				maxSegundoNumero = segundoNumero;
			}
		}
		
		System.out.println("O par com mais algarismos em comum é: " + maxPrimeiroNumero + " - " + maxSegundoNumero + " com " + maxAlgarismosComuns + " algarismo(s) em comum.");
	}

	private static int algarismosComuns(int a, int b) {
                
		int algarismosComuns = 0;
		while (a > 0 && b > 0) {
			if (a % 10 == b % 10) {
				algarismosComuns++;
			}

			a /= 10;
			b /= 10;
		}
		return algarismosComuns;
	}

}
