package xxsd.aprog.pl05;

import java.util.Scanner;

/**
 * @author Gonçalo Corte Real <1180793@isep.ipp.pt>
 */
public class ExComplementar2 {
        
        public static void main(String args[]) {
                
		Scanner scanner = new Scanner(System.in);

		System.out.println("Quantos números pretende converter?");

		try {
			int number = scanner.nextInt();

			for (int i = 1; i <= number; i++) {
				System.out.print("Introduza um número binário: ");
				
				int bNumber = scanner.nextInt();
				
				if (isBinario(bNumber)) {
					System.out.println(bNumber + " em decimal é: " + binarioParaDecimal(bNumber));
				} else {
					System.out.println("O número introduzido não é binário!");
					i--;
				}
			}
		} catch (Exception e) {
			System.out.println("Número Inválido!");
		}

		scanner.close();
	}

	public static int binarioParaDecimal(int numero) {
                
		int numeroDecimal = 0, expoente = 0;
		
		while (numero > 0) {
			int ultimoDigito = numero % 10;
			
			numeroDecimal += ultimoDigito * Math.pow(2, expoente);
			numero /= 10;
			expoente++;
		}
		
		return numeroDecimal;
	}
	
	public static boolean isBinario(int numero) {
                
		boolean isBinario = true;

		while (numero > 0) {
			int ultimoDigito = numero % 10;

			if (ultimoDigito == 1 || ultimoDigito == 0) {
				numero /= 10;
			} else {
				isBinario = false;
				break;
			}
		}

		return isBinario;
	}
}
