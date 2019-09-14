package xxsd.aprog.pl05;

import java.util.Scanner;

/**
 * @author Gonçalo Corte Real <1180793@isep.ipp.pt>
 */
public class Ex4 {
        
        public static void main(String args[]) {
                
		Scanner scanner = new Scanner(System.in);

		int numeros = scanner.nextInt();
		
		for (int i = 1; i <= numeros; i++) {
			if (isPerfeito(i)) {
				System.out.println("O número " + i + " é perfeito");
			}
		}

		scanner.close();
	}

	public static boolean isPerfeito(int numero) {
		if (numero % 2 != 0)
			return false;

		int somaFatores = 0;

		for (int i = 1; i <= numero / 2; i++) {
			if (numero % i == 0) {
				somaFatores += i;
			}
		}
		
                return somaFatores == numero;
	}
        
}
