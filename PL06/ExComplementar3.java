package xxsd.aprog.pl06;

import java.util.Scanner;

/**
 * @author Gonçalo Corte Real <1180793@isep.ipp.pt>
 */
public class ExComplementar3 {
        
        public static void main(String args[]) {
                
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(somaFatoresPares(4));
		
		scanner.close();
	}
	
	private static long somaFatoresPares(long numero) {
		long contFatoresPares = 0;
		for (int i = 1; i <= numero / 2; i++) {
			if (numero % i == 0 && i % 2 == 0) {
				contFatoresPares++;
			}
		}
		return contFatoresPares;
	}
}
