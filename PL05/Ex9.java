package xxsd.aprog.pl05;

import java.util.Scanner;

/**
 * @author Gonçalo Corte Real <1180793@isep.ipp.pt>
 */
public class Ex9 {
        
        public static void main(String args[]) {
                
		Scanner scanner = new Scanner(System.in);
		
		int numeroBinario = scanner.nextInt();
		
		if (!isBinario(numeroBinario)) {
			System.out.println("O número introduzido não é binário.");
		} else {
			int numeroDecimal = 0, expoente = 0, numero = numeroBinario;
			
			while (numero > 0) {
				int ultimoDigito = numero % 10;
				
				numeroDecimal += ultimoDigito * Math.pow(2, expoente);
				numero /= 10;
				expoente++;
			}
			
			System.out.println("O número binário " + numeroBinario + " em decimal é " + numeroDecimal);
		}
		
		scanner.close();
	}
	
	public static boolean isBinario(int numero) {
		boolean isBinary = true;
		
		while (numero > 0) {
			int ultimoDigito = numero % 10;
			
			if (ultimoDigito == 1 || ultimoDigito == 0) {
				numero /= 10;	
			} else {
				isBinary = false;
				break;
			}
		}
		
		return isBinary;
	}
}
