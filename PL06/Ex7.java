package xxsd.aprog.pl06;

import java.util.Scanner;

/**
 * @author Gonçalo Corte Real <1180793@isep.ipp.pt>
 */
public class Ex7 {
       
        public static void main(String args[]) {
                
		Scanner scanner = new Scanner(System.in);

		System.out.printf("Introduza um número decimal para converter para octal: ");
		
		long numero = scanner.nextLong();
		
		while (isOctal(numero)) {
			System.out.printf("O número(decimal) %d equivale a %d em base octal%n", numero, converterOctalParaDecimal(numero));
			
			System.out.printf("Introduza outro número decimal: ");
			
			numero = scanner.nextInt();
		}

		System.out.printf("Sequencia terminada.");
		
		scanner.close();
	}

	public static boolean isOctal(long numero) {
		boolean isOctal = true;
		while (numero > 0) {
			if (numero % 10 > 7) {
				isOctal = false;
				break;
			}

			numero /= 10;
		}
		return isOctal;
	}

	public static long converterOctalParaDecimal(long octal) {
		if (isOctal(octal)) {
			long expoente = 0, decimal = 0;

			while (octal > 0) {
				decimal += (octal % 10) * Math.pow(8, expoente);
				expoente++;
				octal /= 10;
			}

			return decimal;
		} else {
			return -1;
		}
	}
}
