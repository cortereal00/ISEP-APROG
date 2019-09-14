package xxsd.aprog.pl05;

import java.util.Scanner;

/**
 * @author Gonçalo Corte Real <1180793@isep.ipp.pt>
 */
public class Ex6 {
       
        public static void main(String args[]) {
                
		Scanner scanner = new Scanner(System.in);

		int numero = scanner.nextInt();

		int contPar[] = new int[2];

		while (numero != 0) {
			if (numero % 2 == 0) {
				contPar[0]++;
			}

			numero = scanner.nextInt();
		}

		System.out.println("\nA primeira sequência terminou\n");

		while (numero != -1) {
			if (numero % 2 == 0) {
				contPar[1]++;
			}

			numero = scanner.nextInt();
		}

		System.out.println("\nA segunda sequência terminou\n");

		if (contPar[0] > contPar[1]) {
			System.out.println("A sequência com mais números de pares é a primeira");
		} else if (contPar[0] < contPar[1]) {
			System.out.println("A sequência com mais números de pares é a segunda");
		} else {
			System.out.println("As duas sequências têm o mesmo número de pares");
		}

		scanner.close();
	}
}
