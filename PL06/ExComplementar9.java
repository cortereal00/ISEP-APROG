package xxsd.aprog.pl06;

import java.util.Formatter;
import java.util.Scanner;

/**
 * @author Gonçalo Corte Real <1180793@isep.ipp.pt>
 */
public class ExComplementar9 {
        
        public static void main(String args[]) {
                
		Scanner scanner = new Scanner(System.in);
		Formatter formatter = new Formatter(System.out);
		
		int num = scanner.nextInt();
		
		int numeros = 1;
		
		while (!isPerfeito(num)) {
			num = scanner.nextInt();
			numeros++;
		}
		
		formatter.format("%d é um número perfeito e a sua posição na sequência é %d%n", num, numeros);
		
		formatter.close();
		scanner.close();
	}

	public static boolean isPerfeito(int numero) {
		int somaFatores = 0;

		for (int i = 1; i <= numero / 2; i++) {
			if (numero % i == 0)
				somaFatores += i;
		}

                return somaFatores == numero;
	}
}
