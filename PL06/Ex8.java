package xxsd.aprog.pl06;

import java.util.Scanner;

/**
 * @author Gonçalo Corte Real <1180793@isep.ipp.pt>
 */
public class Ex8 {
        
        private static final char[] hexCharacters = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D',
			'E', 'F' };

	public static void main(String args[]) {
                
		Scanner scanner = new Scanner(System.in);

		System.out.printf("Introduza um número decimal para converter para hexadecimal: ");

		long numero = scanner.nextLong();

		while (numero != 0) {
			System.out.printf("O número(decimal) %d equivale a %s em base hexadecimal%n", numero,
					converterHexadecimalParaDecimal(numero));

			System.out.printf("Introduza outro número decimal: ");

			numero = scanner.nextInt();
		}

		System.out.printf("Sequence terminated.");

		scanner.close();
	}

	private static String converterHexadecimalParaDecimal(long number) {
		StringBuilder hexadecimal = new StringBuilder();

		while (number > 0) {
			hexadecimal.append(hexCharacters[(int) (number % 16)]);

			number /= 16;
		}

		return hexadecimal.reverse().toString();
	}
}
