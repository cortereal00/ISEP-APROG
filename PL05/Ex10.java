package xxsd.aprog.pl05;

import java.util.Scanner;

/**
 * @author Gonçalo Corte Real <1180793@isep.ipp.pt>
 */
public class Ex10 {
        
        public static void main(String arsgs[]) {
                
		Scanner scanner = new Scanner(System.in);

		StringBuilder numeroBinario = new StringBuilder();

		int numeroDecimal = scanner.nextInt();

		int numero = numeroDecimal;
		int resto;
		while (numero >= 1) {
			resto = numero % 2;
			
			if (resto == 0) {
				numeroBinario.append("0");
			} else {
				numeroBinario.append("1");
			}
			
			numero /= 2;
		}

		System.out.println(numeroBinario.reverse().toString());
		
		scanner.close();
	}

}
