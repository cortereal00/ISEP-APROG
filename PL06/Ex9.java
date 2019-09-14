package xxsd.aprog.pl06;

import java.util.Scanner;

/**
 * @author Gonçalo Corte Real <1180793@isep.ipp.pt>
 */
public class Ex9 {
        
        public static void main(String args[]) {
                
		Scanner scanner = new Scanner(System.in);

		System.out.println("Quantos termos pretende visualizar?");

		printSucessaoFibonacci(scanner.nextInt());

		scanner.close();
	}

	public static void printSucessaoFibonacci(long number) {
		long n1 = 0;
		long n2 = 1;
		for (int i = 1; i <= number; i++) {
			System.out.println(n1);

			long soma = n1 + n2;
			n1 = n2;
			n2 = soma;
		}
	}
}
